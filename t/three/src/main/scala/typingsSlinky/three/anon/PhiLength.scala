package typingsSlinky.three.anon

import typingsSlinky.three.vector2Mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhiLength extends StObject {
  
  var phiLength: Double = js.native
  
  var phiStart: Double = js.native
  
  var points: js.Array[Vector2] = js.native
  
  var segments: Double = js.native
}
object PhiLength {
  
  @scala.inline
  def apply(phiLength: Double, phiStart: Double, points: js.Array[Vector2], segments: Double): PhiLength = {
    val __obj = js.Dynamic.literal(phiLength = phiLength.asInstanceOf[js.Any], phiStart = phiStart.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhiLength]
  }
  
  @scala.inline
  implicit class PhiLengthMutableBuilder[Self <: PhiLength] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPhiLength(value: Double): Self = StObject.set(x, "phiLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhiStart(value: Double): Self = StObject.set(x, "phiStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoints(value: js.Array[Vector2]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVarargs(value: Vector2*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    @scala.inline
    def setSegments(value: Double): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
  }
}
