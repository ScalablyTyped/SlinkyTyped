package typingsSlinky.winrtUwp.Windows.Foundation.Diagnostics

import typingsSlinky.winrtUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the LogFileGenerated event. */
@js.native
trait LogFileGeneratedEventArgs extends js.Object {
  /** Gets the log file. */
  var file: StorageFile = js.native
}

object LogFileGeneratedEventArgs {
  @scala.inline
  def apply(file: StorageFile): LogFileGeneratedEventArgs = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogFileGeneratedEventArgs]
  }
  @scala.inline
  implicit class LogFileGeneratedEventArgsOps[Self <: LogFileGeneratedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFile(value: StorageFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

