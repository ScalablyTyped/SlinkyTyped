package typingsSlinky.stripeV3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Base extends js.Object {
  var base: js.UndefOr[String] = js.native
  var complete: js.UndefOr[String] = js.native
  var empty: js.UndefOr[String] = js.native
  var focus: js.UndefOr[String] = js.native
  var invalid: js.UndefOr[String] = js.native
  var webkitAutofill: js.UndefOr[String] = js.native
}

object Base {
  @scala.inline
  def apply(): Base = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Base]
  }
  @scala.inline
  implicit class BaseOps[Self <: Base] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(js.undefined)
        ret
    }
    @scala.inline
    def withComplete(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withEmpty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(js.undefined)
        ret
    }
    @scala.inline
    def withFocus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalid")(js.undefined)
        ret
    }
    @scala.inline
    def withWebkitAutofill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webkitAutofill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebkitAutofill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webkitAutofill")(js.undefined)
        ret
    }
  }
  
}

