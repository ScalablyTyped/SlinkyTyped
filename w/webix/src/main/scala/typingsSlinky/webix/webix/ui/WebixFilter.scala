package typingsSlinky.webix.webix.ui

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebixFilter extends js.Object {
  def getValue(node: HTMLElement): js.Any = js.native
  def refresh(master: baseview, node: HTMLElement, value: js.Any): Unit = js.native
  def render(master: baseview, config: StringDictionary[js.Any]): String = js.native
  def setValue(node: HTMLElement, value: js.Any): js.Any = js.native
}

object WebixFilter {
  @scala.inline
  def apply(
    getValue: HTMLElement => js.Any,
    refresh: (baseview, HTMLElement, js.Any) => Unit,
    render: (baseview, StringDictionary[js.Any]) => String,
    setValue: (HTMLElement, js.Any) => js.Any
  ): WebixFilter = {
    val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction1(getValue), refresh = js.Any.fromFunction3(refresh), render = js.Any.fromFunction2(render), setValue = js.Any.fromFunction2(setValue))
    __obj.asInstanceOf[WebixFilter]
  }
  @scala.inline
  implicit class WebixFilterOps[Self <: WebixFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetValue(value: HTMLElement => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRefresh(value: (baseview, HTMLElement, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRender(value: (baseview, StringDictionary[js.Any]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetValue(value: (HTMLElement, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

