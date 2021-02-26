package typingsSlinky.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A generic collection (array-like object similar to arguments) of elements (in document order) and offers methods and properties for selecting from the list. */
@js.native
trait HTMLCollectionBase
  extends /* index */ NumberDictionary[org.scalajs.dom.raw.Element] {
  
  /**
    * Retrieves an object from various collections.
    */
  def item(index: Double): org.scalajs.dom.raw.Element | Null = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[org.scalajs.dom.raw.Element]] = js.native
  
  /**
    * Sets or retrieves the number of objects in a collection.
    */
  val length: Double = js.native
}
