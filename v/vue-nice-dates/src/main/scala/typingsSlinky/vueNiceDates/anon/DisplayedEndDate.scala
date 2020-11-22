package typingsSlinky.vueNiceDates.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayedEndDate extends js.Object {
  
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
  implicit class DisplayedEndDateOps[Self <: DisplayedEndDate] (val x: Self) extends AnyVal {
    
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
    def setMergedModifiers(value: StringDictionary[js.Function2[/* date */ js.Date, /* type */ String, Boolean]]): Self = this.set("mergedModifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayedEndDateDate(value: js.Date): Self = this.set("displayedEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayedEndDate(value: String | js.Date): Self = this.set("displayedEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayedEndDateNull: Self = this.set("displayedEndDate", null)
    
    @scala.inline
    def setDisplayedStartDateDate(value: js.Date): Self = this.set("displayedStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayedStartDate(value: String | js.Date): Self = this.set("displayedStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayedStartDateNull: Self = this.set("displayedStartDate", null)
    
    @scala.inline
    def setReceivedDateDate(value: js.Date): Self = this.set("receivedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedDate(value: String | js.Date): Self = this.set("receivedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedDateNull: Self = this.set("receivedDate", null)
  }
}
