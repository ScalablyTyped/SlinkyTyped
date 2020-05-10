package typingsSlinky.vis

import typingsSlinky.vis.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCanvas extends js.Object {
  var DOM: Position = js.native
  var canvas: Position = js.native
}

object AnonCanvas {
  @scala.inline
  def apply(DOM: Position, canvas: Position): AnonCanvas = {
    val __obj = js.Dynamic.literal(DOM = DOM.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCanvas]
  }
  @scala.inline
  implicit class AnonCanvasOps[Self <: AnonCanvas] (val x: Self) extends AnyVal {
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

