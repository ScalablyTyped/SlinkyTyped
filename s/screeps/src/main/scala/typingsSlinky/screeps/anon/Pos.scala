package typingsSlinky.screeps.anon

import typingsSlinky.screeps.RoomPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pos extends StObject {
  
  var pos: RoomPosition = js.native
}
object Pos {
  
  @scala.inline
  def apply(pos: RoomPosition): Pos = {
    val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pos]
  }
  
  @scala.inline
  implicit class PosMutableBuilder[Self <: Pos] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPos(value: RoomPosition): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
  }
}
