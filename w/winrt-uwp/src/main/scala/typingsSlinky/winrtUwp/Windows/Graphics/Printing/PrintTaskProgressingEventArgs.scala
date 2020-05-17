package typingsSlinky.winrtUwp.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the event arguments for the PrintTask.Progressing event. This event is raised during the submitting phase of the PrintTask . */
@js.native
trait PrintTaskProgressingEventArgs extends js.Object {
  /** Gets the page count for a print task. */
  var documentPageCount: Double = js.native
}

object PrintTaskProgressingEventArgs {
  @scala.inline
  def apply(documentPageCount: Double): PrintTaskProgressingEventArgs = {
    val __obj = js.Dynamic.literal(documentPageCount = documentPageCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintTaskProgressingEventArgs]
  }
  @scala.inline
  implicit class PrintTaskProgressingEventArgsOps[Self <: PrintTaskProgressingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentPageCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentPageCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

