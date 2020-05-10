package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelGroupClientList extends js.Object {
  var cgid: js.UndefOr[Double] = js.native
  var cid: js.UndefOr[Double] = js.native
  var cldbid: js.UndefOr[Double] = js.native
}

object ChannelGroupClientList {
  @scala.inline
  def apply(): ChannelGroupClientList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelGroupClientList]
  }
  @scala.inline
  implicit class ChannelGroupClientListOps[Self <: ChannelGroupClientList] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withCid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cid")(js.undefined)
        ret
    }
    @scala.inline
    def withCldbid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cldbid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCldbid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cldbid")(js.undefined)
        ret
    }
  }
  
}

