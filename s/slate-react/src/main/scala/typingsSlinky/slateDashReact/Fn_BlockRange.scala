package typingsSlinky.slateDashReact

import typingsSlinky.slate.slateMod.Block
import typingsSlinky.slate.slateMod.BlockJSON
import typingsSlinky.slate.slateMod.BlockProperties
import typingsSlinky.slate.slateMod.Editor
import typingsSlinky.slate.slateMod.RangeType
import typingsSlinky.slate.slateMod.RangeTypeJSON
import typingsSlinky.slate.slateMod.RangeTypeProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_BlockRange extends js.Object {
  def apply(range: RangeTypeJSON, block: String): Editor = js.native
  def apply(range: RangeTypeJSON, block: Block): Editor = js.native
  def apply(range: RangeTypeJSON, block: BlockJSON): Editor = js.native
  def apply(range: RangeTypeJSON, block: BlockProperties): Editor = js.native
  def apply(range: RangeTypeProperties, block: String): Editor = js.native
  def apply(range: RangeTypeProperties, block: Block): Editor = js.native
  def apply(range: RangeTypeProperties, block: BlockJSON): Editor = js.native
  def apply(range: RangeTypeProperties, block: BlockProperties): Editor = js.native
  def apply(range: RangeType, block: String): Editor = js.native
  def apply(range: RangeType, block: Block): Editor = js.native
  def apply(range: RangeType, block: BlockJSON): Editor = js.native
  def apply(range: RangeType, block: BlockProperties): Editor = js.native
}

