package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.ConstructSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.typescript.mod.TextRange because Already inherited
- typingsSlinky.typescript.mod.Node because Already inherited
- typingsSlinky.typescript.mod.Declaration because Already inherited
- typingsSlinky.typescript.mod.NamedDeclaration because Already inherited
- typingsSlinky.typescript.mod.TypeElement because var conflicts: _declarationBrand, decorators, end, flags, kind, modifiers, name, parent, pos. Inlined _typeElementBrand, questionToken */ @js.native
trait ConstructSignatureDeclaration
  extends SignatureDeclarationBase
     with HasJSDoc
     with SignatureDeclaration {
  var _typeElementBrand: js.Any = js.native
  @JSName("kind")
  var kind_ConstructSignatureDeclaration: ConstructSignature = js.native
  var questionToken: js.UndefOr[QuestionToken] = js.native
}

