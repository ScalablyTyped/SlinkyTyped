package typingsSlinky.semanticUiApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl, 'missingURL'> */
@js.native
trait PickImplmissingURL extends js.Object {
  var missingURL: String = js.native
}

object PickImplmissingURL {
  @scala.inline
  def apply(missingURL: String): PickImplmissingURL = {
    val __obj = js.Dynamic.literal(missingURL = missingURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmissingURL]
  }
  @scala.inline
  implicit class PickImplmissingURLOps[Self <: PickImplmissingURL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMissingURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingURL")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

