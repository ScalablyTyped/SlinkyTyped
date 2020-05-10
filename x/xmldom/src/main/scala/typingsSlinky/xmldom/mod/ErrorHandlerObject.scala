package typingsSlinky.xmldom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorHandlerObject extends js.Object {
  var error: js.UndefOr[js.Function1[/* msg */ js.Any, _]] = js.native
  var fatalError: js.UndefOr[js.Function1[/* msg */ js.Any, _]] = js.native
  var warning: js.UndefOr[js.Function1[/* msg */ js.Any, _]] = js.native
}

object ErrorHandlerObject {
  @scala.inline
  def apply(): ErrorHandlerObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorHandlerObject]
  }
  @scala.inline
  implicit class ErrorHandlerObjectOps[Self <: ErrorHandlerObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: /* msg */ js.Any => _): Self = {
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
    def withFatalError(value: /* msg */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fatalError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFatalError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fatalError")(js.undefined)
        ret
    }
    @scala.inline
    def withWarning(value: /* msg */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(js.undefined)
        ret
    }
  }
  
}

