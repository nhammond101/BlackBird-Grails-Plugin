class BlackbirdGrailsPlugin
{
    // the plugin version
    def version = "0.1"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "1.3.7 > *"
    // the other plugins this plugin depends on
    def dependsOn = [:]
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/views/error.gsp",
            "grails-app/views/index.gsp"

    ]

    def author = "Nick Hammond"
    def authorEmail = "naughty_nick_1@hotmail.com"
    def title = "Enable the resources for Blackbord JavaScript logging"
    def description = '''\\
Blackbird JavaScript logging allows the logging of javascript messages to a console with different trace levels.
see http://www.gscottolson.com/blackbirdjs/ for more information
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/grails-plugin-blackbird"
}
