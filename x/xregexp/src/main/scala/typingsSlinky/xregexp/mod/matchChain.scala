package typingsSlinky.xregexp.mod

import typingsSlinky.xregexp.AnonBackref
import typingsSlinky.xregexp.AnonRegex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xregexp", "matchChain")
@js.native
object matchChain extends js.Object {
  def apply(str: String, chain: js.Array[AnonBackref | AnonRegex | js.RegExp]): js.Array[String] = js.native
}

