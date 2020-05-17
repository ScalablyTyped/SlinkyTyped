package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Automated extends js.Object {
  var automated: scala.Double = js.native
  var manual: scala.Double = js.native
  var none: scala.Double = js.native
  var scheduled: scala.Double = js.native
}

object Automated {
  @scala.inline
  def apply(automated: scala.Double, manual: scala.Double, none: scala.Double, scheduled: scala.Double): Automated = {
    val __obj = js.Dynamic.literal(automated = automated.asInstanceOf[js.Any], manual = manual.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], scheduled = scheduled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Automated]
  }
  @scala.inline
  implicit class AutomatedOps[Self <: Automated] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomated(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManual(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheduled(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

