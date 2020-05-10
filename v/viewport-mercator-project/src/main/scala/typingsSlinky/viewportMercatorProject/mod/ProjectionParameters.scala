package typingsSlinky.viewportMercatorProject.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectionParameters extends js.Object {
  var aspect: Double = js.native
  var far: Double = js.native
  var focalDistance: Double = js.native
  var fov: Double = js.native
  var near: Double = js.native
}

object ProjectionParameters {
  @scala.inline
  def apply(aspect: Double, far: Double, focalDistance: Double, fov: Double, near: Double): ProjectionParameters = {
    val __obj = js.Dynamic.literal(aspect = aspect.asInstanceOf[js.Any], far = far.asInstanceOf[js.Any], focalDistance = focalDistance.asInstanceOf[js.Any], fov = fov.asInstanceOf[js.Any], near = near.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectionParameters]
  }
  @scala.inline
  implicit class ProjectionParametersOps[Self <: ProjectionParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAspect(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFar(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("far")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocalDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focalDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFov(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fov")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("near")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

