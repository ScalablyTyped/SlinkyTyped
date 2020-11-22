package typingsSlinky.vueNiceDates

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.vue.vueMod.Vue
import typingsSlinky.vue.vueMod.VueConstructor
import typingsSlinky.vueNiceDates.anon.ChangeLastValidEndDate
import typingsSlinky.vueNiceDates.anon.EndDate
import typingsSlinky.vueNiceDates.anon.HasTouchedEndDate
import typingsSlinky.vueNiceDates.sharedMod.DateRangePickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-nice-dates/DateRangePicker", JSImport.Namespace)
@js.native
object dateRangePickerMod extends js.Object {
  
  @js.native
  trait DateRangePicker extends VueConstructor[Vue] {
    
    def date(): HasTouchedEndDate = js.native
    
    var methods: ChangeLastValidEndDate = js.native
    
    var props: DateRangePickerProps = js.native
    
    var watch: EndDate = js.native
  }
  @js.native
  object DateRangePicker extends TopLevel[DateRangePicker]
}
