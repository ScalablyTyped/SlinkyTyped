package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object that defines a Microsoft SharePoint site collection to crawl with this configuration. */
@js.native
trait SourceOptionsSiteColl extends js.Object {
  /** The maximum number of documents to crawl for this site collection. By default, all documents in the site collection are crawled. */
  var limit: js.UndefOr[Double] = js.native
  /** The Microsoft SharePoint Online site collection path to crawl. The path must be be relative to the **organization_url** that was specified in the credentials associated with this source configuration. */
  var site_collection_path: String = js.native
}

object SourceOptionsSiteColl {
  @scala.inline
  def apply(site_collection_path: String): SourceOptionsSiteColl = {
    val __obj = js.Dynamic.literal(site_collection_path = site_collection_path.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceOptionsSiteColl]
  }
  @scala.inline
  implicit class SourceOptionsSiteCollOps[Self <: SourceOptionsSiteColl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSite_collection_path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("site_collection_path")(value.asInstanceOf[js.Any])
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

