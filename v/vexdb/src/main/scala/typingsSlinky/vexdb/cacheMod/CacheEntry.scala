package typingsSlinky.vexdb.cacheMod

import typingsSlinky.vexdb.AnonResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheEntry[T] extends js.Object {
  var expiry: Double = js.native
  var value: AnonResult[T] = js.native
}

object CacheEntry {
  @scala.inline
  def apply[T](expiry: Double, value: AnonResult[T]): CacheEntry[T] = {
    val __obj = js.Dynamic.literal(expiry = expiry.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheEntry[T]]
  }
  @scala.inline
  implicit class CacheEntryOps[Self[t] <: CacheEntry[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withExpiry(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: AnonResult[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

