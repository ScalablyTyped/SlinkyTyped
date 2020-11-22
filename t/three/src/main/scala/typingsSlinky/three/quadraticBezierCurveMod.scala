package typingsSlinky.three

import typingsSlinky.three.curveMod.Curve
import typingsSlinky.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/extras/curves/QuadraticBezierCurve", JSImport.Namespace)
@js.native
object quadraticBezierCurveMod extends js.Object {
  
  @js.native
  class QuadraticBezierCurve protected () extends Curve[Vector2] {
    def this(v0: Vector2, v1: Vector2, v2: Vector2) = this()
    
    /**
    	 * @default new THREE.Vector2()
    	 */
    var v0: Vector2 = js.native
    
    /**
    	 * @default new THREE.Vector2()
    	 */
    var v1: Vector2 = js.native
    
    /**
    	 * @default new THREE.Vector2()
    	 */
    var v2: Vector2 = js.native
  }
}
