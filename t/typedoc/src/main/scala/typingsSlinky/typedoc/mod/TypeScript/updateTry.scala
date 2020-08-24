package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.Block
import typingsSlinky.typescript.mod.CatchClause
import typingsSlinky.typescript.mod.TryStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateTry")
@js.native
object updateTry extends js.Object {
  def apply(node: TryStatement, tryBlock: Block): TryStatement = js.native
  def apply(node: TryStatement, tryBlock: Block, catchClause: js.UndefOr[scala.Nothing], finallyBlock: Block): TryStatement = js.native
  def apply(node: TryStatement, tryBlock: Block, catchClause: CatchClause): TryStatement = js.native
  def apply(node: TryStatement, tryBlock: Block, catchClause: CatchClause, finallyBlock: Block): TryStatement = js.native
}

