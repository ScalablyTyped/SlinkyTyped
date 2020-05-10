package typingsSlinky.zSchema.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaErrorDetail extends js.Object {
  /**
    * An error identifier that can be used to format a custom error message.
    * Example: "INVALID_TYPE"
    */
  var code: String = js.native
  /**
    * The schema rule description, which is included for certain errors where
    * this information is useful (e.g. to describe a constraint).
    */
  var description: String = js.native
  /**
    * Returns details for sub-schemas that failed to match.  For example, if the schema
    * uses the "oneOf" constraint to accept several alternative possibilities, each
    * alternative will have its own inner detail object explaining why it failed to match.
    */
  var inner: js.Array[SchemaErrorDetail] = js.native
  /**
    * Example: "Expected type string but found type array"
    */
  var message: String = js.native
  /**
    * Format parameters that can be used to format a custom error message.
    * Example: ["string","array"]
    */
  var params: js.Array[String] = js.native
  /**
    * A JSON path indicating the location of the error.
    * Example: "#/projects/1"
    */
  var path: String = js.native
}

object SchemaErrorDetail {
  @scala.inline
  def apply(
    code: String,
    description: String,
    inner: js.Array[SchemaErrorDetail],
    message: String,
    params: js.Array[String],
    path: String
  ): SchemaErrorDetail = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], inner = inner.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaErrorDetail]
  }
  @scala.inline
  implicit class SchemaErrorDetailOps[Self <: SchemaErrorDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInner(value: js.Array[SchemaErrorDetail]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParams(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

