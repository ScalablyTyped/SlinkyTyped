package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelClientPermListId extends js.Object {
  var cid: Double = js.native
  var cldbid: Double = js.native
  var permid: Double = js.native
  var permnegated: Double = js.native
  var permskip: Double = js.native
  var permvalue: Double = js.native
}

object ChannelClientPermListId {
  @scala.inline
  def apply(
    cid: Double,
    cldbid: Double,
    permid: Double,
    permnegated: Double,
    permskip: Double,
    permvalue: Double
  ): ChannelClientPermListId = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], cldbid = cldbid.asInstanceOf[js.Any], permid = permid.asInstanceOf[js.Any], permnegated = permnegated.asInstanceOf[js.Any], permskip = permskip.asInstanceOf[js.Any], permvalue = permvalue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelClientPermListId]
  }
  @scala.inline
  implicit class ChannelClientPermListIdOps[Self <: ChannelClientPermListId] (val x: Self) extends AnyVal {
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
    def withPermid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermnegated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permnegated")(value.asInstanceOf[js.Any])
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

