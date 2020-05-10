package typingsSlinky.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCallsignature extends js.Object {
  var `call-signature`: String = js.native
  var `index-signature`: String = js.native
  var parameter: String = js.native
  var `property-declaration`: String = js.native
  var `variable-declaration`: String = js.native
}

object AnonCallsignature {
  @scala.inline
  def apply(
    `call-signature`: String,
    `index-signature`: String,
    parameter: String,
    `property-declaration`: String,
    `variable-declaration`: String
  ): AnonCallsignature = {
    val __obj = js.Dynamic.literal(parameter = parameter.asInstanceOf[js.Any])
    __obj.updateDynamic("call-signature")(`call-signature`.asInstanceOf[js.Any])
    __obj.updateDynamic("index-signature")(`index-signature`.asInstanceOf[js.Any])
    __obj.updateDynamic("property-declaration")(`property-declaration`.asInstanceOf[js.Any])
    __obj.updateDynamic("variable-declaration")(`variable-declaration`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCallsignature]
  }
  @scala.inline
  implicit class AnonCallsignatureOps[Self <: AnonCallsignature] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withCall-signature`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("call-signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withIndex-signature`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index-signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withProperty-declaration`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property-declaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withVariable-declaration`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variable-declaration")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

