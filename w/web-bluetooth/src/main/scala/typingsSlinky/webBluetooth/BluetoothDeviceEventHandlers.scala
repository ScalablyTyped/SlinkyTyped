package typingsSlinky.webBluetooth

import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BluetoothDeviceEventHandlers extends js.Object {
  def onadvertisementreceived(ev: Event): js.Any = js.native
  def ongattserverdisconnected(ev: Event): js.Any = js.native
}

object BluetoothDeviceEventHandlers {
  @scala.inline
  def apply(onadvertisementreceived: Event => js.Any, ongattserverdisconnected: Event => js.Any): BluetoothDeviceEventHandlers = {
    val __obj = js.Dynamic.literal(onadvertisementreceived = js.Any.fromFunction1(onadvertisementreceived), ongattserverdisconnected = js.Any.fromFunction1(ongattserverdisconnected))
    __obj.asInstanceOf[BluetoothDeviceEventHandlers]
  }
  @scala.inline
  implicit class BluetoothDeviceEventHandlersOps[Self <: BluetoothDeviceEventHandlers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnadvertisementreceived(value: Event => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onadvertisementreceived")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOngattserverdisconnected(value: Event => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ongattserverdisconnected")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

