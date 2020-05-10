package typingsSlinky.socketIoClient.SocketIOClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Options we can pass to the socket when connecting
	 */
@js.native
trait ConnectOpts extends js.Object {
  /**
  		 * `http.Agent` to use, defaults to `false` (NodeJS only)
  		 */
  var agent: js.UndefOr[String | Boolean] = js.native
  /**
  		 * Should we automically connect?
  		 * @default true
  		 */
  var autoConnect: js.UndefOr[Boolean] = js.native
  /**
  		 * (SSL) An authority certificate or array of authority certificates to
  		 * check the remote host against.. Can be used in Node.js client
  		 * environment to manually specify certificate information.
  		 */
  var ca: js.UndefOr[String | js.Array[String]] = js.native
  /**
  		 * (SSL) Public x509 certificate to use. Can be used in Node.js client
  		 * environment to manually specify certificate information.
  		 */
  var cert: js.UndefOr[String] = js.native
  /**
  		 * (SSL) A string describing the ciphers to use or exclude. Consult the
  		 * [cipher format list]
  		 * (http://www.openssl.org/docs/apps/ciphers.html#CIPHER_LIST_FORMAT) for
  		 * details on the format.. Can be used in Node.js client environment to
  		 * manually specify certificate information.
  		 */
  var ciphers: js.UndefOr[String] = js.native
  /**
  		 * Enables XDomainRequest for IE8 to avoid loading bar flashing with
  		 * click sound. default to `false` because XDomainRequest has a flaw
  		 * of not sending cookie.
  		 * @default false
  		 */
  var enablesXDR: js.UndefOr[Boolean] = js.native
  /**
  		 * Forces base 64 encoding for polling transport even when XHR2
  		 * responseType is available and WebSocket even if the used standard
  		 * supports binary.
  		 */
  var forceBase64: js.UndefOr[Boolean] = js.native
  /**
  		 * Forces JSONP for polling transport.
  		 */
  var forceJSONP: js.UndefOr[Boolean] = js.native
  /**
  		 * Should we force a new Manager for this connection?
  		 * @default false
  		 */
  var forceNew: js.UndefOr[Boolean] = js.native
  /**
  		 * The host that we're connecting to. Set from the URI passed when connecting
  		 */
  var host: js.UndefOr[String] = js.native
  /**
  		 * The hostname for our connection. Set from the URI passed when connecting
  		 */
  var hostname: js.UndefOr[String] = js.native
  /**
  		 * Determines whether to use JSONP when necessary for polling. If
  		 * disabled (by settings to false) an error will be emitted (saying
  		 * "No transports available") if no other transports are available.
  		 * If another transport is available for opening a connection (e.g.
  		 * WebSocket) that transport will be used instead.
  		 * @default true
  		 */
  var jsonp: js.UndefOr[Boolean] = js.native
  /**
  		 * (SSL) Private key to use for SSL. Can be used in Node.js client
  		 * environment to manually specify certificate information.
  		 */
  var key: js.UndefOr[String] = js.native
  /**
  		 * Should we multiplex our connection (reuse existing Manager) ?
  		 * @default true
  		 */
  var multiplex: js.UndefOr[Boolean] = js.native
  /**
  		 * Are we only interested in transports that support binary?
  		 */
  var onlyBinaryUpgrades: js.UndefOr[Boolean] = js.native
  /**
  		 * (SSL) A string or passphrase for the private key or pfx. Can be
  		 * used in Node.js client environment to manually specify certificate
  		 * information.
  		 */
  var passphrase: js.UndefOr[String] = js.native
  /**
  		 * The path to get our client file from, in the case of the server
  		 * serving it
  		 * @default '/socket.io'
  		 */
  var path: js.UndefOr[String] = js.native
  /**
  		 * (SSL) Certificate, Private key and CA certificates to use for SSL.
  		 * Can be used in Node.js client environment to manually specify
  		 * certificate information.
  		 */
  var pfx: js.UndefOr[String] = js.native
  /**
  		 * The port the policy server listens on
  		 * @default 843
  		 */
  var policyPost: js.UndefOr[Double] = js.native
  /**
  		 * The port for our connection. Set from the URI passed when connecting
  		 */
  var port: js.UndefOr[String] = js.native
  /**
  		 * Any query parameters in our uri. Set from the URI passed when connecting
  		 */
  var query: js.UndefOr[js.Object] = js.native
  /**
  		 * Used in the exponential backoff jitter when reconnecting
  		 * @default 0.5
  		 */
  var randomizationFactor: js.UndefOr[Double] = js.native
  /**
  		 * Should we allow reconnections?
  		 * @default true
  		 */
  var reconnection: js.UndefOr[Boolean] = js.native
  /**
  		 * How many reconnection attempts should we try?
  		 * @default Infinity
  		 */
  var reconnectionAttempts: js.UndefOr[Double] = js.native
  /**
  		 * The time delay in milliseconds between reconnection attempts
  		 * @default 1000
  		 */
  var reconnectionDelay: js.UndefOr[Double] = js.native
  /**
  		 * The max time delay in milliseconds between reconnection attempts
  		 * @default 5000
  		 */
  var reconnectionDelayMax: js.UndefOr[Double] = js.native
  /**
  		 * (SSL) If true, the server certificate is verified against the list of
  		 * supplied CAs. An 'error' event is emitted if verification fails.
  		 * Verification happens at the connection level, before the HTTP request
  		 * is sent. Can be used in Node.js client environment to manually specify
  		 * certificate information.
  		 */
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  /**
  		 * If true and if the previous websocket connection to the server succeeded,
  		 * the connection attempt will bypass the normal upgrade process and will
  		 * initially try websocket. A connection attempt following a transport error
  		 * will use the normal upgrade process. It is recommended you turn this on
  		 * only when using SSL/TLS connections, or if you know that your network does
  		 * not block websockets.
  		 * @default false
  		 */
  var rememberUpgrade: js.UndefOr[Boolean] = js.native
  /**
  		 * If this is a secure connection. Set from the URI passed when connecting
  		 */
  var secure: js.UndefOr[Boolean] = js.native
  /**
  		 * The timeout in milliseconds for our connection attempt
  		 * @default 20000
  		 */
  var timeout: js.UndefOr[Double] = js.native
  /**
  		 * The param name to use as our timestamp key
  		 * @default 't'
  		 */
  var timestampParam: js.UndefOr[String] = js.native
  /**
  		 * Whether to add the timestamp with each transport request. Note: this
  		 * is ignored if the browser is IE or Android, in which case requests
  		 * are always stamped
  		 * @default false
  		 */
  var timestampRequests: js.UndefOr[Boolean] = js.native
  /**
  		 * Transport options for Node.js client (headers etc)
  		 */
  var transportOptions: js.UndefOr[js.Object] = js.native
  /**
  		 * A list of transports to try (in order). Engine.io always attempts to
  		 * connect directly with the first one, provided the feature detection test
  		 * for it passes.
  		 * @default ['polling','websocket']
  		 */
  var transports: js.UndefOr[js.Array[String]] = js.native
  /**
  		 * Whether the client should try to upgrade the transport from
  		 * long-polling to something better.
  		 * @default true
  		 */
  var upgrade: js.UndefOr[Boolean] = js.native
}

object ConnectOpts {
  @scala.inline
  def apply(): ConnectOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectOpts]
  }
  @scala.inline
  implicit class ConnectOptsOps[Self <: ConnectOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgent(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoConnect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoConnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoConnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoConnect")(js.undefined)
        ret
    }
    @scala.inline
    def withCa(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ca")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCa: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ca")(js.undefined)
        ret
    }
    @scala.inline
    def withCert(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cert")(js.undefined)
        ret
    }
    @scala.inline
    def withCiphers(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ciphers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCiphers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ciphers")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablesXDR(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablesXDR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablesXDR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablesXDR")(js.undefined)
        ret
    }
    @scala.inline
    def withForceBase64(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceBase64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceBase64: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceBase64")(js.undefined)
        ret
    }
    @scala.inline
    def withForceJSONP(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceJSONP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceJSONP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceJSONP")(js.undefined)
        ret
    }
    @scala.inline
    def withForceNew(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceNew")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceNew: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceNew")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(js.undefined)
        ret
    }
    @scala.inline
    def withJsonp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonp")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiplex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiplex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiplex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiplex")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyBinaryUpgrades(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyBinaryUpgrades")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyBinaryUpgrades: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyBinaryUpgrades")(js.undefined)
        ret
    }
    @scala.inline
    def withPassphrase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passphrase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassphrase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passphrase")(js.undefined)
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
    def withPfx(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pfx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPfx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pfx")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyPost(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyPost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyPost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyPost")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withRandomizationFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomizationFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRandomizationFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomizationFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withReconnection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnection")(js.undefined)
        ret
    }
    @scala.inline
    def withReconnectionAttempts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectionAttempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconnectionAttempts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectionAttempts")(js.undefined)
        ret
    }
    @scala.inline
    def withReconnectionDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectionDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconnectionDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectionDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withReconnectionDelayMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectionDelayMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconnectionDelayMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectionDelayMax")(js.undefined)
        ret
    }
    @scala.inline
    def withRejectUnauthorized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectUnauthorized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejectUnauthorized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectUnauthorized")(js.undefined)
        ret
    }
    @scala.inline
    def withRememberUpgrade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rememberUpgrade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRememberUpgrade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rememberUpgrade")(js.undefined)
        ret
    }
    @scala.inline
    def withSecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestampParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestampParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampParam")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestampRequests(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestampRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampRequests")(js.undefined)
        ret
    }
    @scala.inline
    def withTransportOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransportOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportOptions")(js.undefined)
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
    @scala.inline
    def withUpgrade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upgrade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpgrade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upgrade")(js.undefined)
        ret
    }
  }
  
}

