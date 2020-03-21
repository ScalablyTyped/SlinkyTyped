package typingsSlinky.wouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DefaultParams = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type LinkProps = typingsSlinky.wouter.OmitAnchorHTMLAttributesH with typingsSlinky.wouter.mod.NavigationalProps
  type LocationHook = js.Function1[
    /* options */ js.UndefOr[typingsSlinky.wouter.mod.LocationHookOptions], 
    typingsSlinky.wouter.mod.LocationTuple
  ]
  type LocationTuple = js.Tuple2[typingsSlinky.wouter.mod.Path, typingsSlinky.wouter.mod.PushCallback]
  type Match[T /* <: typingsSlinky.wouter.mod.DefaultParams */] = typingsSlinky.wouter.mod.MatchWithParams[T] | typingsSlinky.wouter.mod.NoMatch
  type MatchWithParams[T /* <: typingsSlinky.wouter.mod.DefaultParams */] = js.Tuple2[typingsSlinky.wouter.wouterBooleans.`true`, typingsSlinky.wouter.mod.Params[T]]
  type MatcherFn = js.Function2[
    /* pattern */ typingsSlinky.wouter.mod.Path, 
    /* path */ typingsSlinky.wouter.mod.Path, 
    typingsSlinky.wouter.mod.Match[typingsSlinky.wouter.mod.DefaultParams]
  ]
  type NoMatch = js.Tuple2[typingsSlinky.wouter.wouterBooleans.`false`, scala.Null]
  type Params[T /* <: typingsSlinky.wouter.mod.DefaultParams */] = T
  type Path = java.lang.String
  type PushCallback = js.Function2[
    /* to */ typingsSlinky.wouter.mod.Path, 
    /* replace */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  type RedirectProps = typingsSlinky.wouter.mod.NavigationalProps with js.Object
}
