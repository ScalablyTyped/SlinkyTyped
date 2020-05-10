package typingsSlinky.vegaTypings.configMod

import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.titleMod.TitleFrame
import typingsSlinky.vegaTypings.titleMod.TitleOrient
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

/* Inlined vega-typings.vega-typings/types/spec/config.ExcludeMappedValueRef<vega-typings.vega-typings/types/spec/title.BaseTitle> */
@js.native
trait TitleConfig extends js.Object {
  var align: ExcludeValueRefKeepSignal[js.UndefOr[AlignValue]] = js.native
  var anchor: ExcludeValueRefKeepSignal[js.UndefOr[AnchorValue]] = js.native
  var angle: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
  var baseline: ExcludeValueRefKeepSignal[js.UndefOr[TextBaselineValue]] = js.native
  var color: ExcludeValueRefKeepSignal[js.UndefOr[ColorValue]] = js.native
  var dx: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
  var dy: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
  var font: ExcludeValueRefKeepSignal[js.UndefOr[StringValue]] = js.native
  var fontSize: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
  var fontStyle: ExcludeValueRefKeepSignal[js.UndefOr[FontStyleValue]] = js.native
  var fontWeight: ExcludeValueRefKeepSignal[js.UndefOr[FontWeightValue]] = js.native
  var frame: ExcludeValueRefKeepSignal[js.UndefOr[TitleFrame | StringValue]] = js.native
  var limit: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
  var lineHeight: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
  var offset: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
  var orient: ExcludeValueRefKeepSignal[js.UndefOr[TitleOrient | SignalRef]] = js.native
  var subtitleColor: ExcludeValueRefKeepSignal[js.UndefOr[ColorValue]] = js.native
  var subtitleFont: ExcludeValueRefKeepSignal[js.UndefOr[StringValue]] = js.native
  var subtitleFontSize: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
  var subtitleFontStyle: ExcludeValueRefKeepSignal[js.UndefOr[FontStyleValue]] = js.native
  var subtitleFontWeight: ExcludeValueRefKeepSignal[js.UndefOr[FontWeightValue]] = js.native
  var subtitleLineHeight: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
  var subtitlePadding: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
}

object TitleConfig {
  @scala.inline
  def apply(): TitleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TitleConfig]
  }
  @scala.inline
  implicit class TitleConfigOps[Self <: TitleConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: ExcludeValueRefKeepSignal[js.UndefOr[AlignValue]]): Self = {
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
    def withAnchor(value: ExcludeValueRefKeepSignal[js.UndefOr[AnchorValue]]): Self = {
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
    def withAngle(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
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
    def withBaseline(value: ExcludeValueRefKeepSignal[js.UndefOr[TextBaselineValue]]): Self = {
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
    def withColor(value: ExcludeValueRefKeepSignal[js.UndefOr[ColorValue]]): Self = {
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
    def withDx(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
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
    def withDy(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
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
    def withFont(value: ExcludeValueRefKeepSignal[js.UndefOr[StringValue]]): Self = {
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
    def withFontSize(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
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
    def withFontStyle(value: ExcludeValueRefKeepSignal[js.UndefOr[FontStyleValue]]): Self = {
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
    def withFontWeight(value: ExcludeValueRefKeepSignal[js.UndefOr[FontWeightValue]]): Self = {
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
    def withFrame(value: ExcludeValueRefKeepSignal[js.UndefOr[TitleFrame | StringValue]]): Self = {
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
    def withLimit(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
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
    def withLineHeight(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
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
    def withOffset(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
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
    def withOrient(value: ExcludeValueRefKeepSignal[js.UndefOr[TitleOrient | SignalRef]]): Self = {
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
    def withSubtitleColor(value: ExcludeValueRefKeepSignal[js.UndefOr[ColorValue]]): Self = {
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
    def withSubtitleFont(value: ExcludeValueRefKeepSignal[js.UndefOr[StringValue]]): Self = {
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
    def withSubtitleFontSize(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
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
    def withSubtitleFontStyle(value: ExcludeValueRefKeepSignal[js.UndefOr[FontStyleValue]]): Self = {
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
    def withSubtitleFontWeight(value: ExcludeValueRefKeepSignal[js.UndefOr[FontWeightValue]]): Self = {
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
    def withSubtitleLineHeight(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
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
    def withSubtitlePadding(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
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

