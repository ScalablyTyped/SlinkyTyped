package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerGroupCopy extends js.Object {
  /** only available when a new group gets created */
  var sgid: js.UndefOr[Double] = js.native
}

object ServerGroupCopy {
  @scala.inline
  def apply(): ServerGroupCopy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerGroupCopy]
  }
  @scala.inline
  implicit class ServerGroupCopyOps[Self <: ServerGroupCopy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSgid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sgid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSgid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sgid")(js.undefined)
        ret
    }
  }
  
}

