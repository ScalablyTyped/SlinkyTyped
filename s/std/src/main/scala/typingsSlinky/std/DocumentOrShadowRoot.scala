package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentOrShadowRoot extends js.Object {
  val activeElement: org.scalajs.dom.raw.Element | Null
  /**
    * Returns document's fullscreen element.
    */
  val fullscreenElement: org.scalajs.dom.raw.Element | Null
  val pointerLockElement: org.scalajs.dom.raw.Element | Null
  /**
    * Retrieves a collection of styleSheet objects representing the style sheets that correspond to each instance of a link or style object in the document.
    */
  val styleSheets: org.scalajs.dom.raw.StyleSheetList
  def caretPositionFromPoint(x: Double, y: Double): CaretPosition | Null
  /** @deprecated */
  def caretRangeFromPoint(x: Double, y: Double): org.scalajs.dom.raw.Range
  def elementFromPoint(x: Double, y: Double): org.scalajs.dom.raw.Element | Null
  def elementsFromPoint(x: Double, y: Double): js.Array[org.scalajs.dom.raw.Element]
  def getSelection(): org.scalajs.dom.raw.Selection | Null
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
  implicit class DocumentOrShadowRootOps[Self <: DocumentOrShadowRoot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCaretPositionFromPoint(value: (Double, Double) => CaretPosition | Null): Self = this.set("caretPositionFromPoint", js.Any.fromFunction2(value))
    @scala.inline
    def setCaretRangeFromPoint(value: (Double, Double) => org.scalajs.dom.raw.Range): Self = this.set("caretRangeFromPoint", js.Any.fromFunction2(value))
    @scala.inline
    def setElementFromPoint(value: (Double, Double) => org.scalajs.dom.raw.Element | Null): Self = this.set("elementFromPoint", js.Any.fromFunction2(value))
    @scala.inline
    def setElementsFromPoint(value: (Double, Double) => js.Array[org.scalajs.dom.raw.Element]): Self = this.set("elementsFromPoint", js.Any.fromFunction2(value))
    @scala.inline
    def setGetSelection(value: () => org.scalajs.dom.raw.Selection | Null): Self = this.set("getSelection", js.Any.fromFunction0(value))
    @scala.inline
    def setStyleSheets(value: org.scalajs.dom.raw.StyleSheetList): Self = this.set("styleSheets", value.asInstanceOf[js.Any])
    @scala.inline
    def setActiveElement(value: org.scalajs.dom.raw.Element): Self = this.set("activeElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setActiveElementNull: Self = this.set("activeElement", null)
    @scala.inline
    def setFullscreenElement(value: org.scalajs.dom.raw.Element): Self = this.set("fullscreenElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullscreenElementNull: Self = this.set("fullscreenElement", null)
    @scala.inline
    def setPointerLockElement(value: org.scalajs.dom.raw.Element): Self = this.set("pointerLockElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointerLockElementNull: Self = this.set("pointerLockElement", null)
  }
  
}

