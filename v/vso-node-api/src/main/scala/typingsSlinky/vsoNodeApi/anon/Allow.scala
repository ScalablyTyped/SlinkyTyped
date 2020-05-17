package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Allow extends js.Object {
  var allow: scala.Double = js.native
  var completed: scala.Double = js.native
  var disallow: scala.Double = js.native
}

object Allow {
  @scala.inline
  def apply(allow: scala.Double, completed: scala.Double, disallow: scala.Double): Allow = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], disallow = disallow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Allow]
  }
  @scala.inline
  implicit class AllowOps[Self <: Allow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompleted(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisallow(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disallow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

