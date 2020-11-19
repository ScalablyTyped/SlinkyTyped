package typingsSlinky.vue.anon

import typingsSlinky.vue.optionsMod.AsyncComponentPromise
import typingsSlinky.vue.optionsMod.DefaultComputed
import typingsSlinky.vue.optionsMod.DefaultData
import typingsSlinky.vue.optionsMod.DefaultMethods
import typingsSlinky.vue.optionsMod.DefaultProps
import typingsSlinky.vue.optionsMod.EsModuleComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Component[Data, Methods, Computed, Props] extends js.Object {
  
  def component(
    resolve: js.Function1[
      /* component */ typingsSlinky.vue.optionsMod.Component[Data, Methods, Computed, Props], 
      Unit
    ],
    reject: js.Function1[/* reason */ js.UndefOr[js.Any], Unit]
  ): (js.Promise[
    (typingsSlinky.vue.optionsMod.Component[
      DefaultData[scala.Nothing], 
      DefaultMethods[scala.Nothing], 
      DefaultComputed, 
      DefaultProps
    ]) | EsModuleComponent
  ]) | Unit = js.native
  @JSName("component")
  var component_Original: AsyncComponentPromise[Data, Methods, Computed, Props] = js.native
  
  var delay: js.UndefOr[Double] = js.native
  
  var error: js.UndefOr[
    (typingsSlinky.vue.optionsMod.Component[
      DefaultData[scala.Nothing], 
      DefaultMethods[scala.Nothing], 
      DefaultComputed, 
      DefaultProps
    ]) | EsModuleComponent
  ] = js.native
  
  var loading: js.UndefOr[
    (typingsSlinky.vue.optionsMod.Component[
      DefaultData[scala.Nothing], 
      DefaultMethods[scala.Nothing], 
      DefaultComputed, 
      DefaultProps
    ]) | EsModuleComponent
  ] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
