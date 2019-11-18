package typingsSlinky.vue

import typingsSlinky.vue.typesOptionsMod.AsyncComponentPromise
import typingsSlinky.vue.typesOptionsMod.Component
import typingsSlinky.vue.typesOptionsMod.DefaultComputed
import typingsSlinky.vue.typesOptionsMod.DefaultData
import typingsSlinky.vue.typesOptionsMod.DefaultMethods
import typingsSlinky.vue.typesOptionsMod.DefaultProps
import typingsSlinky.vue.typesOptionsMod.EsModuleComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Component[Data, Methods, Computed, Props] extends js.Object {
  @JSName("component")
  var component_Original: AsyncComponentPromise[Data, Methods, Computed, Props] = js.native
  var delay: js.UndefOr[Double] = js.native
  var error: js.UndefOr[
    (Component[
      DefaultData[scala.Nothing], 
      DefaultMethods[scala.Nothing], 
      DefaultComputed, 
      DefaultProps
    ]) | EsModuleComponent
  ] = js.native
  var loading: js.UndefOr[
    (Component[
      DefaultData[scala.Nothing], 
      DefaultMethods[scala.Nothing], 
      DefaultComputed, 
      DefaultProps
    ]) | EsModuleComponent
  ] = js.native
  var timeout: js.UndefOr[Double] = js.native
  def component(
    resolve: js.Function1[/* component */ Component[Data, Methods, Computed, Props], Unit],
    reject: js.Function1[/* reason */ js.UndefOr[js.Any], Unit]
  ): (js.Promise[
    (Component[
      DefaultData[scala.Nothing], 
      DefaultMethods[scala.Nothing], 
      DefaultComputed, 
      DefaultProps
    ]) | EsModuleComponent
  ]) | Unit = js.native
}

