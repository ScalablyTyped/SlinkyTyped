package typingsSlinky.serverless.serverlessMod

import typingsSlinky.serverless.Anon_Log
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serverless", JSImport.Namespace)
@js.native
class ^ () extends Serverless {
  def this(config: js.Object) = this()
  /* CompleteClass */
  override var cli: Anon_Log = js.native
  /* CompleteClass */
  override var config: Config = js.native
  /* CompleteClass */
  override var pluginManager: typingsSlinky.serverless.classesPluginManagerMod.^ = js.native
  /* CompleteClass */
  override var serverlessDirPath: String = js.native
  /* CompleteClass */
  override var service: typingsSlinky.serverless.classesServiceMod.^ = js.native
  /* CompleteClass */
  override var utils: typingsSlinky.serverless.classesUtilsMod.^ = js.native
  /* CompleteClass */
  override var version: String = js.native
  /* CompleteClass */
  override var yamlParser: typingsSlinky.serverless.classesYamlParserMod.^ = js.native
  /* CompleteClass */
  override def getProvider(name: String): typingsSlinky.serverless.pluginsAwsProviderAwsProviderMod.^ = js.native
  /* CompleteClass */
  override def getVersion(): String = js.native
  /* CompleteClass */
  override def init(): js.Promise[_] = js.native
  /* CompleteClass */
  override def run(): js.Promise[_] = js.native
  /* CompleteClass */
  override def setProvider(name: String, provider: typingsSlinky.serverless.pluginsAwsProviderAwsProviderMod.^): Null = js.native
}

