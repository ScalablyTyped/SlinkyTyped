package typingsSlinky.smartFoxServer.global.SFS2X.Requests.System

import typingsSlinky.smartFoxServer.SFS2X.Entities.SFSRoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SFS2X.Requests.System.ChangeRoomPasswordStateRequest")
@js.native
class ChangeRoomPasswordStateRequest protected ()
  extends typingsSlinky.smartFoxServer.SFS2X.Requests.System.ChangeRoomPasswordStateRequest {
  /**
    * Creates a new ChangeRoomPasswordStateRequest instance.
    * @param {Entities.SFSRoom} room    The SFSRoom object corresponding to the Room whose password should be changed.
    * @param {string}           newPass The new password to be assigned to the Room; an empty string or the null value can be passed to remove the Room's password.
    */
  def this(room: SFSRoom, newPass: String) = this()
}
