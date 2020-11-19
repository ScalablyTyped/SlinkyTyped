package typingsSlinky.winrt.global.Windows.Storage

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Storage.StorageFolder")
@js.native
class StorageFolder ()
  extends typingsSlinky.winrt.Windows.Storage.StorageFolder
/* static members */
@JSGlobal("Windows.Storage.StorageFolder")
@js.native
object StorageFolder extends js.Object {
  
  def getFolderFromPathAsync(path: String): IAsyncOperation[typingsSlinky.winrt.Windows.Storage.StorageFolder] = js.native
}
