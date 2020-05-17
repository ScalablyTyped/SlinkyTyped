package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.typescript.mod.TextRange because Already inherited
- typingsSlinky.typescript.mod.Node because Already inherited
- typingsSlinky.typescript.mod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand
- typingsSlinky.typescript.mod.NamedDeclaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined name */ @js.native
trait PropertyAccessExpression
  extends MemberExpression
     with BindingOrAssignmentElement
     with BindingOrAssignmentElementTarget {
  var _declarationBrand: js.Any = js.native
  var expression: LeftHandSideExpression = js.native
  @JSName("kind")
  var kind_PropertyAccessExpression: typingsSlinky.typescript.mod.SyntaxKind.PropertyAccessExpression = js.native
  var name: js.UndefOr[DeclarationName | Identifier | PrivateIdentifier] = js.native
  var questionDotToken: js.UndefOr[QuestionDotToken] = js.native
}

