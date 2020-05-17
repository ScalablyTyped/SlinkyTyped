package typingsSlinky.telebot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorMessage extends js.Object {
  var errorMessage: js.UndefOr[String] = js.native
  var shippingOptions: js.UndefOr[js.Array[_]] = js.native
}

object ErrorMessage {
  @scala.inline
  def apply(): ErrorMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorMessage]
  }
  @scala.inline
  implicit class ErrorMessageOps[Self <: ErrorMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingOptions(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingOptions")(js.undefined)
        ret
    }
  }
  
}

