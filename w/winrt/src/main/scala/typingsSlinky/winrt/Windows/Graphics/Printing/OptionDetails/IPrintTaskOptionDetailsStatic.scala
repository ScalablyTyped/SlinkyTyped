package typingsSlinky.winrt.Windows.Graphics.Printing.OptionDetails

import typingsSlinky.winrt.Windows.Graphics.Printing.PrintTaskOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPrintTaskOptionDetailsStatic extends js.Object {
  def getFromPrintTaskOptions(printTaskOptions: PrintTaskOptions): PrintTaskOptionDetails = js.native
}

object IPrintTaskOptionDetailsStatic {
  @scala.inline
  def apply(getFromPrintTaskOptions: PrintTaskOptions => PrintTaskOptionDetails): IPrintTaskOptionDetailsStatic = {
    val __obj = js.Dynamic.literal(getFromPrintTaskOptions = js.Any.fromFunction1(getFromPrintTaskOptions))
    __obj.asInstanceOf[IPrintTaskOptionDetailsStatic]
  }
  @scala.inline
  implicit class IPrintTaskOptionDetailsStaticOps[Self <: IPrintTaskOptionDetailsStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetFromPrintTaskOptions(value: PrintTaskOptions => PrintTaskOptionDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFromPrintTaskOptions")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

