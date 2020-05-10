package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAbusive extends js.Object {
  var abusive: Double = js.native
  var general: Double = js.native
  var spam: Double = js.native
}

object AnonAbusive {
  @scala.inline
  def apply(abusive: Double, general: Double, spam: Double): AnonAbusive = {
    val __obj = js.Dynamic.literal(abusive = abusive.asInstanceOf[js.Any], general = general.asInstanceOf[js.Any], spam = spam.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAbusive]
  }
  @scala.inline
  implicit class AnonAbusiveOps[Self <: AnonAbusive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbusive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abusive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeneral(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("general")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpam(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spam")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

