package typingsSlinky.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A list of contact points on a touch surface. For example, if the user has three fingers on the touch surface (such as a screen or trackpad), the corresponding TouchList object would have one Touch object for each finger, for a total of three entries. */
@js.native
trait TouchList
  extends /* index */ NumberDictionary[org.scalajs.dom.raw.Touch] {
  
  def item(index: Double): org.scalajs.dom.raw.Touch | Null = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[org.scalajs.dom.raw.Touch]] = js.native
  
  val length: Double = js.native
}
