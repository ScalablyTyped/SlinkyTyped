package typingsSlinky.sipJs.messagerMessageOptionsMod

import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typingsSlinky.sipJs.outgoingRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessagerMessageOptions extends js.Object {
  /** See `core` API. */
  var requestDelegate: js.UndefOr[OutgoingRequestDelegate] = js.native
  /** See `core` API. */
  var requestOptions: js.UndefOr[RequestOptions] = js.native
}

object MessagerMessageOptions {
  @scala.inline
  def apply(): MessagerMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagerMessageOptions]
  }
  @scala.inline
  implicit class MessagerMessageOptionsOps[Self <: MessagerMessageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequestDelegate(value: OutgoingRequestDelegate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestDelegate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestDelegate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestDelegate")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestOptions(value: RequestOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestOptions")(js.undefined)
        ret
    }
  }
  
}

