package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.typescript.mod.TextRange because Already inherited
- typingsSlinky.typescript.mod.Node because Already inherited
- typingsSlinky.typescript.mod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand */ @js.native
trait BinaryExpression extends Expression {
  var _declarationBrand: js.Any = js.native
  @JSName("kind")
  var kind_BinaryExpression: typingsSlinky.typescript.mod.SyntaxKind.BinaryExpression = js.native
  var left: Expression = js.native
  var operatorToken: BinaryOperatorToken = js.native
  var right: Expression = js.native
}

