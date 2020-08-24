package typingsSlinky.ts3NodejsLibrary.mod

import typingsSlinky.ts3NodejsLibrary.channelGroupMod.TeamSpeakChannelGroup.GroupType
import typingsSlinky.ts3NodejsLibrary.channelGroupMod.TeamSpeakChannelGroup.MultiGroupType
import typingsSlinky.ts3NodejsLibrary.responseTypesMod.ChannelGroupEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts3-nodejs-library/lib", "TeamSpeakChannelGroup")
@js.native
class TeamSpeakChannelGroup protected ()
  extends typingsSlinky.ts3NodejsLibrary.channelGroupMod.TeamSpeakChannelGroup {
  def this(parent: typingsSlinky.ts3NodejsLibrary.teamSpeakMod.TeamSpeak, list: ChannelGroupEntry) = this()
}

/* static members */
@JSImport("ts3-nodejs-library/lib", "TeamSpeakChannelGroup")
@js.native
object TeamSpeakChannelGroup extends js.Object {
  /** retrieves the client id from a string or teamspeak client */
  def getId[T /* <: GroupType */](): js.UndefOr[String] = js.native
  def getId[T /* <: GroupType */](channel: T): js.UndefOr[String] = js.native
  /** retrieves the clients from an array */
  def getMultipleIds(client: MultiGroupType): js.Array[String] = js.native
}

