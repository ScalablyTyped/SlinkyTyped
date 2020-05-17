package typingsSlinky.statsJs.Stats

import org.scalajs.dom.raw.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Panel extends js.Object {
  var dom: HTMLCanvasElement = js.native
  def update(value: Double, maxValue: Double): Unit = js.native
}

object Panel {
  @scala.inline
  def apply(dom: HTMLCanvasElement, update: (Double, Double) => Unit): Panel = {
    val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[Panel]
  }
  @scala.inline
  implicit class PanelOps[Self <: Panel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDom(value: HTMLCanvasElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

