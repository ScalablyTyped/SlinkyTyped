package typingsSlinky.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILegend extends js.Object {
  var align: Double = js.native
  var bounds: IRectangle = js.native
  var chart: IChart = js.native
  var dividing: IStroke = js.native
  var fontColor: Boolean = js.native
  var format: IFormat = js.native
  var innerOff: Double = js.native
  var inverted: Boolean = js.native
  var itemHeight: Double = js.native
  var legendStyle: String = js.native
  var over: Double = js.native
  var padding: Double = js.native
  var position: String = js.native
  var symbol: ISymbol = js.native
  var textStyle: String = js.native
  var title: IAnnotation = js.native
  var transparent: Boolean = js.native
  var visible: Boolean = js.native
  def availRows(): Double = js.native
  def isVertical(): Boolean = js.native
  def itemText(series: ISeries, index: Double): String = js.native
  def itemsCount(): Double = js.native
  def showValues(): Boolean = js.native
  def totalWidth(): Double = js.native
}

object ILegend {
  @scala.inline
  def apply(
    align: Double,
    availRows: () => Double,
    bounds: IRectangle,
    chart: IChart,
    dividing: IStroke,
    fontColor: Boolean,
    format: IFormat,
    innerOff: Double,
    inverted: Boolean,
    isVertical: () => Boolean,
    itemHeight: Double,
    itemText: (ISeries, Double) => String,
    itemsCount: () => Double,
    legendStyle: String,
    over: Double,
    padding: Double,
    position: String,
    showValues: () => Boolean,
    symbol: ISymbol,
    textStyle: String,
    title: IAnnotation,
    totalWidth: () => Double,
    transparent: Boolean,
    visible: Boolean
  ): ILegend = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], availRows = js.Any.fromFunction0(availRows), bounds = bounds.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], dividing = dividing.asInstanceOf[js.Any], fontColor = fontColor.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], innerOff = innerOff.asInstanceOf[js.Any], inverted = inverted.asInstanceOf[js.Any], isVertical = js.Any.fromFunction0(isVertical), itemHeight = itemHeight.asInstanceOf[js.Any], itemText = js.Any.fromFunction2(itemText), itemsCount = js.Any.fromFunction0(itemsCount), legendStyle = legendStyle.asInstanceOf[js.Any], over = over.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], showValues = js.Any.fromFunction0(showValues), symbol = symbol.asInstanceOf[js.Any], textStyle = textStyle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], totalWidth = js.Any.fromFunction0(totalWidth), transparent = transparent.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILegend]
  }
  @scala.inline
  implicit class ILegendOps[Self <: ILegend] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvailRows(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availRows")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBounds(value: IRectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChart(value: IChart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDividing(value: IStroke): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dividing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: IFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerOff(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerOff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInverted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsVertical(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVertical")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withItemHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemText(value: (ISeries, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemText")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withItemsCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLegendStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOver(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("over")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowValues(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showValues")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSymbol(value: ISymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: IAnnotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTransparent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparent")(value.asInstanceOf[js.Any])
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

