package typingsSlinky.sharepoint.SP.JsGrid

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.microsoftAjax.Sys.UI.DomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEditControlGridContext extends IEditActorGridContext {
  
  def OnActivateActor(): Unit = js.native
  
  def OnDeactivateActor(): Unit = js.native
}
object IEditControlGridContext {
  
  @scala.inline
  def apply(
    OnActivateActor: () => Unit,
    OnDeactivateActor: () => Unit,
    OnKeyDown: DomEvent => Unit,
    RTL: js.Any,
    bLightFocus: Boolean,
    emptyValue: js.Any,
    jsGridObj: JsGridControl,
    parentNode: HTMLElement,
    styleManager: IStyleManager
  ): IEditControlGridContext = {
    val __obj = js.Dynamic.literal(OnActivateActor = js.Any.fromFunction0(OnActivateActor), OnDeactivateActor = js.Any.fromFunction0(OnDeactivateActor), OnKeyDown = js.Any.fromFunction1(OnKeyDown), RTL = RTL.asInstanceOf[js.Any], bLightFocus = bLightFocus.asInstanceOf[js.Any], emptyValue = emptyValue.asInstanceOf[js.Any], jsGridObj = jsGridObj.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], styleManager = styleManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditControlGridContext]
  }
  
  @scala.inline
  implicit class IEditControlGridContextMutableBuilder[Self <: IEditControlGridContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnActivateActor(value: () => Unit): Self = StObject.set(x, "OnActivateActor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDeactivateActor(value: () => Unit): Self = StObject.set(x, "OnDeactivateActor", js.Any.fromFunction0(value))
  }
}
