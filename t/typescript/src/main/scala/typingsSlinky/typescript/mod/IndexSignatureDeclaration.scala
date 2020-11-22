package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.IndexSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.typescript.mod.ReadonlyTextRange because Already inherited
- typingsSlinky.typescript.mod.Node because Already inherited
- typingsSlinky.typescript.mod.Declaration because Already inherited
- typingsSlinky.typescript.mod.NamedDeclaration because Already inherited
- typingsSlinky.typescript.mod.TypeElement because var conflicts: _declarationBrand. Inlined _typeElementBrand, questionToken
- typingsSlinky.typescript.mod.ClassElement because var conflicts: _declarationBrand. Inlined _classElementBrand */ @js.native
trait IndexSignatureDeclaration
  extends SignatureDeclarationBase
     with SignatureDeclaration
     with _HasJSDoc {
  
  var _classElementBrand: js.Any = js.native
  
  var _typeElementBrand: js.Any = js.native
  
  @JSName("kind")
  val kind_IndexSignatureDeclaration: IndexSignature = js.native
  
  @JSName("parent")
  val parent_IndexSignatureDeclaration: ObjectTypeDeclaration = js.native
  
  val questionToken: js.UndefOr[QuestionToken] = js.native
  
  @JSName("type")
  val type_IndexSignatureDeclaration: TypeNode = js.native
}
