package typingsSlinky.smartFoxServer.global.SFS2X.Requests.System

import typingsSlinky.smartFoxServer.SFS2X.Entities.SFSRoom
import typingsSlinky.smartFoxServer.SFS2X.Entities.Variables.SFSRoomVariable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SFS2X.Requests.System.SetRoomVariablesRequest")
@js.native
class SetRoomVariablesRequest protected ()
  extends typingsSlinky.smartFoxServer.SFS2X.Requests.System.SetRoomVariablesRequest {
  /**
    * Creates a new SetRoomVariablesRequest instance.
    * @param {Entities.Variables.SFSRoomVariable[]} roomVariables A list of SFSRoomVariable objects representing the Room Variables to be set.
    * @param {Entities.SFSRoom}                     [room=null]          A SFSRoom object representing the Room where to set the Room Variables; if null, the last Room joined by the current user is used.
    */
  def this(roomVariables: js.Array[SFSRoomVariable], room: SFSRoom) = this()
}
