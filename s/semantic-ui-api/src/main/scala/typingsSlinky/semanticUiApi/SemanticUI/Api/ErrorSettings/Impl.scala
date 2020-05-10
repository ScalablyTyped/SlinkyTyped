package typingsSlinky.semanticUiApi.SemanticUI.Api.ErrorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * @default 'JSON could not be parsed during error handling'
    */
  var JSONParse: String = js.native
  /**
    * @default 'The before send function has aborted the request'
    */
  var beforeSend: String = js.native
  /**
    * @default 'There was an error with your request'
    */
  var error: String = js.native
  /**
    * @default 'API Request Aborted. Exit conditions met'
    */
  var exitConditions: String = js.native
  /**
    * @default 'You are using legacy API success callback names'
    */
  var legacyParameters: String = js.native
  /**
    * @default 'API action used but no url was defined'
    */
  var missingAction: String = js.native
  /**
    * @default 'Required dependency jquery-serialize-object missing, using basic serialize'
    */
  var missingSerialize: String = js.native
  /**
    * @default 'No URL specified for API event'
    */
  var missingURL: String = js.native
  /**
    * @default 'The beforeSend callback must return a settings object, beforeSend ignored.'
    */
  var noReturnedValue: String = js.native
  /**
    * @default 'There was an error parsing your request'
    */
  var parseError: String = js.native
  /**
    * @default 'Missing a required URL parameter: '
    */
  var requiredParameter: String = js.native
  /**
    * @default 'Server gave an error: '
    */
  var statusMessage: String = js.native
  /**
    * @default 'Your request timed out'
    */
  var timeout: String = js.native
}

object Impl {
  @scala.inline
  def apply(
    JSONParse: String,
    beforeSend: String,
    error: String,
    exitConditions: String,
    legacyParameters: String,
    missingAction: String,
    missingSerialize: String,
    missingURL: String,
    noReturnedValue: String,
    parseError: String,
    requiredParameter: String,
    statusMessage: String,
    timeout: String
  ): Impl = {
    val __obj = js.Dynamic.literal(JSONParse = JSONParse.asInstanceOf[js.Any], beforeSend = beforeSend.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], exitConditions = exitConditions.asInstanceOf[js.Any], legacyParameters = legacyParameters.asInstanceOf[js.Any], missingAction = missingAction.asInstanceOf[js.Any], missingSerialize = missingSerialize.asInstanceOf[js.Any], missingURL = missingURL.asInstanceOf[js.Any], noReturnedValue = noReturnedValue.asInstanceOf[js.Any], parseError = parseError.asInstanceOf[js.Any], requiredParameter = requiredParameter.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
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
    def withBeforeSend(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExitConditions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitConditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLegacyParameters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legacyParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMissingAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMissingSerialize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingSerialize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMissingURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoReturnedValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noReturnedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParseError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequiredParameter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredParameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

