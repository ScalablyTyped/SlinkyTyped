package typingsSlinky.sharedb.sharedbMod

import org.scalajs.dom.raw.WebSocket
import typingsSlinky.sharedb.Anon_Results
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sharedb", "Connection")
@js.native
class Connection protected () extends js.Object {
  def this(ws: WebSocket) = this()
  def createFetchQuery(
    collectionName: String,
    query: String,
    options: Anon_Results,
    callback: js.Function2[/* err */ Error, /* results */ js.Any, _]
  ): typingsSlinky.sharedb.libSharedbMod.Query = js.native
  def createSubscribeQuery(
    collectionName: String,
    query: String,
    options: Anon_Results,
    callback: js.Function2[/* err */ Error, /* results */ js.Any, _]
  ): typingsSlinky.sharedb.libSharedbMod.Query = js.native
  def get(collectionName: String, documentID: String): typingsSlinky.sharedb.libSharedbMod.Doc = js.native
}

