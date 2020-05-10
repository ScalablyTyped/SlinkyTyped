package typingsSlinky.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAxisLabels extends js.Object {
  var alternate: Boolean = js.native
  var chart: IChart = js.native
  var dateFormat: String = js.native
  var decimals: Double = js.native
  var format: IFormat = js.native
  var labelStyle: String = js.native
  var maxWidth: Double = js.native
  var padding: Double = js.native
  var rotation: Double = js.native
  var separation: Double = js.native
   // %
  var visible: Boolean = js.native
  def getLabel(value: Double): String = js.native
  def width(value: Double): Double = js.native
}

object IAxisLabels {
  @scala.inline
  def apply(
    alternate: Boolean,
    chart: IChart,
    dateFormat: String,
    decimals: Double,
    format: IFormat,
    getLabel: Double => String,
    labelStyle: String,
    maxWidth: Double,
    padding: Double,
    rotation: Double,
    separation: Double,
    visible: Boolean,
    width: Double => Double
  ): IAxisLabels = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], dateFormat = dateFormat.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], getLabel = js.Any.fromFunction1(getLabel), labelStyle = labelStyle.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], separation = separation.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = js.Any.fromFunction1(width))
    __obj.asInstanceOf[IAxisLabels]
  }
  @scala.inline
  implicit class IAxisLabelsOps[Self <: IAxisLabels] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChart(value: IChart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecimals(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: IFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetLabel(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLabelStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeparation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

