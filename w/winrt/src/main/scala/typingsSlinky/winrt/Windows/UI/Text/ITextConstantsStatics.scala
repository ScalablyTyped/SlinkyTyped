package typingsSlinky.winrt.Windows.UI.Text

import typingsSlinky.winrt.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextConstantsStatics extends js.Object {
  var autoColor: Color = js.native
  var maxUnitCount: Double = js.native
  var minUnitCount: Double = js.native
  var undefinedColor: Color = js.native
  var undefinedFloatValue: Double = js.native
  var undefinedFontStretch: FontStretch = js.native
  var undefinedFontStyle: FontStyle = js.native
  var undefinedInt32Value: Double = js.native
}

object ITextConstantsStatics {
  @scala.inline
  def apply(
    autoColor: Color,
    maxUnitCount: Double,
    minUnitCount: Double,
    undefinedColor: Color,
    undefinedFloatValue: Double,
    undefinedFontStretch: FontStretch,
    undefinedFontStyle: FontStyle,
    undefinedInt32Value: Double
  ): ITextConstantsStatics = {
    val __obj = js.Dynamic.literal(autoColor = autoColor.asInstanceOf[js.Any], maxUnitCount = maxUnitCount.asInstanceOf[js.Any], minUnitCount = minUnitCount.asInstanceOf[js.Any], undefinedColor = undefinedColor.asInstanceOf[js.Any], undefinedFloatValue = undefinedFloatValue.asInstanceOf[js.Any], undefinedFontStretch = undefinedFontStretch.asInstanceOf[js.Any], undefinedFontStyle = undefinedFontStyle.asInstanceOf[js.Any], undefinedInt32Value = undefinedInt32Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextConstantsStatics]
  }
  @scala.inline
  implicit class ITextConstantsStaticsOps[Self <: ITextConstantsStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxUnitCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxUnitCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinUnitCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minUnitCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUndefinedColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undefinedColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUndefinedFloatValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undefinedFloatValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUndefinedFontStretch(value: FontStretch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undefinedFontStretch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUndefinedFontStyle(value: FontStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undefinedFontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUndefinedInt32Value(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undefinedInt32Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

