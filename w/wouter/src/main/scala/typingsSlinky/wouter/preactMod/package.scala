package typingsSlinky.wouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object preactMod {
  type DefaultParams = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type LinkProps = typingsSlinky.wouter.anon.OmitHTMLAttributesEventTa with typingsSlinky.wouter.preactMod.NavigationalProps
  type LocationHook = js.Function1[
    /* options */ js.UndefOr[typingsSlinky.wouter.preactMod.LocationHookOptions], 
    typingsSlinky.wouter.preactMod.LocationTuple
  ]
  type LocationTuple = js.Tuple2[typingsSlinky.wouter.preactMod.Path, typingsSlinky.wouter.preactMod.PushCallback]
  type MatchWithParams[T /* <: typingsSlinky.wouter.preactMod.DefaultParams */] = js.Tuple2[
    typingsSlinky.wouter.wouterBooleans.`true`, 
    typingsSlinky.wouter.preactMod.Params[T]
  ]
  type MatcherFn = js.Function2[
    /* pattern */ typingsSlinky.wouter.preactMod.Path, 
    /* path */ typingsSlinky.wouter.preactMod.Path, 
    typingsSlinky.wouter.preactMod.Match[typingsSlinky.wouter.preactMod.DefaultParams]
  ]
  type NoMatch = js.Tuple2[typingsSlinky.wouter.wouterBooleans.`false`, scala.Null]
  type Params[T /* <: typingsSlinky.wouter.preactMod.DefaultParams */] = T
  type Path = java.lang.String
  type PushCallback = js.Function2[
    /* to */ typingsSlinky.wouter.preactMod.Path, 
    /* replace */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  type RedirectProps = typingsSlinky.wouter.preactMod.NavigationalProps with js.Object
}
