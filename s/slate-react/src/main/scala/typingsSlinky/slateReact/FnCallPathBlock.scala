package typingsSlinky.slateReact

import typingsSlinky.immutable.Immutable.List
import typingsSlinky.slate.mod.Block
import typingsSlinky.slate.mod.Controller
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallPathBlock extends js.Object {
  def apply(path: List[Double], block: String): Controller = js.native
  def apply(path: List[Double], block: Block): Controller = js.native
}

