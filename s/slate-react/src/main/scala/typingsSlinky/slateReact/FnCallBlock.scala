package typingsSlinky.slateReact

import typingsSlinky.slate.mod.Block
import typingsSlinky.slate.mod.BlockJSON
import typingsSlinky.slate.mod.BlockProperties
import typingsSlinky.slate.mod.Controller
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallBlock extends js.Object {
  def apply(block: String): Controller = js.native
  def apply(block: Block): Controller = js.native
  def apply(block: BlockJSON): Controller = js.native
  def apply(block: BlockProperties): Controller = js.native
}

