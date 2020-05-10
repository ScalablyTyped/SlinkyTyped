package typingsSlinky.smoothie.mod

import typingsSlinky.smoothie.AnonIndex
import typingsSlinky.smoothie.AnonLineWidth
import typingsSlinky.smoothie.smoothieStrings.bezier
import typingsSlinky.smoothie.smoothieStrings.linear
import typingsSlinky.smoothie.smoothieStrings.step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChartOptions extends js.Object {
  /**
    * Displays not the latest data, but data from the given percentile.
    * Useful when trying to see old data saved by setting a high value for maxDataSetLength.
    * Should be a value between 0 and 1.
    */
  var displayDataFromPercentile: js.UndefOr[Double] = js.native
  /** Whether to render at different DPI depending upon the device. Enabled by default. */
  var enableDpiScaling: js.UndefOr[Boolean] = js.native
  var grid: js.UndefOr[IGridOptions] = js.native
  var horizontalLines: js.UndefOr[js.Array[IHorizontalLine]] = js.native
  /** Controls how lines are drawn between data points. Defaults to "bezier". */
  var interpolation: js.UndefOr[linear | step | bezier] = js.native
  var labels: js.UndefOr[ILabelOptions] = js.native
  /** The maximum frame rate the chart will render at, in FPS. Default is <code>0</code>, meaning no limit. */
  var limitFPS: js.UndefOr[Double] = js.native
  var maxDataSetLength: js.UndefOr[Double] = js.native
  /** Specify to clamp the upper y-axis to a given value. */
  var maxValue: js.UndefOr[Double] = js.native
  /** Allows proportional padding to be added below the chart. For 10% padding, specify 1.1. */
  var maxValueScale: js.UndefOr[Double] = js.native
  /** Sets the speed at which the chart pans by. */
  var millisPerPixel: js.UndefOr[Double] = js.native
  /** Specify to clamp the lower y-axis to a given value. */
  var minValue: js.UndefOr[Double] = js.native
  /** Allows proportional padding to be added above the chart. For 10% padding, specify 1.1. */
  var minValueScale: js.UndefOr[Double] = js.native
  /** Whether to use time of latest data as current time. */
  var nonRealtimeData: js.UndefOr[Boolean] = js.native
  /** Allows the chart to stretch according to its containers and layout settings. Default is <code>false</code>, for backwards compatibility. */
  var responsive: js.UndefOr[Boolean] = js.native
  /** Controls the rate at which y-value zoom animation occurs. */
  var scaleSmoothing: js.UndefOr[Double] = js.native
  /** Optional function to format time stamps for bottom of chart. You may use <code>SmoothieChart.timeFormatter</code>, or your own/ */
  var timestampFormatter: js.UndefOr[js.Function1[/* date */ js.Date, String]] = js.native
  var tooltip: js.UndefOr[Boolean] = js.native
  var tooltipFormatter: js.UndefOr[js.Function2[/* timestamp */ Double, /* data */ js.Array[AnonIndex], String]] = js.native
  var tooltipLine: js.UndefOr[AnonLineWidth] = js.native
  /** Callback function that formats the intermediate y value labels */
  var yIntermediateFormatter: js.UndefOr[js.Function2[/* intermediate */ Double, /* precision */ Double, String]] = js.native
  /** Callback function that formats the max y value label */
  var yMaxFormatter: js.UndefOr[js.Function2[/* max */ Double, /* precision */ Double, String]] = js.native
  /** Callback function that formats the min y value label */
  var yMinFormatter: js.UndefOr[js.Function2[/* min */ Double, /* precision */ Double, String]] = js.native
  var yRangeFunction: js.UndefOr[js.Function1[/* range */ IRange, IRange]] = js.native
}

object IChartOptions {
  @scala.inline
  def apply(): IChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChartOptions]
  }
  @scala.inline
  implicit class IChartOptionsOps[Self <: IChartOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayDataFromPercentile(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayDataFromPercentile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayDataFromPercentile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayDataFromPercentile")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDpiScaling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDpiScaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDpiScaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDpiScaling")(js.undefined)
        ret
    }
    @scala.inline
    def withGrid(value: IGridOptions): Self = {
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
    def withHorizontalLines(value: js.Array[IHorizontalLine]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalLines")(js.undefined)
        ret
    }
    @scala.inline
    def withInterpolation(value: linear | step | bezier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterpolation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolation")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: ILabelOptions): Self = {
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
    def withLimitFPS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitFPS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimitFPS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitFPS")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDataSetLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDataSetLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDataSetLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDataSetLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxValueScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValueScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValueScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValueScale")(js.undefined)
        ret
    }
    @scala.inline
    def withMillisPerPixel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("millisPerPixel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMillisPerPixel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("millisPerPixel")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValueScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValueScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValueScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValueScale")(js.undefined)
        ret
    }
    @scala.inline
    def withNonRealtimeData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonRealtimeData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonRealtimeData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonRealtimeData")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleSmoothing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleSmoothing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleSmoothing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleSmoothing")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestampFormatter(value: /* date */ js.Date => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampFormatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTimestampFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: Boolean): Self = {
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
    def withTooltipFormatter(value: (/* timestamp */ Double, /* data */ js.Array[AnonIndex]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipFormatter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTooltipFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipLine(value: AnonLineWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipLine")(js.undefined)
        ret
    }
    @scala.inline
    def withYIntermediateFormatter(value: (/* intermediate */ Double, /* precision */ Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yIntermediateFormatter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutYIntermediateFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yIntermediateFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withYMaxFormatter(value: (/* max */ Double, /* precision */ Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yMaxFormatter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutYMaxFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yMaxFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withYMinFormatter(value: (/* min */ Double, /* precision */ Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yMinFormatter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutYMinFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yMinFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withYRangeFunction(value: /* range */ IRange => IRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yRangeFunction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutYRangeFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yRangeFunction")(js.undefined)
        ret
    }
  }
  
}

