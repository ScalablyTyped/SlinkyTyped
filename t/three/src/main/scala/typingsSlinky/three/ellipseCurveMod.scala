package typingsSlinky.three

import typingsSlinky.three.curveMod.Curve
import typingsSlinky.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/extras/curves/EllipseCurve", JSImport.Namespace)
@js.native
object ellipseCurveMod extends js.Object {
  
  @js.native
  class EllipseCurve protected () extends Curve[Vector2] {
    def this(
      aX: Double,
      aY: Double,
      xRadius: Double,
      yRadius: Double,
      aStartAngle: Double,
      aEndAngle: Double,
      aClockwise: Boolean,
      aRotation: Double
    ) = this()
    
    var aClockwise: Boolean = js.native
    
    var aEndAngle: Double = js.native
    
    var aRotation: Double = js.native
    
    var aStartAngle: Double = js.native
    
    var aX: Double = js.native
    
    var aY: Double = js.native
    
    var xRadius: Double = js.native
    
    var yRadius: Double = js.native
  }
}
