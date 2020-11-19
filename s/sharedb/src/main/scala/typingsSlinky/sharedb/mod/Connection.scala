package typingsSlinky.sharedb.mod

import org.scalajs.dom.raw.WebSocket
import typingsSlinky.sharedb.anon.Results
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sharedb", "Connection")
@js.native
class Connection protected () extends js.Object {
  def this(ws: WebSocket) = this()
  
  def createFetchQuery(
    collectionName: String,
    query: String,
    options: Results,
    callback: js.Function2[/* err */ Error, /* results */ js.Any, _]
  ): typingsSlinky.sharedb.sharedbMod.Query = js.native
  
  def createSubscribeQuery(
    collectionName: String,
    query: String,
    options: Results,
    callback: js.Function2[/* err */ Error, /* results */ js.Any, _]
  ): typingsSlinky.sharedb.sharedbMod.Query = js.native
  
  def get(collectionName: String, documentID: String): typingsSlinky.sharedb.sharedbMod.Doc = js.native
}
