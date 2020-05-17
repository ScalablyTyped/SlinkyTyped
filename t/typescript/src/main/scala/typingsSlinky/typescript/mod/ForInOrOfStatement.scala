package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.ForInStatement
  - typingsSlinky.typescript.mod.ForOfStatement
*/
trait ForInOrOfStatement extends js.Object

object ForInOrOfStatement {
  @scala.inline
  implicit def apply(value: ForInStatement): ForInOrOfStatement = value.asInstanceOf[ForInOrOfStatement]
  @scala.inline
  implicit def apply(value: ForOfStatement): ForInOrOfStatement = value.asInstanceOf[ForInOrOfStatement]
}

