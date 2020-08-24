package typingsSlinky.three

import typingsSlinky.three.box3Mod.Box3
import typingsSlinky.three.matrix4Mod.Matrix4
import typingsSlinky.three.object3DMod.Object3D
import typingsSlinky.three.planeMod.Plane
import typingsSlinky.three.sphereMod.Sphere
import typingsSlinky.three.spriteMod.Sprite
import typingsSlinky.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/math/Frustum", JSImport.Namespace)
@js.native
object frustumMod extends js.Object {
  @js.native
  class Frustum protected () extends js.Object {
    def this(
      p0: js.UndefOr[Plane],
      p1: js.UndefOr[Plane],
      p2: js.UndefOr[Plane],
      p3: js.UndefOr[Plane],
      p4: js.UndefOr[Plane],
      p5: js.UndefOr[Plane]
    ) = this()
    /**
    	 * Array of 6 vectors.
    	 */
    var planes: js.Array[Plane] = js.native
    def containsPoint(point: Vector3): Boolean = js.native
    def copy(frustum: Frustum): this.type = js.native
    def intersectsBox(box: Box3): Boolean = js.native
    def intersectsObject(`object`: Object3D): Boolean = js.native
    def intersectsSphere(sphere: Sphere): Boolean = js.native
    def intersectsSprite(sprite: Sprite): Boolean = js.native
    def set(p0: Plane, p1: Plane, p2: Plane, p3: Plane, p4: Plane, p5: Plane): Frustum = js.native
    def setFromProjectionMatrix(m: Matrix4): this.type = js.native
  }
  
}

