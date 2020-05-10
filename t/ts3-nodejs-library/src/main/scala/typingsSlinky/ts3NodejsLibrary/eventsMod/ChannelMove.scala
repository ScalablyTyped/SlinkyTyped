package typingsSlinky.ts3NodejsLibrary.eventsMod

import typingsSlinky.ts3NodejsLibrary.channelMod.TeamSpeakChannel
import typingsSlinky.ts3NodejsLibrary.clientMod.TeamSpeakClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelMove extends js.Object {
  var channel: TeamSpeakChannel = js.native
  var invoker: TeamSpeakClient = js.native
  var order: Double = js.native
  var parent: TeamSpeakChannel = js.native
}

object ChannelMove {
  @scala.inline
  def apply(channel: TeamSpeakChannel, invoker: TeamSpeakClient, order: Double, parent: TeamSpeakChannel): ChannelMove = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], invoker = invoker.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelMove]
  }
  @scala.inline
  implicit class ChannelMoveOps[Self <: ChannelMove] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannel(value: TeamSpeakChannel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvoker(value: TeamSpeakClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: TeamSpeakChannel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

