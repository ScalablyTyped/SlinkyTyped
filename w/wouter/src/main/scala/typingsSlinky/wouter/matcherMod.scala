package typingsSlinky.wouter

import typingsSlinky.wouter.wouterMod.MatcherFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wouter/matcher", JSImport.Namespace)
@js.native
object matcherMod extends js.Object {
  def default(): MatcherFn = js.native
  def default(
    makeRegexpFn: js.Function2[/* pattern */ String, /* keys */ js.UndefOr[js.Array[Anon_Name]], js.RegExp]
  ): MatcherFn = js.native
}

