package typingsSlinky.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A CSSRuleList is an (indirect-modify only) array-like object containing an ordered collection of CSSRule objects. */
@js.native
trait CSSRuleList
  extends /* index */ NumberDictionary[org.scalajs.dom.raw.CSSRule] {
  
  def item(index: Double): org.scalajs.dom.raw.CSSRule | Null = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[org.scalajs.dom.raw.CSSRule]] = js.native
  
  val length: Double = js.native
}
