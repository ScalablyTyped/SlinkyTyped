package typingsSlinky.serverless.mod

import typingsSlinky.serverless.anon.Log
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Serverless extends js.Object {
  var cli: Log
  var config: Config
  var pluginManager: typingsSlinky.serverless.pluginManagerMod.^
  var serverlessDirPath: String
  var service: typingsSlinky.serverless.serviceMod.^
  var utils: typingsSlinky.serverless.utilsMod.^
  var version: String
  var yamlParser: typingsSlinky.serverless.yamlParserMod.^
  def getProvider(name: String): typingsSlinky.serverless.awsProviderMod.^
  def getVersion(): String
  def init(): js.Promise[_]
  def run(): js.Promise[_]
  def setProvider(name: String, provider: typingsSlinky.serverless.awsProviderMod.^): Null
}

object Serverless {
  @scala.inline
  def apply(
    cli: Log,
    config: Config,
    getProvider: String => typingsSlinky.serverless.awsProviderMod.^,
    getVersion: () => String,
    init: () => js.Promise[_],
    pluginManager: typingsSlinky.serverless.pluginManagerMod.^,
    run: () => js.Promise[_],
    serverlessDirPath: String,
    service: typingsSlinky.serverless.serviceMod.^,
    setProvider: (String, typingsSlinky.serverless.awsProviderMod.^) => Null,
    utils: typingsSlinky.serverless.utilsMod.^,
    version: String,
    yamlParser: typingsSlinky.serverless.yamlParserMod.^
  ): Serverless = {
    val __obj = js.Dynamic.literal(cli = cli.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], getProvider = js.Any.fromFunction1(getProvider), getVersion = js.Any.fromFunction0(getVersion), init = js.Any.fromFunction0(init), pluginManager = pluginManager.asInstanceOf[js.Any], run = js.Any.fromFunction0(run), serverlessDirPath = serverlessDirPath.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], setProvider = js.Any.fromFunction2(setProvider), utils = utils.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], yamlParser = yamlParser.asInstanceOf[js.Any])
    __obj.asInstanceOf[Serverless]
  }
}

