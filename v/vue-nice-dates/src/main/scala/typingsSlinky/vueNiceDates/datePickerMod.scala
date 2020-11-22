package typingsSlinky.vueNiceDates

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.vue.vueMod.Vue
import typingsSlinky.vue.vueMod.VueConstructor
import typingsSlinky.vueNiceDates.anon.ChangeLastValidDate
import typingsSlinky.vueNiceDates.anon.IsFocus
import typingsSlinky.vueNiceDates.anon.LastValidDate
import typingsSlinky.vueNiceDates.sharedMod.DatePickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-nice-dates/DatePicker", JSImport.Namespace)
@js.native
object datePickerMod extends js.Object {
  
  @js.native
  trait DatePicker extends VueConstructor[Vue] {
    
    def date(): LastValidDate = js.native
    
    var methods: ChangeLastValidDate = js.native
    
    var props: DatePickerProps = js.native
    
    var watch: IsFocus = js.native
  }
  @js.native
  object DatePicker extends TopLevel[DatePicker]
}
