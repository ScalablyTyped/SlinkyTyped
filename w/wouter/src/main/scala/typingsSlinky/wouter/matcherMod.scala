package typingsSlinky.wouter

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.wouter.anon.Name
import typingsSlinky.wouter.wouterBooleans.`false`
import typingsSlinky.wouter.wouterBooleans.`true`
import typingsSlinky.wouter.wouterUseLocationMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wouter/matcher", JSImport.Namespace)
@js.native
object matcherMod extends js.Object {
  def default(): MatcherFn = js.native
  def default(makeRegexpFn: js.Function2[/* pattern */ String, /* keys */ js.UndefOr[js.Array[Name]], js.RegExp]): MatcherFn = js.native
  type DefaultParams = StringDictionary[String]
  type Match[T /* <: DefaultParams */] = MatchWithParams[T] | NoMatch
  type MatchWithParams[T /* <: DefaultParams */] = js.Tuple2[`true`, Params[T]]
  type MatcherFn = js.Function2[/* pattern */ Path, /* path */ Path, Match[DefaultParams]]
  type NoMatch = js.Tuple2[`false`, Null]
  type Params[T /* <: DefaultParams */] = T
}

