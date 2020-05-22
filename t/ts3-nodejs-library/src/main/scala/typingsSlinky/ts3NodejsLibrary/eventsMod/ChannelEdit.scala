package typingsSlinky.ts3NodejsLibrary.eventsMod

import typingsSlinky.ts3NodejsLibrary.anon.PartialQueryResponseTypes
import typingsSlinky.ts3NodejsLibrary.channelMod.TeamSpeakChannel
import typingsSlinky.ts3NodejsLibrary.clientMod.TeamSpeakClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelEdit extends js.Object {
  var channel: TeamSpeakChannel
  var invoker: TeamSpeakClient
  var modified: PartialQueryResponseTypes
  var reasonid: Double
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
}

