package typingsSlinky.std.global

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.WeakSetConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("WeakSet")
@js.native
class WeakSet[T /* <: js.Object */] ()
  extends typingsSlinky.std.WeakSet[T] {
  def this(iterable: js.Iterable[T]) = this()
  def this(values: js.Array[T]) = this()
}
@JSGlobal("WeakSet")
@js.native
object WeakSet extends TopLevel[WeakSetConstructor]
