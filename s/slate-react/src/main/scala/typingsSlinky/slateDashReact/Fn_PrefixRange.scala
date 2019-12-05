package typingsSlinky.slateDashReact

import typingsSlinky.slate.slateMod.Editor
import typingsSlinky.slate.slateMod.RangeType
import typingsSlinky.slate.slateMod.RangeTypeJSON
import typingsSlinky.slate.slateMod.RangeTypeProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_PrefixRange extends js.Object {
  def apply(range: RangeTypeJSON, prefix: String): Editor = js.native
  def apply(range: RangeTypeJSON, prefix: String, suffix: String): Editor = js.native
  def apply(range: RangeTypeProperties, prefix: String): Editor = js.native
  def apply(range: RangeTypeProperties, prefix: String, suffix: String): Editor = js.native
  def apply(range: RangeType, prefix: String): Editor = js.native
  def apply(range: RangeType, prefix: String, suffix: String): Editor = js.native
}

