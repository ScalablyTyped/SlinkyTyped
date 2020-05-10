package typingsSlinky.winrt.Windows.Graphics.Printing.OptionDetails

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPrintTaskOptionChangedEventArgs extends js.Object {
  var optionId: js.Any = js.native
}

object IPrintTaskOptionChangedEventArgs {
  @scala.inline
  def apply(optionId: js.Any): IPrintTaskOptionChangedEventArgs = {
    val __obj = js.Dynamic.literal(optionId = optionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrintTaskOptionChangedEventArgs]
  }
  @scala.inline
  implicit class IPrintTaskOptionChangedEventArgsOps[Self <: IPrintTaskOptionChangedEventArgs] (val x: Self) extends AnyVal {
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

