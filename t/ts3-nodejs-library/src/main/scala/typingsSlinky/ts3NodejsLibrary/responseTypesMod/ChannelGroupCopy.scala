package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelGroupCopy extends js.Object {
  /** only available when a new group gets created */
  var cgid: js.UndefOr[Double] = js.native
}

object ChannelGroupCopy {
  @scala.inline
  def apply(): ChannelGroupCopy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelGroupCopy]
  }
  @scala.inline
  implicit class ChannelGroupCopyOps[Self <: ChannelGroupCopy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCgid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cgid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCgid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cgid")(js.undefined)
        ret
    }
  }
  
}

