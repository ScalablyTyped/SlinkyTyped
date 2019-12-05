package typingsSlinky.ts3DashNodejsDashLibrary.libTypesEventsMod

import typingsSlinky.std.Partial
import typingsSlinky.ts3DashNodejsDashLibrary.libNodeChannelMod.TeamSpeakChannel
import typingsSlinky.ts3DashNodejsDashLibrary.libNodeClientMod.TeamSpeakClient
import typingsSlinky.ts3DashNodejsDashLibrary.libTypesQueryResponseMod.QueryResponseTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelEdit extends js.Object {
  var channel: TeamSpeakChannel
  var invoker: TeamSpeakClient
  var modified: Partial[QueryResponseTypes]
  var reasonid: Double
}

object ChannelEdit {
  @scala.inline
  def apply(
    channel: TeamSpeakChannel,
    invoker: TeamSpeakClient,
    modified: Partial[QueryResponseTypes],
    reasonid: Double
  ): ChannelEdit = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], invoker = invoker.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], reasonid = reasonid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChannelEdit]
  }
}

