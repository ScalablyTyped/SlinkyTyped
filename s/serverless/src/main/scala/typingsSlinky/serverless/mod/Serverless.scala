package typingsSlinky.serverless.mod

import typingsSlinky.serverless.anon.Log
import typingsSlinky.serverless.anon.PopulateService
import typingsSlinky.serverless.awsProviderMod.Resources
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Serverless extends js.Object {
  
  var cli: Log = js.native
  
  var config: Config = js.native
  
  def getProvider(name: String): typingsSlinky.serverless.awsProviderMod.^ = js.native
  
  def getVersion(): String = js.native
  
  def init(): js.Promise[_] = js.native
  
  var pluginManager: typingsSlinky.serverless.pluginManagerMod.^ = js.native
  
  var resources: Resources = js.native
  
  def run(): js.Promise[_] = js.native
  
  var serverlessDirPath: String = js.native
  
  var service: typingsSlinky.serverless.serviceMod.^ = js.native
  
  def setProvider(name: String, provider: typingsSlinky.serverless.awsProviderMod.^): Null = js.native
  
  var utils: typingsSlinky.serverless.utilsMod.^ = js.native
  
  var variables: PopulateService = js.native
  
  var version: String = js.native
  
  var yamlParser: typingsSlinky.serverless.yamlParserMod.^ = js.native
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
    resources: Resources,
    run: () => js.Promise[_],
    serverlessDirPath: String,
    service: typingsSlinky.serverless.serviceMod.^,
    setProvider: (String, typingsSlinky.serverless.awsProviderMod.^) => Null,
    utils: typingsSlinky.serverless.utilsMod.^,
    variables: PopulateService,
    version: String,
    yamlParser: typingsSlinky.serverless.yamlParserMod.^
  ): Serverless = {
    val __obj = js.Dynamic.literal(cli = cli.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], getProvider = js.Any.fromFunction1(getProvider), getVersion = js.Any.fromFunction0(getVersion), init = js.Any.fromFunction0(init), pluginManager = pluginManager.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], run = js.Any.fromFunction0(run), serverlessDirPath = serverlessDirPath.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], setProvider = js.Any.fromFunction2(setProvider), utils = utils.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], yamlParser = yamlParser.asInstanceOf[js.Any])
    __obj.asInstanceOf[Serverless]
  }
  
  @scala.inline
  implicit class ServerlessOps[Self <: Serverless] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCli(value: Log): Self = this.set("cli", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfig(value: Config): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetProvider(value: String => typingsSlinky.serverless.awsProviderMod.^): Self = this.set("getProvider", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetVersion(value: () => String): Self = this.set("getVersion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInit(value: () => js.Promise[_]): Self = this.set("init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPluginManager(value: typingsSlinky.serverless.pluginManagerMod.^): Self = this.set("pluginManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResources(value: Resources): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRun(value: () => js.Promise[_]): Self = this.set("run", js.Any.fromFunction0(value))
    
    @scala.inline
    def setServerlessDirPath(value: String): Self = this.set("serverlessDirPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setService(value: typingsSlinky.serverless.serviceMod.^): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetProvider(value: (String, typingsSlinky.serverless.awsProviderMod.^) => Null): Self = this.set("setProvider", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUtils(value: typingsSlinky.serverless.utilsMod.^): Self = this.set("utils", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariables(value: PopulateService): Self = this.set("variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYamlParser(value: typingsSlinky.serverless.yamlParserMod.^): Self = this.set("yamlParser", value.asInstanceOf[js.Any])
  }
}
