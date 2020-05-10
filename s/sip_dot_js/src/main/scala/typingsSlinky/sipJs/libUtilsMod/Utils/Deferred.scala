package typingsSlinky.sipJs.libUtilsMod.Utils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deferred[T] extends js.Object {
  var promise: js.Promise[T] = js.native
  def reject(): T = js.native
  def resolve(): T = js.native
}

object Deferred {
  @scala.inline
  def apply[T](promise: js.Promise[T], reject: () => T, resolve: () => T): Deferred[T] = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], reject = js.Any.fromFunction0(reject), resolve = js.Any.fromFunction0(resolve))
    __obj.asInstanceOf[Deferred[T]]
  }
  @scala.inline
  implicit class DeferredOps[Self[t] <: Deferred[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withPromise(value: js.Promise[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReject(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reject")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResolve(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

