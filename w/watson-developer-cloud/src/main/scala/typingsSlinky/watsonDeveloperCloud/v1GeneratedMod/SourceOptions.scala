package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The **options** object defines which items to crawl from the source system. */
@js.native
trait SourceOptions extends js.Object {
  /** Array of cloud object store buckets to begin crawling. Only valid and required when the **type** field of the **source** object is set to `cloud_object_store`, and the **crawl_all_buckets** field is `false` or not specified. */
  var buckets: js.UndefOr[js.Array[SourceOptionsBuckets]] = js.native
  /** When `true`, all buckets in the specified cloud object store are crawled. If set to `true`, the **buckets** array must not be specified. */
  var crawl_all_buckets: js.UndefOr[Boolean] = js.native
  /** Array of folders to crawl from the Box source. Only valid, and required, when the **type** field of the **source** object is set to `box`. */
  var folders: js.UndefOr[js.Array[SourceOptionsFolder]] = js.native
  /** Array of Salesforce document object types to crawl from the Salesforce source. Only valid, and required, when the **type** field of the **source** object is set to `salesforce`. */
  var objects: js.UndefOr[js.Array[SourceOptionsObject]] = js.native
  /** Array of Microsoft SharePointoint Online site collections to crawl from the SharePoint source. Only valid and required when the **type** field of the **source** object is set to `sharepoint`. */
  var site_collections: js.UndefOr[js.Array[SourceOptionsSiteColl]] = js.native
  /** Array of Web page URLs to begin crawling the web from. Only valid and required when the **type** field of the **source** object is set to `web_crawl`. */
  var urls: js.UndefOr[js.Array[SourceOptionsWebCrawl]] = js.native
}

object SourceOptions {
  @scala.inline
  def apply(): SourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceOptions]
  }
  @scala.inline
  implicit class SourceOptionsOps[Self <: SourceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuckets(value: js.Array[SourceOptionsBuckets]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buckets")(js.undefined)
        ret
    }
    @scala.inline
    def withCrawl_all_buckets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crawl_all_buckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrawl_all_buckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crawl_all_buckets")(js.undefined)
        ret
    }
    @scala.inline
    def withFolders(value: js.Array[SourceOptionsFolder]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFolders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folders")(js.undefined)
        ret
    }
    @scala.inline
    def withObjects(value: js.Array[SourceOptionsObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(js.undefined)
        ret
    }
    @scala.inline
    def withSite_collections(value: js.Array[SourceOptionsSiteColl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("site_collections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSite_collections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("site_collections")(js.undefined)
        ret
    }
    @scala.inline
    def withUrls(value: js.Array[SourceOptionsWebCrawl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urls")(js.undefined)
        ret
    }
  }
  
}

