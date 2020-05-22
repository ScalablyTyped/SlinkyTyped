package typingsSlinky.universalRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Context = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ErrorHandler[C /* <: typingsSlinky.universalRouter.mod.Context */, R] = js.Function2[
    /* error */ typingsSlinky.universalRouter.anon.Errorstatusnumber, 
    /* context */ C with (typingsSlinky.universalRouter.mod.RouteContext[C, R]), 
    typingsSlinky.universalRouter.mod.Result[R]
  ]
  type QueryParams = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  type ResolveRoute[C /* <: typingsSlinky.universalRouter.mod.Context */, R] = js.Function2[
    /* context */ C with (typingsSlinky.universalRouter.mod.RouteContext[C, R]), 
    /* params */ typingsSlinky.universalRouter.mod.QueryParams, 
    typingsSlinky.universalRouter.mod.Result[R]
  ]
  type Result[T] = T | (js.Promise[T | scala.Unit]) | scala.Unit
  type Routes[C /* <: typingsSlinky.universalRouter.mod.Context */, R] = js.Array[typingsSlinky.universalRouter.mod.Route[C, R]]
}
