package typingsSlinky.slateReact

import typingsSlinky.slate.mod.Controller
import typingsSlinky.slate.mod.Document
import typingsSlinky.slate.mod.RangeType
import typingsSlinky.slate.mod.RangeTypeJSON
import typingsSlinky.slate.mod.RangeTypeProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallRangeFragment extends js.Object {
  def apply(range: RangeTypeJSON, fragment: Document): Controller = js.native
  def apply(range: RangeTypeProperties, fragment: Document): Controller = js.native
  def apply(range: RangeType, fragment: Document): Controller = js.native
}

