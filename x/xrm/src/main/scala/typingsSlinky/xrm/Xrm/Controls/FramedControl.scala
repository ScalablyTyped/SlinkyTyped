package typingsSlinky.xrm.Xrm.Controls

import org.scalajs.dom.raw.HTMLIFrameElement
import typingsSlinky.xrm.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for a framed control, which is either a Web Resource or an Iframe.
  * @see {@link Control}
  * @remarks     An Iframe control provides additional methods, so use {@link IframeControl} where
  *              appropriate.  Silverlight controls should use {@link SilverlightControl}.
  */
@js.native
trait FramedControl extends Control {
  
  /**
    * Returns the content window that represents an IFRAME or web resource.
    * @returns A promise that contains a content window instance representing an IFRAME or web resource.
    * @remarks This method is supported only on Unified Interface.  The implementer is expected to call
    * a custom function within the returned window that will receive the Xrm and formContext objects as
    * parameters.
    */
  def getContentWindow(): js.Promise[Window] = js.native
  
  /**
    * Gets the DOM element containing the control.
    * @returns The container object.
    * @remarks Unavailable for Microsoft Dynamics CRM for tablets.
    */
  def getObject(): HTMLIFrameElement = js.native
  
  /**
    * Gets the URL value of the control.
    * @returns The source URL.
    * @remarks Unavailable for Microsoft Dynamics CRM for tablets.
    */
  def getSrc(): String = js.native
  
  /**
    * Sets the URL value of the control.
    * @param src The source URL.
    * @remarks Unavailable for Microsoft Dynamics CRM for tablets.
    */
  def setSrc(src: String): Unit = js.native
}
object FramedControl {
  
  @scala.inline
  def apply(
    getContentWindow: () => js.Promise[Window],
    getControlType: () => ControlType | String,
    getLabel: () => String,
    getName: () => String,
    getObject: () => HTMLIFrameElement,
    getParent: () => Section,
    getSrc: () => String,
    getVisible: () => Boolean,
    setLabel: String => Unit,
    setSrc: String => Unit
  ): FramedControl = {
    val __obj = js.Dynamic.literal(getContentWindow = js.Any.fromFunction0(getContentWindow), getControlType = js.Any.fromFunction0(getControlType), getLabel = js.Any.fromFunction0(getLabel), getName = js.Any.fromFunction0(getName), getObject = js.Any.fromFunction0(getObject), getParent = js.Any.fromFunction0(getParent), getSrc = js.Any.fromFunction0(getSrc), getVisible = js.Any.fromFunction0(getVisible), setLabel = js.Any.fromFunction1(setLabel), setSrc = js.Any.fromFunction1(setSrc))
    __obj.asInstanceOf[FramedControl]
  }
  
  @scala.inline
  implicit class FramedControlMutableBuilder[Self <: FramedControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetContentWindow(value: () => js.Promise[Window]): Self = StObject.set(x, "getContentWindow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetObject(value: () => HTMLIFrameElement): Self = StObject.set(x, "getObject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSrc(value: () => String): Self = StObject.set(x, "getSrc", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetSrc(value: String => Unit): Self = StObject.set(x, "setSrc", js.Any.fromFunction1(value))
  }
}
