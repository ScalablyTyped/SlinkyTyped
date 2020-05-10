package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentOrShadowRoot extends js.Object {
  val activeElement: org.scalajs.dom.raw.Element | Null = js.native
  /**
    * Returns document's fullscreen element.
    */
  val fullscreenElement: org.scalajs.dom.raw.Element | Null = js.native
  val pointerLockElement: org.scalajs.dom.raw.Element | Null = js.native
  /**
    * Retrieves a collection of styleSheet objects representing the style sheets that correspond to each instance of a link or style object in the document.
    */
  val styleSheets: org.scalajs.dom.raw.StyleSheetList = js.native
  def caretPositionFromPoint(x: Double, y: Double): CaretPosition | Null = js.native
  /** @deprecated */
  def caretRangeFromPoint(x: Double, y: Double): org.scalajs.dom.raw.Range = js.native
  def elementFromPoint(x: Double, y: Double): org.scalajs.dom.raw.Element | Null = js.native
  def elementsFromPoint(x: Double, y: Double): js.Array[org.scalajs.dom.raw.Element] = js.native
  def getSelection(): org.scalajs.dom.raw.Selection | Null = js.native
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
    def withCaretPositionFromPoint(value: (Double, Double) => CaretPosition | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caretPositionFromPoint")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCaretRangeFromPoint(value: (Double, Double) => org.scalajs.dom.raw.Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caretRangeFromPoint")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withElementFromPoint(value: (Double, Double) => org.scalajs.dom.raw.Element | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementFromPoint")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withElementsFromPoint(value: (Double, Double) => js.Array[org.scalajs.dom.raw.Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementsFromPoint")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetSelection(value: () => org.scalajs.dom.raw.Selection | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStyleSheets(value: org.scalajs.dom.raw.StyleSheetList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleSheets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveElement(value: org.scalajs.dom.raw.Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveElementNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeElement")(null)
        ret
    }
    @scala.inline
    def withFullscreenElement(value: org.scalajs.dom.raw.Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullscreenElementNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenElement")(null)
        ret
    }
    @scala.inline
    def withPointerLockElement(value: org.scalajs.dom.raw.Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerLockElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointerLockElementNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerLockElement")(null)
        ret
    }
  }
  
}

