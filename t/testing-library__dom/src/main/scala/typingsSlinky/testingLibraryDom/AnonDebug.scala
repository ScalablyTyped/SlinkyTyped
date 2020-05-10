package typingsSlinky.testingLibraryDom

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLDocument
import typingsSlinky.prettyFormat.mod.OptionsReceived
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDebug extends js.Object {
  def debug(element: js.Array[Element | HTMLDocument]): Unit = js.native
  def debug(element: js.Array[Element | HTMLDocument], maxLength: Double): Unit = js.native
  def debug(element: js.Array[Element | HTMLDocument], maxLength: Double, options: OptionsReceived): Unit = js.native
  /**
    * Convenience function for `pretty-dom` which also allows an array
    * of elements
    */
  def debug(element: Element): Unit = js.native
  def debug(element: Element, maxLength: Double): Unit = js.native
  def debug(element: Element, maxLength: Double, options: OptionsReceived): Unit = js.native
  def debug(element: HTMLDocument): Unit = js.native
  def debug(element: HTMLDocument, maxLength: Double): Unit = js.native
  def debug(element: HTMLDocument, maxLength: Double, options: OptionsReceived): Unit = js.native
}

