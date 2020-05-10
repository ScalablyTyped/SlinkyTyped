package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRequired extends js.Object {
  var required: Double = js.native
  var supported: Double = js.native
  var unsupported: Double = js.native
}

object AnonRequired {
  @scala.inline
  def apply(required: Double, supported: Double, unsupported: Double): AnonRequired = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any], unsupported = unsupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRequired]
  }
  @scala.inline
  implicit class AnonRequiredOps[Self <: AnonRequired] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequired(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupported(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnsupported(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsupported")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

