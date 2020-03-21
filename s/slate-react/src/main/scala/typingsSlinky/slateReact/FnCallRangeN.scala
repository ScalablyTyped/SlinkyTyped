package typingsSlinky.slateReact

import typingsSlinky.slate.mod.Controller
import typingsSlinky.slate.mod.RangeType
import typingsSlinky.slate.mod.RangeTypeJSON
import typingsSlinky.slate.mod.RangeTypeProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallRangeN extends js.Object {
  def apply(range: RangeType): Controller = js.native
  def apply(range: RangeTypeJSON): Controller = js.native
  def apply(range: RangeTypeJSON, n: Double): Controller = js.native
  def apply(range: RangeTypeProperties): Controller = js.native
  def apply(range: RangeTypeProperties, n: Double): Controller = js.native
  def apply(range: RangeType, n: Double): Controller = js.native
}

