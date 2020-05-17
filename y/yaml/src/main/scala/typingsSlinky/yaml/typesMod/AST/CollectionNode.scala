package typingsSlinky.yaml.typesMod.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.yaml.typesMod.AST.FlowMap
  - typingsSlinky.yaml.typesMod.AST.BlockMap
  - typingsSlinky.yaml.typesMod.AST.FlowSeq
  - typingsSlinky.yaml.typesMod.AST.BlockSeq
*/
trait CollectionNode extends AstNode

object CollectionNode {
  @scala.inline
  implicit def apply(value: BlockMap): CollectionNode = value.asInstanceOf[CollectionNode]
  @scala.inline
  implicit def apply(value: BlockSeq): CollectionNode = value.asInstanceOf[CollectionNode]
  @scala.inline
  implicit def apply(value: FlowMap): CollectionNode = value.asInstanceOf[CollectionNode]
  @scala.inline
  implicit def apply(value: FlowSeq): CollectionNode = value.asInstanceOf[CollectionNode]
}

