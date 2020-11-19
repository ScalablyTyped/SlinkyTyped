package typingsSlinky.universalRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object universalRouterSyncMod {
  
  type ErrorHandler[R] = js.Function2[
    /* error */ typingsSlinky.universalRouter.universalRouterSyncMod.RouteError, 
    /* context */ typingsSlinky.universalRouter.universalRouterSyncMod.ResolveContext, 
    typingsSlinky.universalRouter.universalRouterSyncMod.RouteResultSync[R]
  ]
  
  type ResolveRoute[R, C /* <: typingsSlinky.universalRouter.universalRouterSyncMod.RouterContext */] = js.Function2[
    /* context */ typingsSlinky.universalRouter.universalRouterSyncMod.RouteContext[R, C], 
    /* params */ typingsSlinky.universalRouter.universalRouterSyncMod.RouteParams, 
    typingsSlinky.universalRouter.universalRouterSyncMod.RouteResultSync[R]
  ]
  
  type RouteParams = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  
  type RouteResultSync[T] = js.UndefOr[T | scala.Null]
  
  type RouterContext = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type Routes[R, C /* <: typingsSlinky.universalRouter.universalRouterSyncMod.RouterContext */] = js.Array[typingsSlinky.universalRouter.universalRouterSyncMod.Route[R, C]]
}
