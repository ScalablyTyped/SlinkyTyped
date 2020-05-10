package typingsSlinky.tabris.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transformation extends js.Object {
  /**
    * Clock-wise rotation in radians. Defaults to \`0\`.
    */
  var rotation: js.UndefOr[Double] = js.native
  /**
    * Horizontal scale factor. Defaults to \`1\`.
    */
  var scaleX: js.UndefOr[Double] = js.native
  /**
    * Vertical scale factor. Defaults to \`1\`.
    */
  var scaleY: js.UndefOr[Double] = js.native
  /**
    * Horizontal translation (shift) in dip. Defaults to \`0\`.
    */
  var translationX: js.UndefOr[Double] = js.native
  /**
    * Vertical translation (shift) in dip. Defaults to \`0\`.
    */
  var translationY: js.UndefOr[Double] = js.native
  /**
    * Z-axis translation (shift) in dip. Defaults to \`0\`. Android 5.0+ only.
    */
  var translationZ: js.UndefOr[Double] = js.native
}

object Transformation {
  @scala.inline
  def apply(): Transformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Transformation]
  }
  @scala.inline
  implicit class TransformationOps[Self <: Transformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleX")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleY")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslationX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translationX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslationX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translationX")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslationY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translationY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslationY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translationY")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslationZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translationZ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslationZ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translationZ")(js.undefined)
        ret
    }
  }
  
}

