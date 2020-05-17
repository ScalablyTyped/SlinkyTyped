package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.PropertyAccessChain
  - typingsSlinky.typescript.mod.ElementAccessChain
  - typingsSlinky.typescript.mod.CallChain
*/
trait OptionalChain extends js.Object

object OptionalChain {
  @scala.inline
  implicit def apply(value: CallChain): OptionalChain = value.asInstanceOf[OptionalChain]
  @scala.inline
  implicit def apply(value: ElementAccessChain): OptionalChain = value.asInstanceOf[OptionalChain]
  @scala.inline
  implicit def apply(value: PropertyAccessChain): OptionalChain = value.asInstanceOf[OptionalChain]
}

