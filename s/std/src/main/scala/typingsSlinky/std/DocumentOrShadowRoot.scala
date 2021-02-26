package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentOrShadowRoot extends StObject {
  
  val activeElement: org.scalajs.dom.raw.Element | Null = js.native
  
  def caretPositionFromPoint(x: Double, y: Double): CaretPosition | Null = js.native
  
  /** @deprecated */
  def caretRangeFromPoint(x: Double, y: Double): org.scalajs.dom.raw.Range = js.native
  
  def elementFromPoint(x: Double, y: Double): org.scalajs.dom.raw.Element | Null = js.native
  
  def elementsFromPoint(x: Double, y: Double): js.Array[org.scalajs.dom.raw.Element] = js.native
  
  /**
    * Returns document's fullscreen element.
    */
  val fullscreenElement: org.scalajs.dom.raw.Element | Null = js.native
  
  def getSelection(): org.scalajs.dom.raw.Selection | Null = js.native
  
  val pointerLockElement: org.scalajs.dom.raw.Element | Null = js.native
  
  /**
    * Retrieves a collection of styleSheet objects representing the style sheets that correspond to each instance of a link or style object in the document.
    */
  val styleSheets: org.scalajs.dom.raw.StyleSheetList = js.native
}
object DocumentOrShadowRoot {
  
  @scala.inline
  def apply(
    caretPositionFromPoint: (Double, Double) => CaretPosition | Null,
    caretRangeFromPoint: (Double, Double) => org.scalajs.dom.raw.Range,
    elementFromPoint: (Double, Double) => org.scalajs.dom.raw.Element | Null,
    elementsFromPoint: (Double, Double) => js.Array[org.scalajs.dom.raw.Element],
    getSelection: () => org.scalajs.dom.raw.Selection | Null,
    styleSheets: org.scalajs.dom.raw.StyleSheetList
  ): DocumentOrShadowRoot = {
    val __obj = js.Dynamic.literal(caretPositionFromPoint = js.Any.fromFunction2(caretPositionFromPoint), caretRangeFromPoint = js.Any.fromFunction2(caretRangeFromPoint), elementFromPoint = js.Any.fromFunction2(elementFromPoint), elementsFromPoint = js.Any.fromFunction2(elementsFromPoint), getSelection = js.Any.fromFunction0(getSelection), styleSheets = styleSheets.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentOrShadowRoot]
  }
  
  @scala.inline
  implicit class DocumentOrShadowRootMutableBuilder[Self <: DocumentOrShadowRoot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveElement(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "activeElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveElementNull: Self = StObject.set(x, "activeElement", null)
    
    @scala.inline
    def setCaretPositionFromPoint(value: (Double, Double) => CaretPosition | Null): Self = StObject.set(x, "caretPositionFromPoint", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCaretRangeFromPoint(value: (Double, Double) => org.scalajs.dom.raw.Range): Self = StObject.set(x, "caretRangeFromPoint", js.Any.fromFunction2(value))
    
    @scala.inline
    def setElementFromPoint(value: (Double, Double) => org.scalajs.dom.raw.Element | Null): Self = StObject.set(x, "elementFromPoint", js.Any.fromFunction2(value))
    
    @scala.inline
    def setElementsFromPoint(value: (Double, Double) => js.Array[org.scalajs.dom.raw.Element]): Self = StObject.set(x, "elementsFromPoint", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFullscreenElement(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "fullscreenElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullscreenElementNull: Self = StObject.set(x, "fullscreenElement", null)
    
    @scala.inline
    def setGetSelection(value: () => org.scalajs.dom.raw.Selection | Null): Self = StObject.set(x, "getSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPointerLockElement(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "pointerLockElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerLockElementNull: Self = StObject.set(x, "pointerLockElement", null)
    
    @scala.inline
    def setStyleSheets(value: org.scalajs.dom.raw.StyleSheetList): Self = StObject.set(x, "styleSheets", value.asInstanceOf[js.Any])
  }
}
