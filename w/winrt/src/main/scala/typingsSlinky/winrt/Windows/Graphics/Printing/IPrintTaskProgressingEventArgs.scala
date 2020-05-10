package typingsSlinky.winrt.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPrintTaskProgressingEventArgs extends js.Object {
  var documentPageCount: Double = js.native
}

object IPrintTaskProgressingEventArgs {
  @scala.inline
  def apply(documentPageCount: Double): IPrintTaskProgressingEventArgs = {
    val __obj = js.Dynamic.literal(documentPageCount = documentPageCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrintTaskProgressingEventArgs]
  }
  @scala.inline
  implicit class IPrintTaskProgressingEventArgsOps[Self <: IPrintTaskProgressingEventArgs] (val x: Self) extends AnyVal {
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

