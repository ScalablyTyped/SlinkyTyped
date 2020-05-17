package typingsSlinky.vexdb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Prefetch extends js.Object {
  var prefetch: js.UndefOr[Boolean] = js.native
}

object Prefetch {
  @scala.inline
  def apply(): Prefetch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Prefetch]
  }
  @scala.inline
  implicit class PrefetchOps[Self <: Prefetch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrefetch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefetch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefetch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefetch")(js.undefined)
        ret
    }
  }
  
}

