package typingsSlinky.ssUtils.ssutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SSEConnect extends SSECommand {
  var heartbeatIntervalMs: Double = js.native
  var heartbeatUrl: String = js.native
  var id: String = js.native
  var idleTimeoutMs: Double = js.native
  var unRegisterUrl: String = js.native
  var updateSubscriberUrl: String = js.native
}

object SSEConnect {
  @scala.inline
  def apply(
    channels: String,
    displayName: String,
    heartbeatIntervalMs: Double,
    heartbeatUrl: String,
    id: String,
    idleTimeoutMs: Double,
    profileUrl: String,
    unRegisterUrl: String,
    updateSubscriberUrl: String,
    userId: String
  ): SSEConnect = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], heartbeatIntervalMs = heartbeatIntervalMs.asInstanceOf[js.Any], heartbeatUrl = heartbeatUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], idleTimeoutMs = idleTimeoutMs.asInstanceOf[js.Any], profileUrl = profileUrl.asInstanceOf[js.Any], unRegisterUrl = unRegisterUrl.asInstanceOf[js.Any], updateSubscriberUrl = updateSubscriberUrl.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSEConnect]
  }
  @scala.inline
  implicit class SSEConnectOps[Self <: SSEConnect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeartbeatIntervalMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeatIntervalMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeartbeatUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeatUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdleTimeoutMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idleTimeoutMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnRegisterUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unRegisterUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateSubscriberUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateSubscriberUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

