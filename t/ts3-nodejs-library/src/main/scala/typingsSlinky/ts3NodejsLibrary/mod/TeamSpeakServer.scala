package typingsSlinky.ts3NodejsLibrary.mod

import typingsSlinky.ts3NodejsLibrary.responseTypesMod.ServerEntry
import typingsSlinky.ts3NodejsLibrary.serverMod.TeamSpeakServer.MultiServerType
import typingsSlinky.ts3NodejsLibrary.serverMod.TeamSpeakServer.ServerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts3-nodejs-library/lib", "TeamSpeakServer")
@js.native
class TeamSpeakServer protected ()
  extends typingsSlinky.ts3NodejsLibrary.serverMod.TeamSpeakServer {
  def this(parent: typingsSlinky.ts3NodejsLibrary.teamSpeakMod.TeamSpeak, list: ServerEntry) = this()
}
/* static members */
@JSImport("ts3-nodejs-library/lib", "TeamSpeakServer")
@js.native
object TeamSpeakServer extends js.Object {
  
  /** retrieves the client id from a string or teamspeak client */
  def getId[T /* <: ServerType */](): js.UndefOr[String] = js.native
  def getId[T /* <: ServerType */](server: T): js.UndefOr[String] = js.native
  
  /** retrieves the clients from an array */
  def getMultipleIds(servers: MultiServerType): js.Array[String] = js.native
}
