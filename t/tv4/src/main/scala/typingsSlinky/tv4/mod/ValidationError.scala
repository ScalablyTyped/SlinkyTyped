package typingsSlinky.tv4.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationError extends js.Object {
  var code: Double = js.native
  var dataPath: js.UndefOr[String] = js.native
  var message: js.Any = js.native
  var schemaPath: js.UndefOr[String] = js.native
  var subErrors: js.UndefOr[js.Array[ValidationError]] = js.native
}

object ValidationError {
  @scala.inline
  def apply(code: Double, message: js.Any): ValidationError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationError]
  }
  @scala.inline
  implicit class ValidationErrorOps[Self <: ValidationError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataPath")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaPath")(js.undefined)
        ret
    }
    @scala.inline
    def withSubErrors(value: js.Array[ValidationError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subErrors")(js.undefined)
        ret
    }
  }
  
}

