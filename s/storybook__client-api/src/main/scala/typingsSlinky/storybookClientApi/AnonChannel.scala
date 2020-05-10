package typingsSlinky.storybookClientApi

import typingsSlinky.storybookChannels.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChannel extends js.Object {
  var channel: default | Null = js.native
  var clientApi: typingsSlinky.storybookClientApi.clientApiMod.default = js.native
  var storyStore: typingsSlinky.storybookClientApi.storyStoreMod.default = js.native
  def clearDecorators(): Unit = js.native
}

object AnonChannel {
  @scala.inline
  def apply(
    clearDecorators: () => Unit,
    clientApi: typingsSlinky.storybookClientApi.clientApiMod.default,
    storyStore: typingsSlinky.storybookClientApi.storyStoreMod.default
  ): AnonChannel = {
    val __obj = js.Dynamic.literal(clearDecorators = js.Any.fromFunction0(clearDecorators), clientApi = clientApi.asInstanceOf[js.Any], storyStore = storyStore.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChannel]
  }
  @scala.inline
  implicit class AnonChannelOps[Self <: AnonChannel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearDecorators(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearDecorators")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClientApi(value: typingsSlinky.storybookClientApi.clientApiMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientApi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoryStore(value: typingsSlinky.storybookClientApi.storyStoreMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storyStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel(value: default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannelNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(null)
        ret
    }
  }
  
}

