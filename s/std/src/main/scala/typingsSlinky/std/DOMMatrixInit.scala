package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMMatrixInit extends DOMMatrix2DInit {
  var is2D: js.UndefOr[scala.Boolean] = js.native
  var m13: js.UndefOr[Double] = js.native
  var m14: js.UndefOr[Double] = js.native
  var m23: js.UndefOr[Double] = js.native
  var m24: js.UndefOr[Double] = js.native
  var m31: js.UndefOr[Double] = js.native
  var m32: js.UndefOr[Double] = js.native
  var m33: js.UndefOr[Double] = js.native
  var m34: js.UndefOr[Double] = js.native
  var m43: js.UndefOr[Double] = js.native
  var m44: js.UndefOr[Double] = js.native
}

object DOMMatrixInit {
  @scala.inline
  def apply(): DOMMatrixInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DOMMatrixInit]
  }
  @scala.inline
  implicit class DOMMatrixInitOps[Self <: DOMMatrixInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIs2D(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is2D")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs2D: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is2D")(js.undefined)
        ret
    }
    @scala.inline
    def withM13(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m13")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutM13: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m13")(js.undefined)
        ret
    }
    @scala.inline
    def withM14(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m14")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutM14: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m14")(js.undefined)
        ret
    }
    @scala.inline
    def withM23(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m23")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutM23: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m23")(js.undefined)
        ret
    }
    @scala.inline
    def withM24(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m24")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutM24: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m24")(js.undefined)
        ret
    }
    @scala.inline
    def withM31(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m31")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutM31: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m31")(js.undefined)
        ret
    }
    @scala.inline
    def withM32(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m32")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutM32: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m32")(js.undefined)
        ret
    }
    @scala.inline
    def withM33(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m33")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutM33: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m33")(js.undefined)
        ret
    }
    @scala.inline
    def withM34(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m34")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutM34: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m34")(js.undefined)
        ret
    }
    @scala.inline
    def withM43(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m43")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutM43: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m43")(js.undefined)
        ret
    }
    @scala.inline
    def withM44(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m44")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutM44: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m44")(js.undefined)
        ret
    }
  }
  
}

