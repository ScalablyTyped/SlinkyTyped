package typingsSlinky.xregexp.mod

import typingsSlinky.std.RegExpExecArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xregexp", "forEach")
@js.native
object forEach extends js.Object {
  def apply(
    str: String,
    regex: js.RegExp,
    callback: js.Function4[
      /* matchArr */ RegExpExecArray, 
      /* index */ Double, 
      /* input */ String, 
      /* regexp */ js.RegExp, 
      Unit
    ]
  ): js.Any = js.native
}

