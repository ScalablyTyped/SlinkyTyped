package typingsSlinky.xrm.Xrm.Controls

import org.scalajs.dom.raw.HTMLIFrameElement
import typingsSlinky.xrm.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for an Iframe control.
  * @see {@link FramedControl}
  */
@js.native
trait IframeControl
  extends FramedControl
     with UiCanSetVisibleElement {
  
  /**
    * Gets initial URL defined for the Iframe.
    * @returns The initial URL.
    * @remarks Unavailable for Microsoft Dynamics CRM for tablets.
    */
  def getInitialUrl(): String = js.native
}
object IframeControl {
  
  @scala.inline
  def apply(
    getContentWindow: () => js.Promise[Window],
    getControlType: () => ControlType | String,
    getInitialUrl: () => String,
    getLabel: () => String,
    getName: () => String,
    getObject: () => HTMLIFrameElement,
    getParent: () => Section,
    getSrc: () => String,
    getVisible: () => Boolean,
    setLabel: String => Unit,
    setSrc: String => Unit,
    setVisible: Boolean => Unit
  ): IframeControl = {
    val __obj = js.Dynamic.literal(getContentWindow = js.Any.fromFunction0(getContentWindow), getControlType = js.Any.fromFunction0(getControlType), getInitialUrl = js.Any.fromFunction0(getInitialUrl), getLabel = js.Any.fromFunction0(getLabel), getName = js.Any.fromFunction0(getName), getObject = js.Any.fromFunction0(getObject), getParent = js.Any.fromFunction0(getParent), getSrc = js.Any.fromFunction0(getSrc), getVisible = js.Any.fromFunction0(getVisible), setLabel = js.Any.fromFunction1(setLabel), setSrc = js.Any.fromFunction1(setSrc), setVisible = js.Any.fromFunction1(setVisible))
    __obj.asInstanceOf[IframeControl]
  }
  
  @scala.inline
  implicit class IframeControlMutableBuilder[Self <: IframeControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetInitialUrl(value: () => String): Self = StObject.set(x, "getInitialUrl", js.Any.fromFunction0(value))
  }
}
