package typingsSlinky.three.raycasterMod

import typingsSlinky.three.face3Mod.Face3
import typingsSlinky.three.object3DMod.Object3D
import typingsSlinky.three.vector2Mod.Vector2
import typingsSlinky.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Intersection extends js.Object {
  var distance: Double = js.native
  var distanceToRay: js.UndefOr[Double] = js.native
  var face: js.UndefOr[Face3 | Null] = js.native
  var faceIndex: js.UndefOr[Double] = js.native
  var index: js.UndefOr[Double] = js.native
  var `object`: Object3D = js.native
  var point: Vector3 = js.native
  var uv: js.UndefOr[Vector2] = js.native
}

object Intersection {
  @scala.inline
  def apply(distance: Double, `object`: Object3D, point: Vector3): Intersection = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Intersection]
  }
  @scala.inline
  implicit class IntersectionOps[Self <: Intersection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: Object3D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoint(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistanceToRay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceToRay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistanceToRay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceToRay")(js.undefined)
        ret
    }
    @scala.inline
    def withFace(value: Face3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("face")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("face")(js.undefined)
        ret
    }
    @scala.inline
    def withFaceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("face")(null)
        ret
    }
    @scala.inline
    def withFaceIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faceIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaceIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faceIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withUv(value: Vector2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uv")(js.undefined)
        ret
    }
  }
  
}

