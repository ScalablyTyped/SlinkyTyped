package typingsSlinky.sharepoint.SP.JsGrid.Internal

import typingsSlinky.sharepoint.SP.JsGrid.IChangeKey
import typingsSlinky.sharepoint.anon.AnyChanges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiffTracker extends js.Object {
  var ExternalAPI: AnyChanges = js.native
  def Clear(): Unit = js.native
  def NotifyRollbackChange(changeKey: IChangeKey): Unit = js.native
  def NotifySynchronizeToChange(changeKey: IChangeKey): Unit = js.native
  def NotifyVacateChange(changeKey: IChangeKey): Unit = js.native
}

object DiffTracker {
  @scala.inline
  def apply(
    Clear: () => Unit,
    ExternalAPI: AnyChanges,
    NotifyRollbackChange: IChangeKey => Unit,
    NotifySynchronizeToChange: IChangeKey => Unit,
    NotifyVacateChange: IChangeKey => Unit
  ): DiffTracker = {
    val __obj = js.Dynamic.literal(Clear = js.Any.fromFunction0(Clear), ExternalAPI = ExternalAPI.asInstanceOf[js.Any], NotifyRollbackChange = js.Any.fromFunction1(NotifyRollbackChange), NotifySynchronizeToChange = js.Any.fromFunction1(NotifySynchronizeToChange), NotifyVacateChange = js.Any.fromFunction1(NotifyVacateChange))
    __obj.asInstanceOf[DiffTracker]
  }
  @scala.inline
  implicit class DiffTrackerOps[Self <: DiffTracker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExternalAPI(value: AnyChanges): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExternalAPI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotifyRollbackChange(value: IChangeKey => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotifyRollbackChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNotifySynchronizeToChange(value: IChangeKey => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotifySynchronizeToChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNotifyVacateChange(value: IChangeKey => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotifyVacateChange")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

