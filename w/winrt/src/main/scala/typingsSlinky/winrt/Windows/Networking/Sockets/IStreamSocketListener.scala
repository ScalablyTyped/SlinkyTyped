package typingsSlinky.winrt.Windows.Networking.Sockets

import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import typingsSlinky.winrt.Windows.Foundation.IClosable
import typingsSlinky.winrt.Windows.Networking.HostName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStreamSocketListener extends IClosable {
  var control: StreamSocketListenerControl = js.native
  var information: StreamSocketListenerInformation = js.native
  var onconnectionreceived: js.Any = js.native
  def bindEndpointAsync(localHostName: HostName, localServiceName: String): IAsyncAction = js.native
  def bindServiceNameAsync(localServiceName: String): IAsyncAction = js.native
}

object IStreamSocketListener {
  @scala.inline
  def apply(
    bindEndpointAsync: (HostName, String) => IAsyncAction,
    bindServiceNameAsync: String => IAsyncAction,
    close: () => Unit,
    control: StreamSocketListenerControl,
    information: StreamSocketListenerInformation,
    onconnectionreceived: js.Any
  ): IStreamSocketListener = {
    val __obj = js.Dynamic.literal(bindEndpointAsync = js.Any.fromFunction2(bindEndpointAsync), bindServiceNameAsync = js.Any.fromFunction1(bindServiceNameAsync), close = js.Any.fromFunction0(close), control = control.asInstanceOf[js.Any], information = information.asInstanceOf[js.Any], onconnectionreceived = onconnectionreceived.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStreamSocketListener]
  }
  @scala.inline
  implicit class IStreamSocketListenerOps[Self <: IStreamSocketListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindEndpointAsync(value: (HostName, String) => IAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindEndpointAsync")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBindServiceNameAsync(value: String => IAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindServiceNameAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withControl(value: StreamSocketListenerControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInformation(value: StreamSocketListenerInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("information")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnconnectionreceived(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onconnectionreceived")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

