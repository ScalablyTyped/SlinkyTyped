package typingsSlinky.winrt.Windows.Graphics.Printing

import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPrintTaskOptionsCoreUIConfiguration extends js.Object {
  var displayedOptions: IVector[String] = js.native
}

object IPrintTaskOptionsCoreUIConfiguration {
  @scala.inline
  def apply(displayedOptions: IVector[String]): IPrintTaskOptionsCoreUIConfiguration = {
    val __obj = js.Dynamic.literal(displayedOptions = displayedOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrintTaskOptionsCoreUIConfiguration]
  }
  @scala.inline
  implicit class IPrintTaskOptionsCoreUIConfigurationOps[Self <: IPrintTaskOptionsCoreUIConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayedOptions(value: IVector[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayedOptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

