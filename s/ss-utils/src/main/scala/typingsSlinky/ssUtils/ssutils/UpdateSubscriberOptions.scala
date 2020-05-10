package typingsSlinky.ssUtils.ssutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSubscriberOptions extends js.Object {
  var SubscribeChannels: js.UndefOr[String] = js.native
  var UnsubscribeChannels: js.UndefOr[String] = js.native
}

object UpdateSubscriberOptions {
  @scala.inline
  def apply(): UpdateSubscriberOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSubscriberOptions]
  }
  @scala.inline
  implicit class UpdateSubscriberOptionsOps[Self <: UpdateSubscriberOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubscribeChannels(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubscribeChannels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscribeChannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubscribeChannels")(js.undefined)
        ret
    }
    @scala.inline
    def withUnsubscribeChannels(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnsubscribeChannels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsubscribeChannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnsubscribeChannels")(js.undefined)
        ret
    }
  }
  
}

