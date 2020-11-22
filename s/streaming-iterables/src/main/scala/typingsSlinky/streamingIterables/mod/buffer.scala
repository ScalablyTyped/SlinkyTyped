package typingsSlinky.streamingIterables.mod

import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("streaming-iterables", "buffer")
@js.native
object buffer extends js.Object {
  
  def apply(size: Double): CurriedBufferResult = js.native
  def apply[T](size: Double, iterable: AsyncIterable[T]): UnwrapAnyIterable[AsyncIterable[T]] = js.native
  def apply[T](size: Double, iterable: js.Iterable[T]): UnwrapAnyIterable[js.Iterable[T]] = js.native
}
