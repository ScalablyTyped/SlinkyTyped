package typingsSlinky.testingLibraryVue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ConfigurationCallback[V /* <: typingsSlinky.vue.vueMod.Vue */] = js.Function3[
    /* localVue */ typingsSlinky.vue.vueMod.VueConstructor[typingsSlinky.vue.vueMod.Vue], 
    /* store */ typingsSlinky.vuex.mod.Store[js.Any], 
    /* router */ typingsSlinky.vueRouter.mod.default, 
    typingsSlinky.std.Partial[typingsSlinky.vueTestUtils.mod.ThisTypedMountOptions[V]] | scala.Unit
  ]
}
