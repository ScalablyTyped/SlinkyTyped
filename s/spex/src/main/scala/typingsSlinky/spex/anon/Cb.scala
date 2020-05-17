package typingsSlinky.spex.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cb extends js.Object {
  var cb: js.UndefOr[
    js.Function4[/* index */ Double, /* success */ Boolean, /* result */ js.Any, /* delay */ Double, _]
  ] = js.native
}

object Cb {
  @scala.inline
  def apply(): Cb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cb]
  }
  @scala.inline
  implicit class CbOps[Self <: Cb] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCb(value: (/* index */ Double, /* success */ Boolean, /* result */ js.Any, /* delay */ Double) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cb")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutCb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cb")(js.undefined)
        ret
    }
  }
  
}

