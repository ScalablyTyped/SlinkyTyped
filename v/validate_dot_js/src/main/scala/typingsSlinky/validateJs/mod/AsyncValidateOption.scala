package typingsSlinky.validateJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncValidateOption extends js.Object {
  var cleanAttributes: js.UndefOr[Boolean] = js.native
  var prettify: js.UndefOr[js.Function] = js.native
  var wrapErrors: js.UndefOr[js.Function] = js.native
}

object AsyncValidateOption {
  @scala.inline
  def apply(): AsyncValidateOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncValidateOption]
  }
  @scala.inline
  implicit class AsyncValidateOptionOps[Self <: AsyncValidateOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCleanAttributes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCleanAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withPrettify(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrettify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettify")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapErrors(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapErrors")(js.undefined)
        ret
    }
  }
  
}

