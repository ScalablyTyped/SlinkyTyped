package typingsSlinky.streamingIterables.mod

import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("streaming-iterables", "batch")
@js.native
object batch extends js.Object {
  
  def apply(size: Double): CurriedBatchResult = js.native
  def apply[T](size: Double, iterable: AsyncIterable[T]): UnwrapAnyIterableArray[AsyncIterable[T]] = js.native
  def apply[T](size: Double, iterable: js.Iterable[T]): UnwrapAnyIterableArray[js.Iterable[T]] = js.native
}
