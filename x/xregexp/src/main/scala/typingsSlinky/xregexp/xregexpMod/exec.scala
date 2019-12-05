package typingsSlinky.xregexp.xregexpMod

import typingsSlinky.std.RegExpExecArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xregexp", "exec")
@js.native
object exec extends js.Object {
  def apply(str: String, regex: js.RegExp): RegExpExecArray = js.native
  def apply(str: String, regex: js.RegExp, pos: Double): RegExpExecArray = js.native
  def apply(str: String, regex: js.RegExp, pos: Double, sticky: Boolean): RegExpExecArray = js.native
}

