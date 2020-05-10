package typingsSlinky.winrt.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPrintTaskCompletedEventArgs extends js.Object {
  var completion: PrintTaskCompletion = js.native
}

object IPrintTaskCompletedEventArgs {
  @scala.inline
  def apply(completion: PrintTaskCompletion): IPrintTaskCompletedEventArgs = {
    val __obj = js.Dynamic.literal(completion = completion.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrintTaskCompletedEventArgs]
  }
  @scala.inline
  implicit class IPrintTaskCompletedEventArgsOps[Self <: IPrintTaskCompletedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompletion(value: PrintTaskCompletion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

