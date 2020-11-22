package typingsSlinky.three

import typingsSlinky.three.vector2Mod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/extras/core/Curve", JSImport.Namespace)
@js.native
object curveMod extends js.Object {
  
  @js.native
  class Curve[T /* <: Vector */] () extends js.Object {
    
    /**
    	 * This value determines the amount of divisions when calculating the cumulative segment lengths of a curve via .getLengths.
    	 * To ensure precision when using methods like .getSpacedPoints, it is recommended to increase .arcLengthDivisions if the curve is very large.
    	 * @default 200
    	 */
    var arcLengthDivisions: Double = js.native
    
    def copy(source: Curve[T]): this.type = js.native
    
    def fromJSON(json: js.Object): this.type = js.native
    
    /**
    	 * Get total curve arc length
    	 */
    def getLength(): Double = js.native
    
    /**
    	 * Get list of cumulative segment lengths
    	 */
    def getLengths(): js.Array[Double] = js.native
    def getLengths(divisions: Double): js.Array[Double] = js.native
    
    /**
    	 * Returns a vector for point t of the curve where t is between 0 and 1
    	 * getPoint(t: number, optionalTarget?: T): T;
    	 */
    def getPoint(t: Double): T = js.native
    def getPoint(t: Double, optionalTarget: T): T = js.native
    
    /**
    	 * Returns a vector for point at relative position in curve according to arc length
    	 * getPointAt(u: number, optionalTarget?: T): T;
    	 */
    def getPointAt(u: Double): T = js.native
    def getPointAt(u: Double, optionalTarget: T): T = js.native
    
    /**
    	 * Get sequence of points using getPoint( t )
    	 * getPoints(divisions?: number): T[];
    	 */
    def getPoints(): js.Array[T] = js.native
    def getPoints(divisions: Double): js.Array[T] = js.native
    
    /**
    	 * Get sequence of equi-spaced points using getPointAt( u )
    	 * getSpacedPoints(divisions?: number): T[];
    	 */
    def getSpacedPoints(): js.Array[T] = js.native
    def getSpacedPoints(divisions: Double): js.Array[T] = js.native
    
    /**
    	 * Returns a unit vector tangent at t. If the subclassed curve do not implement its tangent derivation, 2 points a small delta apart will be used to find its gradient which seems to give a reasonable approximation
    	 * getTangent(t: number, optionalTarget?: T): T;
    	 */
    def getTangent(t: Double): T = js.native
    def getTangent(t: Double, optionalTarget: T): T = js.native
    
    /**
    	 * Returns tangent at equidistance point u on the curve
    	 * getTangentAt(u: number, optionalTarget?: T): T;
    	 */
    def getTangentAt(u: Double): T = js.native
    def getTangentAt(u: Double, optionalTarget: T): T = js.native
    
    /**
    	 * Given u ( 0 .. 1 ), get a t to find p. This gives you points which are equi distance
    	 */
    def getUtoTmapping(u: Double, distance: Double): Double = js.native
    
    def toJSON(): js.Object = js.native
    
    /**
    	 * @default 'Curve'
    	 */
    var `type`: String = js.native
    
    /**
    	 * Update the cumlative segment distance cache
    	 */
    def updateArcLengths(): Unit = js.native
  }
  /* static members */
  @js.native
  object Curve extends js.Object {
    
    /**
    	 * @deprecated since r84.
    	 */
    def create(constructorFunc: js.Function, getPointFunc: js.Function): js.Function = js.native
  }
}
