package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Document")
@js.native
class Document_ () extends Document {
  /* CompleteClass */
  override val activeElement: org.scalajs.dom.raw.Element | Null = js.native
  /**
    * Returns document's fullscreen element.
    */
  /* CompleteClass */
  override val fullscreenElement: org.scalajs.dom.raw.Element | Null = js.native
  /* CompleteClass */
  override val pointerLockElement: org.scalajs.dom.raw.Element | Null = js.native
  /**
    * Retrieves a collection of styleSheet objects representing the style sheets that correspond to each instance of a link or style object in the document.
    */
  /* CompleteClass */
  override val styleSheets: org.scalajs.dom.raw.StyleSheetList = js.native
  /* CompleteClass */
  override def caretPositionFromPoint(x: Double, y: Double): typingsSlinky.std.CaretPosition | Null = js.native
  /** @deprecated */
  /* CompleteClass */
  override def caretRangeFromPoint(x: Double, y: Double): org.scalajs.dom.raw.Range = js.native
  /* CompleteClass */
  override def elementFromPoint(x: Double, y: Double): org.scalajs.dom.raw.Element | Null = js.native
  /* CompleteClass */
  override def elementsFromPoint(x: Double, y: Double): js.Array[org.scalajs.dom.raw.Element] = js.native
  /**
    * Returns the first element within node's descendants whose ID is elementId.
    */
  /* CompleteClass */
  override def getElementById(elementId: java.lang.String): org.scalajs.dom.raw.Element | Null = js.native
  /* CompleteClass */
  override def getSelection(): org.scalajs.dom.raw.Selection | Null = js.native
}

@JSGlobal("Document")
@js.native
object Document_
  extends Instantiable0[org.scalajs.dom.raw.Document]

