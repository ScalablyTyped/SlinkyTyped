package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options object for the [accept](Titanium.Network.Socket.TCP.accept) method.
  */
@js.native
trait AcceptDict extends js.Object {
  /**
  	 * Callback to be fired when the socket enters the [ERROR](Titanium.Network.Socket.ERROR) state.
  	 */
  var error: js.UndefOr[js.Function1[/* param0 */ ErrorCallbackArgs, Unit]] = js.native
  /**
  	 * Timeout, in milliseconds, for all `write` operations.
  	 */
  var timeout: js.UndefOr[Double] = js.native
}

object AcceptDict {
  @scala.inline
  def apply(): AcceptDict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptDict]
  }
  @scala.inline
  implicit class AcceptDictOps[Self <: AcceptDict] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: /* param0 */ ErrorCallbackArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

