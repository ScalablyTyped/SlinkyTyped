package typingsSlinky.screeps

import typingsSlinky.screeps.screepsStrings.novice
import typingsSlinky.screeps.screepsStrings.respawn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoomStatusTemporary extends RoomStatus {
  
  var status: novice | respawn = js.native
  
  var timestamp: Double = js.native
}
object RoomStatusTemporary {
  
  @scala.inline
  def apply(status: novice | respawn, timestamp: Double): RoomStatusTemporary = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomStatusTemporary]
  }
  
  @scala.inline
  implicit class RoomStatusTemporaryMutableBuilder[Self <: RoomStatusTemporary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: novice | respawn): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
