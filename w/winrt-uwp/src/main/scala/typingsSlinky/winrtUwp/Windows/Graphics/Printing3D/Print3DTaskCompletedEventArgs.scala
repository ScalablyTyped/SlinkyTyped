package typingsSlinky.winrtUwp.Windows.Graphics.Printing3D

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the Completed event of the 3D print request. */
@js.native
trait Print3DTaskCompletedEventArgs extends js.Object {
  /** Gets the status of the 3D print request. */
  var completion: Print3DTaskCompletion = js.native
  /** Gets the type of error encountered during the 3D print request. */
  var extendedStatus: Print3DTaskDetail = js.native
}

object Print3DTaskCompletedEventArgs {
  @scala.inline
  def apply(completion: Print3DTaskCompletion, extendedStatus: Print3DTaskDetail): Print3DTaskCompletedEventArgs = {
    val __obj = js.Dynamic.literal(completion = completion.asInstanceOf[js.Any], extendedStatus = extendedStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Print3DTaskCompletedEventArgs]
  }
  @scala.inline
  implicit class Print3DTaskCompletedEventArgsOps[Self <: Print3DTaskCompletedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompletion(value: Print3DTaskCompletion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtendedStatus(value: Print3DTaskDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedStatus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

