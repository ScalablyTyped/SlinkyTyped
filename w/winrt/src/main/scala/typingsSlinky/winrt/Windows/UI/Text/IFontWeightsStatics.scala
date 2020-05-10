package typingsSlinky.winrt.Windows.UI.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFontWeightsStatics extends js.Object {
  var black: FontWeight = js.native
  var bold: FontWeight = js.native
  var extraBlack: FontWeight = js.native
  var extraBold: FontWeight = js.native
  var extraLight: FontWeight = js.native
  var light: FontWeight = js.native
  var medium: FontWeight = js.native
  var normal: FontWeight = js.native
  var semiBold: FontWeight = js.native
  var semiLight: FontWeight = js.native
  var thin: FontWeight = js.native
}

object IFontWeightsStatics {
  @scala.inline
  def apply(
    black: FontWeight,
    bold: FontWeight,
    extraBlack: FontWeight,
    extraBold: FontWeight,
    extraLight: FontWeight,
    light: FontWeight,
    medium: FontWeight,
    normal: FontWeight,
    semiBold: FontWeight,
    semiLight: FontWeight,
    thin: FontWeight
  ): IFontWeightsStatics = {
    val __obj = js.Dynamic.literal(black = black.asInstanceOf[js.Any], bold = bold.asInstanceOf[js.Any], extraBlack = extraBlack.asInstanceOf[js.Any], extraBold = extraBold.asInstanceOf[js.Any], extraLight = extraLight.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], semiBold = semiBold.asInstanceOf[js.Any], semiLight = semiLight.asInstanceOf[js.Any], thin = thin.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFontWeightsStatics]
  }
  @scala.inline
  implicit class IFontWeightsStaticsOps[Self <: IFontWeightsStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlack(value: FontWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("black")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBold(value: FontWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtraBlack(value: FontWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraBlack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtraBold(value: FontWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraBold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtraLight(value: FontWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraLight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLight(value: FontWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("light")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedium(value: FontWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormal(value: FontWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSemiBold(value: FontWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semiBold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSemiLight(value: FontWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semiLight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThin(value: FontWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

