package typingsSlinky.twitchExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TwitchExtFeatureFlags extends js.Object {
  /**
  	 * If this flag is true, you can send a chat message to the current channel using Send Extension Chat Message
  	 * (subject to the authentication requirements documented for that endpoint).
  	 */
  var isChatEnabled: Boolean = js.native
}

object TwitchExtFeatureFlags {
  @scala.inline
  def apply(isChatEnabled: Boolean): TwitchExtFeatureFlags = {
    val __obj = js.Dynamic.literal(isChatEnabled = isChatEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitchExtFeatureFlags]
  }
  @scala.inline
  implicit class TwitchExtFeatureFlagsOps[Self <: TwitchExtFeatureFlags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsChatEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChatEnabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

