package typingsSlinky.wouter.preactMod

import typingsSlinky.wouter.preactMatcherMod.DefaultParams
import typingsSlinky.wouter.preactMatcherMod.Match
import typingsSlinky.wouter.useLocationMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wouter/preact", "useRoute")
@js.native
object useRoute extends js.Object {
  def apply[T /* <: DefaultParams */](pattern: Path): Match[T] = js.native
}

