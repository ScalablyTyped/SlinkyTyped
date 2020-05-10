package typingsSlinky.winrt.Windows.Devices.Printers.Extensions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPrintTaskConfigurationSaveRequestedDeferral extends js.Object {
  def complete(): Unit = js.native
}

object IPrintTaskConfigurationSaveRequestedDeferral {
  @scala.inline
  def apply(complete: () => Unit): IPrintTaskConfigurationSaveRequestedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[IPrintTaskConfigurationSaveRequestedDeferral]
  }
  @scala.inline
  implicit class IPrintTaskConfigurationSaveRequestedDeferralOps[Self <: IPrintTaskConfigurationSaveRequestedDeferral] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

