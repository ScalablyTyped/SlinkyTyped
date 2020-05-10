package typingsSlinky.stellarSdk.horizonApiMod.Horizon.ErrorResponseData

import typingsSlinky.stellarSdk.stellarSdkNumbers.`429`
import typingsSlinky.stellarSdk.stellarSdkStrings.`Rate Limit Exceeded`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RateLimitExceeded extends Base {
  @JSName("status")
  var status_RateLimitExceeded: `429` = js.native
  @JSName("title")
  var title_RateLimitExceeded: `Rate Limit Exceeded` = js.native
}

object RateLimitExceeded {
  @scala.inline
  def apply(details: String, instance: String, status: `429`, title: `Rate Limit Exceeded`, `type`: String): RateLimitExceeded = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateLimitExceeded]
  }
  @scala.inline
  implicit class RateLimitExceededOps[Self <: RateLimitExceeded] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: `429`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: `Rate Limit Exceeded`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

