package typingsSlinky.winrtUwp.Windows.Media.Core

import typingsSlinky.winrtUwp.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the style of the rendered text in a TimedTextCue . You can set the style of a substring within a TimedTextLine by using the Subformats property. */
@js.native
trait TimedTextStyle extends js.Object {
  /** Gets or sets the background color of timed text. */
  var background: Color = js.native
  /** Gets or sets a value indicating the direction that timed text is flowed. */
  var flowDirection: TimedTextFlowDirection = js.native
  /** Gets or sets the font family of timed text. */
  var fontFamily: String = js.native
  /** Gets or sets the font size of timed text. */
  var fontSize: TimedTextDouble = js.native
  /** Gets or sets the weight of timed text. */
  var fontWeight: TimedTextWeight = js.native
  /** Gets or sets the color of the timed text glyphs. */
  var foreground: Color = js.native
  /** Gets or sets a value indicating if the background color stays visible when no text is being displayed. */
  var isBackgroundAlwaysShown: Boolean = js.native
  /** Gets or sets the alignment of timed text lines. */
  var lineAlignment: TimedTextLineAlignment = js.native
  /** Gets or sets the name of the timed text style. */
  var name: String = js.native
  /** Gets or sets the outline color of timed text. */
  var outlineColor: Color = js.native
  /** Gets or sets the radius of the blur applied to outline of the timed text. */
  var outlineRadius: TimedTextDouble = js.native
  /** Gets or sets the thickness of the outline of the timed text. */
  var outlineThickness: TimedTextDouble = js.native
}

object TimedTextStyle {
  @scala.inline
  def apply(
    background: Color,
    flowDirection: TimedTextFlowDirection,
    fontFamily: String,
    fontSize: TimedTextDouble,
    fontWeight: TimedTextWeight,
    foreground: Color,
    isBackgroundAlwaysShown: Boolean,
    lineAlignment: TimedTextLineAlignment,
    name: String,
    outlineColor: Color,
    outlineRadius: TimedTextDouble,
    outlineThickness: TimedTextDouble
  ): TimedTextStyle = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], flowDirection = flowDirection.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], foreground = foreground.asInstanceOf[js.Any], isBackgroundAlwaysShown = isBackgroundAlwaysShown.asInstanceOf[js.Any], lineAlignment = lineAlignment.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outlineColor = outlineColor.asInstanceOf[js.Any], outlineRadius = outlineRadius.asInstanceOf[js.Any], outlineThickness = outlineThickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedTextStyle]
  }
  @scala.inline
  implicit class TimedTextStyleOps[Self <: TimedTextStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackground(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlowDirection(value: TimedTextFlowDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontSize(value: TimedTextDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontWeight(value: TimedTextWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForeground(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBackgroundAlwaysShown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBackgroundAlwaysShown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineAlignment(value: TimedTextLineAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlineColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlineRadius(value: TimedTextDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlineThickness(value: TimedTextDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineThickness")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

