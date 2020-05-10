package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAllow extends js.Object {
  var allow: Double = js.native
  var completed: Double = js.native
  var disallow: Double = js.native
}

object AnonAllow {
  @scala.inline
  def apply(allow: Double, completed: Double, disallow: Double): AnonAllow = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], disallow = disallow.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllow]
  }
  @scala.inline
  implicit class AnonAllowOps[Self <: AnonAllow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompleted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisallow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disallow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

