package typingsSlinky.sipJs.outgoingRequestMod

import typingsSlinky.sipJs.incomingResponseMod.IncomingResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutgoingRequestDelegate extends js.Object {
  /**
    * Received a 2xx positive final response to this request.
    * @param response - Incoming response.
    */
  var onAccept: js.UndefOr[js.Function1[/* response */ IncomingResponse, Unit]] = js.native
  /**
    * Received a 1xx provisional response to this request. Excluding 100 responses.
    * @param response - Incoming response.
    */
  var onProgress: js.UndefOr[js.Function1[/* response */ IncomingResponse, Unit]] = js.native
  /**
    * Received a 3xx negative final response to this request.
    * @param response - Incoming response.
    */
  var onRedirect: js.UndefOr[js.Function1[/* response */ IncomingResponse, Unit]] = js.native
  /**
    * Received a 4xx, 5xx, or 6xx negative final response to this request.
    * @param response - Incoming response.
    */
  var onReject: js.UndefOr[js.Function1[/* response */ IncomingResponse, Unit]] = js.native
  /**
    * Received a 100 provisional response.
    * @param response - Incoming response.
    */
  var onTrying: js.UndefOr[js.Function1[/* response */ IncomingResponse, Unit]] = js.native
}

object OutgoingRequestDelegate {
  @scala.inline
  def apply(): OutgoingRequestDelegate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutgoingRequestDelegate]
  }
  @scala.inline
  implicit class OutgoingRequestDelegateOps[Self <: OutgoingRequestDelegate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnAccept(value: /* response */ IncomingResponse => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccept")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAccept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccept")(js.undefined)
        ret
    }
    @scala.inline
    def withOnProgress(value: /* response */ IncomingResponse => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRedirect(value: /* response */ IncomingResponse => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRedirect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRedirect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRedirect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReject(value: /* response */ IncomingResponse => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnReject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReject")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTrying(value: /* response */ IncomingResponse => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTrying")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTrying: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTrying")(js.undefined)
        ret
    }
  }
  
}

