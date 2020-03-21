package typingsSlinky.slateReact

import typingsSlinky.slate.mod.Block
import typingsSlinky.slate.mod.BlockJSON
import typingsSlinky.slate.mod.BlockProperties
import typingsSlinky.slate.mod.Controller
import typingsSlinky.slate.mod.RangeType
import typingsSlinky.slate.mod.RangeTypeJSON
import typingsSlinky.slate.mod.RangeTypeProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallRangeBlock extends js.Object {
  def apply(range: RangeTypeJSON, block: String): Controller = js.native
  def apply(range: RangeTypeJSON, block: Block): Controller = js.native
  def apply(range: RangeTypeJSON, block: BlockJSON): Controller = js.native
  def apply(range: RangeTypeJSON, block: BlockProperties): Controller = js.native
  def apply(range: RangeTypeProperties, block: String): Controller = js.native
  def apply(range: RangeTypeProperties, block: Block): Controller = js.native
  def apply(range: RangeTypeProperties, block: BlockJSON): Controller = js.native
  def apply(range: RangeTypeProperties, block: BlockProperties): Controller = js.native
  def apply(range: RangeType, block: String): Controller = js.native
  def apply(range: RangeType, block: Block): Controller = js.native
  def apply(range: RangeType, block: BlockJSON): Controller = js.native
  def apply(range: RangeType, block: BlockProperties): Controller = js.native
}

