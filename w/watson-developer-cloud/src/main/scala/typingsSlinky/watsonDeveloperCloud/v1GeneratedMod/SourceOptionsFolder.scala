package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withFolder_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folder_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner_user_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner_user_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
  }
  
}

