package typingsSlinky.vueNiceDates.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayedEndDate extends StObject {
  
  var displayedEndDate: String | js.Date | Null = js.native
  
  var displayedStartDate: String | js.Date | Null = js.native
  
  var mergedModifiers: StringDictionary[js.Function2[/* date */ js.Date, /* type */ String, Boolean]] = js.native
  
  var receivedDate: String | js.Date | Null = js.native
}
object DisplayedEndDate {
  
  @scala.inline
  def apply(mergedModifiers: StringDictionary[js.Function2[/* date */ js.Date, /* type */ String, Boolean]]): DisplayedEndDate = {
    val __obj = js.Dynamic.literal(mergedModifiers = mergedModifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayedEndDate]
  }
  
  @scala.inline
  implicit class DisplayedEndDateMutableBuilder[Self <: DisplayedEndDate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayedEndDate(value: String | js.Date): Self = StObject.set(x, "displayedEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayedEndDateDate(value: js.Date): Self = StObject.set(x, "displayedEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayedEndDateNull: Self = StObject.set(x, "displayedEndDate", null)
    
    @scala.inline
    def setDisplayedStartDate(value: String | js.Date): Self = StObject.set(x, "displayedStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayedStartDateDate(value: js.Date): Self = StObject.set(x, "displayedStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayedStartDateNull: Self = StObject.set(x, "displayedStartDate", null)
    
    @scala.inline
    def setMergedModifiers(value: StringDictionary[js.Function2[/* date */ js.Date, /* type */ String, Boolean]]): Self = StObject.set(x, "mergedModifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedDate(value: String | js.Date): Self = StObject.set(x, "receivedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedDateDate(value: js.Date): Self = StObject.set(x, "receivedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedDateNull: Self = StObject.set(x, "receivedDate", null)
  }
}
