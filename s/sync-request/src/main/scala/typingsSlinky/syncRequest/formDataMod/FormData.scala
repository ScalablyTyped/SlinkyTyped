package typingsSlinky.syncRequest.formDataMod

import org.scalajs.dom.raw.Blob
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sync-request/lib/FormData", "FormData")
@js.native
class FormData () extends js.Object {
  
  var _entries: js.Any = js.native
  
  def append(key: String, value: String): Unit = js.native
  def append(key: String, value: String, fileName: String): Unit = js.native
  def append(key: String, value: Buffer): Unit = js.native
  def append(key: String, value: Buffer, fileName: String): Unit = js.native
  def append(key: String, value: Blob): Unit = js.native
  def append(key: String, value: Blob, fileName: String): Unit = js.native
}
