package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.SourceFile
  - typingsSlinky.typescript.mod.Block
  - typingsSlinky.typescript.mod.ModuleBlock
  - typingsSlinky.typescript.mod.CaseOrDefaultClause
*/
trait BlockLike extends js.Object

object BlockLike {
  @scala.inline
  implicit def apply(value: Block): BlockLike = value.asInstanceOf[BlockLike]
  @scala.inline
  implicit def apply(value: CaseOrDefaultClause): BlockLike = value.asInstanceOf[BlockLike]
  @scala.inline
  implicit def apply(value: ModuleBlock): BlockLike = value.asInstanceOf[BlockLike]
  @scala.inline
  implicit def apply(value: SourceFile): BlockLike = value.asInstanceOf[BlockLike]
}

