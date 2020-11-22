package typingsSlinky.streamingIterables.mod

import typingsSlinky.std.AsyncIterableIterator
import typingsSlinky.streamingIterables.anon.Fn0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("streaming-iterables", "parallelMap")
@js.native
object parallelMap extends js.Object {
  
  def apply[T, R](concurrency: Double): Fn0[T, R] = js.native
  def apply[T, R](concurrency: Double, func: js.Function1[/* data */ T, R | js.Promise[R]]): js.Function1[/* iterable */ AnyIterable[T], AsyncIterableIterator[R]] = js.native
  def apply[T, R](concurrency: Double, func: js.Function1[/* data */ T, R | js.Promise[R]], iterable: AnyIterable[T]): AsyncIterableIterator[R] = js.native
}
