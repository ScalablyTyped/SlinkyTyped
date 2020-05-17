package typingsSlinky.webix.webix.ui.datafilter

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.webix.webix.ui.WebixFilter
import typingsSlinky.webix.webix.ui.baseview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait textFilter extends WebixFilter {
  def getInputNode(node: HTMLElement): HTMLElement = js.native
}

object textFilter {
  @scala.inline
  def apply(
    getInputNode: HTMLElement => HTMLElement,
    getValue: HTMLElement => js.Any,
    refresh: (baseview, HTMLElement, js.Any) => Unit,
    render: (baseview, StringDictionary[js.Any]) => String,
    setValue: (HTMLElement, js.Any) => js.Any
  ): textFilter = {
    val __obj = js.Dynamic.literal(getInputNode = js.Any.fromFunction1(getInputNode), getValue = js.Any.fromFunction1(getValue), refresh = js.Any.fromFunction3(refresh), render = js.Any.fromFunction2(render), setValue = js.Any.fromFunction2(setValue))
    __obj.asInstanceOf[textFilter]
  }
  @scala.inline
  implicit class textFilterOps[Self <: textFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetInputNode(value: HTMLElement => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInputNode")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

