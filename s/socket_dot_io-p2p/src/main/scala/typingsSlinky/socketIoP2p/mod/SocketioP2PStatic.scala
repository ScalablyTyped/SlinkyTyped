package typingsSlinky.socketIoP2p.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates the P2P object
  * @param socket Socket.io socket
  * @param opts Object of viable options
  * @param cb Optional callback
  */
@js.native
trait SocketioP2PStatic extends js.Object {
  var decoder: js.Any = js.native
  var defaultOps: DefaultOps = js.native
  var numConnectedClients: Double = js.native
  var opts: P2POptions = js.native
  var peerOpts: PeerOpts = js.native
  var socket: js.Any = js.native
  var usePeerConnection: Boolean = js.native
  var useSockets: Boolean = js.native
  def binarySlice(arr: js.Array[_], interval: Double, cb: js.Function0[Unit]): Unit = js.native
  def cb(): Unit = js.native
  def disconnect(): Unit = js.native
  def emit(eventName: js.Any, data: js.Any): Unit = js.native
  def on(event: String, callback: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
  def setupPeerEvents(peer: js.Any): Unit = js.native
  /**
    * Upgrade the connection to p2p
    */
  def upgrade(): Unit = js.native
}

object SocketioP2PStatic {
  @scala.inline
  def apply(
    binarySlice: (js.Array[_], Double, js.Function0[Unit]) => Unit,
    cb: () => Unit,
    decoder: js.Any,
    defaultOps: DefaultOps,
    disconnect: () => Unit,
    emit: (js.Any, js.Any) => Unit,
    numConnectedClients: Double,
    on: (String, js.Function1[/* data */ js.Any, Unit]) => Unit,
    opts: P2POptions,
    peerOpts: PeerOpts,
    setupPeerEvents: js.Any => Unit,
    socket: js.Any,
    upgrade: () => Unit,
    usePeerConnection: Boolean,
    useSockets: Boolean
  ): SocketioP2PStatic = {
    val __obj = js.Dynamic.literal(binarySlice = js.Any.fromFunction3(binarySlice), cb = js.Any.fromFunction0(cb), decoder = decoder.asInstanceOf[js.Any], defaultOps = defaultOps.asInstanceOf[js.Any], disconnect = js.Any.fromFunction0(disconnect), emit = js.Any.fromFunction2(emit), numConnectedClients = numConnectedClients.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), opts = opts.asInstanceOf[js.Any], peerOpts = peerOpts.asInstanceOf[js.Any], setupPeerEvents = js.Any.fromFunction1(setupPeerEvents), socket = socket.asInstanceOf[js.Any], upgrade = js.Any.fromFunction0(upgrade), usePeerConnection = usePeerConnection.asInstanceOf[js.Any], useSockets = useSockets.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketioP2PStatic]
  }
  @scala.inline
  implicit class SocketioP2PStaticOps[Self <: SocketioP2PStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBinarySlice(value: (js.Array[_], Double, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binarySlice")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCb(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cb")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDecoder(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultOps(value: DefaultOps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisconnect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEmit(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNumConnectedClients(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numConnectedClients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOn(value: (String, js.Function1[/* data */ js.Any, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOpts(value: P2POptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeerOpts(value: PeerOpts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerOpts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetupPeerEvents(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupPeerEvents")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSocket(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpgrade(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upgrade")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUsePeerConnection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePeerConnection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseSockets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSockets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

