package typingsSlinky.slateDashReact

import typingsSlinky.slate.slateMod.Document
import typingsSlinky.slate.slateMod.Editor
import typingsSlinky.slate.slateMod.RangeType
import typingsSlinky.slate.slateMod.RangeTypeJSON
import typingsSlinky.slate.slateMod.RangeTypeProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_FragmentRange extends js.Object {
  def apply(range: RangeTypeJSON, fragment: Document): Editor = js.native
  def apply(range: RangeTypeProperties, fragment: Document): Editor = js.native
  def apply(range: RangeType, fragment: Document): Editor = js.native
}

