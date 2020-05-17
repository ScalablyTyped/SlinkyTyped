package typingsSlinky.semanticUiApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl, keyof semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplBeforeSend extends js.Object {
  var JSONParse: js.UndefOr[String] = js.native
  var beforeSend: js.UndefOr[String] = js.native
  var error: js.UndefOr[String] = js.native
  var exitConditions: js.UndefOr[String] = js.native
  var legacyParameters: js.UndefOr[String] = js.native
  var missingAction: js.UndefOr[String] = js.native
  var missingSerialize: js.UndefOr[String] = js.native
  var missingURL: js.UndefOr[String] = js.native
  var noReturnedValue: js.UndefOr[String] = js.native
  var parseError: js.UndefOr[String] = js.native
  var requiredParameter: js.UndefOr[String] = js.native
  var statusMessage: js.UndefOr[String] = js.native
  var timeout: js.UndefOr[String] = js.native
}

object PartialPickImplkeyofImplBeforeSend {
  @scala.inline
  def apply(): PartialPickImplkeyofImplBeforeSend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplBeforeSend]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplBeforeSendOps[Self <: PartialPickImplkeyofImplBeforeSend] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutJSONParse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSONParse")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeSend(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeSend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSend")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withExitConditions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitConditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExitConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitConditions")(js.undefined)
        ret
    }
    @scala.inline
    def withLegacyParameters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legacyParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegacyParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legacyParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withMissingAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMissingAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingAction")(js.undefined)
        ret
    }
    @scala.inline
    def withMissingSerialize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingSerialize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMissingSerialize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingSerialize")(js.undefined)
        ret
    }
    @scala.inline
    def withMissingURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMissingURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingURL")(js.undefined)
        ret
    }
    @scala.inline
    def withNoReturnedValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noReturnedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoReturnedValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noReturnedValue")(js.undefined)
        ret
    }
    @scala.inline
    def withParseError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParseError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseError")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiredParameter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredParameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiredParameter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredParameter")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

