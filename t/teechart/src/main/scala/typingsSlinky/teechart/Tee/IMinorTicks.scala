package typingsSlinky.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMinorTicks extends ITicks {
  var count: Double = js.native
}

object IMinorTicks {
  @scala.inline
  def apply(chart: IChart, count: Double, length: Double, stroke: IStroke, visible: Boolean): IMinorTicks = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMinorTicks]
  }
  @scala.inline
  implicit class IMinorTicksOps[Self <: IMinorTicks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

