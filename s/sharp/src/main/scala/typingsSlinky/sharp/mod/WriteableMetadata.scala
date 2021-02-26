package typingsSlinky.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriteableMetadata extends StObject {
  
  /** Number value of the EXIF Orientation header, if present */
  var orientation: js.UndefOr[Double] = js.native
}
object WriteableMetadata {
  
  @scala.inline
  def apply(): WriteableMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteableMetadata]
  }
  
  @scala.inline
  implicit class WriteableMetadataMutableBuilder[Self <: WriteableMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrientation(value: Double): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
  }
}
