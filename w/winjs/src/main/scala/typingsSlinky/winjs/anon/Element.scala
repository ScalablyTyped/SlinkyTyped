package typingsSlinky.winjs.anon

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element extends js.Object {
  var element: Promise[HTMLElement] = js.native
  var renderComplete: Promise[_] = js.native
}

object Element {
  @scala.inline
  def apply(element: Promise[HTMLElement], renderComplete: Promise[_]): Element = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], renderComplete = renderComplete.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  @scala.inline
  implicit class ElementOps[Self <: Element] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElement(value: Promise[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderComplete(value: Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderComplete")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

