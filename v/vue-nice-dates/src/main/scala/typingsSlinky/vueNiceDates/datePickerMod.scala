package typingsSlinky.vueNiceDates

import typingsSlinky.vue.vueMod.Vue
import typingsSlinky.vue.vueMod.VueConstructor
import typingsSlinky.vueNiceDates.anon.ChangeLastValidDate
import typingsSlinky.vueNiceDates.anon.IsFocus
import typingsSlinky.vueNiceDates.anon.LastValidDate
import typingsSlinky.vueNiceDates.sharedMod.DatePickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerMod {
  
  @js.native
  trait DatePicker extends VueConstructor[Vue] {
    
    def date(): LastValidDate = js.native
    
    var methods: ChangeLastValidDate = js.native
    
    var props: DatePickerProps = js.native
    
    var watch: IsFocus = js.native
  }
  @JSImport("vue-nice-dates/DatePicker", "DatePicker")
  @js.native
  val DatePicker: typingsSlinky.vueNiceDates.datePickerMod.DatePicker = js.native
}
