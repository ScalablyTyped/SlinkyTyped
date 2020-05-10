package typingsSlinky.xregexp.mod

import typingsSlinky.xregexp.xregexpStrings.sticky
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xregexp", "exec")
@js.native
object exec_sticky extends js.Object {
  def apply(str: String, regex: js.RegExp, pos: Double, sticky: sticky): ExecArray | Null = js.native
}

