package typingsSlinky.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAxis extends js.Object {
  var automatic: Boolean = js.native
   // %
  var axisSize: Double = js.native
   // readonly
  var bounds: IRectangle = js.native
  var chart: IChart = js.native
  var custom: Boolean = js.native
   // %
  var end: Double = js.native
  var endPos: Double = js.native
  var format: IFormat = js.native
   // readonly
  var grid: IGrid = js.native
  var horizontal: Boolean = js.native
  var increm: Double = js.native
  var increment: Double = js.native
  var innerTicks: ITicks = js.native
  var inverted: Boolean = js.native
  var labels: IAxisLabels = js.native
  var log: Boolean = js.native
  var maximum: Double = js.native
  var minimum: Double = js.native
  var minorTicks: IMinorTicks = js.native
    // readonly
  var otherSize: Boolean = js.native
    // readonly?
  var position: Double = js.native
  var scale: Double = js.native
  var start: Double = js.native
  var startPos: Double = js.native
  var ticks: ITicks = js.native
  var title: IAxisTitle = js.native
  var visible: Boolean = js.native
  def calc(value: Double): Double = js.native
  def fromPos(position: Double): Double = js.native
  def fromSize(size: Double): Double = js.native
  def hasAnySeries(): Boolean = js.native
  def scroll(delta: Double): Unit = js.native
  def setMinMax(minimum: Double, maximum: Double): Unit = js.native
}

object IAxis {
  @scala.inline
  def apply(
    automatic: Boolean,
    axisSize: Double,
    bounds: IRectangle,
    calc: Double => Double,
    chart: IChart,
    custom: Boolean,
    end: Double,
    endPos: Double,
    format: IFormat,
    fromPos: Double => Double,
    fromSize: Double => Double,
    grid: IGrid,
    hasAnySeries: () => Boolean,
    horizontal: Boolean,
    increm: Double,
    increment: Double,
    innerTicks: ITicks,
    inverted: Boolean,
    labels: IAxisLabels,
    log: Boolean,
    maximum: Double,
    minimum: Double,
    minorTicks: IMinorTicks,
    otherSize: Boolean,
    position: Double,
    scale: Double,
    scroll: Double => Unit,
    setMinMax: (Double, Double) => Unit,
    start: Double,
    startPos: Double,
    ticks: ITicks,
    title: IAxisTitle,
    visible: Boolean
  ): IAxis = {
    val __obj = js.Dynamic.literal(automatic = automatic.asInstanceOf[js.Any], axisSize = axisSize.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], calc = js.Any.fromFunction1(calc), chart = chart.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], endPos = endPos.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], fromPos = js.Any.fromFunction1(fromPos), fromSize = js.Any.fromFunction1(fromSize), grid = grid.asInstanceOf[js.Any], hasAnySeries = js.Any.fromFunction0(hasAnySeries), horizontal = horizontal.asInstanceOf[js.Any], increm = increm.asInstanceOf[js.Any], increment = increment.asInstanceOf[js.Any], innerTicks = innerTicks.asInstanceOf[js.Any], inverted = inverted.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], maximum = maximum.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any], minorTicks = minorTicks.asInstanceOf[js.Any], otherSize = otherSize.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], scroll = js.Any.fromFunction1(scroll), setMinMax = js.Any.fromFunction2(setMinMax), start = start.asInstanceOf[js.Any], startPos = startPos.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAxis]
  }
  @scala.inline
  implicit class IAxisOps[Self <: IAxis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomatic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automatic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAxisSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBounds(value: IRectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalc(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calc")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChart(value: IChart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndPos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endPos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: IFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromPos(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromPos")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFromSize(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGrid(value: IGrid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasAnySeries(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAnySeries")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHorizontal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncrem(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncrement(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerTicks(value: ITicks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerTicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInverted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabels(value: IAxisLabels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinorTicks(value: IMinorTicks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOtherSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScroll(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMinMax(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinMax")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartPos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTicks(value: ITicks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: IAxisTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

