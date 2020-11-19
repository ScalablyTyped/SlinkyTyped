package typingsSlinky.testingLibraryVue.mod

import typingsSlinky.vue.vueMod.Vue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@testing-library/vue", "render")
@js.native
object render extends js.Object {
  
  def apply[V /* <: Vue */](
    TestComponent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueClass<V> */ js.Any
  ): ComponentHarness = js.native
  def apply[V /* <: Vue */](
    TestComponent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueClass<V> */ js.Any,
    options: js.UndefOr[scala.Nothing],
    configure: ConfigurationCallback[V]
  ): ComponentHarness = js.native
  def apply[V /* <: Vue */](
    TestComponent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueClass<V> */ js.Any,
    options: RenderOptions[V, js.Object]
  ): ComponentHarness = js.native
  def apply[V /* <: Vue */](
    TestComponent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueClass<V> */ js.Any,
    options: RenderOptions[V, js.Object],
    configure: ConfigurationCallback[V]
  ): ComponentHarness = js.native
}
