package typingsSlinky.vueDashRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesRouterMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.vue.typesOptionsMod.AsyncComponent
  import typingsSlinky.vue.typesOptionsMod.ComponentOptions
  import typingsSlinky.vue.typesOptionsMod.DefaultComputed
  import typingsSlinky.vue.typesOptionsMod.DefaultData
  import typingsSlinky.vue.typesOptionsMod.DefaultMethods
  import typingsSlinky.vue.typesOptionsMod.DefaultProps
  import typingsSlinky.vue.typesOptionsMod.PropsDefinition
  import typingsSlinky.vue.typesVueMod.Vue
  import typingsSlinky.vue.typesVueMod.VueConstructor
  import typingsSlinky.vueDashRouter.vueDashRouterBooleans.`false`

  type Component = (ComponentOptions[
    Vue, 
    DefaultData[Vue], 
    DefaultMethods[Vue], 
    DefaultComputed, 
    PropsDefinition[DefaultProps], 
    DefaultProps
  ]) | VueConstructor[Vue] | (AsyncComponent[
    DefaultData[scala.Nothing], 
    DefaultMethods[scala.Nothing], 
    DefaultComputed, 
    DefaultProps
  ])
  type Dictionary[T] = StringDictionary[T]
  type ErrorHandler = js.Function1[/* err */ js.Error, Unit]
  type NavigationGuard[V /* <: Vue */] = js.Function3[
    /* to */ Route, 
    /* from */ Route, 
    /* next */ js.Function1[
      /* to */ js.UndefOr[RawLocation | `false` | (js.Function1[/* vm */ V, js.Any]) | Unit], 
      Unit
    ], 
    js.Any
  ]
  /* Rewritten from type alias, can be one of: 
    - typings.vueDashRouter.typesRouterMod.Position
    - typings.vueDashRouter.Anon_Offset
    - scala.Unit
  */
  type PositionResult = _PositionResult | Unit
  type RawLocation = String | Location
  type RedirectOption = RawLocation | (js.Function1[/* to */ Route, RawLocation])
  type RoutePropsFunction = js.Function1[/* route */ Route, js.Object]
}
