package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelClientPermListSid extends js.Object {
  var cid: Double = js.native
  var cldbid: Double = js.native
  var permnegated: Double = js.native
  var permsid: String = js.native
  var permskip: Double = js.native
  var permvalue: Double = js.native
}

object ChannelClientPermListSid {
  @scala.inline
  def apply(
    cid: Double,
    cldbid: Double,
    permnegated: Double,
    permsid: String,
    permskip: Double,
    permvalue: Double
  ): ChannelClientPermListSid = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], cldbid = cldbid.asInstanceOf[js.Any], permnegated = permnegated.asInstanceOf[js.Any], permsid = permsid.asInstanceOf[js.Any], permskip = permskip.asInstanceOf[js.Any], permvalue = permvalue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelClientPermListSid]
  }
  @scala.inline
  implicit class ChannelClientPermListSidOps[Self <: ChannelClientPermListSid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCldbid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cldbid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermnegated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permnegated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermsid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permsid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermskip(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permskip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermvalue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permvalue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

