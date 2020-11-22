package typingsSlinky.vueNiceDates

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.vue.vueMod.Vue
import typingsSlinky.vue.vueMod.VueConstructor
import typingsSlinky.vueNiceDates.anon.HandleClickDate
import typingsSlinky.vueNiceDates.anon.OmitDatePickerPropsisFocu
import typingsSlinky.vueNiceDates.anon.ReceivedDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-nice-dates/DatePickerCalendar", JSImport.Namespace)
@js.native
object datePickerCalendarMod extends js.Object {
  
  @js.native
  trait DatePickerCalendar extends VueConstructor[Vue] {
    
    def date(): ReceivedDate = js.native
    
    var methods: HandleClickDate = js.native
    
    var props: OmitDatePickerPropsisFocu = js.native
    
    var watch: StringDictionary[js.Function1[/* date */ js.Date, Unit]] = js.native
  }
  @js.native
  object DatePickerCalendar extends TopLevel[DatePickerCalendar]
}
