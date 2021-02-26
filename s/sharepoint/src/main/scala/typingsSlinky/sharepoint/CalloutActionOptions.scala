package typingsSlinky.sharepoint

import org.scalajs.dom.raw.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalloutActionOptions extends StObject {
  
  var disabledTooltip: String = js.native
  
  /** Callback which returns if the action link is enabled */
  def isEnabledCallback(action: CalloutAction): Boolean = js.native
  
  /** Callback which returns if the action link is visible */
  def isVisibleCallback(action: CalloutAction): Boolean = js.native
  
  /** Submenu entries for the action. If defined, the action link click will popup the specified menu. */
  var menuEntries: js.Array[CalloutActionMenuEntry] = js.native
  
  /** Callback that is executed when the action link is clicked.
    @param event Standard javascript event object
    @param action The action object */
  def onClickCallback(event: Event, action: CalloutAction): js.Any = js.native
  
  /** Text for the action link */
  var text: String = js.native
  
  var tooltip: String = js.native
}
object CalloutActionOptions {
  
  @scala.inline
  def apply(
    disabledTooltip: String,
    isEnabledCallback: CalloutAction => Boolean,
    isVisibleCallback: CalloutAction => Boolean,
    menuEntries: js.Array[CalloutActionMenuEntry],
    onClickCallback: (Event, CalloutAction) => js.Any,
    text: String,
    tooltip: String
  ): CalloutActionOptions = {
    val __obj = js.Dynamic.literal(disabledTooltip = disabledTooltip.asInstanceOf[js.Any], isEnabledCallback = js.Any.fromFunction1(isEnabledCallback), isVisibleCallback = js.Any.fromFunction1(isVisibleCallback), menuEntries = menuEntries.asInstanceOf[js.Any], onClickCallback = js.Any.fromFunction2(onClickCallback), text = text.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalloutActionOptions]
  }
  
  @scala.inline
  implicit class CalloutActionOptionsMutableBuilder[Self <: CalloutActionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabledTooltip(value: String): Self = StObject.set(x, "disabledTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabledCallback(value: CalloutAction => Boolean): Self = StObject.set(x, "isEnabledCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsVisibleCallback(value: CalloutAction => Boolean): Self = StObject.set(x, "isVisibleCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMenuEntries(value: js.Array[CalloutActionMenuEntry]): Self = StObject.set(x, "menuEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuEntriesVarargs(value: CalloutActionMenuEntry*): Self = StObject.set(x, "menuEntries", js.Array(value :_*))
    
    @scala.inline
    def setOnClickCallback(value: (Event, CalloutAction) => js.Any): Self = StObject.set(x, "onClickCallback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
