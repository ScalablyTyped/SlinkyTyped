package typingsSlinky.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBackgroundTaskRegistration extends js.Object {
  var name: String = js.native
  var oncompleted: js.Any = js.native
  var onprogress: js.Any = js.native
  var taskId: String = js.native
  def unregister(cancelTask: Boolean): Unit = js.native
}

object IBackgroundTaskRegistration {
  @scala.inline
  def apply(name: String, oncompleted: js.Any, onprogress: js.Any, taskId: String, unregister: Boolean => Unit): IBackgroundTaskRegistration = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], oncompleted = oncompleted.asInstanceOf[js.Any], onprogress = onprogress.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any], unregister = js.Any.fromFunction1(unregister))
    __obj.asInstanceOf[IBackgroundTaskRegistration]
  }
  @scala.inline
  implicit class IBackgroundTaskRegistrationOps[Self <: IBackgroundTaskRegistration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOncompleted(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncompleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnprogress(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onprogress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnregister(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unregister")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

