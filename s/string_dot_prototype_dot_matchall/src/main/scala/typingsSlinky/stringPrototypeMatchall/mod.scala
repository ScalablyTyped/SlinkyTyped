package typingsSlinky.stringPrototypeMatchall

import typingsSlinky.std.IterableIterator
import typingsSlinky.std.RegExpMatchArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("string.prototype.matchall", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(str: String, regexp: String): IterableIterator[RegExpMatchArray] = js.native
  def apply(str: String, regexp: js.RegExp): IterableIterator[RegExpMatchArray] = js.native
  
  def shim(): Unit = js.native
}
