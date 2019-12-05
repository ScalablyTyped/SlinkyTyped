package typingsSlinky.winjs.WinJS.Utilities

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.Utilities.id")
@js.native
object id extends js.Object {
  /**
    * Returns a collection with zero or one elements matching the specified id.
    * @param id The ID of the element (or elements).
    * @returns A collection of elements whose id matches the id parameter.
    **/
  def apply(id: String): QueryCollection[HTMLElement] = js.native
}

