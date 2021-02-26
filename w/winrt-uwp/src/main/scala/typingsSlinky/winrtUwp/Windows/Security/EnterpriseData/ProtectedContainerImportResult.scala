package typingsSlinky.winrtUwp.Windows.Security.EnterpriseData

import typingsSlinky.winrtUwp.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of an enterprise protected file that has been imported from a container file. */
@js.native
trait ProtectedContainerImportResult extends StObject {
  
  /** The enterprise protected file that has been loaded from a container file. */
  var file: StorageFile = js.native
  
  /** The protection status after an enterprise protected file has been imported from a container file. */
  var status: ProtectedImportExportStatus = js.native
}
object ProtectedContainerImportResult {
  
  @scala.inline
  def apply(file: StorageFile, status: ProtectedImportExportStatus): ProtectedContainerImportResult = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectedContainerImportResult]
  }
  
  @scala.inline
  implicit class ProtectedContainerImportResultMutableBuilder[Self <: ProtectedContainerImportResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFile(value: StorageFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: ProtectedImportExportStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
