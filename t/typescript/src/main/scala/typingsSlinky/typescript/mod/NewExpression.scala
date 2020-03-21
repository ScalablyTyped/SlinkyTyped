package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsSlinky.typescript.mod.TextRange because Already inherited
- typingsSlinky.typescript.mod.Node because Already inherited
- typingsSlinky.typescript.mod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand */ @js.native
trait NewExpression
  extends PrimaryExpression
     with CallLikeExpression
     with HasTypeArguments {
  var _declarationBrand: js.Any = js.native
  var arguments: js.UndefOr[NodeArray[Expression]] = js.native
  var expression: LeftHandSideExpression = js.native
  @JSName("kind")
  var kind_NewExpression: typingsSlinky.typescript.mod.SyntaxKind.NewExpression = js.native
  var typeArguments: js.UndefOr[NodeArray[TypeNode]] = js.native
}

