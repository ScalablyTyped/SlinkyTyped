package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object of this type is returned by the files property of the HTML <input> element; this lets you access the list of files selected with the <input type="file"> element. It's also used for a list of files dropped into web content when using the drag and drop API; see the DataTransfer object for details on this usage. */
@js.native
trait FileList
  extends /* index */ NumberDictionary[org.scalajs.dom.raw.File] {
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[org.scalajs.dom.raw.File]] = js.native
  val length: Double = js.native
  def item(index: Double): org.scalajs.dom.raw.File | Null = js.native
}

@JSGlobal("FileList")
@js.native
object FileList
  extends Instantiable0[org.scalajs.dom.raw.FileList]

