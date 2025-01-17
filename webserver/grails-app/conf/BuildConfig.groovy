grails.servlet.version = "2.5" // Change depending on target container compliance (2.5 or 3.0)
grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.target.level = 1.6
grails.project.source.level = 1.6
//grails.project.war.file = "target/${appName}-${appVersion}.war"

grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // specify dependency exclusions here; for example, uncomment this to disable ehcache:
        // excludes 'ehcache'
    }
    log "error" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    checksums true // Whether to verify checksums on resolve

    repositories {
        inherits true // Whether to inherit repository definitions from plugins

        grailsPlugins()
        grailsHome()
        grailsCentral()

        mavenLocal()
        mavenCentral()

        // uncomment these (or add new ones) to enable remote dependency resolution from public Maven repositories
        //mavenRepo "http://snapshots.repository.codehaus.org"
        //mavenRepo "http://repository.codehaus.org"
        //mavenRepo "http://download.java.net/maven/2/"
        //mavenRepo "http://repository.jboss.com/maven2/"
    }
    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.

        // runtime 'mysql:mysql-connector-java:5.1.20'
        compile('org.grails.plugins:gson:1.1.4')

        compile ('joda-time:joda-time:2.3')

        runtime('org.codehaus.groovy.modules.http-builder:http-builder:0.7') {
            excludes 'xalan'
            excludes 'xml-apis'
            excludes 'groovy'
        }

        compile ('org.springframework:spring-test:3.1.2.RELEASE'){
            excludes 'groovy'
        }
    }

    plugins {
        runtime ":jquery:1.8.0"
        runtime ":resources:1.1.6"
        build ":tomcat:$grailsVersion"
        compile ':cache:1.0.0'
        runtime ":mongodb:1.1.0.GA"
        runtime ":cors:1.1.4"
        compile ":burning-image:0.5.1"
    }
}
