package typingsSlinky.superagent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.superagent.mod.BrowserParser
  - typingsSlinky.superagent.mod.NodeParser
*/
trait Parser extends js.Object

object Parser {
  @scala.inline
  implicit def apply(value: BrowserParser): Parser = value.asInstanceOf[Parser]
  @scala.inline
  implicit def apply(value: NodeParser): Parser = value.asInstanceOf[Parser]
}

