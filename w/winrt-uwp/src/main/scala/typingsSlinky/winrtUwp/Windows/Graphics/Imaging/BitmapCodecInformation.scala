package typingsSlinky.winrtUwp.Windows.Graphics.Imaging

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to information about a decoder or encoder. */
@js.native
trait BitmapCodecInformation extends StObject {
  
  /** The unique identifier of the decoder or encoder. Methods like BitmapDecoder::CreateAsync and BitmapEncoder::CreateAsync use the codec identifier to determine which codec to create. */
  var codecId: String = js.native
  
  /** A collection of all the file extensions supported by the decoder or encoder. */
  var fileExtensions: IVectorView[String] = js.native
  
  /** The friendly name of the decoder or encoder. */
  var friendlyName: String = js.native
  
  /** A collection of all the MIME/content types supported by the decoder or encoder. MIME type is synonymous with content type . */
  var mimeTypes: IVectorView[String] = js.native
}
object BitmapCodecInformation {
  
  @scala.inline
  def apply(
    codecId: String,
    fileExtensions: IVectorView[String],
    friendlyName: String,
    mimeTypes: IVectorView[String]
  ): BitmapCodecInformation = {
    val __obj = js.Dynamic.literal(codecId = codecId.asInstanceOf[js.Any], fileExtensions = fileExtensions.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], mimeTypes = mimeTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitmapCodecInformation]
  }
  
  @scala.inline
  implicit class BitmapCodecInformationMutableBuilder[Self <: BitmapCodecInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodecId(value: String): Self = StObject.set(x, "codecId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileExtensions(value: IVectorView[String]): Self = StObject.set(x, "fileExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypes(value: IVectorView[String]): Self = StObject.set(x, "mimeTypes", value.asInstanceOf[js.Any])
  }
}
