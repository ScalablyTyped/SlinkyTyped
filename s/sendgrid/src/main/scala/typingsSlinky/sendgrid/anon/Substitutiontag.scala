package typingsSlinky.sendgrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Substitutiontag extends js.Object {
  var enable: Boolean = js.native
  var substitution_tag: String = js.native
}

object Substitutiontag {
  @scala.inline
  def apply(enable: Boolean, substitution_tag: String): Substitutiontag = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], substitution_tag = substitution_tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Substitutiontag]
  }
  @scala.inline
  implicit class SubstitutiontagOps[Self <: Substitutiontag] (val x: Self) extends AnyVal {
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

