package typingsSlinky.simplSchema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonKeepArrays extends js.Object {
  var keepArrays: js.UndefOr[Boolean] = js.native
}

object AnonKeepArrays {
  @scala.inline
  def apply(): AnonKeepArrays = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonKeepArrays]
  }
  @scala.inline
  implicit class AnonKeepArraysOps[Self <: AnonKeepArrays] (val x: Self) extends AnyVal {
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

