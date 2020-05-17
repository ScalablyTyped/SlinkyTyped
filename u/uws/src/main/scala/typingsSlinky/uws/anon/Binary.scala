package typingsSlinky.uws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Binary extends js.Object {
  var binary: js.UndefOr[Boolean] = js.native
  var mask: js.UndefOr[Boolean] = js.native
}

object Binary {
  @scala.inline
  def apply(): Binary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Binary]
  }
  @scala.inline
  implicit class BinaryOps[Self <: Binary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBinary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(js.undefined)
        ret
    }
    @scala.inline
    def withMask(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(js.undefined)
        ret
    }
  }
  
}

