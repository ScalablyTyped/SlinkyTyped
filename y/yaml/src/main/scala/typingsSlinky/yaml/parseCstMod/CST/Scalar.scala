package typingsSlinky.yaml.parseCstMod.CST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.yaml.parseCstMod.CST.BlockValue
  - typingsSlinky.yaml.parseCstMod.CST.PlainValue
  - typingsSlinky.yaml.parseCstMod.CST.QuoteValue
*/
trait Scalar extends ContentNode

object Scalar {
  @scala.inline
  implicit def apply(value: BlockValue): Scalar = value.asInstanceOf[Scalar]
  @scala.inline
  implicit def apply(value: PlainValue): Scalar = value.asInstanceOf[Scalar]
  @scala.inline
  implicit def apply(value: QuoteValue): Scalar = value.asInstanceOf[Scalar]
}

