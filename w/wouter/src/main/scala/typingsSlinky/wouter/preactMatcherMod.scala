package typingsSlinky.wouter

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.wouter.anon.Name
import typingsSlinky.wouter.useLocationMod.Path
import typingsSlinky.wouter.wouterBooleans.`false`
import typingsSlinky.wouter.wouterBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object preactMatcherMod {
  
  @JSImport("wouter/preact/matcher", JSImport.Default)
  @js.native
  def default(): MatcherFn = js.native
  @JSImport("wouter/preact/matcher", JSImport.Default)
  @js.native
  def default(makeRegexpFn: js.Function2[/* pattern */ String, /* keys */ js.UndefOr[js.Array[Name]], js.RegExp]): MatcherFn = js.native
  
  type DefaultParams = StringDictionary[String]
  
  type Match[T /* <: DefaultParams */] = MatchWithParams[T] | NoMatch
  
  type MatchWithParams[T /* <: DefaultParams */] = js.Tuple2[`true`, Params[T]]
  
  type MatcherFn = js.Function2[/* pattern */ Path, /* path */ Path, Match[DefaultParams]]
  
  type NoMatch = js.Tuple2[`false`, Null]
  
  type Params[T /* <: DefaultParams */] = T
}
