package typingsSlinky.serverless.serverlessMod

import typingsSlinky.serverless.Anon_Log
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Serverless extends js.Object {
  var cli: Anon_Log
  var config: Config
  var pluginManager: typingsSlinky.serverless.classesPluginManagerMod.^
  var serverlessDirPath: String
  var service: typingsSlinky.serverless.classesServiceMod.^
  var utils: typingsSlinky.serverless.classesUtilsMod.^
  var version: String
  var yamlParser: typingsSlinky.serverless.classesYamlParserMod.^
  def getProvider(name: String): typingsSlinky.serverless.pluginsAwsProviderAwsProviderMod.^
  def getVersion(): String
  def init(): js.Promise[_]
  def run(): js.Promise[_]
  def setProvider(name: String, provider: typingsSlinky.serverless.pluginsAwsProviderAwsProviderMod.^): Null
}

object Serverless {
  @scala.inline
  def apply(
    cli: Anon_Log,
    config: Config,
    getProvider: String => typingsSlinky.serverless.pluginsAwsProviderAwsProviderMod.^,
    getVersion: () => String,
    init: () => js.Promise[_],
    pluginManager: typingsSlinky.serverless.classesPluginManagerMod.^,
    run: () => js.Promise[_],
    serverlessDirPath: String,
    service: typingsSlinky.serverless.classesServiceMod.^,
    setProvider: (String, typingsSlinky.serverless.pluginsAwsProviderAwsProviderMod.^) => Null,
    utils: typingsSlinky.serverless.classesUtilsMod.^,
    version: String,
    yamlParser: typingsSlinky.serverless.classesYamlParserMod.^
  ): Serverless = {
    val __obj = js.Dynamic.literal(cli = cli.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], getProvider = js.Any.fromFunction1(getProvider), getVersion = js.Any.fromFunction0(getVersion), init = js.Any.fromFunction0(init), pluginManager = pluginManager.asInstanceOf[js.Any], run = js.Any.fromFunction0(run), serverlessDirPath = serverlessDirPath.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], setProvider = js.Any.fromFunction2(setProvider), utils = utils.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], yamlParser = yamlParser.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Serverless]
  }
}

