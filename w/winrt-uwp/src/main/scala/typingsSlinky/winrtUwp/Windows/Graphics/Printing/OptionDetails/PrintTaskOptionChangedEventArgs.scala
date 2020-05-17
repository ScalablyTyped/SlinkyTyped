package typingsSlinky.winrtUwp.Windows.Graphics.Printing.OptionDetails

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Called when a print task option has changed. */
@js.native
trait PrintTaskOptionChangedEventArgs extends js.Object {
  /** Gets the ID of the print task option that changed. */
  var optionId: js.Any = js.native
}

object PrintTaskOptionChangedEventArgs {
  @scala.inline
  def apply(optionId: js.Any): PrintTaskOptionChangedEventArgs = {
    val __obj = js.Dynamic.literal(optionId = optionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintTaskOptionChangedEventArgs]
  }
  @scala.inline
  implicit class PrintTaskOptionChangedEventArgsOps[Self <: PrintTaskOptionChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptionId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

