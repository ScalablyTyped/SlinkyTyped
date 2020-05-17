package typingsSlinky.tsEssentials.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TYPE[K] extends js.Object {
  var __TYPE__ : K = js.native
}

object TYPE {
  @scala.inline
  def apply[K](__TYPE__ : K): TYPE[K] = {
    val __obj = js.Dynamic.literal(__TYPE__ = __TYPE__.asInstanceOf[js.Any])
    __obj.asInstanceOf[TYPE[K]]
  }
  @scala.inline
  implicit class TYPEOps[Self[k] <: TYPE[k], K] (val x: Self[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[K] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[K] with Other]
    @scala.inline
    def with__TYPE__(value: K): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__TYPE__")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

