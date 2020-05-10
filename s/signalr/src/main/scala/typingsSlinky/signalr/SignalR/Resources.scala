package typingsSlinky.signalr.SignalR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resources extends js.Object {
  var errorDuringStartRequest: String = js.native
  var errorOnNegotiate: String = js.native
  var errorParsingNegotiateResponse: String = js.native
  var errorParsingStartResponse: String = js.native
  var eventSourceError: String = js.native
  var eventSourceFailedToConnect: String = js.native
  var invalidStartResponse: String = js.native
  var longPollFailed: String = js.native
  var noConnectionTransport: String = js.native
  var noTransportOnInit: String = js.native
  var nojQuery: String = js.native
  var parseFailed: String = js.native
  var pingServerFailed: String = js.native
  var pingServerFailedInvalidResponse: String = js.native
  var pingServerFailedParse: String = js.native
  var pingServerFailedStatusCode: String = js.native
  var protocolIncompatible: String = js.native
  var reconnectTimeout: String = js.native
  var reconnectWindowTimeout: String = js.native
  var sendFailed: String = js.native
  var stoppedDuringStartRequest: String = js.native
  var stoppedWhileLoading: String = js.native
  var stoppedWhileNegotiating: String = js.native
  var webSocketClosed: String = js.native
  var webSocketsInvalidState: String = js.native
}

object Resources {
  @scala.inline
  def apply(
    errorDuringStartRequest: String,
    errorOnNegotiate: String,
    errorParsingNegotiateResponse: String,
    errorParsingStartResponse: String,
    eventSourceError: String,
    eventSourceFailedToConnect: String,
    invalidStartResponse: String,
    longPollFailed: String,
    noConnectionTransport: String,
    noTransportOnInit: String,
    nojQuery: String,
    parseFailed: String,
    pingServerFailed: String,
    pingServerFailedInvalidResponse: String,
    pingServerFailedParse: String,
    pingServerFailedStatusCode: String,
    protocolIncompatible: String,
    reconnectTimeout: String,
    reconnectWindowTimeout: String,
    sendFailed: String,
    stoppedDuringStartRequest: String,
    stoppedWhileLoading: String,
    stoppedWhileNegotiating: String,
    webSocketClosed: String,
    webSocketsInvalidState: String
  ): Resources = {
    val __obj = js.Dynamic.literal(errorDuringStartRequest = errorDuringStartRequest.asInstanceOf[js.Any], errorOnNegotiate = errorOnNegotiate.asInstanceOf[js.Any], errorParsingNegotiateResponse = errorParsingNegotiateResponse.asInstanceOf[js.Any], errorParsingStartResponse = errorParsingStartResponse.asInstanceOf[js.Any], eventSourceError = eventSourceError.asInstanceOf[js.Any], eventSourceFailedToConnect = eventSourceFailedToConnect.asInstanceOf[js.Any], invalidStartResponse = invalidStartResponse.asInstanceOf[js.Any], longPollFailed = longPollFailed.asInstanceOf[js.Any], noConnectionTransport = noConnectionTransport.asInstanceOf[js.Any], noTransportOnInit = noTransportOnInit.asInstanceOf[js.Any], nojQuery = nojQuery.asInstanceOf[js.Any], parseFailed = parseFailed.asInstanceOf[js.Any], pingServerFailed = pingServerFailed.asInstanceOf[js.Any], pingServerFailedInvalidResponse = pingServerFailedInvalidResponse.asInstanceOf[js.Any], pingServerFailedParse = pingServerFailedParse.asInstanceOf[js.Any], pingServerFailedStatusCode = pingServerFailedStatusCode.asInstanceOf[js.Any], protocolIncompatible = protocolIncompatible.asInstanceOf[js.Any], reconnectTimeout = reconnectTimeout.asInstanceOf[js.Any], reconnectWindowTimeout = reconnectWindowTimeout.asInstanceOf[js.Any], sendFailed = sendFailed.asInstanceOf[js.Any], stoppedDuringStartRequest = stoppedDuringStartRequest.asInstanceOf[js.Any], stoppedWhileLoading = stoppedWhileLoading.asInstanceOf[js.Any], stoppedWhileNegotiating = stoppedWhileNegotiating.asInstanceOf[js.Any], webSocketClosed = webSocketClosed.asInstanceOf[js.Any], webSocketsInvalidState = webSocketsInvalidState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resources]
  }
  @scala.inline
  implicit class ResourcesOps[Self <: Resources] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorDuringStartRequest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorDuringStartRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorOnNegotiate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorOnNegotiate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorParsingNegotiateResponse(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorParsingNegotiateResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorParsingStartResponse(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorParsingStartResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventSourceError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventSourceError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventSourceFailedToConnect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventSourceFailedToConnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalidStartResponse(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidStartResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongPollFailed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longPollFailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoConnectionTransport(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noConnectionTransport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoTransportOnInit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noTransportOnInit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNojQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nojQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParseFailed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseFailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPingServerFailed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pingServerFailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPingServerFailedInvalidResponse(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pingServerFailedInvalidResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPingServerFailedParse(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pingServerFailedParse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPingServerFailedStatusCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pingServerFailedStatusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocolIncompatible(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocolIncompatible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReconnectTimeout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReconnectWindowTimeout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectWindowTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSendFailed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendFailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoppedDuringStartRequest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stoppedDuringStartRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoppedWhileLoading(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stoppedWhileLoading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoppedWhileNegotiating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stoppedWhileNegotiating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebSocketClosed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webSocketClosed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebSocketsInvalidState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webSocketsInvalidState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

