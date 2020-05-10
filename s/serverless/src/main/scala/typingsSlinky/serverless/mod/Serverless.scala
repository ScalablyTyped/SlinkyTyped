package typingsSlinky.serverless.mod

import typingsSlinky.serverless.AnonLog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Serverless extends js.Object {
  var cli: AnonLog = js.native
  var config: Config = js.native
  var pluginManager: typingsSlinky.serverless.pluginManagerMod.^ = js.native
  var serverlessDirPath: String = js.native
  var service: typingsSlinky.serverless.serviceMod.^ = js.native
  var utils: typingsSlinky.serverless.utilsMod.^ = js.native
  var version: String = js.native
  var yamlParser: typingsSlinky.serverless.yamlParserMod.^ = js.native
  def getProvider(name: String): typingsSlinky.serverless.awsProviderMod.^ = js.native
  def getVersion(): String = js.native
  def init(): js.Promise[_] = js.native
  def run(): js.Promise[_] = js.native
  def setProvider(name: String, provider: typingsSlinky.serverless.awsProviderMod.^): Null = js.native
}

object Serverless {
  @scala.inline
  def apply(
    cli: AnonLog,
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
  @scala.inline
  implicit class ServerlessOps[Self <: Serverless] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCli(value: AnonLog): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cli")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfig(value: Config): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetProvider(value: String => typingsSlinky.serverless.awsProviderMod.^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProvider")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetVersion(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVersion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInit(value: () => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPluginManager(value: typingsSlinky.serverless.pluginManagerMod.^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRun(value: () => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withServerlessDirPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverlessDirPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withService(value: typingsSlinky.serverless.serviceMod.^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetProvider(value: (String, typingsSlinky.serverless.awsProviderMod.^) => Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setProvider")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUtils(value: typingsSlinky.serverless.utilsMod.^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utils")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYamlParser(value: typingsSlinky.serverless.yamlParserMod.^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yamlParser")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

