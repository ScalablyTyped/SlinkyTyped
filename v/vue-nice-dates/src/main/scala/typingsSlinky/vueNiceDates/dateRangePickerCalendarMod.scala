package typingsSlinky.vueNiceDates

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vue.vueMod.Vue
import typingsSlinky.vue.vueMod.VueConstructor
import typingsSlinky.vueNiceDates.anon.DisplayedEndDate
import typingsSlinky.vueNiceDates.anon.HandleMouseEnterDate
import typingsSlinky.vueNiceDates.anon.HoveredDate
import typingsSlinky.vueNiceDates.anon.OmitDateRangePickerPropsi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateRangePickerCalendarMod {
  
  @js.native
  trait DateRangePickerCalendar extends VueConstructor[Vue] {
    
    var computed: DisplayedEndDate = js.native
    
    def date(): HoveredDate = js.native
    
    var methods: HandleMouseEnterDate = js.native
    
    var props: OmitDateRangePickerPropsi = js.native
    
    var watch: StringDictionary[js.Function1[/* date */ String, Unit]] = js.native
  }
  @JSImport("vue-nice-dates/DateRangePickerCalendar", "DateRangePickerCalendar")
  @js.native
  val DateRangePickerCalendar: typingsSlinky.vueNiceDates.dateRangePickerCalendarMod.DateRangePickerCalendar = js.native
}
