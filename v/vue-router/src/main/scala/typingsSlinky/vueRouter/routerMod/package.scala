package typingsSlinky.vueRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object routerMod {
  
  type Component = (typingsSlinky.vue.optionsMod.ComponentOptions[
    typingsSlinky.vue.vueMod.Vue, 
    typingsSlinky.vue.optionsMod.DefaultData[typingsSlinky.vue.vueMod.Vue], 
    typingsSlinky.vue.optionsMod.DefaultMethods[typingsSlinky.vue.vueMod.Vue], 
    typingsSlinky.vue.optionsMod.DefaultComputed, 
    typingsSlinky.vue.optionsMod.PropsDefinition[typingsSlinky.vue.optionsMod.DefaultProps], 
    typingsSlinky.vue.optionsMod.DefaultProps
  ]) | typingsSlinky.vue.vueMod.VueConstructor[typingsSlinky.vue.vueMod.Vue] | (typingsSlinky.vue.optionsMod.AsyncComponent[
    typingsSlinky.vue.optionsMod.DefaultData[scala.Nothing], 
    typingsSlinky.vue.optionsMod.DefaultMethods[scala.Nothing], 
    typingsSlinky.vue.optionsMod.DefaultComputed, 
    typingsSlinky.vue.optionsMod.DefaultProps
  ])
  
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  
  type ErrorHandler = js.Function1[/* err */ js.Error, scala.Unit]
  
  type NavigationGuard[V /* <: typingsSlinky.vue.vueMod.Vue */] = js.Function3[
    /* to */ typingsSlinky.vueRouter.routerMod.Route, 
    /* from */ typingsSlinky.vueRouter.routerMod.Route, 
    /* next */ typingsSlinky.vueRouter.routerMod.NavigationGuardNext[V], 
    js.Any
  ]
  
  type NavigationGuardNext[V /* <: typingsSlinky.vue.vueMod.Vue */] = js.Function1[
    /* to */ js.UndefOr[
      typingsSlinky.vueRouter.routerMod.RawLocation | typingsSlinky.vueRouter.vueRouterBooleans.`false` | (js.Function1[/* vm */ V, js.Any]) | scala.Unit
    ], 
    scala.Unit
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vueRouter.routerMod.Position
    - typingsSlinky.vueRouter.anon.Offset
    - scala.Unit
  */
  type PositionResult = typingsSlinky.vueRouter.routerMod._PositionResult | scala.Unit
  
  type RawLocation = java.lang.String | typingsSlinky.vueRouter.routerMod.Location
  
  type RedirectOption = typingsSlinky.vueRouter.routerMod.RawLocation | (js.Function1[
    /* to */ typingsSlinky.vueRouter.routerMod.Route, 
    typingsSlinky.vueRouter.routerMod.RawLocation
  ])
  
  type RoutePropsFunction = js.Function1[/* route */ typingsSlinky.vueRouter.routerMod.Route, js.Object]
}
