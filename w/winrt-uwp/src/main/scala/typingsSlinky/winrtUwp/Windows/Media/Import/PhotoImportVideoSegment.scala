package typingsSlinky.winrtUwp.Windows.Media.Import

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an imported video segment. */
@js.native
trait PhotoImportVideoSegment extends StObject {
  
  /** Gets the date of the imported video segment. */
  var date: js.Date = js.native
  
  /** Gets the name of the imported video segment. */
  var name: String = js.native
  
  /** Gets the sibling file associated with the imported video segment. */
  var sibling: PhotoImportSidecar = js.native
  
  /** Gets the sidecar file associated with the imported video segment. */
  var sidecars: IVectorView[PhotoImportSidecar] = js.native
  
  /** Gets the size of the imported video segment, in bytes. */
  var sizeInBytes: Double = js.native
}
object PhotoImportVideoSegment {
  
  @scala.inline
  def apply(
    date: js.Date,
    name: String,
    sibling: PhotoImportSidecar,
    sidecars: IVectorView[PhotoImportSidecar],
    sizeInBytes: Double
  ): PhotoImportVideoSegment = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sibling = sibling.asInstanceOf[js.Any], sidecars = sidecars.asInstanceOf[js.Any], sizeInBytes = sizeInBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoImportVideoSegment]
  }
  
  @scala.inline
  implicit class PhotoImportVideoSegmentMutableBuilder[Self <: PhotoImportVideoSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSibling(value: PhotoImportSidecar): Self = StObject.set(x, "sibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSidecars(value: IVectorView[PhotoImportSidecar]): Self = StObject.set(x, "sidecars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeInBytes(value: Double): Self = StObject.set(x, "sizeInBytes", value.asInstanceOf[js.Any])
  }
}
