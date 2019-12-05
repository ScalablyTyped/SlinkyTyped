package typingsSlinky.slateDashReact

import typingsSlinky.slate.slateMod.Editor
import typingsSlinky.slate.slateMod.Mark
import typingsSlinky.slate.slateMod.MarkJSON
import typingsSlinky.slate.slateMod.MarkProperties
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_MarkArray extends js.Object {
  def apply(mark: js.Array[String | MarkProperties | MarkJSON | Mark]): Editor = js.native
  def apply(mark: Set[String | MarkProperties | MarkJSON | Mark]): Editor = js.native
}

