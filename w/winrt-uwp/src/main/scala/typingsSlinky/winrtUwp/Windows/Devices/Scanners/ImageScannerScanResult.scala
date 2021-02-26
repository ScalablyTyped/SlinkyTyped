package typingsSlinky.winrtUwp.Windows.Devices.Scanners

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of a scan job. */
@js.native
trait ImageScannerScanResult extends StObject {
  
  /** Gets the list of scanned image files that was produced by the completed scan job. */
  var scannedFiles: IVectorView[StorageFile] = js.native
}
object ImageScannerScanResult {
  
  @scala.inline
  def apply(scannedFiles: IVectorView[StorageFile]): ImageScannerScanResult = {
    val __obj = js.Dynamic.literal(scannedFiles = scannedFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageScannerScanResult]
  }
  
  @scala.inline
  implicit class ImageScannerScanResultMutableBuilder[Self <: ImageScannerScanResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScannedFiles(value: IVectorView[StorageFile]): Self = StObject.set(x, "scannedFiles", value.asInstanceOf[js.Any])
  }
}
