package typingsSlinky.whatwgMimetype

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAllowParameters extends js.Object {
  var allowParameters: js.UndefOr[Boolean] = js.native
}

object AnonAllowParameters {
  @scala.inline
  def apply(): AnonAllowParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAllowParameters]
  }
  @scala.inline
  implicit class AnonAllowParametersOps[Self <: AnonAllowParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowParameters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowParameters")(js.undefined)
        ret
    }
  }
  
}

