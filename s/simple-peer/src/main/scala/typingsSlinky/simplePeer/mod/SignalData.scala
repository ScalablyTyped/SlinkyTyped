package typingsSlinky.simplePeer.mod

import typingsSlinky.simplePeer.simplePeerStrings.answer
import typingsSlinky.simplePeer.simplePeerStrings.offer
import typingsSlinky.simplePeer.simplePeerStrings.pranswer
import typingsSlinky.simplePeer.simplePeerStrings.rollback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignalData extends js.Object {
  var candidate: js.UndefOr[js.Any] = js.native
  var sdp: js.UndefOr[js.Any] = js.native
  var `type`: js.UndefOr[offer | pranswer | answer | rollback] = js.native
}

object SignalData {
  @scala.inline
  def apply(): SignalData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignalData]
  }
  @scala.inline
  implicit class SignalDataOps[Self <: SignalData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCandidate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCandidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candidate")(js.undefined)
        ret
    }
    @scala.inline
    def withSdp(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSdp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdp")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: offer | pranswer | answer | rollback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

