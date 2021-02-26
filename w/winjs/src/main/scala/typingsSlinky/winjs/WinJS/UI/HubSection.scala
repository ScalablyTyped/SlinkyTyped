package typingsSlinky.winjs.WinJS.UI

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a section of a Hub.
  **/
@js.native
trait HubSection extends StObject {
  
  //#endregion Methods
  //#region Properties
  /**
    * Gets the DOM element that hosts the HubSection control's content.
    **/
  var contentElement: HTMLElement = js.native
  
  //#endregion Constructors
  //#region Methods
  /**
    * Releases resources held by this HubSection. Call this method when the HubSection is no longer needed. After calling this method, the HubSection becomes unusable.
    **/
  def dispose(): Unit = js.native
  
  /**
    * Gets the DOM element that hosts this HubSection.
    **/
  var element: HTMLElement = js.native
  
  /**
    * Gets or sets the header for this HubSection.
    **/
  var header: String = js.native
  
  /**
    * Gets a value that specifies whether the header is static.
    **/
  var isHeaderStatic: Boolean = js.native
}
object HubSection {
  
  @scala.inline
  def apply(
    contentElement: HTMLElement,
    dispose: () => Unit,
    element: HTMLElement,
    header: String,
    isHeaderStatic: Boolean
  ): HubSection = {
    val __obj = js.Dynamic.literal(contentElement = contentElement.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), element = element.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], isHeaderStatic = isHeaderStatic.asInstanceOf[js.Any])
    __obj.asInstanceOf[HubSection]
  }
  
  @scala.inline
  implicit class HubSectionMutableBuilder[Self <: HubSection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentElement(value: HTMLElement): Self = StObject.set(x, "contentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHeaderStatic(value: Boolean): Self = StObject.set(x, "isHeaderStatic", value.asInstanceOf[js.Any])
  }
}
