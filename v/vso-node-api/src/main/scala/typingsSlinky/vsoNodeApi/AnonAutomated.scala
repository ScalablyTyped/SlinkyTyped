package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAutomated extends js.Object {
  var automated: Double = js.native
  var manual: Double = js.native
  var none: Double = js.native
  var scheduled: Double = js.native
}

object AnonAutomated {
  @scala.inline
  def apply(automated: Double, manual: Double, none: Double, scheduled: Double): AnonAutomated = {
    val __obj = js.Dynamic.literal(automated = automated.asInstanceOf[js.Any], manual = manual.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], scheduled = scheduled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutomated]
  }
  @scala.inline
  implicit class AnonAutomatedOps[Self <: AnonAutomated] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManual(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheduled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

