package typingsSlinky.simplSchema.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeepArrays extends js.Object {
  var keepArrays: js.UndefOr[Boolean] = js.native
}

object KeepArrays {
  @scala.inline
  def apply(): KeepArrays = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeepArrays]
  }
  @scala.inline
  implicit class KeepArraysOps[Self <: KeepArrays] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeepArrays(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepArrays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepArrays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepArrays")(js.undefined)
        ret
    }
  }
  
}

