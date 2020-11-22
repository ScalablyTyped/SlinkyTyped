package typingsSlinky.streamingIterables.mod

import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("streaming-iterables", "collect")
@js.native
object collect extends js.Object {
  
  def apply[T](iterable: AsyncIterable[T]): UnwrapToPromiseOrAsyncIterable[AsyncIterable[T]] = js.native
  def apply[T](iterable: js.Iterable[T]): UnwrapToPromiseOrAsyncIterable[js.Iterable[T]] = js.native
}
