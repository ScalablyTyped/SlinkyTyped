package typingsSlinky.semanticUiApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-api.SemanticUI.Api.RegExpSettings._Impl, keyof semantic-ui-api.SemanticUI.Api.RegExpSettings._Impl>> */
trait PartialPickImplkeyofImplOptional extends js.Object {
  var optional: js.UndefOr[js.RegExp] = js.undefined
  var required: js.UndefOr[js.RegExp] = js.undefined
}

object PartialPickImplkeyofImplOptional {
  @scala.inline
  def apply(optional: js.RegExp = null, required: js.RegExp = null): PartialPickImplkeyofImplOptional = {
    val __obj = js.Dynamic.literal()
    if (optional != null) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplOptional]
  }
}

