package typingsSlinky.winrt.Windows.Storage.Pickers.Provider

import typingsSlinky.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetFileRequest extends ITargetFileRequest
object TargetFileRequest {
  
  @scala.inline
  def apply(getDeferral: () => TargetFileRequestDeferral, targetFile: IStorageFile): TargetFileRequest = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), targetFile = targetFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetFileRequest]
  }
}
