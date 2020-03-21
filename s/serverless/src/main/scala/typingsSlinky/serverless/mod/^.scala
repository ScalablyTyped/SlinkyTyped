package typingsSlinky.serverless.mod

import typingsSlinky.serverless.AnonLog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serverless", JSImport.Namespace)
@js.native
class ^ () extends Serverless {
  def this(config: js.Object) = this()
  /* CompleteClass */
  override var cli: AnonLog = js.native
  /* CompleteClass */
  override var config: Config = js.native
  /* CompleteClass */
  override var pluginManager: typingsSlinky.serverless.pluginManagerMod.^ = js.native
  /* CompleteClass */
  override var serverlessDirPath: String = js.native
  /* CompleteClass */
  override var service: typingsSlinky.serverless.serviceMod.^ = js.native
  /* CompleteClass */
  override var utils: typingsSlinky.serverless.utilsMod.^ = js.native
  /* CompleteClass */
  override var version: String = js.native
  /* CompleteClass */
  override var yamlParser: typingsSlinky.serverless.yamlParserMod.^ = js.native
  /* CompleteClass */
  override def getProvider(name: String): typingsSlinky.serverless.awsProviderMod.^ = js.native
  /* CompleteClass */
  override def getVersion(): String = js.native
  /* CompleteClass */
  override def init(): js.Promise[_] = js.native
  /* CompleteClass */
  override def run(): js.Promise[_] = js.native
  /* CompleteClass */
  override def setProvider(name: String, provider: typingsSlinky.serverless.awsProviderMod.^): Null = js.native
}

