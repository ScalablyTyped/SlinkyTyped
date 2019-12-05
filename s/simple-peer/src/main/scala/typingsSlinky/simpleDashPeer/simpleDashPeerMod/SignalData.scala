package typingsSlinky.simpleDashPeer.simpleDashPeerMod

import typingsSlinky.simpleDashPeer.simpleDashPeerStrings.answer
import typingsSlinky.simpleDashPeer.simpleDashPeerStrings.offer
import typingsSlinky.simpleDashPeer.simpleDashPeerStrings.pranswer
import typingsSlinky.simpleDashPeer.simpleDashPeerStrings.rollback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignalData extends js.Object {
  var candidate: js.UndefOr[js.Any] = js.undefined
  var sdp: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[offer | pranswer | answer | rollback] = js.undefined
}

object SignalData {
  @scala.inline
  def apply(candidate: js.Any = null, sdp: js.Any = null, `type`: offer | pranswer | answer | rollback = null): SignalData = {
    val __obj = js.Dynamic.literal()
    if (candidate != null) __obj.updateDynamic("candidate")(candidate.asInstanceOf[js.Any])
    if (sdp != null) __obj.updateDynamic("sdp")(sdp.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalData]
  }
}

