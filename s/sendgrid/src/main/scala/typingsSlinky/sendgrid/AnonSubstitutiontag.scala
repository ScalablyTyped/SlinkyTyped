package typingsSlinky.sendgrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSubstitutiontag extends js.Object {
  var enable: Boolean = js.native
  var substitution_tag: String = js.native
}

object AnonSubstitutiontag {
  @scala.inline
  def apply(enable: Boolean, substitution_tag: String): AnonSubstitutiontag = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], substitution_tag = substitution_tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSubstitutiontag]
  }
  @scala.inline
  implicit class AnonSubstitutiontagOps[Self <: AnonSubstitutiontag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubstitution_tag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substitution_tag")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

