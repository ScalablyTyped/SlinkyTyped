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
    styleSheets: org.scalajs.dom.raw.StyleSheetList,
    activeElement: org.scalajs.dom.raw.Element = null,
    fullscreenElement: org.scalajs.dom.raw.Element = null,
    pointerLockElement: org.scalajs.dom.raw.Element = null
  ): DocumentOrShadowRoot = {
    val __obj = js.Dynamic.literal(caretPositionFromPoint = js.Any.fromFunction2(caretPositionFromPoint), caretRangeFromPoint = js.Any.fromFunction2(caretRangeFromPoint), elementFromPoint = js.Any.fromFunction2(elementFromPoint), elementsFromPoint = js.Any.fromFunction2(elementsFromPoint), getSelection = js.Any.fromFunction0(getSelection), styleSheets = styleSheets.asInstanceOf[js.Any])
    if (activeElement != null) __obj.updateDynamic("activeElement")(activeElement.asInstanceOf[js.Any])
    if (fullscreenElement != null) __obj.updateDynamic("fullscreenElement")(fullscreenElement.asInstanceOf[js.Any])
    if (pointerLockElement != null) __obj.updateDynamic("pointerLockElement")(pointerLockElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentOrShadowRoot]
  }
}

