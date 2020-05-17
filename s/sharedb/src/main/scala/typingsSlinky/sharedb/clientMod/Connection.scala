package typingsSlinky.sharedb.clientMod

import org.scalajs.dom.raw.WebSocket
import typingsSlinky.sharedb.anon.ResultsArray
import typingsSlinky.ws.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sharedb/lib/client", "Connection")
@js.native
class Connection protected () extends js.Object {
  def this(ws: WebSocket) = this()
  def this(ws: ^) = this()
  // This direct reference from connection to agent is not used internal to
  // ShareDB, but it is handy for server-side only user code that may cache
  // state on the agent and read it in middleware
  var agent: typingsSlinky.sharedb.agentMod.^  | Null = js.native
  def createFetchQuery(
    collectionName: String,
    query: js.Any,
    options: ResultsArray,
    callback: js.Function2[/* err */ Error, /* results */ js.Array[_], Unit]
  ): Query = js.native
  def createSubscribeQuery(
    collectionName: String,
    query: js.Any,
    options: ResultsArray,
    callback: js.Function2[/* err */ Error, /* results */ js.Array[_], Unit]
  ): Query = js.native
  def get(collectionName: String, documentID: String): Doc = js.native
}

