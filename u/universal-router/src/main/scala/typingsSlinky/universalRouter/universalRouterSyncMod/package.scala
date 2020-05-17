package typingsSlinky.universalRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object universalRouterSyncMod {
  type Context = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ErrorHandler[C /* <: typingsSlinky.universalRouter.universalRouterSyncMod.Context */, R] = js.Function2[
    /* error */ typingsSlinky.universalRouter.anon.Errorstatusnumber, 
    /* context */ C with (typingsSlinky.universalRouter.universalRouterSyncMod.RouteContext[C, R]), 
    typingsSlinky.universalRouter.universalRouterSyncMod.Result[R]
  ]
  type QueryParams = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  type ResolveRoute[C /* <: typingsSlinky.universalRouter.universalRouterSyncMod.Context */, R] = js.Function2[
    /* context */ C with (typingsSlinky.universalRouter.universalRouterSyncMod.RouteContext[C, R]), 
    /* params */ typingsSlinky.universalRouter.universalRouterSyncMod.QueryParams, 
    typingsSlinky.universalRouter.universalRouterSyncMod.Result[R]
  ]
  type Routes[C /* <: typingsSlinky.universalRouter.universalRouterSyncMod.Context */, R] = js.Array[typingsSlinky.universalRouter.universalRouterSyncMod.Route[C, R]]
}
