package typingsSlinky.uuid1345.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.Buffer
  - typingsSlinky.uuid1345.mod.UUID
*/
trait UuidTypes extends js.Object

object UuidTypes {
  @scala.inline
  implicit def apply(value: Buffer): UuidTypes = value.asInstanceOf[UuidTypes]
  @scala.inline
  implicit def apply(value: String): UuidTypes = value.asInstanceOf[UuidTypes]
  @scala.inline
  implicit def apply(value: UUID): UuidTypes = value.asInstanceOf[UuidTypes]
}

