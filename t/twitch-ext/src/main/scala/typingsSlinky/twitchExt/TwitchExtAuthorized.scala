package typingsSlinky.twitchExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result object as passed to the onAuthorized callback.
  *
  * @see TwitchExt.onAuthorized
  */
@js.native
trait TwitchExtAuthorized extends js.Object {
  /**
  	 * Channel ID of the page where the extension is iframe embedded.
  	 */
  var channelId: String = js.native
  /**
  	 * Client ID of the extension.
  	 */
  var clientId: String = js.native
  /**
  	 * JWT that should be passed to any EBS call for authentication.
  	 */
  var token: String = js.native
  /**
  	 * Opaque user ID.
  	 */
  var userId: String = js.native
}

object TwitchExtAuthorized {
  @scala.inline
  def apply(channelId: String, clientId: String, token: String, userId: String): TwitchExtAuthorized = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitchExtAuthorized]
  }
  @scala.inline
  implicit class TwitchExtAuthorizedOps[Self <: TwitchExtAuthorized] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

