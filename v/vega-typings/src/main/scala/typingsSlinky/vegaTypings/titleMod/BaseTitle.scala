package typingsSlinky.vegaTypings.titleMod

import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.valuesMod.AlignValue
import typingsSlinky.vegaTypings.valuesMod.AnchorValue
import typingsSlinky.vegaTypings.valuesMod.ColorValue
import typingsSlinky.vegaTypings.valuesMod.FontStyleValue
import typingsSlinky.vegaTypings.valuesMod.FontWeightValue
import typingsSlinky.vegaTypings.valuesMod.NumberValue
import typingsSlinky.vegaTypings.valuesMod.StringValue
import typingsSlinky.vegaTypings.valuesMod.TextBaselineValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseTitle extends js.Object {
  /**
    * Horizontal text alignment for title text. One of `"left"`, `"center"`, or `"right"`.
    */
  var align: js.UndefOr[AlignValue] = js.native
  /**
    * The anchor position for placing the title and subtitle text. One of `"start"`, `"middle"`, or `"end"`. For example, with an orientation of top these anchor positions map to a left-, center-, or right-aligned title.
    */
  var anchor: js.UndefOr[AnchorValue] = js.native
  /**
    * Angle in degrees of title and subtitle text.
    */
  var angle: js.UndefOr[NumberValue] = js.native
  /**
    * Vertical text baseline for title and subtitle text. One of `"top"`, `"middle"`, `"bottom"`, or `"alphabetic"`.
    */
  var baseline: js.UndefOr[TextBaselineValue] = js.native
  /**
    * Text color for title text.
    */
  var color: js.UndefOr[ColorValue] = js.native
  /**
    * Delta offset for title and subtitle text x-coordinate.
    */
  var dx: js.UndefOr[NumberValue] = js.native
  /**
    * Delta offset for title and subtitle text y-coordinate.
    */
  var dy: js.UndefOr[NumberValue] = js.native
  /**
    * Font name for title text.
    */
  var font: js.UndefOr[StringValue] = js.native
  /**
    * Font size in pixels for title text.
    *
    * @minimum 0
    */
  var fontSize: js.UndefOr[NumberValue] = js.native
  /**
    * Font style for title text.
    */
  var fontStyle: js.UndefOr[FontStyleValue] = js.native
  /**
    * Font weight for title text.
    * This can be either a string (e.g `"bold"`, `"normal"`) or a number (`100`, `200`, `300`, ..., `900` where `"normal"` = `400` and `"bold"` = `700`).
    */
  var fontWeight: js.UndefOr[FontWeightValue] = js.native
  /**
    * The reference frame for the anchor position, one of `"bounds"` (to anchor relative to the full bounding box) or `"group"` (to anchor relative to the group width or height).
    */
  var frame: js.UndefOr[TitleFrame | StringValue] = js.native
  /**
    * The maximum allowed length in pixels of title and subtitle text.
    *
    * @minimum 0
    */
  var limit: js.UndefOr[NumberValue] = js.native
  /**
    * Line height in pixels for multi-line title text.
    */
  var lineHeight: js.UndefOr[NumberValue] = js.native
  /**
    * The orthogonal offset in pixels by which to displace the title group from its position along the edge of the chart.
    */
  var offset: js.UndefOr[NumberValue] = js.native
  /**
    * Default title orientation (`"top"`, `"bottom"`, `"left"`, or `"right"`)
    */
  var orient: js.UndefOr[TitleOrient | SignalRef] = js.native
  /**
    * Text color for subtitle text.
    */
  var subtitleColor: js.UndefOr[ColorValue] = js.native
  /**
    * Font name for subtitle text.
    */
  var subtitleFont: js.UndefOr[StringValue] = js.native
  /**
    * Font size in pixels for subtitle text.
    *
    * @minimum 0
    */
  var subtitleFontSize: js.UndefOr[NumberValue] = js.native
  /**
    * Font style for subtitle text.
    */
  var subtitleFontStyle: js.UndefOr[FontStyleValue] = js.native
  /**
    * Font weight for subtitle text.
    * This can be either a string (e.g `"bold"`, `"normal"`) or a number (`100`, `200`, `300`, ..., `900` where `"normal"` = `400` and `"bold"` = `700`).
    */
  var subtitleFontWeight: js.UndefOr[FontWeightValue] = js.native
  /**
    * Line height in pixels for multi-line subtitle text.
    */
  var subtitleLineHeight: js.UndefOr[NumberValue] = js.native
  /**
    * The padding in pixels between title and subtitle text.
    */
  var subtitlePadding: js.UndefOr[NumberValue] = js.native
}

object BaseTitle {
  @scala.inline
  def apply(): BaseTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseTitle]
  }
  @scala.inline
  implicit class BaseTitleOps[Self <: BaseTitle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: AlignValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withAnchor(value: AnchorValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(js.undefined)
        ret
    }
    @scala.inline
    def withAnchorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(null)
        ret
    }
    @scala.inline
    def withAngle(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseline(value: TextBaselineValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseline")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: ColorValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withColorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(null)
        ret
    }
    @scala.inline
    def withDx(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dx")(js.undefined)
        ret
    }
    @scala.inline
    def withDy(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dy")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: StringValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSize(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFontStyle(value: FontStyleValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFontWeight(value: FontWeightValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withFrame(value: TitleFrame | StringValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withLineHeight(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withOrient(value: TitleOrient | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orient")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitleColor(value: ColorValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitleColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitleColorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleColor")(null)
        ret
    }
    @scala.inline
    def withSubtitleFont(value: StringValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitleFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleFont")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitleFontSize(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitleFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitleFontStyle(value: FontStyleValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleFontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitleFontStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleFontStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitleFontWeight(value: FontWeightValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleFontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitleFontWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleFontWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitleLineHeight(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleLineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitleLineHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleLineHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitlePadding(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitlePadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitlePadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitlePadding")(js.undefined)
        ret
    }
  }
  
}

