package typingsSlinky.webix.webix.ui

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebixFilter extends StObject {
  
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
  implicit class WebixFilterMutableBuilder[Self <: WebixFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetValue(value: HTMLElement => js.Any): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefresh(value: (baseview, HTMLElement, js.Any) => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRender(value: (baseview, StringDictionary[js.Any]) => String): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetValue(value: (HTMLElement, js.Any) => js.Any): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
  }
}
