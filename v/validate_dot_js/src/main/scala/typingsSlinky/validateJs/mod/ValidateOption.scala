package typingsSlinky.validateJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidateOption extends js.Object {
  var format: js.UndefOr[String] = js.native
  var fullMessages: js.UndefOr[Boolean] = js.native
  var prettify: js.UndefOr[js.Function] = js.native
}

object ValidateOption {
  @scala.inline
  def apply(): ValidateOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateOption]
  }
  @scala.inline
  implicit class ValidateOptionOps[Self <: ValidateOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withFullMessages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullMessages")(js.undefined)
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
  }
  
}

