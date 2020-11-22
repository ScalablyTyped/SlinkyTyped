package typingsSlinky.vueNiceDates

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.vue.vueMod.Vue
import typingsSlinky.vue.vueMod.VueConstructor
import typingsSlinky.vueNiceDates.anon.Date
import typingsSlinky.vueNiceDates.anon.GetGridType
import typingsSlinky.vueNiceDates.anon.GridType
import typingsSlinky.vueNiceDates.anon.MergedModifiers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-nice-dates/Calendar", JSImport.Namespace)
@js.native
object calendarMod extends js.Object {
  
  @js.native
  trait Calendar extends VueConstructor[Vue] {
    
    var computed: MergedModifiers = js.native
    
    def data(): GridType = js.native
    
    var methods: GetGridType = js.native
    
    var props: Date = js.native
    
    var watch: StringDictionary[
        js.Function2[/* newValue */ js.Date | String, /* oldValue */ js.Date | String, Unit]
      ] = js.native
  }
  @js.native
  object Calendar extends TopLevel[Calendar]
}
