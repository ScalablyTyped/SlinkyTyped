package typingsSlinky.vsoNodeApi.testInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LastResultDetails extends js.Object {
  var dateCompleted: js.Date = js.native
  var duration: Double = js.native
  var runBy: IdentityRef = js.native
}

object LastResultDetails {
  @scala.inline
  def apply(dateCompleted: js.Date, duration: Double, runBy: IdentityRef): LastResultDetails = {
    val __obj = js.Dynamic.literal(dateCompleted = dateCompleted.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], runBy = runBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastResultDetails]
  }
  @scala.inline
  implicit class LastResultDetailsOps[Self <: LastResultDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateCompleted(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateCompleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunBy(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runBy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

