package typingsSlinky.socketclusterClient.clientsocketMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.socketclusterClient.authMod.AGAuthEngine
import typingsSlinky.socketclusterServer.serverMod.CodecEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientOptions extends js.Object {
  // (milliseconds) - This is the timeout for getting a response to a AGClientSocket invoke action.
  var ackTimeout: js.UndefOr[Double] = js.native
  // A custom engine to use for storing and loading JWT auth tokens on the client side.
  var authEngine: js.UndefOr[AGAuthEngine | Null] = js.native
  // The name of the JWT auth token (provided to the authEngine - By default this is the localStorage variable name); defaults to 'socketcluster.authToken'.
  var authTokenName: js.UndefOr[String] = js.native
  // Whether or not to automatically connect the socket as soon as it is created. Default is true.
  var autoConnect: js.UndefOr[Boolean] = js.native
  // Whether or not to automatically reconnect the socket when it loses the connection. Default is true.
  var autoReconnect: js.UndefOr[Boolean] = js.native
  // Valid properties are: initialDelay (milliseconds), randomness (milliseconds), multiplier (decimal; default is 1.5) and maxDelay (milliseconds).
  var autoReconnectOptions: js.UndefOr[AutoReconnectOptions] = js.native
  // This is true by default. If you set this to false, then the socket will not automatically try to subscribe to pending subscriptions on
  // connect - Instead, you will have to manually invoke the processSubscriptions callback from inside the 'connect' event handler on the client side.
  // See AGClientSocket API. This gives you more fine-grained control with regards to when pending subscriptions are processed after the socket
  // connection is established (or re-established).
  var autoSubscribeOnConnect: js.UndefOr[Boolean] = js.native
  // The amount of milliseconds to wait before flushing each batch of messages. Defaults to 50.
  var batchInterval: js.UndefOr[Double] = js.native
  // Whether or not to start batching messages immediately after the connection handshake completes. This is useful for handling connection recovery
  // when the client tries to resubscribe to a large number of channels in a very short amount of time. Defaults to false.
  var batchOnHandshake: js.UndefOr[Boolean] = js.native
  // The amount of time in milliseconds after the handshake completes during which all socket messages will be batched. Defaults to 100.
  var batchOnHandshakeDuration: js.UndefOr[Double] = js.native
  // The type to use to represent binary on the client. Defaults to 'arraybuffer'.
  var binaryType: js.UndefOr[String] = js.native
  var callIdGenerator: js.UndefOr[CallIdGenerator] = js.native
  // A prefix to add to the channel names.
  var channelPrefix: js.UndefOr[String | Null] = js.native
  var clientId: js.UndefOr[String] = js.native
  // If you set this to true, any data/objects/arrays that you pass to the client socket will be cloned before being sent/queued up. If the socket
  // is disconnected and you emit an event, it will be added to a queue which will be processed upon reconnection. The cloneData option is false
  // by default; this means that if you emit/publish an object and that object changes somewhere else in your code before the queue is processed,
  // then the changed version of that object will be sent out to the server.
  var cloneData: js.UndefOr[Boolean] = js.native
  // Lets you set a custom codec engine. This allows you to specify how data gets encoded before being sent over the wire and how it gets decoded
  // once it reaches the other side. The codecEngine must be an object which exposes an encode(object) and a decode(encodedData) function.
  // The encode function can return any data type - Commonly a string or a Buffer/ArrayBuffer. The decode function needs to return a JavaScript
  // object which adheres to the SC protocol. The idea of using a custom codec is that it allows you to compress SocketCluster packets in any format
  // you like (optimized for any use case) - By decoding these packets back into their original protocol form, SocketCluster will be able process
  // them appropriately. Note that if you provide a codecEngine when creating a client socket, you will need to make sure that the server uses the
  // same codec by passing the same engine to the AGServer constructor (using the codecEngine option).
  var codecEngine: js.UndefOr[CodecEngine | Null] = js.native
  // (milliseconds)
  var connectTimeout: js.UndefOr[Double] = js.native
  // Whether or not a client automatically disconnects on page unload. If enabled, the client will disconnect when a user navigates away from the page.
  // This can happen when a user closes the tab/window, clicks a link to leave the page, or types a new URL into the address bar. Defaults to true.
  var disconnectOnUnload: js.UndefOr[Boolean] = js.native
  var host: js.UndefOr[String] = js.native
  // Defaults to the current host (read from the URL).
  var hostname: js.UndefOr[String] = js.native
  // The URL which SocketCluster uses to make the initial handshake for the WebSocket. Defaults to '/socketcluster/'.
  var path: js.UndefOr[String] = js.native
  // pingTimeout will be connectTimeout at the start, but it will be updated with values provided by the 'connect' event.
  var pingTimeout: js.UndefOr[Double] = js.native
  var pingTimeoutDisabled: js.UndefOr[Boolean] = js.native
  // Defaults to 80 if !secure otherwise defaults to 443.
  var port: js.UndefOr[Double] = js.native
  // The protocol scheme for the transport. Defaults to 'ws' or 'wss', depending upon the valur of secure.
  var protocolScheme: js.UndefOr[String] = js.native
  var protocolVersion: js.UndefOr[ProtocolVersions] = js.native
  // A map of key-value pairs which will be used as query parameters for the initial HTTP handshake which will initiate the WebSocket connection.
  var query: js.UndefOr[String | StringDictionary[String]] = js.native
  // Defaults to false.
  var secure: js.UndefOr[Boolean] = js.native
  var socketPath: js.UndefOr[String] = js.native
  var subscriptionRetryOptions: js.UndefOr[js.Object | Null] = js.native
  // The query parameter name to use to hold the timestamp.
  var timestampParam: js.UndefOr[String] = js.native
  // Whether or not to add a timestamp to the WebSocket handshake request.
  var timestampRequests: js.UndefOr[Boolean] = js.native
  var version: js.UndefOr[String] = js.native
  // This object will be passed to the constructor of the ws WebSocket instance.
  var wsOptions: js.UndefOr[typingsSlinky.ws.mod.ClientOptions] = js.native
}

object ClientOptions {
  @scala.inline
  def apply(): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOptions]
  }
  @scala.inline
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
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
    def withAuthEngine(value: AGAuthEngine): Self = {
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
    def withAuthEngineNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authEngine")(null)
        ret
    }
    @scala.inline
    def withAuthTokenName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authTokenName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthTokenName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authTokenName")(js.undefined)
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
    def withAutoReconnect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoReconnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoReconnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoReconnect")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoReconnectOptions(value: AutoReconnectOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoReconnectOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoReconnectOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoReconnectOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoSubscribeOnConnect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSubscribeOnConnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSubscribeOnConnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSubscribeOnConnect")(js.undefined)
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
    def withBinaryType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinaryType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryType")(js.undefined)
        ret
    }
    @scala.inline
    def withCallIdGenerator(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callIdGenerator")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCallIdGenerator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callIdGenerator")(js.undefined)
        ret
    }
    @scala.inline
    def withChannelPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withChannelPrefixNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelPrefix")(null)
        ret
    }
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(js.undefined)
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
    def withCodecEngineNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codecEngine")(null)
        ret
    }
    @scala.inline
    def withConnectTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withDisconnectOnUnload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnectOnUnload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisconnectOnUnload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnectOnUnload")(js.undefined)
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
    def withPingTimeoutDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pingTimeoutDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPingTimeoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pingTimeoutDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
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
    def withProtocolScheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocolScheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocolScheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocolScheme")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocolVersion(value: ProtocolVersions): Self = {
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
    def withQuery(value: String | StringDictionary[String]): Self = {
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
    def withSocketPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocketPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketPath")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriptionRetryOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionRetryOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriptionRetryOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionRetryOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriptionRetryOptionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionRetryOptions")(null)
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
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
    @scala.inline
    def withWsOptions(value: typingsSlinky.ws.mod.ClientOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWsOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsOptions")(js.undefined)
        ret
    }
  }
  
}

