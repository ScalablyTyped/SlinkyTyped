package typingsSlinky.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FillStyle_ extends js.Object {
  var fillStyle: js.UndefOr[String] = js.native
  var shadowBlur: js.UndefOr[String] = js.native
  var shadowColor: js.UndefOr[String] = js.native
  var strokeStyle: js.UndefOr[String] = js.native
}

object FillStyle_ {
  @scala.inline
  def apply(): FillStyle_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillStyle_]
  }
  @scala.inline
  implicit class FillStyle_Ops[Self <: FillStyle_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFillStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowBlur(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowColor")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeStyle")(js.undefined)
        ret
    }
  }
  
}

