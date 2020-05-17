package typingsSlinky.winrtUwp.Windows.Storage.Pickers.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about a targetfilerequested event. */
@js.native
trait TargetFileRequestedEventArgs extends js.Object {
  /** Gets a targetFileRequest object that is used to respond to a targetfilerequested event. */
  var request: TargetFileRequest = js.native
}

object TargetFileRequestedEventArgs {
  @scala.inline
  def apply(request: TargetFileRequest): TargetFileRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetFileRequestedEventArgs]
  }
  @scala.inline
  implicit class TargetFileRequestedEventArgsOps[Self <: TargetFileRequestedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequest(value: TargetFileRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

