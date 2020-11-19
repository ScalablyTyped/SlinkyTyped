package typingsSlinky.three

import typingsSlinky.three.curveMod.Curve
import typingsSlinky.three.geometryMod.Geometry
import typingsSlinky.three.vector2Mod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/extras/core/CurvePath", JSImport.Namespace)
@js.native
object curvePathMod extends js.Object {
  
  @js.native
  class CurvePath[T /* <: Vector */] () extends Curve[T] {
    
    def add(curve: Curve[T]): Unit = js.native
    
    var autoClose: Boolean = js.native
    
    def closePath(): Unit = js.native
    
    /**
    	 * @deprecated Use {@link Geometry#setFromPoints new THREE.Geometry().setFromPoints( points )} instead.
    	 */
    def createGeometry(points: js.Array[T]): Geometry = js.native
    
    /**
    	 * @deprecated Use {@link Geometry#setFromPoints new THREE.Geometry().setFromPoints( points )} instead.
    	 */
    def createPointsGeometry(divisions: Double): Geometry = js.native
    
    /**
    	 * @deprecated Use {@link Geometry#setFromPoints new THREE.Geometry().setFromPoints( points )} instead.
    	 */
    def createSpacedPointsGeometry(divisions: Double): Geometry = js.native
    
    var curves: js.Array[Curve[T]] = js.native
    
    def getCurveLengths(): js.Array[Double] = js.native
  }
}
