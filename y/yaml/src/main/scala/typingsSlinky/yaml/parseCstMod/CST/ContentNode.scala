package typingsSlinky.yaml.parseCstMod.CST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.yaml.parseCstMod.CST.Alias
  - typingsSlinky.yaml.parseCstMod.CST.Scalar
  - typingsSlinky.yaml.parseCstMod.CST.Map
  - typingsSlinky.yaml.parseCstMod.CST.Seq
  - typingsSlinky.yaml.parseCstMod.CST.FlowCollection
*/
trait ContentNode extends js.Object

object ContentNode {
  @scala.inline
  implicit def apply(value: Alias): ContentNode = value.asInstanceOf[ContentNode]
  @scala.inline
  implicit def apply(value: FlowCollection): ContentNode = value.asInstanceOf[ContentNode]
  @scala.inline
  implicit def apply(value: Map): ContentNode = value.asInstanceOf[ContentNode]
  @scala.inline
  implicit def apply(value: Scalar): ContentNode = value.asInstanceOf[ContentNode]
  @scala.inline
  implicit def apply(value: Seq): ContentNode = value.asInstanceOf[ContentNode]
}

