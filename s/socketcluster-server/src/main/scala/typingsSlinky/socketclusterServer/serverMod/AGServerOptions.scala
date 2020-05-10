package typingsSlinky.socketclusterServer.serverMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jsonwebtoken.mod.Secret
import typingsSlinky.node.httpMod.Server
import typingsSlinky.scAuth.mod.SCAuthEngine
import typingsSlinky.socketclusterServer.socketclusterServerNumbers.`1`
import typingsSlinky.socketclusterServer.socketclusterServerNumbers.`2`
import typingsSlinky.socketclusterServer.socketclusterServerStrings.close
import typingsSlinky.socketclusterServer.socketclusterServerStrings.kill
import typingsSlinky.ws.mod.ClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AGServerOptions
  extends /* additionalOptions */ StringDictionary[js.Any] {
  // In milliseconds, the timeout for receiving a response
  // when using invoke() or invokePublish().
  var ackTimeout: js.UndefOr[Double] = js.native
  // Whether or not clients are allowed to publish messages
  // to channels.
  var allowClientPublish: js.UndefOr[Boolean] = js.native
  // The algorithm to use to sign and verify JWT tokens.
  var authAlgorithm: js.UndefOr[String] = js.native
  // The default expiry for auth tokens in seconds
  var authDefaultExpiry: js.UndefOr[Double] = js.native
  var authEngine: js.UndefOr[SCAuthEngine] = js.native
  // The key which SC will use to encrypt/decrypt authTokens,
  // defaults to a 256 bits cryptographically random hex
  // string. The default JWT algorithm used is 'HS256'.
  // If you want to use RSA or ECDSA, you should provide an
  // authPrivateKey and authPublicKey instead of authKey.
  var authKey: js.UndefOr[Secret] = js.native
  // If using an RSA or ECDSA algorithm to sign the
  // authToken, you will need to provide an authPrivateKey
  // and authPublicKey in PEM format (string or Buffer).
  var authPrivateKey: js.UndefOr[Secret] = js.native
  var authPublicKey: js.UndefOr[Secret] = js.native
  var authVerifyAlgorithms: js.UndefOr[js.Array[String]] = js.native
  // If batchOnHandshake is true, this lets you specify
  // the size of each batch in milliseconds.
  var batchInterval: js.UndefOr[Double] = js.native
  // Whether or not to batch all socket messages
  // for some time immediately after completing
  // a handshake. This can be useful in failure-recovery
  // scenarios (e.g. batch resubscribe).
  var batchOnHandshake: js.UndefOr[Boolean] = js.native
  // If batchOnHandshake is true, this lets you specify
  // How long to enable batching (in milliseconds) following
  // a successful socket handshake.
  var batchOnHandshakeDuration: js.UndefOr[Double] = js.native
  var cloneData: js.UndefOr[Boolean] = js.native
  var codecEngine: js.UndefOr[CodecEngine] = js.native
  // In milliseconds - If the socket handshake hasn't been
  // completed before this timeout is reached, the new
  // connection attempt will be terminated.
  var handshakeTimeout: js.UndefOr[Double] = js.native
  // An instance of a Node.js HTTP server.
  // https://nodejs.org/api/http.html#http_class_http_server
  // This option should not be set if the server is created
  // with socketClusterServer.attach(...).
  var httpServer: js.UndefOr[Server] = js.native
  // Whether or not an error should be emitted on
  // the socket whenever an action is blocked by a
  // middleware function
  var middlewareEmitFailures: js.UndefOr[Boolean] = js.native
  // Origins which are allowed to connect to the server.
  var origins: js.UndefOr[String] = js.native
  // The URL path reserved by SocketCluster clients to
  // interact with the server.
  var path: js.UndefOr[String] = js.native
  // perMessageDeflate compression. Note that this option is
  // passed directly to the wsEngine's Server object.
  // So if you're using 'ws' as the engine, you can pass an
  // object instead of a boolean.
  // Note that by default, per-message deflate only kicks in
  // for messages > 1024 bytes.
  var perMessageDeflate: js.UndefOr[Boolean | js.Object] = js.native
  // The interval in milliseconds on which to
  // send a ping to the client to check that
  // it is still alive.
  var pingInterval: js.UndefOr[Double] = js.native
  // How many milliseconds to wait without receiving a ping
  // before closing the socket.
  var pingTimeout: js.UndefOr[Double] = js.native
  // Can be 1 or 2. Version 1 is for maximum backwards
  // compatibility with SocketCluster clients.
  var protocolVersion: js.UndefOr[`1` | `2`] = js.native
  // The maximum number of unique channels which a single
  // socket can subscribe to.
  var socketChannelLimit: js.UndefOr[Double] = js.native
  // Lets you specify the default cleanup behaviour for
  // when a socket becomes disconnected.
  // Can be either 'kill' or 'close'. Kill mode means
  // that all of the socket's streams will be killed and
  // so consumption will stop immediately.
  // Close mode means that consumers on the socket will
  // be able to finish processing their stream backlogs
  // bebfore they are ended.
  var socketStreamCleanupMode: js.UndefOr[kill | close] = js.native
  // This can be the name of an npm module or a path to a
  // Node.js module to use as the WebSocket server engine.
  var wsEngine: js.UndefOr[js.Any] = js.native
  // Custom options to pass to the wsEngine when it is being
  // instantiated.
  var wsEngineServerOptions: js.UndefOr[ClientOptions] = js.native
}

object AGServerOptions {
  @scala.inline
  def apply(): AGServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AGServerOptions]
  }
  @scala.inline
  implicit class AGServerOptionsOps[Self <: AGServerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAckTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ackTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAckTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ackTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowClientPublish(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowClientPublish")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowClientPublish: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowClientPublish")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthDefaultExpiry(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authDefaultExpiry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthDefaultExpiry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authDefaultExpiry")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthEngine(value: SCAuthEngine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authEngine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authEngine")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthKey(value: Secret): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authKey")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthPrivateKey(value: Secret): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authPrivateKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthPrivateKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authPrivateKey")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthPublicKey(value: Secret): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authPublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthPublicKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authPublicKey")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthVerifyAlgorithms(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authVerifyAlgorithms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthVerifyAlgorithms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authVerifyAlgorithms")(js.undefined)
        ret
    }
    @scala.inline
    def withBatchInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withBatchOnHandshake(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchOnHandshake")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchOnHandshake: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchOnHandshake")(js.undefined)
        ret
    }
    @scala.inline
    def withBatchOnHandshakeDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchOnHandshakeDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchOnHandshakeDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchOnHandshakeDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withCloneData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloneData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneData")(js.undefined)
        ret
    }
    @scala.inline
    def withCodecEngine(value: CodecEngine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codecEngine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodecEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codecEngine")(js.undefined)
        ret
    }
    @scala.inline
    def withHandshakeTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handshakeTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandshakeTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handshakeTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpServer(value: Server): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpServer")(js.undefined)
        ret
    }
    @scala.inline
    def withMiddlewareEmitFailures(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middlewareEmitFailures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMiddlewareEmitFailures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middlewareEmitFailures")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigins(value: String): Self = {
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
    def withPerMessageDeflate(value: Boolean | js.Object): Self = {
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
    def withProtocolVersion(value: `1` | `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocolVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocolVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocolVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withSocketChannelLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketChannelLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocketChannelLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketChannelLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withSocketStreamCleanupMode(value: kill | close): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketStreamCleanupMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocketStreamCleanupMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketStreamCleanupMode")(js.undefined)
        ret
    }
    @scala.inline
    def withWsEngine(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsEngine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWsEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsEngine")(js.undefined)
        ret
    }
    @scala.inline
    def withWsEngineServerOptions(value: ClientOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsEngineServerOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWsEngineServerOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsEngineServerOptions")(js.undefined)
        ret
    }
  }
  
}

