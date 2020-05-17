package typingsSlinky.webix.webix

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Touch extends js.Object {
  var config: js.Any = js.native
  def disable(): Unit = js.native
  def enable(): Unit = js.native
  def limit(mode: Boolean): Unit = js.native
  def scrollTo(node: HTMLElement, x: Double, y: Double, speed: String): Unit = js.native
}

object Touch {
  @scala.inline
  def apply(
    config: js.Any,
    disable: () => Unit,
    enable: () => Unit,
    limit: Boolean => Unit,
    scrollTo: (HTMLElement, Double, Double, String) => Unit
  ): Touch = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), limit = js.Any.fromFunction1(limit), scrollTo = js.Any.fromFunction4(scrollTo))
    __obj.asInstanceOf[Touch]
  }
  @scala.inline
  implicit class TouchOps[Self <: Touch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLimit(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScrollTo(value: (HTMLElement, Double, Double, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTo")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

