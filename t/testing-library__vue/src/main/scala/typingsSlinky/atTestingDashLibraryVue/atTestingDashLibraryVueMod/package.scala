package typingsSlinky.atTestingDashLibraryVue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atTestingDashLibraryVueMod {
  import typingsSlinky.std.Partial
  import typingsSlinky.vue.typesVueMod.Vue
  import typingsSlinky.vueDashRouter.vueDashRouterMod.default
  import typingsSlinky.vuex.vuexMod.Store

  type AsyncFireObject = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in @testing-library/dom.@testing-library/dom/events.EventType ]: (element : std.Document | std.Element | std.Window, options? : {}): std.Promise<void>}
    */ typingsSlinky.atTestingDashLibraryVue.atTestingDashLibraryVueStrings.AsyncFireObject with js.Any
  type ConfigurationCallback[V /* <: Vue */] = js.Function3[
    /* vue */ V, 
    /* store */ Store[js.Any], 
    /* router */ default, 
    (Partial[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThisTypedMountOptions<V> */ js.Any
    ]) | Unit
  ]
}
