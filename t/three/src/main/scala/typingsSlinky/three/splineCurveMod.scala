package typingsSlinky.three

import typingsSlinky.three.curveMod.Curve
import typingsSlinky.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/extras/curves/SplineCurve", JSImport.Namespace)
@js.native
object splineCurveMod extends js.Object {
  
  @js.native
  class SplineCurve () extends Curve[Vector2] {
    def this(points: js.Array[Vector2]) = this()
    
    /**
    	 * @default []
    	 */
    var points: js.Array[Vector2] = js.native
  }
}
