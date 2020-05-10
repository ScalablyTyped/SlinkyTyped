package typingsSlinky.winrt.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKeypadPressedEventArgs extends js.Object {
  var telephonyKey: TelephonyKey = js.native
}

object IKeypadPressedEventArgs {
  @scala.inline
  def apply(telephonyKey: TelephonyKey): IKeypadPressedEventArgs = {
    val __obj = js.Dynamic.literal(telephonyKey = telephonyKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeypadPressedEventArgs]
  }
  @scala.inline
  implicit class IKeypadPressedEventArgsOps[Self <: IKeypadPressedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTelephonyKey(value: TelephonyKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telephonyKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

