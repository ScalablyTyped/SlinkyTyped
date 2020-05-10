package typingsSlinky.winrt.Windows.Devices.Printers.Extensions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPrintTaskConfiguration extends js.Object {
  var onsaverequested: js.Any = js.native
  var printerExtensionContext: js.Any = js.native
}

object IPrintTaskConfiguration {
  @scala.inline
  def apply(onsaverequested: js.Any, printerExtensionContext: js.Any): IPrintTaskConfiguration = {
    val __obj = js.Dynamic.literal(onsaverequested = onsaverequested.asInstanceOf[js.Any], printerExtensionContext = printerExtensionContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrintTaskConfiguration]
  }
  @scala.inline
  implicit class IPrintTaskConfigurationOps[Self <: IPrintTaskConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnsaverequested(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsaverequested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrinterExtensionContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printerExtensionContext")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

