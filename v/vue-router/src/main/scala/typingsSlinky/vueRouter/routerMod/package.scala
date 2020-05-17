package typingsSlinky.vueRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object routerMod {
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  type ErrorHandler = js.Function1[/* err */ js.Error, scala.Unit]
  type NavigationGuard[V /* <: typingsSlinky.vue.vueMod.Vue */] = js.Function3[
    /* to */ typingsSlinky.vueRouter.routerMod.Route, 
    /* from */ typingsSlinky.vueRouter.routerMod.Route, 
    /* next */ js.Function1[
      /* to */ js.UndefOr[
        typingsSlinky.vueRouter.routerMod.RawLocation | typingsSlinky.vueRouter.vueRouterBooleans.`false` | (js.Function1[/* vm */ V, js.Any]) | scala.Unit
      ], 
      scala.Unit
    ], 
    js.Any
  ]
  type RoutePropsFunction = js.Function1[/* route */ typingsSlinky.vueRouter.routerMod.Route, js.Object]
}
