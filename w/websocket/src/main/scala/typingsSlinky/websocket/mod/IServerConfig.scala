package typingsSlinky.websocket.mod

import typingsSlinky.node.httpMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IServerConfig extends IConfig {
  
  /**
    * If this is true, websocket connections will be accepted regardless of the path
    * and protocol specified by the client. The protocol accepted will be the first
    * that was requested by the client.
    * @default false
    */
  var autoAcceptConnections: js.UndefOr[Boolean] = js.native
  
  /**
    * The Nagle Algorithm makes more efficient use of network resources by introducing a
    * small delay before sending small packets so that multiple messages can be batched
    * together before going onto the wire. This however comes at the cost of latency.
    * @default true
    */
  var disableNagleAlgorithm: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, the server will consider any connection that has not received any
    * data within the amount of time specified by `keepaliveGracePeriod` after a
    * `keepalive` ping has been sent. Ignored if `keepalive` is false.
    * @default true
    */
  var dropConnectionOnKeepaliveTimeout: js.UndefOr[Boolean] = js.native
  
  /** The http or https server instance(s) to attach to */
  var httpServer: Server | typingsSlinky.node.httpsMod.Server | (js.Array[Server | typingsSlinky.node.httpsMod.Server]) = js.native
  
  /**
    * Whether or not the X-Forwarded-For header should be respected.
    * It's important to set this to 'true' when accepting connections
    * from untrusted clients, as a malicious client could spoof its
    * IP address by simply setting this header.  It's meant to be added
    * by a trusted proxy or other intermediary within your own
    * infrastructure.
    * See:  http://en.wikipedia.org/wiki/X-Forwarded-For
    * @default false
    */
  var ignoreXForwardedFor: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, the server will automatically send a ping to all clients every
    * `keepaliveInterval` milliseconds. Each client has an independent `keepalive`
    * timer, which is reset when any data is received from that client.
    * @default true
    */
  var keepalive: js.UndefOr[Boolean] = js.native
  
  /**
    * The amount of time to wait after sending a `keepalive` ping before closing
    * the connection if the connected peer does not respond. Ignored if `keepalive`
    * or `dropConnectionOnKeepaliveTimeout` are false. The grace period timer is
    * reset when any data is received from the client.
    * @default 10000
    */
  var keepaliveGracePeriod: js.UndefOr[Double] = js.native
  
  /**
    * The interval in milliseconds to send `keepalive` pings to connected clients.
    * @default 20000
    */
  var keepaliveInterval: js.UndefOr[Double] = js.native
  
  /**
    * Whether to use native TCP keep-alive instead of WebSockets ping
    * and pong packets.  Native TCP keep-alive sends smaller packets
    * on the wire and so uses bandwidth more efficiently.  This may
    * be more important when talking to mobile devices.
    * If this value is set to true, then these values will be ignored:
    *   keepaliveGracePeriod
    *   dropConnectionOnKeepaliveTimeout
    * @default false
    */
  var useNativeKeepalive: js.UndefOr[Boolean] = js.native
}
object IServerConfig {
  
  @scala.inline
  def apply(
    httpServer: Server | typingsSlinky.node.httpsMod.Server | (js.Array[Server | typingsSlinky.node.httpsMod.Server])
  ): IServerConfig = {
    val __obj = js.Dynamic.literal(httpServer = httpServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IServerConfig]
  }
  
  @scala.inline
  implicit class IServerConfigOps[Self <: IServerConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHttpServerVarargs(value: (Server | typingsSlinky.node.httpsMod.Server)*): Self = this.set("httpServer", js.Array(value :_*))
    
    @scala.inline
    def setHttpServer(
      value: Server | typingsSlinky.node.httpsMod.Server | (js.Array[Server | typingsSlinky.node.httpsMod.Server])
    ): Self = this.set("httpServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoAcceptConnections(value: Boolean): Self = this.set("autoAcceptConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoAcceptConnections: Self = this.set("autoAcceptConnections", js.undefined)
    
    @scala.inline
    def setDisableNagleAlgorithm(value: Boolean): Self = this.set("disableNagleAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableNagleAlgorithm: Self = this.set("disableNagleAlgorithm", js.undefined)
    
    @scala.inline
    def setDropConnectionOnKeepaliveTimeout(value: Boolean): Self = this.set("dropConnectionOnKeepaliveTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropConnectionOnKeepaliveTimeout: Self = this.set("dropConnectionOnKeepaliveTimeout", js.undefined)
    
    @scala.inline
    def setIgnoreXForwardedFor(value: Boolean): Self = this.set("ignoreXForwardedFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreXForwardedFor: Self = this.set("ignoreXForwardedFor", js.undefined)
    
    @scala.inline
    def setKeepalive(value: Boolean): Self = this.set("keepalive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepalive: Self = this.set("keepalive", js.undefined)
    
    @scala.inline
    def setKeepaliveGracePeriod(value: Double): Self = this.set("keepaliveGracePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepaliveGracePeriod: Self = this.set("keepaliveGracePeriod", js.undefined)
    
    @scala.inline
    def setKeepaliveInterval(value: Double): Self = this.set("keepaliveInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepaliveInterval: Self = this.set("keepaliveInterval", js.undefined)
    
    @scala.inline
    def setUseNativeKeepalive(value: Boolean): Self = this.set("useNativeKeepalive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseNativeKeepalive: Self = this.set("useNativeKeepalive", js.undefined)
  }
}
