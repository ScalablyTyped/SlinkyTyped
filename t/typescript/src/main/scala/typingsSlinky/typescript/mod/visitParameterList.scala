package typingsSlinky.typescript.mod

import typingsSlinky.typescript.anon.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "visitParameterList")
@js.native
object visitParameterList extends js.Object {
  /**
    * Starts a new lexical environment and visits a parameter list, suspending the lexical
    * environment upon completion.
    */
  def apply(
    nodes: js.UndefOr[NodeArray[ParameterDeclaration]],
    visitor: Visitor,
    context: TransformationContext
  ): NodeArray[ParameterDeclaration] = js.native
  def apply(
    nodes: js.UndefOr[NodeArray[ParameterDeclaration]],
    visitor: Visitor,
    context: TransformationContext,
    nodesVisitor: FnCall
  ): NodeArray[ParameterDeclaration] = js.native
}

