package typingsSlinky.storybookClientApi.configApiMod

import typingsSlinky.node.NodeModule
import typingsSlinky.storybookClientApi.AnonChannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/client-api/dist/config_api", JSImport.Default)
@js.native
class default protected () extends ConfigApi {
  def this(hasChannelStoryStoreClientApiClearDecorators: AnonChannel) = this()
  /* CompleteClass */
  override var _channel: typingsSlinky.storybookChannels.mod.default = js.native
  /* CompleteClass */
  override var _storyStore: typingsSlinky.storybookClientApi.storyStoreMod.default = js.native
  /* CompleteClass */
  override var clientApi: typingsSlinky.storybookClientApi.clientApiMod.default = js.native
  /* CompleteClass */
  override def _clearDecorators(): Unit = js.native
  /* CompleteClass */
  override def _renderError(err: js.Error): Unit = js.native
  /* CompleteClass */
  override def _renderMain(): Unit = js.native
  /* CompleteClass */
  override def configure(loaders: js.Function0[Unit], module: NodeModule): Unit = js.native
}

