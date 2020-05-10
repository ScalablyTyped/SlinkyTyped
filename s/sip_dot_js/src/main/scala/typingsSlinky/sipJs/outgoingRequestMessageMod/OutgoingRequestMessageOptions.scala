package typingsSlinky.sipJs.outgoingRequestMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutgoingRequestMessageOptions extends js.Object {
  var callId: js.UndefOr[String] = js.native
  var callIdPrefix: js.UndefOr[String] = js.native
  var cseq: js.UndefOr[Double] = js.native
  var forceRport: js.UndefOr[Boolean] = js.native
  var fromDisplayName: js.UndefOr[String] = js.native
  var fromTag: js.UndefOr[String] = js.native
  var hackViaTcp: js.UndefOr[Boolean] = js.native
  var optionTags: js.UndefOr[js.Array[String]] = js.native
  var routeSet: js.UndefOr[js.Array[String]] = js.native
  var toDisplayName: js.UndefOr[String] = js.native
  var toTag: js.UndefOr[String] = js.native
  var userAgentString: js.UndefOr[String] = js.native
  var viaHost: js.UndefOr[String] = js.native
}

object OutgoingRequestMessageOptions {
  @scala.inline
  def apply(): OutgoingRequestMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutgoingRequestMessageOptions]
  }
  @scala.inline
  implicit class OutgoingRequestMessageOptionsOps[Self <: OutgoingRequestMessageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callId")(js.undefined)
        ret
    }
    @scala.inline
    def withCallIdPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callIdPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallIdPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callIdPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withCseq(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cseq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCseq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cseq")(js.undefined)
        ret
    }
    @scala.inline
    def withForceRport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceRport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceRport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceRport")(js.undefined)
        ret
    }
    @scala.inline
    def withFromDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromDisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withFromTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromTag")(js.undefined)
        ret
    }
    @scala.inline
    def withHackViaTcp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hackViaTcp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHackViaTcp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hackViaTcp")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionTags")(js.undefined)
        ret
    }
    @scala.inline
    def withRouteSet(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouteSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeSet")(js.undefined)
        ret
    }
    @scala.inline
    def withToDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withToTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toTag")(js.undefined)
        ret
    }
    @scala.inline
    def withUserAgentString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgentString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAgentString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgentString")(js.undefined)
        ret
    }
    @scala.inline
    def withViaHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viaHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViaHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viaHost")(js.undefined)
        ret
    }
  }
  
}

