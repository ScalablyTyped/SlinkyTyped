package typingsSlinky.smartFoxServer.global.SFS2X.Requests.System

import typingsSlinky.smartFoxServer.SFS2X.Entities.SFSRoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SFS2X.Requests.System.ChangeRoomNameRequest")
@js.native
class ChangeRoomNameRequest protected ()
  extends typingsSlinky.smartFoxServer.SFS2X.Requests.System.ChangeRoomNameRequest {
  /**
    * Creates a new ChangeRoomNameRequest instance.
    * @param {Entities.SFSRoom} room    The SFSRoom object corresponding to the Room whose name should be changed.
    * @param {string}           newName The new name to be assigned to the Room.
    */
  def this(room: SFSRoom, newName: String) = this()
}
