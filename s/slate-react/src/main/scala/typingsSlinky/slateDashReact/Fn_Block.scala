package typingsSlinky.slateDashReact

import typingsSlinky.slate.slateMod.Block
import typingsSlinky.slate.slateMod.BlockJSON
import typingsSlinky.slate.slateMod.BlockProperties
import typingsSlinky.slate.slateMod.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Block extends js.Object {
  def apply(block: String): Editor = js.native
  def apply(block: Block): Editor = js.native
  def apply(block: BlockJSON): Editor = js.native
  def apply(block: BlockProperties): Editor = js.native
}

