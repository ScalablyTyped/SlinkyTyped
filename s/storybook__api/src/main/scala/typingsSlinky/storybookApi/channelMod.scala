package typingsSlinky.storybookApi

import typingsSlinky.storybookApi.mod.Module
import typingsSlinky.storybookChannels.mod.Channel
import typingsSlinky.storybookChannels.mod.Listener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/api/dist/modules/channel", JSImport.Namespace)
@js.native
object channelMod extends js.Object {
  @js.native
  trait SubAPI extends js.Object {
    def collapseAll(): Unit = js.native
    def emit(`type`: String, args: js.Any*): Unit = js.native
    def expandAll(): Unit = js.native
    def getChannel(): Channel = js.native
    def off(`type`: String, cb: Listener): Unit = js.native
    def on(`type`: String, cb: Listener): js.Function0[Unit] = js.native
    def on(`type`: String, cb: Listener, peer: Boolean): js.Function0[Unit] = js.native
    def onStory(cb: Listener): Unit = js.native
    def once(`type`: String, cb: Listener): Unit = js.native
  }
  
  def default(hasProvider: Module): AnonApiSubAPI = js.native
}

