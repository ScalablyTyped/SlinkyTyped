package typingsSlinky.ts3NodejsLibrary.eventsMod

import typingsSlinky.ts3NodejsLibrary.PartialQueryResponseTypes
import typingsSlinky.ts3NodejsLibrary.channelMod.TeamSpeakChannel
import typingsSlinky.ts3NodejsLibrary.clientMod.TeamSpeakClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelEdit extends js.Object {
  var channel: TeamSpeakChannel = js.native
  var invoker: TeamSpeakClient = js.native
  var modified: PartialQueryResponseTypes = js.native
  var reasonid: Double = js.native
}

object ChannelEdit {
  @scala.inline
  def apply(
    channel: TeamSpeakChannel,
    invoker: TeamSpeakClient,
    modified: PartialQueryResponseTypes,
    reasonid: Double
  ): ChannelEdit = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], invoker = invoker.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], reasonid = reasonid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelEdit]
  }
  @scala.inline
  implicit class ChannelEditOps[Self <: ChannelEdit] (val x: Self) extends AnyVal {
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
    def withModified(value: PartialQueryResponseTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReasonid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

