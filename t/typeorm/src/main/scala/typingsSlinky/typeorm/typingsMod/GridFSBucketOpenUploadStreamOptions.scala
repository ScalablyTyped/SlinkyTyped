package typingsSlinky.typeorm.typingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridFSBucketOpenUploadStreamOptions extends js.Object {
  
  /**
    * Optional array of strings to store in the file document's aliases field.
    */
  var aliases: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional overwrite this bucket's chunkSizeBytes for this file.
    */
  var chunkSizeBytes: js.UndefOr[scala.Double] = js.native
  
  /**
    * Optional string to store in the file document's contentType field.
    */
  var contentType: js.UndefOr[String] = js.native
  
  /**
    * Optional object to store in the file document's metadata field.
    */
  var metadata: js.UndefOr[js.Object] = js.native
}
object GridFSBucketOpenUploadStreamOptions {
  
  @scala.inline
  def apply(): GridFSBucketOpenUploadStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridFSBucketOpenUploadStreamOptions]
  }
  
  @scala.inline
  implicit class GridFSBucketOpenUploadStreamOptionsOps[Self <: GridFSBucketOpenUploadStreamOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAliasesVarargs(value: String*): Self = this.set("aliases", js.Array(value :_*))
    
    @scala.inline
    def setAliases(value: js.Array[String]): Self = this.set("aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliases: Self = this.set("aliases", js.undefined)
    
    @scala.inline
    def setChunkSizeBytes(value: scala.Double): Self = this.set("chunkSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkSizeBytes: Self = this.set("chunkSizeBytes", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setMetadata(value: js.Object): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
}
