package typingsSlinky.screeps

import typingsSlinky.screeps.screepsStrings.closed
import typingsSlinky.screeps.screepsStrings.normal
import typingsSlinky.screeps.screepsStrings.novice
import typingsSlinky.screeps.screepsStrings.respawn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.screeps.RoomStatusPermanent
  - typingsSlinky.screeps.RoomStatusTemporary
*/
trait RoomStatus extends StObject
object RoomStatus {
  
  @scala.inline
  def RoomStatusPermanent(status: normal | closed, timestamp: Null): typingsSlinky.screeps.RoomStatusPermanent = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.screeps.RoomStatusPermanent]
  }
  
  @scala.inline
  def RoomStatusTemporary(status: novice | respawn, timestamp: Double): typingsSlinky.screeps.RoomStatusTemporary = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.screeps.RoomStatusTemporary]
  }
}
