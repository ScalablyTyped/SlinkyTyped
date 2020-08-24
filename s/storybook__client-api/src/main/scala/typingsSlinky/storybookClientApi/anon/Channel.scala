package typingsSlinky.storybookClientApi.anon

import typingsSlinky.storybookChannels.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channel extends js.Object {
  var channel: default | Null = js.native
  var clientApi: typingsSlinky.storybookClientApi.clientApiMod.default = js.native
  var storyStore: typingsSlinky.storybookClientApi.storyStoreMod.default = js.native
  def clearDecorators(): Unit = js.native
}

object Channel {
  @scala.inline
  def apply(
    clearDecorators: () => Unit,
    clientApi: typingsSlinky.storybookClientApi.clientApiMod.default,
    storyStore: typingsSlinky.storybookClientApi.storyStoreMod.default
  ): Channel = {
    val __obj = js.Dynamic.literal(clearDecorators = js.Any.fromFunction0(clearDecorators), clientApi = clientApi.asInstanceOf[js.Any], storyStore = storyStore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
  @scala.inline
  implicit class ChannelOps[Self <: Channel] (val x: Self) extends AnyVal {
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
    def setClearDecorators(value: () => Unit): Self = this.set("clearDecorators", js.Any.fromFunction0(value))
    @scala.inline
    def setClientApi(value: typingsSlinky.storybookClientApi.clientApiMod.default): Self = this.set("clientApi", value.asInstanceOf[js.Any])
    @scala.inline
    def setStoryStore(value: typingsSlinky.storybookClientApi.storyStoreMod.default): Self = this.set("storyStore", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannel(value: default): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannelNull: Self = this.set("channel", null)
  }
  
}

