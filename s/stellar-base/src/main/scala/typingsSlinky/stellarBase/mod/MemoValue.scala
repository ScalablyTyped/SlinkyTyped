package typingsSlinky.stellarBase.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Null
  - java.lang.String
  - typingsSlinky.node.Buffer
*/
trait MemoValue extends js.Object

object MemoValue {
  @scala.inline
  implicit def apply(value: Buffer): MemoValue = value.asInstanceOf[MemoValue]
  @scala.inline
  implicit def apply(value: Null): MemoValue = value.asInstanceOf[MemoValue]
  @scala.inline
  implicit def apply(value: String): MemoValue = value.asInstanceOf[MemoValue]
}

