package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostMessageOptions extends js.Object {
  var transfer: js.UndefOr[js.Array[_]] = js.native
}

object PostMessageOptions {
  @scala.inline
  def apply(): PostMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostMessageOptions]
  }
  @scala.inline
  implicit class PostMessageOptionsOps[Self <: PostMessageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransfer(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transfer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransfer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transfer")(js.undefined)
        ret
    }
  }
  
}

