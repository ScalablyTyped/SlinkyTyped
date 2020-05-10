package typingsSlinky.tgfancy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TgfancyOptions extends js.Object {
  var chatIdResolution: js.UndefOr[Boolean | ChatIdResolutionOptions] = js.native
  var emojification: js.UndefOr[Boolean | EmojificationOptions] = js.native
  var kickWithoutBan: js.UndefOr[Boolean] = js.native
  var openshiftWebHook: js.UndefOr[Boolean] = js.native
  var orderedSending: js.UndefOr[Boolean] = js.native
  var ratelimiting: js.UndefOr[Boolean | RatelimitingOptions] = js.native
  var textPaging: js.UndefOr[Boolean] = js.native
  var webSocket: js.UndefOr[Boolean | WebSocketOptions] = js.native
}

object TgfancyOptions {
  @scala.inline
  def apply(): TgfancyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TgfancyOptions]
  }
  @scala.inline
  implicit class TgfancyOptionsOps[Self <: TgfancyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChatIdResolution(value: Boolean | ChatIdResolutionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chatIdResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChatIdResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chatIdResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withEmojification(value: Boolean | EmojificationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emojification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmojification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emojification")(js.undefined)
        ret
    }
    @scala.inline
    def withKickWithoutBan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kickWithoutBan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKickWithoutBan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kickWithoutBan")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenshiftWebHook(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openshiftWebHook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenshiftWebHook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openshiftWebHook")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderedSending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderedSending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderedSending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderedSending")(js.undefined)
        ret
    }
    @scala.inline
    def withRatelimiting(value: Boolean | RatelimitingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratelimiting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRatelimiting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratelimiting")(js.undefined)
        ret
    }
    @scala.inline
    def withTextPaging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textPaging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextPaging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textPaging")(js.undefined)
        ret
    }
    @scala.inline
    def withWebSocket(value: Boolean | WebSocketOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webSocket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebSocket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webSocket")(js.undefined)
        ret
    }
  }
  
}

