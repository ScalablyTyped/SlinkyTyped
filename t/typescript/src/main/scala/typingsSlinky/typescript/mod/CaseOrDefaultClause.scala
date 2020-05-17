package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.CaseClause
  - typingsSlinky.typescript.mod.DefaultClause
*/
trait CaseOrDefaultClause extends BlockLike

object CaseOrDefaultClause {
  @scala.inline
  implicit def apply(value: CaseClause): CaseOrDefaultClause = value.asInstanceOf[CaseOrDefaultClause]
  @scala.inline
  implicit def apply(value: DefaultClause): CaseOrDefaultClause = value.asInstanceOf[CaseOrDefaultClause]
}

