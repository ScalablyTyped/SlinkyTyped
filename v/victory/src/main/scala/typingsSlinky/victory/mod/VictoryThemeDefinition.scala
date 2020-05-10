package typingsSlinky.victory.mod

import typingsSlinky.victory.AnonCornerRadius
import typingsSlinky.victory.borderWidthnumberstyledat
import typingsSlinky.victory.gutternumberorientationve
import typingsSlinky.victory.styleaxisCSSPropertiesaxi
import typingsSlinky.victory.styledataCSSPropertieslab
import typingsSlinky.victory.styledataCSSPropertieslabCandleColors
import typingsSlinky.victory.styledataCSSPropertieslabColorScale
import typingsSlinky.victory.stylemaxCSSPropertiesmaxL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VictoryThemeDefinition extends js.Object {
  var area: js.UndefOr[styledataCSSPropertieslab] = js.native
  var axis: js.UndefOr[styleaxisCSSPropertiesaxi] = js.native
  var bar: js.UndefOr[styledataCSSPropertieslab] = js.native
  var boxplot: js.UndefOr[stylemaxCSSPropertiesmaxL] = js.native
  var candlestick: js.UndefOr[styledataCSSPropertieslabCandleColors] = js.native
  var chart: js.UndefOr[ThemeBaseProps] = js.native
  var errorbar: js.UndefOr[borderWidthnumberstyledat] = js.native
  var group: js.UndefOr[ThemeBaseProps] = js.native
  var legend: js.UndefOr[gutternumberorientationve] = js.native
  var line: js.UndefOr[styledataCSSPropertieslab] = js.native
  var pie: js.UndefOr[styledataCSSPropertieslab] = js.native
  var scatter: js.UndefOr[styledataCSSPropertieslab] = js.native
  var stack: js.UndefOr[ThemeBaseProps] = js.native
  var tooltip: js.UndefOr[AnonCornerRadius] = js.native
  var voronoi: js.UndefOr[styledataCSSPropertieslabColorScale] = js.native
}

object VictoryThemeDefinition {
  @scala.inline
  def apply(): VictoryThemeDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryThemeDefinition]
  }
  @scala.inline
  implicit class VictoryThemeDefinitionOps[Self <: VictoryThemeDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArea(value: styledataCSSPropertieslab): Self = {
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
    def withAxis(value: styleaxisCSSPropertiesaxi): Self = {
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
    def withBar(value: styledataCSSPropertieslab): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bar")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxplot(value: stylemaxCSSPropertiesmaxL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxplot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxplot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxplot")(js.undefined)
        ret
    }
    @scala.inline
    def withCandlestick(value: styledataCSSPropertieslabCandleColors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candlestick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCandlestick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candlestick")(js.undefined)
        ret
    }
    @scala.inline
    def withChart(value: ThemeBaseProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorbar(value: borderWidthnumberstyledat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorbar")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: ThemeBaseProps): Self = {
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
    def withLegend(value: gutternumberorientationve): Self = {
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
    def withLine(value: styledataCSSPropertieslab): Self = {
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
    def withPie(value: styledataCSSPropertieslab): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pie")(js.undefined)
        ret
    }
    @scala.inline
    def withScatter(value: styledataCSSPropertieslab): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scatter")(js.undefined)
        ret
    }
    @scala.inline
    def withStack(value: ThemeBaseProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: AnonCornerRadius): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withVoronoi(value: styledataCSSPropertieslabColorScale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voronoi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoronoi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voronoi")(js.undefined)
        ret
    }
  }
  
}

