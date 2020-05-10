package typingsSlinky.sharepoint.SP.JsGrid.IStyleType

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimescaleTier extends js.Object {
  var backgroundColor: js.Any = js.native
  var font: js.Any = js.native
  var fontSize: js.Any = js.native
  var fontWeight: js.Any = js.native
  var horizontalBorderColor: js.Any = js.native
  var horizontalBorderStyle: js.Any = js.native
  var outerBorderColor: js.Any = js.native
  var textColor: js.Any = js.native
  var todayLineColor: js.Any = js.native
  var verticalBorderColor: js.Any = js.native
  var verticalBorderStyle: js.Any = js.native
}

object TimescaleTier {
  @scala.inline
  def apply(
    backgroundColor: js.Any,
    font: js.Any,
    fontSize: js.Any,
    fontWeight: js.Any,
    horizontalBorderColor: js.Any,
    horizontalBorderStyle: js.Any,
    outerBorderColor: js.Any,
    textColor: js.Any,
    todayLineColor: js.Any,
    verticalBorderColor: js.Any,
    verticalBorderStyle: js.Any
  ): TimescaleTier = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], horizontalBorderColor = horizontalBorderColor.asInstanceOf[js.Any], horizontalBorderStyle = horizontalBorderStyle.asInstanceOf[js.Any], outerBorderColor = outerBorderColor.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], todayLineColor = todayLineColor.asInstanceOf[js.Any], verticalBorderColor = verticalBorderColor.asInstanceOf[js.Any], verticalBorderStyle = verticalBorderStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimescaleTier]
  }
  @scala.inline
  implicit class TimescaleTierOps[Self <: TimescaleTier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFont(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontSize(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontWeight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizontalBorderColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizontalBorderStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalBorderStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOuterBorderColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTodayLineColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayLineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalBorderColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalBorderStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalBorderStyle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

