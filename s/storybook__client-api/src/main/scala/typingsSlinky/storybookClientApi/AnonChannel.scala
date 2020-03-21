package typingsSlinky.storybookClientApi

import typingsSlinky.storybookChannels.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChannel extends js.Object {
  var channel: default | Null
  var clientApi: typingsSlinky.storybookClientApi.clientApiMod.default
  var storyStore: typingsSlinky.storybookClientApi.storyStoreMod.default
  def clearDecorators(): Unit
}

object AnonChannel {
  @scala.inline
  def apply(
    clearDecorators: () => Unit,
    clientApi: typingsSlinky.storybookClientApi.clientApiMod.default,
    storyStore: typingsSlinky.storybookClientApi.storyStoreMod.default,
    channel: default = null
  ): AnonChannel = {
    val __obj = js.Dynamic.literal(clearDecorators = js.Any.fromFunction0(clearDecorators), clientApi = clientApi.asInstanceOf[js.Any], storyStore = storyStore.asInstanceOf[js.Any])
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChannel]
  }
}

