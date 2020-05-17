package typingsSlinky.wrench.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Preserve extends js.Object {
  var preserve: js.UndefOr[Boolean] = js.native
}

object Preserve {
  @scala.inline
  def apply(): Preserve = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Preserve]
  }
  @scala.inline
  implicit class PreserveOps[Self <: Preserve] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreserve(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserve")(js.undefined)
        ret
    }
  }
  
}

