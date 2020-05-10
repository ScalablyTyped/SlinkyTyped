package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasRect extends js.Object {
  def clearRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  def fillRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  def strokeRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
}

object CanvasRect {
  @scala.inline
  def apply(
    clearRect: (Double, Double, Double, Double) => Unit,
    fillRect: (Double, Double, Double, Double) => Unit,
    strokeRect: (Double, Double, Double, Double) => Unit
  ): CanvasRect = {
    val __obj = js.Dynamic.literal(clearRect = js.Any.fromFunction4(clearRect), fillRect = js.Any.fromFunction4(fillRect), strokeRect = js.Any.fromFunction4(strokeRect))
    __obj.asInstanceOf[CanvasRect]
  }
  @scala.inline
  implicit class CanvasRectOps[Self <: CanvasRect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearRect(value: (Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearRect")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withFillRect(value: (Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillRect")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withStrokeRect(value: (Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeRect")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

