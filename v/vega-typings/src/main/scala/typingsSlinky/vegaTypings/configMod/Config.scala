package typingsSlinky.vegaTypings.configMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vegaTypings.anon.Bind
import typingsSlinky.vegaTypings.autosizeMod.AutoSize
import typingsSlinky.vegaTypings.colorMod.Color
import typingsSlinky.vegaTypings.paddingMod.Padding
import typingsSlinky.vegaTypings.signalMod.InitSignal
import typingsSlinky.vegaTypings.signalMod.NewSignal
import typingsSlinky.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<std.Record<vega-typings.vega-typings/types/spec/config.MarkConfigKeys, vega-typings.vega-typings/types/spec/config.MarkConfig>> */
/* Inlined parent std.Partial<std.Record<vega-typings.vega-typings/types/spec/config.AxisConfigKeys, vega-typings.vega-typings/types/spec/config.AxisConfig>> */
@js.native
trait Config extends js.Object {
  var arc: js.UndefOr[MarkConfig] = js.native
  var area: js.UndefOr[MarkConfig] = js.native
  var autosize: js.UndefOr[AutoSize | SignalRef] = js.native
  var axis: js.UndefOr[AxisConfig] = js.native
  var axisBand: js.UndefOr[AxisConfig] = js.native
  var axisBottom: js.UndefOr[AxisConfig] = js.native
  var axisLeft: js.UndefOr[AxisConfig] = js.native
  var axisRight: js.UndefOr[AxisConfig] = js.native
  var axisTop: js.UndefOr[AxisConfig] = js.native
  var axisX: js.UndefOr[AxisConfig] = js.native
  var axisY: js.UndefOr[AxisConfig] = js.native
  var background: js.UndefOr[Null | Color | SignalRef] = js.native
   // TODO
  var events: js.UndefOr[Bind] = js.native
  var group: js.UndefOr[js.Any] = js.native
  var image: js.UndefOr[MarkConfig] = js.native
  var legend: js.UndefOr[LegendConfig] = js.native
  var line: js.UndefOr[MarkConfig] = js.native
  /**
    * A delimiter, such as a newline character, upon which to break text strings into multiple lines. This property provides a global default for text marks, which is overridden by mark or style config settings, and by the "lineBreak" mark encoding channel. If signal-valued, either string or regular expression (regexp) values are valid.
    */
  var lineBreak: js.UndefOr[String | SignalRef] = js.native
  var mark: js.UndefOr[MarkConfig] = js.native
  var padding: js.UndefOr[Padding | SignalRef] = js.native
  var path: js.UndefOr[MarkConfig] = js.native
  var projection: js.UndefOr[ProjectionConfig] = js.native
  var range: js.UndefOr[RangeConfig] = js.native
  var rect: js.UndefOr[MarkConfig] = js.native
  var rule: js.UndefOr[MarkConfig] = js.native
  var shape: js.UndefOr[MarkConfig] = js.native
  var signals: js.UndefOr[js.Array[InitSignal | NewSignal]] = js.native
  var style: js.UndefOr[StringDictionary[MarkConfig]] = js.native
  var symbol: js.UndefOr[MarkConfig] = js.native
  var text: js.UndefOr[MarkConfig] = js.native
  var title: js.UndefOr[TitleConfig] = js.native
  var trail: js.UndefOr[MarkConfig] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArc(value: MarkConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arc")(js.undefined)
        ret
    }
    @scala.inline
    def withArea(value: MarkConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(js.undefined)
        ret
    }
    @scala.inline
    def withAutosize(value: AutoSize | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autosize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutosize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autosize")(js.undefined)
        ret
    }
    @scala.inline
    def withAxis(value: AxisConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisBand(value: AxisConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisBand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisBand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisBand")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisBottom(value: AxisConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisLeft(value: AxisConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisRight(value: AxisConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisRight")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisTop(value: AxisConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisTop")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisX(value: AxisConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisX")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisY(value: AxisConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisY")(js.undefined)
        ret
    }
    @scala.inline
    def withBackground(value: Color | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(null)
        ret
    }
    @scala.inline
    def withEvents(value: Bind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: MarkConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withLegend(value: LegendConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(js.undefined)
        ret
    }
    @scala.inline
    def withLine(value: MarkConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(js.undefined)
        ret
    }
    @scala.inline
    def withLineBreak(value: String | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineBreak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineBreak: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineBreak")(js.undefined)
        ret
    }
    @scala.inline
    def withMark(value: MarkConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Padding | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: MarkConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withProjection(value: ProjectionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: RangeConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withRect(value: MarkConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rect")(js.undefined)
        ret
    }
    @scala.inline
    def withRule(value: MarkConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(js.undefined)
        ret
    }
    @scala.inline
    def withShape(value: MarkConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(js.undefined)
        ret
    }
    @scala.inline
    def withSignals(value: js.Array[InitSignal | NewSignal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signals")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: StringDictionary[MarkConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbol(value: MarkConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: MarkConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: TitleConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTrail(value: MarkConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trail")(js.undefined)
        ret
    }
  }
  
}

