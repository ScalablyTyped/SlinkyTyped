package typingsSlinky.yaml.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsonEncoding extends js.Object {
  /**
    * Whether to restrict double-quoted strings to use JSON-compatible syntax.
    *
    * Default: `false`
    */
  var jsonEncoding: Boolean = js.native
  /**
    * Minimum length to use multiple lines to represent the value.
    *
    * Default: `40`
    */
  var minMultiLineLength: Double = js.native
}

object JsonEncoding {
  @scala.inline
  def apply(jsonEncoding: Boolean, minMultiLineLength: Double): JsonEncoding = {
    val __obj = js.Dynamic.literal(jsonEncoding = jsonEncoding.asInstanceOf[js.Any], minMultiLineLength = minMultiLineLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonEncoding]
  }
  @scala.inline
  implicit class JsonEncodingOps[Self <: JsonEncoding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJsonEncoding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinMultiLineLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minMultiLineLength")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

