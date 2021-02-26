package typingsSlinky.sparkpost.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attachment extends StObject {
  
  /**
    * The content of the attachment as a Base64 encoded string.
    * The string should not contain \r\n line breaks.
    * The SparkPost systems will add line breaks as necessary to ensure the Base64 encoded lines contain no more than 76 characters each.
    *
    */
  var data: String = js.native
  
  /**   The filename of the attachment (for example, “document.pdf”). This is inserted into the filename parameter of the Content-Disposition header. */
  var name: String = js.native
  
  /**
    * The MIME type of the attachment; e.g., “text/plain”, “image/jpeg”, “audio/mp3”, “video/mp4”, “application/msword”, “application/pdf”, etc.,
    * including the “charset” parameter (text/html; charset=“UTF-8”) if needed.
    * The value will apply “as-is” to the “Content-Type” header of the generated MIME part for the attachment.
    *
    */
  var `type`: String = js.native
}
object Attachment {
  
  @scala.inline
  def apply(data: String, name: String, `type`: String): Attachment = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
  
  @scala.inline
  implicit class AttachmentMutableBuilder[Self <: Attachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
