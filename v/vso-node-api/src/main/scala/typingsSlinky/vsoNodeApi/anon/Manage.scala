package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Manage extends js.Object {
  var manage: scala.Double = js.native
  var none: scala.Double = js.native
  var use: scala.Double = js.native
}

object Manage {
  @scala.inline
  def apply(manage: scala.Double, none: scala.Double, use: scala.Double): Manage = {
    val __obj = js.Dynamic.literal(manage = manage.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manage]
  }
  @scala.inline
  implicit class ManageOps[Self <: Manage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManage(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUse(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

