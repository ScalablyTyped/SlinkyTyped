package typingsSlinky.semanticUiApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl, 'JSONParse'> */
@js.native
trait PickImplJSONParse extends js.Object {
  var JSONParse: String = js.native
}

object PickImplJSONParse {
  @scala.inline
  def apply(JSONParse: String): PickImplJSONParse = {
    val __obj = js.Dynamic.literal(JSONParse = JSONParse.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplJSONParse]
  }
  @scala.inline
  implicit class PickImplJSONParseOps[Self <: PickImplJSONParse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJSONParse(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSONParse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

