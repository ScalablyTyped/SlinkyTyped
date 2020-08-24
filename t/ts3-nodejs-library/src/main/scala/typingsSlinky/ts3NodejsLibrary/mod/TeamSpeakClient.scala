package typingsSlinky.ts3NodejsLibrary.mod

import typingsSlinky.ts3NodejsLibrary.clientMod.TeamSpeakClient.MultiClientType
import typingsSlinky.ts3NodejsLibrary.responseTypesMod.ClientEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts3-nodejs-library/lib", "TeamSpeakClient")
@js.native
class TeamSpeakClient protected ()
  extends typingsSlinky.ts3NodejsLibrary.clientMod.TeamSpeakClient {
  def this(parent: typingsSlinky.ts3NodejsLibrary.teamSpeakMod.TeamSpeak, list: ClientEntry) = this()
}

/* static members */
@JSImport("ts3-nodejs-library/lib", "TeamSpeakClient")
@js.native
object TeamSpeakClient extends js.Object {
  /** retrieves the client dbid from a string or teamspeak client */
  def getDbid[T /* <: typingsSlinky.ts3NodejsLibrary.clientMod.TeamSpeakClient.ClientType */](): js.UndefOr[String] = js.native
  def getDbid[T /* <: typingsSlinky.ts3NodejsLibrary.clientMod.TeamSpeakClient.ClientType */](client: T): js.UndefOr[String] = js.native
  /** retrieves the client id from a string or teamspeak client */
  def getId[T /* <: typingsSlinky.ts3NodejsLibrary.clientMod.TeamSpeakClient.ClientType */](): js.UndefOr[String] = js.native
  def getId[T /* <: typingsSlinky.ts3NodejsLibrary.clientMod.TeamSpeakClient.ClientType */](client: T): js.UndefOr[String] = js.native
  /** retrieves the clients from an array */
  def getMultipleDbids(client: MultiClientType): js.Array[String] = js.native
  /** retrieves the clients from an array */
  def getMultipleIds(client: MultiClientType): js.Array[String] = js.native
  /** retrieves the clients from an array */
  def getMultipleUids(client: MultiClientType): js.Array[String] = js.native
  /** retrieves the client dbid from a string or teamspeak client */
  def getUid[T /* <: typingsSlinky.ts3NodejsLibrary.clientMod.TeamSpeakClient.ClientType */](): js.UndefOr[String] = js.native
  def getUid[T /* <: typingsSlinky.ts3NodejsLibrary.clientMod.TeamSpeakClient.ClientType */](client: T): js.UndefOr[String] = js.native
}

