package typingsSlinky.stripe.stripeMod

import typingsSlinky.std.AsyncIterableIterator
import typingsSlinky.std.Promise
import typingsSlinky.stripe.Anon_Limit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IListPromise[T]
  extends AsyncIterableIterator[T]
     with Promise[IList[T]] {
  def autoPagingEach(handler: js.Function1[/* item */ T, js.Promise[Unit]]): Unit = js.native
  def autoPagingToArray(opts: Anon_Limit): js.Promise[js.Array[T]] = js.native
}

