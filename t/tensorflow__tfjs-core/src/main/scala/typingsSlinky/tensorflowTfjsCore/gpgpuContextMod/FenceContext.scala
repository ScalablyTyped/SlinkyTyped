package typingsSlinky.tensorflowTfjsCore.gpgpuContextMod

import typingsSlinky.std.WebGLQuery
import typingsSlinky.std.WebGLSync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FenceContext extends js.Object {
  var query: WebGLQuery | WebGLSync = js.native
  def isFencePassed(): Boolean = js.native
}

object FenceContext {
  @scala.inline
  def apply(isFencePassed: () => Boolean, query: WebGLQuery | WebGLSync): FenceContext = {
    val __obj = js.Dynamic.literal(isFencePassed = js.Any.fromFunction0(isFencePassed), query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[FenceContext]
  }
  @scala.inline
  implicit class FenceContextOps[Self <: FenceContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsFencePassed(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFencePassed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withQuery(value: WebGLQuery | WebGLSync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

