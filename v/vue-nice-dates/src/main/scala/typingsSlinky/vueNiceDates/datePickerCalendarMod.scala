package typingsSlinky.vueNiceDates

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vue.vueMod.Vue
import typingsSlinky.vue.vueMod.VueConstructor
import typingsSlinky.vueNiceDates.anon.HandleClickDate
import typingsSlinky.vueNiceDates.anon.OmitDatePickerPropsisFocu
import typingsSlinky.vueNiceDates.anon.ReceivedDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerCalendarMod {
  
  @js.native
  trait DatePickerCalendar extends VueConstructor[Vue] {
    
    def date(): ReceivedDate = js.native
    
    var methods: HandleClickDate = js.native
    
    var props: OmitDatePickerPropsisFocu = js.native
    
    var watch: StringDictionary[js.Function1[/* date */ js.Date, Unit]] = js.native
  }
  @JSImport("vue-nice-dates/DatePickerCalendar", "DatePickerCalendar")
  @js.native
  val DatePickerCalendar: typingsSlinky.vueNiceDates.datePickerCalendarMod.DatePickerCalendar = js.native
}
