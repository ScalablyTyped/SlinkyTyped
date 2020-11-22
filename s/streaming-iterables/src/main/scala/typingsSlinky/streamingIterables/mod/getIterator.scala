package typingsSlinky.streamingIterables.mod

import typingsSlinky.std.AsyncIterable
import typingsSlinky.std.AsyncIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("streaming-iterables", "getIterator")
@js.native
object getIterator extends js.Object {
  
  def apply[T](iterable: AsyncIterable[T]): AsyncIterator[T, _, js.UndefOr[scala.Nothing]] = js.native
  def apply[T](iterable: AsyncIterator[T, _, js.UndefOr[scala.Nothing]]): AsyncIterator[T, _, js.UndefOr[scala.Nothing]] = js.native
  def apply[T](iterable: js.Iterable[T]): js.Iterator[T] = js.native
  def apply[T](iterable: js.Iterator[T]): js.Iterator[T] = js.native
}
