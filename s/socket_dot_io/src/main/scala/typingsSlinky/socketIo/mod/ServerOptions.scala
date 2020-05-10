package typingsSlinky.socketIo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Options to pass to our server when creating it
	 */
@js.native
trait ServerOptions extends js.Object {
  /**
  		 * The adapter to use for handling rooms. NOTE: this should be a class,
  		 * not an object
  		 * @default typeof Adapter
  		 */
  var adapter: js.UndefOr[Adapter] = js.native
  /**
  		 * A function that receives a given handshake or upgrade request as its first parameter,
  		 * and can decide whether to continue or not. The second argument is a function that needs
  		 * to be called with the decided information: fn( err, success ), where success is a boolean
  		 * value where false means that the request is rejected, and err is an error code (engine.io)
  		 * @default null
  		 */
  var allowRequest: js.UndefOr[
    js.Function2[
      /* request */ js.Any, 
      /* callback */ js.Function2[/* err */ Double, /* success */ Boolean, Unit], 
      Unit
    ]
  ] = js.native
  /**
  		 * Whether to allow transport upgrades (engine.io)
  		 * @default true
  		 */
  var allowUpgrades: js.UndefOr[Boolean] = js.native
  /**
  		 * Name of the HTTP cookie that contains the client sid to send as part of
  		 * handshake response headers. Set to false to not send one (engine.io)
  		 * @default "io"
  		 */
  var cookie: js.UndefOr[String | Boolean] = js.native
  /**
    * Whether to let engine.io handle the OPTIONS requests.
    * You can also pass a custom function to handle the requests
    * @default true
    */
  var handlePreflightRequest: js.UndefOr[(js.Function2[/* req */ js.Any, /* res */ js.Any, Unit]) | Boolean] = js.native
  /**
  		 * Parameters of the http compression for the polling transports (see zlib).
  		 * Set to false to disable, or set an object with parameter "threshold:number"
  		 * to only compress data if the byte size is above this value (1024) (engine.io)
  		 * @default true|1024
  		 */
  var httpCompression: js.UndefOr[js.Object | Boolean] = js.native
  /**
  		 * How many bytes or characters a message can be when polling, before closing the session
  		 * (to avoid Dos) (engine.io)
  		 * @default 10E7
  		 */
  var maxHttpBufferSize: js.UndefOr[Double] = js.native
  /**
  		 * Accepted origins
  		 * @default '*:*'
  		 */
  var origins: js.UndefOr[String | js.Array[String]] = js.native
  /**
  		 * The path to server the client file to
  		 * @default '/socket.io'
  		 */
  var path: js.UndefOr[String] = js.native
  /**
  		 * parameters of the WebSocket permessage-deflate extension (see ws module).
  		 * Set to false to disable (engine.io)
  		 * @default true
  		 */
  var perMessageDeflate: js.UndefOr[js.Object | Boolean] = js.native
  /**
  		 * How many milliseconds before sending a new ping packet (keep-alive) (engine.io)
  		 * @default 25000
  		 */
  var pingInterval: js.UndefOr[Double] = js.native
  /**
  		 * How many milliseconds without a pong packed to consider the connection closed (engine.io)
  		 * @default 60000
  		 */
  var pingTimeout: js.UndefOr[Double] = js.native
  /**
  		 * Should we serve the client file?
  		 * @default true
  		 */
  var serveClient: js.UndefOr[Boolean] = js.native
  /**
  		 * Transports to allow connections to (engine.io)
  		 * @default ['polling','websocket']
  		 */
  var transports: js.UndefOr[js.Array[String]] = js.native
}

object ServerOptions {
  @scala.inline
  def apply(): ServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptions]
  }
  @scala.inline
  implicit class ServerOptionsOps[Self <: ServerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdapter(value: Adapter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdapter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapter")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowRequest(
      value: (/* request */ js.Any, /* callback */ js.Function2[/* err */ Double, /* success */ Boolean, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRequest")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAllowRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowUpgrades(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUpgrades")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowUpgrades: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUpgrades")(js.undefined)
        ret
    }
    @scala.inline
    def withCookie(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie")(js.undefined)
        ret
    }
    @scala.inline
    def withHandlePreflightRequestFunction2(value: (/* req */ js.Any, /* res */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlePreflightRequest")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHandlePreflightRequest(value: (js.Function2[/* req */ js.Any, /* res */ js.Any, Unit]) | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlePreflightRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandlePreflightRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlePreflightRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpCompression(value: js.Object | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpCompression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpCompression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpCompression")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHttpBufferSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHttpBufferSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHttpBufferSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHttpBufferSize")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigins(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origins")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withPerMessageDeflate(value: js.Object | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perMessageDeflate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerMessageDeflate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perMessageDeflate")(js.undefined)
        ret
    }
    @scala.inline
    def withPingInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pingInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPingInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pingInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withPingTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pingTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPingTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pingTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withServeClient(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serveClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServeClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serveClient")(js.undefined)
        ret
    }
    @scala.inline
    def withTransports(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transports")(js.undefined)
        ret
    }
  }
  
}

