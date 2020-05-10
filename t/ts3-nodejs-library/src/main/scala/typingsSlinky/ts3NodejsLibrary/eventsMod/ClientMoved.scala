package typingsSlinky.ts3NodejsLibrary.eventsMod

import typingsSlinky.ts3NodejsLibrary.channelMod.TeamSpeakChannel
import typingsSlinky.ts3NodejsLibrary.clientMod.TeamSpeakClient
import typingsSlinky.ts3NodejsLibrary.enumMod.ReasonIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientMoved extends js.Object {
  var channel: TeamSpeakChannel = js.native
  var client: TeamSpeakClient = js.native
  var reasonid: ReasonIdentifier = js.native
}

object ClientMoved {
  @scala.inline
  def apply(channel: TeamSpeakChannel, client: TeamSpeakClient, reasonid: ReasonIdentifier): ClientMoved = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], reasonid = reasonid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientMoved]
  }
  @scala.inline
  implicit class ClientMovedOps[Self <: ClientMoved] (val x: Self) extends AnyVal {
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
    def withClient(value: TeamSpeakClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReasonid(value: ReasonIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

