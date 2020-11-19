package typingsSlinky.std.global

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.EnumeratorConstructor
import typingsSlinky.std.anon.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Enumerator")
@js.native
class Enumerator[T] protected ()
  extends typingsSlinky.std.Enumerator[T] {
  def this(collection: js.Any) = this()
  def this(collection: Item[T]) = this()
  def this(safearray: typingsSlinky.std.SafeArray[T]) = this()
}
@JSGlobal("Enumerator")
@js.native
object Enumerator extends TopLevel[EnumeratorConstructor]
