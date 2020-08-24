package typingsSlinky.universalRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ErrorHandler[R] = js.Function2[
    /* error */ typingsSlinky.universalRouter.mod.RouteError, 
    /* context */ typingsSlinky.universalRouter.mod.ResolveContext, 
    typingsSlinky.universalRouter.mod.RouteResult[R]
  ]
  type ResolveRoute[R, C /* <: typingsSlinky.universalRouter.mod.RouterContext */] = js.Function2[
    /* context */ typingsSlinky.universalRouter.mod.RouteContext[R, C], 
    /* params */ typingsSlinky.universalRouter.mod.RouteParams, 
    typingsSlinky.universalRouter.mod.RouteResult[R]
  ]
  type RouteParams = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  type RouteResult[T] = js.UndefOr[T | scala.Null | (js.Promise[js.UndefOr[T | scala.Null]])]
  type RouterContext = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Routes[R, C /* <: typingsSlinky.universalRouter.mod.RouterContext */] = js.Array[typingsSlinky.universalRouter.mod.Route[R, C]]
}
