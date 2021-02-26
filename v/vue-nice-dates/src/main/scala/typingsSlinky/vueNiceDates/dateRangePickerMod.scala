package typingsSlinky.vueNiceDates

import typingsSlinky.vue.vueMod.Vue
import typingsSlinky.vue.vueMod.VueConstructor
import typingsSlinky.vueNiceDates.anon.ChangeLastValidEndDate
import typingsSlinky.vueNiceDates.anon.EndDate
import typingsSlinky.vueNiceDates.anon.HasTouchedEndDate
import typingsSlinky.vueNiceDates.sharedMod.DateRangePickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateRangePickerMod {
  
  @js.native
  trait DateRangePicker extends VueConstructor[Vue] {
    
    def date(): HasTouchedEndDate = js.native
    
    var methods: ChangeLastValidEndDate = js.native
    
    var props: DateRangePickerProps = js.native
    
    var watch: EndDate = js.native
  }
  @JSImport("vue-nice-dates/DateRangePicker", "DateRangePicker")
  @js.native
  val DateRangePicker: typingsSlinky.vueNiceDates.dateRangePickerMod.DateRangePicker = js.native
}
