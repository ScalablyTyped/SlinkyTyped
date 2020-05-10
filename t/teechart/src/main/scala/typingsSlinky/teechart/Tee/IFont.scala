package typingsSlinky.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFont extends js.Object {
  var baseLine: String = js.native
  var chart: IChart = js.native
  var fill: String = js.native
  var gradient: IGradient = js.native
  var shadow: IShadow = js.native
  var stroke: IStroke = js.native
  var style: String = js.native
  var textAlign: String = js.native
  def getSize(): Double = js.native
  def setSize(size: Double): Unit = js.native
}

object IFont {
  @scala.inline
  def apply(
    baseLine: String,
    chart: IChart,
    fill: String,
    getSize: () => Double,
    gradient: IGradient,
    setSize: Double => Unit,
    shadow: IShadow,
    stroke: IStroke,
    style: String,
    textAlign: String
  ): IFont = {
    val __obj = js.Dynamic.literal(baseLine = baseLine.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], getSize = js.Any.fromFunction0(getSize), gradient = gradient.asInstanceOf[js.Any], setSize = js.Any.fromFunction1(setSize), shadow = shadow.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFont]
  }
  @scala.inline
  implicit class IFontOps[Self <: IFont] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseLine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChart(value: IChart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetSize(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGradient(value: IGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetSize(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShadow(value: IShadow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStroke(value: IStroke): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

