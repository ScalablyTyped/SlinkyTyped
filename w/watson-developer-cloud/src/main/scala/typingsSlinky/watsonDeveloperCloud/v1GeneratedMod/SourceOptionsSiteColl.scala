package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Object that defines a Microsoft SharePoint site collection to crawl with this configuration. */
@js.native
trait SourceOptionsSiteColl extends StObject {
  
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
  implicit class SourceOptionsSiteCollMutableBuilder[Self <: SourceOptionsSiteColl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setSite_collection_path(value: String): Self = StObject.set(x, "site_collection_path", value.asInstanceOf[js.Any])
  }
}
