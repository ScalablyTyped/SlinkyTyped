package typingsSlinky.streamingIterables.mod

import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("streaming-iterables", "take")
@js.native
object take extends js.Object {
  
  def apply(count: Double): CurriedTakeResult = js.native
  def apply[T](count: Double, iterable: AsyncIterable[T]): UnwrapAnyIterable[AsyncIterable[T]] = js.native
  def apply[T](count: Double, iterable: js.Iterable[T]): UnwrapAnyIterable[js.Iterable[T]] = js.native
}
