package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.NodeArray
import typingsSlinky.typescript.mod.ParameterDeclaration
import typingsSlinky.typescript.mod.TransformationContext
import typingsSlinky.typescript.mod.Visitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.visitParameterList")
@js.native
object visitParameterList extends js.Object {
  def apply(nodes: js.UndefOr[scala.Nothing], visitor: Visitor, context: TransformationContext): js.UndefOr[NodeArray[ParameterDeclaration]] = js.native
  def apply(
    nodes: js.UndefOr[scala.Nothing],
    visitor: Visitor,
    context: TransformationContext,
    nodesVisitor: js.Function5[
      /* nodes */ js.UndefOr[NodeArray[Node]], 
      /* visitor */ Visitor, 
      /* test */ js.UndefOr[js.Function1[/* node */ Node, Boolean]], 
      /* start */ js.UndefOr[Double], 
      /* count */ js.UndefOr[Double], 
      js.UndefOr[NodeArray[Node]]
    ]
  ): js.UndefOr[NodeArray[ParameterDeclaration]] = js.native
  def apply(nodes: NodeArray[ParameterDeclaration], visitor: Visitor, context: TransformationContext): js.UndefOr[NodeArray[ParameterDeclaration]] = js.native
  def apply(
    nodes: NodeArray[ParameterDeclaration],
    visitor: Visitor,
    context: TransformationContext,
    nodesVisitor: js.Function5[
      /* nodes */ js.UndefOr[NodeArray[Node]], 
      /* visitor */ Visitor, 
      /* test */ js.UndefOr[js.Function1[/* node */ Node, Boolean]], 
      /* start */ js.UndefOr[Double], 
      /* count */ js.UndefOr[Double], 
      js.UndefOr[NodeArray[Node]]
    ]
  ): js.UndefOr[NodeArray[ParameterDeclaration]] = js.native
}

