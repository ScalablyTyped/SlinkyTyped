package typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search

import typingsSlinky.sharepoint.SP.ClientObject
import typingsSlinky.sharepoint.SP.Guid
import typingsSlinky.sharepoint.SP.ListItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**Located in sp.search.apps.js*/
object Analytics {
  
  @js.native
  trait AnalyticsItemData extends ClientObject {
    
    def getHitCountForDay(day: js.Date): Double = js.native
    
    def getHitCountForMonth(day: js.Date): Double = js.native
    
    def getUniqueUsersCountForDay(day: js.Date): Double = js.native
    
    def getUniqueUsersCountForMonth(day: js.Date): Double = js.native
    
    def get_lastProcessingTime(): js.Date = js.native
    
    def get_totalHits(): Double = js.native
    
    def get_totalUniqueUsers(): Double = js.native
  }
  
  @js.native
  trait UsageAnalytics extends ClientObject {
    
    def deleteCustomEventUsageData(appEventTypeId: Guid): Unit = js.native
    
    def deleteStandardEventUsageData(eventType: Double): Unit = js.native
    
    def getAnalyticsItemData[T](eventType: Double, listItem: ListItem[T]): AnalyticsItemData = js.native
    
    def getAnalyticsItemDataForApplicationEventType[T](appEventType: Guid, listItem: ListItem[T]): AnalyticsItemData = js.native
  }
}
