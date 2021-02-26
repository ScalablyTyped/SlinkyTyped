package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.ConstructSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.typescript.mod.ReadonlyTextRange because Already inherited
- typingsSlinky.typescript.mod.Node because Already inherited
- typingsSlinky.typescript.mod.Declaration because Already inherited
- typingsSlinky.typescript.mod.NamedDeclaration because Already inherited
- typingsSlinky.typescript.mod.TypeElement because var conflicts: _declarationBrand. Inlined _typeElementBrand, questionToken */ @js.native
trait ConstructSignatureDeclaration
  extends SignatureDeclarationBase
     with SignatureDeclaration
     with _HasJSDoc {
  
  var _typeElementBrand: js.Any = js.native
  
  @JSName("kind")
  val kind_ConstructSignatureDeclaration: ConstructSignature = js.native
  
  val questionToken: js.UndefOr[QuestionToken] = js.native
}
