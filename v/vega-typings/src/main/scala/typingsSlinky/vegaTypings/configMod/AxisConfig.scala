package typingsSlinky.vegaTypings.configMod

import typingsSlinky.vegaTypings.axisMod.LabelOverlap
import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.valuesMod.AlignValue
import typingsSlinky.vegaTypings.valuesMod.AnchorValue
import typingsSlinky.vegaTypings.valuesMod.BooleanValue
import typingsSlinky.vegaTypings.valuesMod.ColorValue
import typingsSlinky.vegaTypings.valuesMod.DashArrayValue
import typingsSlinky.vegaTypings.valuesMod.FontStyleValue
import typingsSlinky.vegaTypings.valuesMod.FontWeightValue
import typingsSlinky.vegaTypings.valuesMod.NumberValue
import typingsSlinky.vegaTypings.valuesMod.StringValue
import typingsSlinky.vegaTypings.valuesMod.TextBaselineValue
import typingsSlinky.vegaTypings.vegaTypingsStrings.center
import typingsSlinky.vegaTypings.vegaTypingsStrings.extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined vega-typings.vega-typings/types/spec/config.ExcludeMappedValueRef<vega-typings.vega-typings/types/spec/axis.BaseAxis> */
@js.native
trait AxisConfig extends js.Object {
  var bandPosition: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
  var domain: ExcludeValueRefKeepSignal[js.UndefOr[Boolean]] = js.native
  var domainColor: ExcludeValueRefKeepSignal[js.UndefOr[ColorValue]] = js.native
  var domainDash: ExcludeValueRefKeepSignal[js.UndefOr[DashArrayValue]] = js.native
  var domainDashOffset: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
  var domainOpacity: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
  var domainWidth: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
  var grid: ExcludeValueRefKeepSignal[js.UndefOr[Boolean]] = js.native
  var gridColor: ExcludeValueRefKeepSignal[js.UndefOr[ColorValue]] = js.native
  var gridDash: ExcludeValueRefKeepSignal[js.UndefOr[DashArrayValue]] = js.native
  var gridDashOffset: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
  var gridOpacity: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
  var gridWidth: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
  var labelAlign: ExcludeValueRefKeepSignal[js.UndefOr[AlignValue]] = js.native
  var labelAngle: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
  var labelBaseline: ExcludeValueRefKeepSignal[js.UndefOr[TextBaselineValue]] = js.native
  var labelBound: ExcludeValueRefKeepSignal[js.UndefOr[Double | Boolean | SignalRef]] = js.native
  var labelColor: ExcludeValueRefKeepSignal[js.UndefOr[ColorValue]] = js.native
  var labelFlush: ExcludeValueRefKeepSignal[js.UndefOr[Double | Boolean | SignalRef]] = js.native
  var labelFlushOffset: ExcludeValueRefKeepSignal[js.UndefOr[Double | SignalRef]] = js.native
  var labelFont: ExcludeValueRefKeepSignal[js.UndefOr[StringValue]] = js.native
  var labelFontSize: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
  var labelFontStyle: ExcludeValueRefKeepSignal[js.UndefOr[FontStyleValue]] = js.native
  var labelFontWeight: ExcludeValueRefKeepSignal[js.UndefOr[FontWeightValue]] = js.native
  var labelLimit: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
  var labelLineHeight: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
  var labelOffset: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
  var labelOpacity: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
  var labelOverlap: ExcludeValueRefKeepSignal[js.UndefOr[LabelOverlap | SignalRef]] = js.native
  var labelPadding: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
  var labelSeparation: ExcludeValueRefKeepSignal[js.UndefOr[Double | SignalRef]] = js.native
  var labels: ExcludeValueRefKeepSignal[js.UndefOr[Boolean]] = js.native
  var maxExtent: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
  var minExtent: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
  var tickBand: ExcludeValueRefKeepSignal[js.UndefOr[center | extent | SignalRef]] = js.native
  var tickColor: ExcludeValueRefKeepSignal[js.UndefOr[ColorValue]] = js.native
  var tickDash: ExcludeValueRefKeepSignal[js.UndefOr[DashArrayValue]] = js.native
  var tickDashOffset: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
  var tickExtra: ExcludeValueRefKeepSignal[js.UndefOr[BooleanValue]] = js.native
  var tickOffset: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
  var tickOpacity: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
  var tickRound: ExcludeValueRefKeepSignal[js.UndefOr[BooleanValue]] = js.native
  var tickSize: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
  var tickWidth: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
  var ticks: ExcludeValueRefKeepSignal[js.UndefOr[BooleanValue]] = js.native
  var titleAlign: ExcludeValueRefKeepSignal[js.UndefOr[AlignValue]] = js.native
  var titleAnchor: ExcludeValueRefKeepSignal[js.UndefOr[AnchorValue]] = js.native
  var titleAngle: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
  var titleBaseline: ExcludeValueRefKeepSignal[js.UndefOr[TextBaselineValue]] = js.native
  var titleColor: ExcludeValueRefKeepSignal[js.UndefOr[ColorValue]] = js.native
  var titleFont: ExcludeValueRefKeepSignal[js.UndefOr[StringValue]] = js.native
  var titleFontSize: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
  var titleFontStyle: ExcludeValueRefKeepSignal[js.UndefOr[FontStyleValue]] = js.native
  var titleFontWeight: ExcludeValueRefKeepSignal[js.UndefOr[FontWeightValue]] = js.native
  var titleLimit: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
  var titleLineHeight: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
  var titleOpacity: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
  var titlePadding: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
  var titleX: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
  var titleY: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = js.native
  var translate: ExcludeValueRefKeepSignal[js.UndefOr[Double]] = js.native
}

object AxisConfig {
  @scala.inline
  def apply(): AxisConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisConfig]
  }
  @scala.inline
  implicit class AxisConfigOps[Self <: AxisConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBandPosition(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBandPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: ExcludeValueRefKeepSignal[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainColor(value: ExcludeValueRefKeepSignal[js.UndefOr[ColorValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainDash(value: ExcludeValueRefKeepSignal[js.UndefOr[DashArrayValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainDash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainDash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainDash")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainDashOffset(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainDashOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainDashOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainDashOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainOpacity(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainWidth(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withGrid(value: ExcludeValueRefKeepSignal[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(js.undefined)
        ret
    }
    @scala.inline
    def withGridColor(value: ExcludeValueRefKeepSignal[js.UndefOr[ColorValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColor")(js.undefined)
        ret
    }
    @scala.inline
    def withGridDash(value: ExcludeValueRefKeepSignal[js.UndefOr[DashArrayValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridDash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridDash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridDash")(js.undefined)
        ret
    }
    @scala.inline
    def withGridDashOffset(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridDashOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridDashOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridDashOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withGridOpacity(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withGridWidth(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelAlign(value: ExcludeValueRefKeepSignal[js.UndefOr[AlignValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelAngle(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelBaseline(value: ExcludeValueRefKeepSignal[js.UndefOr[TextBaselineValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelBaseline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelBaseline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelBaseline")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelBound(value: ExcludeValueRefKeepSignal[js.UndefOr[Double | Boolean | SignalRef]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelBound")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelColor(value: ExcludeValueRefKeepSignal[js.UndefOr[ColorValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFlush(value: ExcludeValueRefKeepSignal[js.UndefOr[Double | Boolean | SignalRef]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFlush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFlush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFlush")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFlushOffset(value: ExcludeValueRefKeepSignal[js.UndefOr[Double | SignalRef]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFlushOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFlushOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFlushOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFont(value: ExcludeValueRefKeepSignal[js.UndefOr[StringValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFont")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFontSize(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFontStyle(value: ExcludeValueRefKeepSignal[js.UndefOr[FontStyleValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFontStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFontStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFontWeight(value: ExcludeValueRefKeepSignal[js.UndefOr[FontWeightValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFontWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFontWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelLimit(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelLineHeight(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelLineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelLineHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelLineHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelOffset(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelOpacity(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelOverlap(value: ExcludeValueRefKeepSignal[js.UndefOr[LabelOverlap | SignalRef]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOverlap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelOverlap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOverlap")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelPadding(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelSeparation(value: ExcludeValueRefKeepSignal[js.UndefOr[Double | SignalRef]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSeparation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelSeparation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSeparation")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: ExcludeValueRefKeepSignal[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxExtent(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withMinExtent(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withTickBand(value: ExcludeValueRefKeepSignal[js.UndefOr[center | extent | SignalRef]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickBand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickBand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickBand")(js.undefined)
        ret
    }
    @scala.inline
    def withTickColor(value: ExcludeValueRefKeepSignal[js.UndefOr[ColorValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTickDash(value: ExcludeValueRefKeepSignal[js.UndefOr[DashArrayValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickDash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickDash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickDash")(js.undefined)
        ret
    }
    @scala.inline
    def withTickDashOffset(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickDashOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickDashOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickDashOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withTickExtra(value: ExcludeValueRefKeepSignal[js.UndefOr[BooleanValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickExtra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickExtra: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickExtra")(js.undefined)
        ret
    }
    @scala.inline
    def withTickOffset(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withTickOpacity(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withTickRound(value: ExcludeValueRefKeepSignal[js.UndefOr[BooleanValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickRound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickRound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickRound")(js.undefined)
        ret
    }
    @scala.inline
    def withTickSize(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTickWidth(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTicks(value: ExcludeValueRefKeepSignal[js.UndefOr[BooleanValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleAlign(value: ExcludeValueRefKeepSignal[js.UndefOr[AlignValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleAnchor(value: ExcludeValueRefKeepSignal[js.UndefOr[AnchorValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAnchor")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleAngle(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleBaseline(value: ExcludeValueRefKeepSignal[js.UndefOr[TextBaselineValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleBaseline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleBaseline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleBaseline")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleColor(value: ExcludeValueRefKeepSignal[js.UndefOr[ColorValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleFont(value: ExcludeValueRefKeepSignal[js.UndefOr[StringValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFont")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleFontSize(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleFontStyle(value: ExcludeValueRefKeepSignal[js.UndefOr[FontStyleValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleFontStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFontStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleFontWeight(value: ExcludeValueRefKeepSignal[js.UndefOr[FontWeightValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleFontWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFontWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleLimit(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleLineHeight(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleLineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleLineHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleLineHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleOpacity(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withTitlePadding(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titlePadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitlePadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titlePadding")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleX(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleX")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleY(value: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleY")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslate(value: ExcludeValueRefKeepSignal[js.UndefOr[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate")(js.undefined)
        ret
    }
  }
  
}

