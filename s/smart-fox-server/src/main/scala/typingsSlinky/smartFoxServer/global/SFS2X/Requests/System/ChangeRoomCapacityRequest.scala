package typingsSlinky.smartFoxServer.global.SFS2X.Requests.System

import typingsSlinky.smartFoxServer.SFS2X.Entities.SFSRoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SFS2X.Requests.System.ChangeRoomCapacityRequest")
@js.native
class ChangeRoomCapacityRequest protected ()
  extends typingsSlinky.smartFoxServer.SFS2X.Requests.System.ChangeRoomCapacityRequest {
  /**
    * Creates a new ChangeRoomCapacityRequest instance.
    * @param {Entities.SFSRoom} room        The Room object corresponding to the Room whose capacity should be changed.
    * @param {number}           newMaxUsers The new maximum number of users/players who can join the Room; the -1 value can be passed not to change the Room.maxUsers property.
    * @param {number}           newMaxSpect The new maximum number of spectators who can join the Room (for Game Rooms only); the -1 value can be passed not to change the Room.maxSpectators property.
    */
  def this(room: SFSRoom, newMaxUsers: Double, newMaxSpect: Double) = this()
}
