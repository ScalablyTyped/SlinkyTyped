package typingsSlinky.testingLibraryVue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ConfigurationCallback[V /* <: typingsSlinky.vue.vueMod.Vue */] = js.Function3[
    /* localVue */ typingsSlinky.vue.vueMod.VueConstructor[typingsSlinky.vue.vueMod.Vue], 
    /* store */ typingsSlinky.vuex.mod.Store[js.Any], 
    /* router */ typingsSlinky.vueRouter.mod.default, 
    (typingsSlinky.std.Partial[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThisTypedMountOptions<V> */ js.Any
    ]) | scala.Unit
  ]
}
