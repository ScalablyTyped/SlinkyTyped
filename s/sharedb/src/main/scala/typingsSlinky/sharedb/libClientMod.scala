package typingsSlinky.sharedb

import org.scalajs.dom.raw.WebSocket
import typingsSlinky.sharedb.libClientMod.Doc
import typingsSlinky.sharedb.libClientMod.Error
import typingsSlinky.sharedb.libClientMod.Query
import typingsSlinky.ws.wsMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sharedb/lib/client", JSImport.Namespace)
@js.native
object libClientMod extends js.Object {
  @js.native
  class Connection protected () extends js.Object {
    def this(ws: WebSocket) = this()
    def this(ws: ^) = this()
    def createFetchQuery(
      collectionName: String,
      query: js.Any,
      options: Anon_ResultsArray,
      callback: js.Function2[/* err */ Error, /* results */ js.Array[_], Unit]
    ): Query = js.native
    def createSubscribeQuery(
      collectionName: String,
      query: js.Any,
      options: Anon_ResultsArray,
      callback: js.Function2[/* err */ Error, /* results */ js.Array[_], Unit]
    ): Query = js.native
    def get(collectionName: String, documentID: String): Doc = js.native
  }
  
  type AddNumOp = typingsSlinky.sharedb.libSharedbMod.AddNumOp
  type Doc = typingsSlinky.sharedb.libSharedbMod.Doc
  type Error = typingsSlinky.sharedb.libSharedbMod.Error
  type ListDeleteOp = typingsSlinky.sharedb.libSharedbMod.ListDeleteOp
  type ListInsertOp = typingsSlinky.sharedb.libSharedbMod.ListInsertOp
  type ListMoveOp = typingsSlinky.sharedb.libSharedbMod.ListMoveOp
  type ListReplaceOp = typingsSlinky.sharedb.libSharedbMod.ListReplaceOp
  type ObjectDeleteOp = typingsSlinky.sharedb.libSharedbMod.ObjectDeleteOp
  type ObjectInsertOp = typingsSlinky.sharedb.libSharedbMod.ObjectInsertOp
  type ObjectReplaceOp = typingsSlinky.sharedb.libSharedbMod.ObjectReplaceOp
  type Op = typingsSlinky.sharedb.libSharedbMod.Op
  type Path = typingsSlinky.sharedb.libSharedbMod.Path
  type Query = typingsSlinky.sharedb.libSharedbMod.Query
  type ShareDBSourceOptions = typingsSlinky.sharedb.libSharedbMod.ShareDBSourceOptions
  type StringDeleteOp = typingsSlinky.sharedb.libSharedbMod.StringDeleteOp
  type StringInsertOp = typingsSlinky.sharedb.libSharedbMod.StringInsertOp
  type SubtypeOp = typingsSlinky.sharedb.libSharedbMod.SubtypeOp
}

