package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.typescript.mod.ReadonlyTextRange because Already inherited
- typingsSlinky.typescript.mod.Node because Already inherited
- typingsSlinky.typescript.mod.Declaration because Already inherited
- typingsSlinky.typescript.mod.NamedDeclaration because Already inherited
- typingsSlinky.typescript.mod.TypeElement because var conflicts: _declarationBrand. Inlined _typeElementBrand, questionToken */ @js.native
trait MethodSignature
  extends SignatureDeclarationBase
     with SignatureDeclaration
     with _HasJSDoc {
  
  var _typeElementBrand: js.Any = js.native
  
  @JSName("kind")
  val kind_MethodSignature: typingsSlinky.typescript.mod.SyntaxKind.MethodSignature = js.native
  
  @JSName("name")
  val name_MethodSignature: PropertyName = js.native
  
  @JSName("parent")
  val parent_MethodSignature: ObjectTypeDeclaration = js.native
  
  val questionToken: js.UndefOr[QuestionToken] = js.native
}
