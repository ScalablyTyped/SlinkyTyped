package typingsSlinky.std.global

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.RegExpConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("RegExp")
@js.native
class RegExp protected ()
  extends typingsSlinky.std.RegExp {
  def this(pattern: java.lang.String) = this()
  def this(pattern: js.RegExp) = this()
  def this(pattern: java.lang.String, flags: java.lang.String) = this()
  def this(pattern: js.RegExp, flags: java.lang.String) = this()
}

@JSGlobal("RegExp")
@js.native
object RegExp extends TopLevel[RegExpConstructor]

