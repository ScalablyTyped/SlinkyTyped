package typingsSlinky.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Analytics {
  
  @JSGlobal("SP.Analytics.AnalyticsUsageEntry")
  @js.native
  class AnalyticsUsageEntry ()
    extends typingsSlinky.sharepoint.SP.ClientObject
  object AnalyticsUsageEntry {
    
    /* static member */
    @JSGlobal("SP.Analytics.AnalyticsUsageEntry.logAnalyticsAppEvent")
    @js.native
    def logAnalyticsAppEvent(
      context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
      appEventTypeId: typingsSlinky.sharepoint.SP.Guid,
      itemId: String
    ): Unit = js.native
    
    /* static member */
    @JSGlobal("SP.Analytics.AnalyticsUsageEntry.logAnalyticsAppEvent2")
    @js.native
    def logAnalyticsAppEvent2(
      context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
      appEventTypeId: typingsSlinky.sharepoint.SP.Guid,
      itemId: String,
      rollupScopeId: typingsSlinky.sharepoint.SP.Guid,
      siteId: typingsSlinky.sharepoint.SP.Guid,
      userId: String
    ): Unit = js.native
    
    /* static member */
    @JSGlobal("SP.Analytics.AnalyticsUsageEntry.logAnalyticsEvent")
    @js.native
    def logAnalyticsEvent(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, eventTypeId: Double, itemId: String): Unit = js.native
    
    /* static member */
    @JSGlobal("SP.Analytics.AnalyticsUsageEntry.logAnalyticsEvent2")
    @js.native
    def logAnalyticsEvent2(
      context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
      eventTypeId: Double,
      itemId: String,
      rollupScopeId: typingsSlinky.sharepoint.SP.Guid,
      siteId: typingsSlinky.sharepoint.SP.Guid,
      userId: String
    ): Unit = js.native
  }
  
  @JSGlobal("SP.Analytics.EventTypeId")
  @js.native
  object EventTypeId extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SP.Analytics.EventTypeId with Double] = js.native
    
    /* 1 */ val first: typingsSlinky.sharepoint.SP.Analytics.EventTypeId.first with Double = js.native
    
    /* 5 */ val last: typingsSlinky.sharepoint.SP.Analytics.EventTypeId.last with Double = js.native
    
    /* 0 */ val none: typingsSlinky.sharepoint.SP.Analytics.EventTypeId.none with Double = js.native
    
    /* 4 */ val recommendationClick: typingsSlinky.sharepoint.SP.Analytics.EventTypeId.recommendationClick with Double = js.native
    
    /* 3 */ val recommendationView: typingsSlinky.sharepoint.SP.Analytics.EventTypeId.recommendationView with Double = js.native
    
    /* 2 */ val view: typingsSlinky.sharepoint.SP.Analytics.EventTypeId.view with Double = js.native
  }
}
