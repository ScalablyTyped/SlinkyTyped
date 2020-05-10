package typingsSlinky.subscriptionsTransportWs.serverMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.ws.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionContext extends js.Object {
  var initPromise: js.UndefOr[js.Promise[_]] = js.native
  var isLegacy: Boolean = js.native
  var operations: StringDictionary[ExecutionIterator] = js.native
  var request: IncomingMessage = js.native
  var socket: ^ = js.native
}

object ConnectionContext {
  @scala.inline
  def apply(
    isLegacy: Boolean,
    operations: StringDictionary[ExecutionIterator],
    request: IncomingMessage,
    socket: ^
  ): ConnectionContext = {
    val __obj = js.Dynamic.literal(isLegacy = isLegacy.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionContext]
  }
  @scala.inline
  implicit class ConnectionContextOps[Self <: ConnectionContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsLegacy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperations(value: StringDictionary[ExecutionIterator]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: IncomingMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSocket(value: ^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitPromise(value: js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initPromise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitPromise: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initPromise")(js.undefined)
        ret
    }
  }
  
}

