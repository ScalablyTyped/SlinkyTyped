package typingsSlinky.vis.anon

import typingsSlinky.vis.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Canvas extends js.Object {
  var DOM: Position = js.native
  var canvas: Position = js.native
}

object Canvas {
  @scala.inline
  def apply(DOM: Position, canvas: Position): Canvas = {
    val __obj = js.Dynamic.literal(DOM = DOM.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any])
    __obj.asInstanceOf[Canvas]
  }
  @scala.inline
  implicit class CanvasOps[Self <: Canvas] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDOM(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanvas(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvas")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

