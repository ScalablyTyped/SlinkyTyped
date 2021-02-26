package typingsSlinky.three.anon

import typingsSlinky.three.vector2Mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Holes extends StObject {
  
  var holes: js.Array[js.Array[Vector2]] = js.native
  
  var shape: js.Array[Vector2] = js.native
}
object Holes {
  
  @scala.inline
  def apply(holes: js.Array[js.Array[Vector2]], shape: js.Array[Vector2]): Holes = {
    val __obj = js.Dynamic.literal(holes = holes.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[Holes]
  }
  
  @scala.inline
  implicit class HolesMutableBuilder[Self <: Holes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHoles(value: js.Array[js.Array[Vector2]]): Self = StObject.set(x, "holes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHolesVarargs(value: js.Array[Vector2]*): Self = StObject.set(x, "holes", js.Array(value :_*))
    
    @scala.inline
    def setShape(value: js.Array[Vector2]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeVarargs(value: Vector2*): Self = StObject.set(x, "shape", js.Array(value :_*))
  }
}
