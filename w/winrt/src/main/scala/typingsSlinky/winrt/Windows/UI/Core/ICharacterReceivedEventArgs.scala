package typingsSlinky.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICharacterReceivedEventArgs extends ICoreWindowEventArgs {
  var keyCode: Double = js.native
  var keyStatus: CorePhysicalKeyStatus = js.native
}

object ICharacterReceivedEventArgs {
  @scala.inline
  def apply(handled: Boolean, keyCode: Double, keyStatus: CorePhysicalKeyStatus): ICharacterReceivedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], keyStatus = keyStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICharacterReceivedEventArgs]
  }
  @scala.inline
  implicit class ICharacterReceivedEventArgsOps[Self <: ICharacterReceivedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyStatus(value: CorePhysicalKeyStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyStatus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

