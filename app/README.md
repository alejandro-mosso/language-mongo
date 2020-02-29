# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.4.RELEASE/maven-plugin/)

#Create Spring Boot project
* String Initializer https://start.spring.io/<br/>
<code>&lt;group&gt;com.languagelab&lt;/group&gt;</code><br/>
<code>&lt;artifact&gt;app&lt;/artifact&gt;</code>

#Heroku integration
<br/><code><b>$</b> heroku login</code>
<br/><code><b>$</b> heroku git:remote -a languagelab-mongo</code> # Associate this app with haroku
<br/><code><b>$</b> heroku buildpacks:set heroku/jvm </code> # Add build pack manually, Heroku buildpack to support deployment from subdirectory
<br/><code><b>$</b> heroku config:set PROJECT_PATH=app </code> # Set pom.xml directory
<br/><code><b>$</b> heroku config:set WEB_CONCURRENCY=3 </code>
<br/><code><b>$</b> heroku ps:scale web=1 </code>

<br/><code><b>$</b> heroku logs --tail --app languagelab-service</code>
<br/><code><b>$</b> git status </code>
<br/><code><b>$</b> git commit --allow-empty -m "Adjust buildpacks on Heroku" </code>
<br/><code><b>$</b> git push heroku master </code> # Compile project
