package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Object that defines a box folder to crawl with this configuration. */
@js.native
trait SourceOptionsFolder extends js.Object {
  
  /** The Box folder ID of the folder to crawl. */
  var folder_id: String = js.native
  
  /** The maximum number of documents to crawl for this folder. By default, all documents in the folder are crawled. */
  var limit: js.UndefOr[Double] = js.native
  
  /** The Box user ID of the user who owns the folder to crawl. */
  var owner_user_id: String = js.native
}
object SourceOptionsFolder {
  
  @scala.inline
  def apply(folder_id: String, owner_user_id: String): SourceOptionsFolder = {
    val __obj = js.Dynamic.literal(folder_id = folder_id.asInstanceOf[js.Any], owner_user_id = owner_user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceOptionsFolder]
  }
  
  @scala.inline
  implicit class SourceOptionsFolderOps[Self <: SourceOptionsFolder] (val x: Self) extends AnyVal {
    
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
    def setFolder_id(value: String): Self = this.set("folder_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner_user_id(value: String): Self = this.set("owner_user_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
  }
}
