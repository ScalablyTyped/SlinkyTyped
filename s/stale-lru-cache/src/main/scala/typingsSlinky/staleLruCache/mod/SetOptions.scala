package typingsSlinky.staleLruCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetOptions[K, V] extends js.Object {
  var maxAge: js.UndefOr[Double] = js.native
  var revalidate: js.UndefOr[RevalidationCallback[K, V]] = js.native
  var staleWhileRevalidate: js.UndefOr[Double] = js.native
}

object SetOptions {
  @scala.inline
  def apply[K, V](): SetOptions[K, V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetOptions[K, V]]
  }
  @scala.inline
  implicit class SetOptionsOps[Self[k, v] <: SetOptions[k, v], K, V] (val x: Self[K, V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, V]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, V]) with Other]
    @scala.inline
    def withMaxAge(value: Double): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAge: Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(js.undefined)
        ret
    }
    @scala.inline
    def withRevalidate(value: (K, /* callback */ OptionsCallback[K, V]) => Unit): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revalidate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRevalidate: Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revalidate")(js.undefined)
        ret
    }
    @scala.inline
    def withStaleWhileRevalidate(value: Double): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staleWhileRevalidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaleWhileRevalidate: Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staleWhileRevalidate")(js.undefined)
        ret
    }
  }
  
}

