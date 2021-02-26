package typingsSlinky.sharepoint.SP.UI

import org.scalajs.dom.raw.HTMLAnchorElement
import typingsSlinky.sharepoint.SP.HtmlBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Command extends StObject {
  
  def attachEvents(): Unit = js.native
  
  def get_displayName(): String = js.native
  
  def get_elementIDPrefix(): String = js.native
  
  def get_href(): String = js.native
  
  def get_isDropDownCommand(): Boolean = js.native
  
  def get_isEnabled(): Boolean = js.native
  
  def get_linkElement(): HTMLAnchorElement = js.native
  
  def get_name(): String = js.native
  
  def get_tooltip(): String = js.native
  
  /**Should override*/
  def onClick(): Unit = js.native
  
  def render(builder: HtmlBuilder): Unit = js.native
  
  def set_displayName(value: String): String = js.native
  
  def set_elementIDPrefix(value: String): String = js.native
  
  def set_isDropDownCommand(value: Boolean): Boolean = js.native
  
  def set_isEnabled(value: Boolean): Boolean = js.native
  
  def set_tooltip(value: String): String = js.native
}
object Command {
  
  @scala.inline
  def apply(
    attachEvents: () => Unit,
    get_displayName: () => String,
    get_elementIDPrefix: () => String,
    get_href: () => String,
    get_isDropDownCommand: () => Boolean,
    get_isEnabled: () => Boolean,
    get_linkElement: () => HTMLAnchorElement,
    get_name: () => String,
    get_tooltip: () => String,
    onClick: () => Unit,
    render: HtmlBuilder => Unit,
    set_displayName: String => String,
    set_elementIDPrefix: String => String,
    set_isDropDownCommand: Boolean => Boolean,
    set_isEnabled: Boolean => Boolean,
    set_tooltip: String => String
  ): Command = {
    val __obj = js.Dynamic.literal(attachEvents = js.Any.fromFunction0(attachEvents), get_displayName = js.Any.fromFunction0(get_displayName), get_elementIDPrefix = js.Any.fromFunction0(get_elementIDPrefix), get_href = js.Any.fromFunction0(get_href), get_isDropDownCommand = js.Any.fromFunction0(get_isDropDownCommand), get_isEnabled = js.Any.fromFunction0(get_isEnabled), get_linkElement = js.Any.fromFunction0(get_linkElement), get_name = js.Any.fromFunction0(get_name), get_tooltip = js.Any.fromFunction0(get_tooltip), onClick = js.Any.fromFunction0(onClick), render = js.Any.fromFunction1(render), set_displayName = js.Any.fromFunction1(set_displayName), set_elementIDPrefix = js.Any.fromFunction1(set_elementIDPrefix), set_isDropDownCommand = js.Any.fromFunction1(set_isDropDownCommand), set_isEnabled = js.Any.fromFunction1(set_isEnabled), set_tooltip = js.Any.fromFunction1(set_tooltip))
    __obj.asInstanceOf[Command]
  }
  
  @scala.inline
  implicit class CommandMutableBuilder[Self <: Command] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachEvents(value: () => Unit): Self = StObject.set(x, "attachEvents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_displayName(value: () => String): Self = StObject.set(x, "get_displayName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_elementIDPrefix(value: () => String): Self = StObject.set(x, "get_elementIDPrefix", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_href(value: () => String): Self = StObject.set(x, "get_href", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_isDropDownCommand(value: () => Boolean): Self = StObject.set(x, "get_isDropDownCommand", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_isEnabled(value: () => Boolean): Self = StObject.set(x, "get_isEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_linkElement(value: () => HTMLAnchorElement): Self = StObject.set(x, "get_linkElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_name(value: () => String): Self = StObject.set(x, "get_name", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_tooltip(value: () => String): Self = StObject.set(x, "get_tooltip", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRender(value: HtmlBuilder => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_displayName(value: String => String): Self = StObject.set(x, "set_displayName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_elementIDPrefix(value: String => String): Self = StObject.set(x, "set_elementIDPrefix", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_isDropDownCommand(value: Boolean => Boolean): Self = StObject.set(x, "set_isDropDownCommand", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_isEnabled(value: Boolean => Boolean): Self = StObject.set(x, "set_isEnabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_tooltip(value: String => String): Self = StObject.set(x, "set_tooltip", js.Any.fromFunction1(value))
  }
}
