package typingsSlinky.sharedb

import org.scalajs.dom.raw.WebSocket
import typingsSlinky.sharedb.anon.`0`
import typingsSlinky.sharedb.sharedbMod.Types
import typingsSlinky.ws.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sharedb/lib/client", JSImport.Namespace)
@js.native
object clientMod extends js.Object {
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
      options: `0`,
      callback: js.Function2[/* err */ Error, /* results */ js.Array[_], Unit]
    ): Query = js.native
    def createSubscribeQuery(
      collectionName: String,
      query: js.Any,
      options: `0`,
      callback: js.Function2[/* err */ Error, /* results */ js.Array[_], Unit]
    ): Query = js.native
    def get(collectionName: String, documentID: String): Doc = js.native
  }
  
  val types: Types = js.native
  type AddNumOp = typingsSlinky.sharedb.sharedbMod.AddNumOp
  type Doc = typingsSlinky.sharedb.sharedbMod.Doc
  type Error = typingsSlinky.sharedb.sharedbMod.Error
  type ListDeleteOp = typingsSlinky.sharedb.sharedbMod.ListDeleteOp
  type ListInsertOp = typingsSlinky.sharedb.sharedbMod.ListInsertOp
  type ListMoveOp = typingsSlinky.sharedb.sharedbMod.ListMoveOp
  type ListReplaceOp = typingsSlinky.sharedb.sharedbMod.ListReplaceOp
  type ObjectDeleteOp = typingsSlinky.sharedb.sharedbMod.ObjectDeleteOp
  type ObjectInsertOp = typingsSlinky.sharedb.sharedbMod.ObjectInsertOp
  type ObjectReplaceOp = typingsSlinky.sharedb.sharedbMod.ObjectReplaceOp
  type Op = typingsSlinky.sharedb.sharedbMod.Op
  type Path = typingsSlinky.sharedb.sharedbMod.Path
  type Query = typingsSlinky.sharedb.sharedbMod.Query
  type ShareDBSourceOptions = typingsSlinky.sharedb.sharedbMod.ShareDBSourceOptions
  type StringDeleteOp = typingsSlinky.sharedb.sharedbMod.StringDeleteOp
  type StringInsertOp = typingsSlinky.sharedb.sharedbMod.StringInsertOp
  type SubtypeOp = typingsSlinky.sharedb.sharedbMod.SubtypeOp
}

