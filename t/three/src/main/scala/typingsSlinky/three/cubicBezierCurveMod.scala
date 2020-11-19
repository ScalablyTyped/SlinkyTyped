package typingsSlinky.three

import typingsSlinky.three.curveMod.Curve
import typingsSlinky.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/extras/curves/CubicBezierCurve", JSImport.Namespace)
@js.native
object cubicBezierCurveMod extends js.Object {
  
  @js.native
  class CubicBezierCurve protected () extends Curve[Vector2] {
    def this(v0: Vector2, v1: Vector2, v2: Vector2, v3: Vector2) = this()
    
    var v0: Vector2 = js.native
    
    var v1: Vector2 = js.native
    
    var v2: Vector2 = js.native
    
    var v3: Vector2 = js.native
  }
}
