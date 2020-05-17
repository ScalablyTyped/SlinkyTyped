package typingsSlinky.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActualSignatureInfo extends js.Object {
  var currentParameter: Double = js.native
  var currentParameterIsTypeParameter: Boolean = js.native
  var parameterLimChar: Double = js.native
  var parameterMinChar: Double = js.native
}

object ActualSignatureInfo {
  @scala.inline
  def apply(
    currentParameter: Double,
    currentParameterIsTypeParameter: Boolean,
    parameterLimChar: Double,
    parameterMinChar: Double
  ): ActualSignatureInfo = {
    val __obj = js.Dynamic.literal(currentParameter = currentParameter.asInstanceOf[js.Any], currentParameterIsTypeParameter = currentParameterIsTypeParameter.asInstanceOf[js.Any], parameterLimChar = parameterLimChar.asInstanceOf[js.Any], parameterMinChar = parameterMinChar.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActualSignatureInfo]
  }
  @scala.inline
  implicit class ActualSignatureInfoOps[Self <: ActualSignatureInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentParameter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentParameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentParameterIsTypeParameter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentParameterIsTypeParameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameterLimChar(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterLimChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameterMinChar(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterMinChar")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

