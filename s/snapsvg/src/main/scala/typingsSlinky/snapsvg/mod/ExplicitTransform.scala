package typingsSlinky.snapsvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExplicitTransform extends js.Object {
  var dx: Double = js.native
  var dy: Double = js.native
  var isSimple: Boolean = js.native
  var rotate: Double = js.native
  var scalex: Double = js.native
  var scaley: Double = js.native
  var shear: Double = js.native
}

object ExplicitTransform {
  @scala.inline
  def apply(
    dx: Double,
    dy: Double,
    isSimple: Boolean,
    rotate: Double,
    scalex: Double,
    scaley: Double,
    shear: Double
  ): ExplicitTransform = {
    val __obj = js.Dynamic.literal(dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], isSimple = isSimple.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], scalex = scalex.asInstanceOf[js.Any], scaley = scaley.asInstanceOf[js.Any], shear = shear.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplicitTransform]
  }
  @scala.inline
  implicit class ExplicitTransformOps[Self <: ExplicitTransform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSimple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSimple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScalex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaley(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaley")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shear")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

