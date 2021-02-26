package typingsSlinky.winrt.Windows.Networking.Sockets

import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import typingsSlinky.winrt.Windows.Foundation.IClosable
import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.Storage.Streams.IOutputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebSocket extends IClosable {
  
  def close(code: Double, reason: String): Unit = js.native
  
  def connectAsync(uri: Uri): IAsyncAction = js.native
  
  var onclosed: js.Any = js.native
  
  var outputStream: IOutputStream = js.native
  
  def setRequestHeader(headerName: String, headerValue: String): Unit = js.native
}
