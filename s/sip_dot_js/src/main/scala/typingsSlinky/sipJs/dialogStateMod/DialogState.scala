package typingsSlinky.sipJs.dialogStateMod

import typingsSlinky.sipJs.uriMod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogState extends js.Object {
  var callId: String = js.native
  var early: Boolean = js.native
  var id: String = js.native
  var localSequenceNumber: js.UndefOr[Double] = js.native
  var localTag: String = js.native
  var localURI: URI = js.native
  var remoteSequenceNumber: js.UndefOr[Double] = js.native
  var remoteTag: String = js.native
  var remoteTarget: URI = js.native
  var remoteURI: URI = js.native
  var routeSet: js.Array[String] = js.native
  var secure: Boolean = js.native
}

object DialogState {
  @scala.inline
  def apply(
    callId: String,
    early: Boolean,
    id: String,
    localTag: String,
    localURI: URI,
    remoteTag: String,
    remoteTarget: URI,
    remoteURI: URI,
    routeSet: js.Array[String],
    secure: Boolean
  ): DialogState = {
    val __obj = js.Dynamic.literal(callId = callId.asInstanceOf[js.Any], early = early.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], localTag = localTag.asInstanceOf[js.Any], localURI = localURI.asInstanceOf[js.Any], remoteTag = remoteTag.asInstanceOf[js.Any], remoteTarget = remoteTarget.asInstanceOf[js.Any], remoteURI = remoteURI.asInstanceOf[js.Any], routeSet = routeSet.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogState]
  }
  @scala.inline
  implicit class DialogStateOps[Self <: DialogState] (val x: Self) extends AnyVal {
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
    def withEarly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("early")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalURI(value: URI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localURI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoteTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoteTarget(value: URI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoteURI(value: URI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteURI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRouteSet(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalSequenceNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localSequenceNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalSequenceNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localSequenceNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteSequenceNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteSequenceNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteSequenceNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteSequenceNumber")(js.undefined)
        ret
    }
  }
  
}

