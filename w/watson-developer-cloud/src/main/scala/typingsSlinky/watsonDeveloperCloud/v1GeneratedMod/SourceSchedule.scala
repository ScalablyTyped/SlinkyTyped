package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Object containing the schedule information for the source. */
@js.native
trait SourceSchedule extends StObject {
  
  /** When `true`, the source is re-crawled based on the **frequency** field in this object. When `false` the source is not re-crawled; When `false` and connecting to Salesforce the source is crawled annually. */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** The crawl schedule in the specified **time_zone**. -  `daily`: Runs every day between 00:00 and 06:00. -  `weekly`: Runs every week on Sunday between 00:00 and 06:00. -  `monthly`: Runs the on the first Sunday of every month between 00:00 and 06:00. */
  var frequency: js.UndefOr[String] = js.native
  
  /** The time zone to base source crawl times on. Possible values correspond to the IANA (Internet Assigned Numbers Authority) time zones list. */
  var time_zone: js.UndefOr[String] = js.native
}
object SourceSchedule {
  
  @scala.inline
  def apply(): SourceSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceSchedule]
  }
  
  @scala.inline
  implicit class SourceScheduleMutableBuilder[Self <: SourceSchedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setFrequency(value: String): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    @scala.inline
    def setTime_zone(value: String): Self = StObject.set(x, "time_zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime_zoneUndefined: Self = StObject.set(x, "time_zone", js.undefined)
  }
}
