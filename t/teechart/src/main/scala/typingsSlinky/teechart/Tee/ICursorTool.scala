package typingsSlinky.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICursorTool extends ITool {
  var direction: String = js.native
  var dragging: Double = js.native
  var followMouse: Boolean = js.native
  var format: IFormat = js.native
  var horizAxis: IAxis = js.native
  var render: String = js.native
  var size: IPoint = js.native
  var vertAxis: IAxis = js.native
  def over(point: IPoint): Boolean = js.native
  def setRender(render: String): Unit = js.native
}

object ICursorTool {
  @scala.inline
  def apply(
    active: Boolean,
    chart: IChart,
    clicked: IPoint => Boolean,
    direction: String,
    dragging: Double,
    draw: () => Unit,
    followMouse: Boolean,
    format: IFormat,
    horizAxis: IAxis,
    mousedown: js.Any => Boolean,
    mousemove: js.Any => Boolean,
    over: IPoint => Boolean,
    render: String,
    setRender: String => Unit,
    size: IPoint,
    vertAxis: IAxis
  ): ICursorTool = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], clicked = js.Any.fromFunction1(clicked), direction = direction.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], draw = js.Any.fromFunction0(draw), followMouse = followMouse.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], horizAxis = horizAxis.asInstanceOf[js.Any], mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), over = js.Any.fromFunction1(over), render = render.asInstanceOf[js.Any], setRender = js.Any.fromFunction1(setRender), size = size.asInstanceOf[js.Any], vertAxis = vertAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICursorTool]
  }
  @scala.inline
  implicit class ICursorToolOps[Self <: ICursorTool] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragging(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollowMouse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followMouse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: IFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizAxis(value: IAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOver(value: IPoint => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("over")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRender(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetRender(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSize(value: IPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertAxis(value: IAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertAxis")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

