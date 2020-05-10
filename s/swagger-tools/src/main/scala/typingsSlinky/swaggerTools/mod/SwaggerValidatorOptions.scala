package typingsSlinky.swaggerTools.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwaggerValidatorOptions extends js.Object {
  var validateResponse: js.UndefOr[Boolean] = js.native
}

object SwaggerValidatorOptions {
  @scala.inline
  def apply(): SwaggerValidatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwaggerValidatorOptions]
  }
  @scala.inline
  implicit class SwaggerValidatorOptionsOps[Self <: SwaggerValidatorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValidateResponse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateResponse")(js.undefined)
        ret
    }
  }
  
}

