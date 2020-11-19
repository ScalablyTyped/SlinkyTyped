package typingsSlinky.vue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object vueMod {
  
  type CombinedVueInstance[Instance /* <: typingsSlinky.vue.vueMod.Vue */, Data, Methods, Computed, Props] = Data with Methods with Computed with Props with Instance
  
  type ExtendedVue[Instance /* <: typingsSlinky.vue.vueMod.Vue */, Data, Methods, Computed, Props] = typingsSlinky.vue.vueMod.VueConstructor[
    (typingsSlinky.vue.vueMod.CombinedVueInstance[Instance, Data, Methods, Computed, Props]) with typingsSlinky.vue.vueMod.Vue
  ]
}
