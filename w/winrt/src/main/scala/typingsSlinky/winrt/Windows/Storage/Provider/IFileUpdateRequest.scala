package typingsSlinky.winrt.Windows.Storage.Provider

import typingsSlinky.winrt.Windows.Storage.IStorageFile
import typingsSlinky.winrt.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFileUpdateRequest extends StObject {
  
  var contentId: String = js.native
  
  var file: StorageFile = js.native
  
  def getDeferral(): FileUpdateRequestDeferral = js.native
  
  var status: FileUpdateStatus = js.native
  
  def updateLocalFile(value: IStorageFile): Unit = js.native
}
object IFileUpdateRequest {
  
  @scala.inline
  def apply(
    contentId: String,
    file: StorageFile,
    getDeferral: () => FileUpdateRequestDeferral,
    status: FileUpdateStatus,
    updateLocalFile: IStorageFile => Unit
  ): IFileUpdateRequest = {
    val __obj = js.Dynamic.literal(contentId = contentId.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), status = status.asInstanceOf[js.Any], updateLocalFile = js.Any.fromFunction1(updateLocalFile))
    __obj.asInstanceOf[IFileUpdateRequest]
  }
  
  @scala.inline
  implicit class IFileUpdateRequestMutableBuilder[Self <: IFileUpdateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentId(value: String): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: StorageFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDeferral(value: () => FileUpdateRequestDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStatus(value: FileUpdateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateLocalFile(value: IStorageFile => Unit): Self = StObject.set(x, "updateLocalFile", js.Any.fromFunction1(value))
  }
}
