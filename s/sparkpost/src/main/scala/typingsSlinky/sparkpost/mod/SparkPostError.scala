package typingsSlinky.sparkpost.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparkPostError extends Error {
  var errors: js.Array[ErrorWithDescription | ErrorWithParam] = js.native
  @JSName("name")
  var name_SparkPostError: typingsSlinky.sparkpost.sparkpostStrings.SparkPostError = js.native
  var statusCode: Double = js.native
}

object SparkPostError {
  @scala.inline
  def apply(
    errors: js.Array[ErrorWithDescription | ErrorWithParam],
    message: String,
    name: typingsSlinky.sparkpost.sparkpostStrings.SparkPostError,
    statusCode: Double
  ): SparkPostError = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparkPostError]
  }
  @scala.inline
  implicit class SparkPostErrorOps[Self <: SparkPostError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: js.Array[ErrorWithDescription | ErrorWithParam]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: typingsSlinky.sparkpost.sparkpostStrings.SparkPostError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

