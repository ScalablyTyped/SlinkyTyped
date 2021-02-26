package typingsSlinky.three

import typingsSlinky.three.box3Mod.Box3
import typingsSlinky.three.matrix4Mod.Matrix4
import typingsSlinky.three.planeMod.Plane
import typingsSlinky.three.sphereMod.Sphere
import typingsSlinky.three.vector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rayMod {
  
  @JSImport("three/src/math/Ray", "Ray")
  @js.native
  class Ray () extends StObject {
    def this(origin: Vector3) = this()
    def this(origin: js.UndefOr[scala.Nothing], direction: Vector3) = this()
    def this(origin: Vector3, direction: Vector3) = this()
    
    def applyMatrix4(matrix4: Matrix4): Ray = js.native
    
    def at(t: Double, target: Vector3): Vector3 = js.native
    
    def closestPointToPoint(point: Vector3, target: Vector3): Vector3 = js.native
    
    def copy(ray: Ray): this.type = js.native
    
    /**
    	 * @default new THREE.Vector3( 0, 0, - 1 )
    	 */
    var direction: Vector3 = js.native
    
    def distanceSqToPoint(point: Vector3): Double = js.native
    
    def distanceSqToSegment(v0: Vector3, v1: Vector3): Double = js.native
    def distanceSqToSegment(
      v0: Vector3,
      v1: Vector3,
      optionalPointOnRay: js.UndefOr[scala.Nothing],
      optionalPointOnSegment: Vector3
    ): Double = js.native
    def distanceSqToSegment(v0: Vector3, v1: Vector3, optionalPointOnRay: Vector3): Double = js.native
    def distanceSqToSegment(v0: Vector3, v1: Vector3, optionalPointOnRay: Vector3, optionalPointOnSegment: Vector3): Double = js.native
    
    def distanceToPlane(plane: Plane): Double = js.native
    
    def distanceToPoint(point: Vector3): Double = js.native
    
    def equals(ray: Ray): Boolean = js.native
    
    def intersectBox(box: Box3, target: Vector3): Vector3 | Null = js.native
    
    def intersectPlane(plane: Plane, target: Vector3): Vector3 | Null = js.native
    
    def intersectSphere(sphere: Sphere, target: Vector3): Vector3 | Null = js.native
    
    def intersectTriangle(a: Vector3, b: Vector3, c: Vector3, backfaceCulling: Boolean, target: Vector3): Vector3 | Null = js.native
    
    def intersectsBox(box: Box3): Boolean = js.native
    
    def intersectsPlane(plane: Plane): Boolean = js.native
    
    def intersectsSphere(sphere: Sphere): Boolean = js.native
    
    /**
    	 * @deprecated Use {@link Ray#intersectsBox .intersectsBox()} instead.
    	 */
    def isIntersectionBox(b: js.Any): js.Any = js.native
    
    /**
    	 * @deprecated Use {@link Ray#intersectsPlane .intersectsPlane()} instead.
    	 */
    def isIntersectionPlane(p: js.Any): js.Any = js.native
    
    /**
    	 * @deprecated Use {@link Ray#intersectsSphere .intersectsSphere()} instead.
    	 */
    def isIntersectionSphere(s: js.Any): js.Any = js.native
    
    def lookAt(v: Vector3): Ray = js.native
    
    /**
    	 * @default new THREE.Vector3()
    	 */
    var origin: Vector3 = js.native
    
    def recast(t: Double): Ray = js.native
    
    def set(origin: Vector3, direction: Vector3): Ray = js.native
  }
}
