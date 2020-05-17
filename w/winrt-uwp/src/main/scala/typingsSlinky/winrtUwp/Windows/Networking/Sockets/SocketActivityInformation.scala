package typingsSlinky.winrtUwp.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information on the transferred socket from the Socket Broker. */
@js.native
trait SocketActivityInformation extends js.Object {
  /** Get the context associated while transferring ownership of the socket. */
  var context: SocketActivityContext = js.native
  /** Based on the socket type, the app can reclaim the ownership of the appropriate DatagramSocket . */
  var datagramSocket: DatagramSocket = js.native
  /** A unique string for this app used to identify the transferred socket. This is passed by the app while transferring the socket ownership to the service. */
  var id: String = js.native
  /** Gets a SocketActivityKind enumeration value that identifies socket kind. */
  var socketKind: SocketActivityKind = js.native
  /** Based on the socket type, the app can reclaim the ownership of the appropriate StreamSocket . */
  var streamSocket: StreamSocket = js.native
  /** Based on the socket type, the app can reclaim the ownership of the appropriate StreamSocketListener . */
  var streamSocketListener: StreamSocketListener = js.native
  /** The background task ID used while transferring ownership of the socket. */
  var taskId: String = js.native
}

object SocketActivityInformation {
  @scala.inline
  def apply(
    context: SocketActivityContext,
    datagramSocket: DatagramSocket,
    id: String,
    socketKind: SocketActivityKind,
    streamSocket: StreamSocket,
    streamSocketListener: StreamSocketListener,
    taskId: String
  ): SocketActivityInformation = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], datagramSocket = datagramSocket.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], socketKind = socketKind.asInstanceOf[js.Any], streamSocket = streamSocket.asInstanceOf[js.Any], streamSocketListener = streamSocketListener.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketActivityInformation]
  }
  @scala.inline
  implicit class SocketActivityInformationOps[Self <: SocketActivityInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: SocketActivityContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatagramSocket(value: DatagramSocket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datagramSocket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSocketKind(value: SocketActivityKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamSocket(value: StreamSocket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamSocket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamSocketListener(value: StreamSocketListener): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamSocketListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

