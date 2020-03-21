package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.IndexSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsSlinky.typescript.mod.TextRange because Already inherited
- typingsSlinky.typescript.mod.Node because Already inherited
- typingsSlinky.typescript.mod.Declaration because Already inherited
- typingsSlinky.typescript.mod.NamedDeclaration because Already inherited
- typingsSlinky.typescript.mod.TypeElement because var conflicts: _declarationBrand, decorators, end, flags, kind, modifiers, name, parent, pos. Inlined _typeElementBrand, questionToken
- typingsSlinky.typescript.mod.ClassElement because var conflicts: _declarationBrand, decorators, end, flags, kind, modifiers, name, parent, pos. Inlined _classElementBrand */ @js.native
trait IndexSignatureDeclaration
  extends SignatureDeclarationBase
     with SignatureDeclaration
     with _HasJSDoc {
  var _classElementBrand: js.Any = js.native
  var _typeElementBrand: js.Any = js.native
  @JSName("kind")
  var kind_IndexSignatureDeclaration: IndexSignature = js.native
  @JSName("parent")
  var parent_IndexSignatureDeclaration: ObjectTypeDeclaration = js.native
  var questionToken: js.UndefOr[QuestionToken] = js.native
}

