package typingsSlinky.webgme.mod

import typingsSlinky.webgme.Core.DataObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlobMetadata
  extends typingsSlinky.webgme.Blobs.BlobMetadata
object BlobMetadata {
  
  @scala.inline
  def apply(contentType: String, context: DataObject, mime: String, name: String, size: Double): BlobMetadata = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlobMetadata]
  }
}
