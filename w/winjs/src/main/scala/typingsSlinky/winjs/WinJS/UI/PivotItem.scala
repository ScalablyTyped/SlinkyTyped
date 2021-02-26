package typingsSlinky.winjs.WinJS.UI

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An item within a Pivot control.
  **/
@js.native
trait PivotItem extends StObject {
  
  //#endregion Methods
  //#region Properties
  /**
    * Gets the DOM element that hosts the PivotItem control's content.
    **/
  var contentElement: HTMLElement = js.native
  
  //#endregion Constructors
  //#region Methods
  /**
    * Releases resources held by this PivotItem. Call this method when the PivotItem is no longer needed. After calling this method, the PivotItem becomes unusable.
    **/
  def dispose(): Unit = js.native
  
  /**
    * Gets the DOM element that hosts the PivotItem control.
    **/
  var element: HTMLElement = js.native
  
  /**
    * Gets or sets the header for this PivotItem.
    **/
  var header: String = js.native
}
object PivotItem {
  
  @scala.inline
  def apply(contentElement: HTMLElement, dispose: () => Unit, element: HTMLElement, header: String): PivotItem = {
    val __obj = js.Dynamic.literal(contentElement = contentElement.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), element = element.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotItem]
  }
  
  @scala.inline
  implicit class PivotItemMutableBuilder[Self <: PivotItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentElement(value: HTMLElement): Self = StObject.set(x, "contentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
  }
}
