package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Object containing source crawl status information. */
@js.native
trait SourceStatus extends StObject {
  
  /** Date in UTC format indicating when the last crawl was attempted. If `null`, no crawl was completed. */
  var last_updated: js.UndefOr[String] = js.native
  
  /** The current status of the source crawl for this collection. This field returns `not_configured` if the default configuration for this source does not have a **source** object defined. -  `running` indicates that a crawl to fetch more documents is in progress. -  `complete` indicates that the crawl has completed with no errors. -  `queued` indicates that the crawl has been paused by the system and will automatically restart when possible. */
  var status: js.UndefOr[String] = js.native
}
object SourceStatus {
  
  @scala.inline
  def apply(): SourceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceStatus]
  }
  
  @scala.inline
  implicit class SourceStatusMutableBuilder[Self <: SourceStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLast_updated(value: String): Self = StObject.set(x, "last_updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_updatedUndefined: Self = StObject.set(x, "last_updated", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
