package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.typescript.mod.ReadonlyTextRange because Already inherited
- typingsSlinky.typescript.mod.Node because Already inherited
- typingsSlinky.typescript.mod.Declaration because Already inherited
- typingsSlinky.typescript.mod.NamedDeclaration because Already inherited
- typingsSlinky.typescript.mod.DeclarationStatement because var conflicts: _declarationBrand. Inlined  */ @js.native
trait FunctionDeclaration
  extends FunctionLikeDeclarationBase
     with FunctionLikeDeclaration
     with SignatureDeclaration
     with _HasJSDoc
     with Statement {
  
  @JSName("body")
  val body_FunctionDeclaration: js.UndefOr[FunctionBody] = js.native
  
  @JSName("kind")
  val kind_FunctionDeclaration: typingsSlinky.typescript.mod.SyntaxKind.FunctionDeclaration = js.native
  
  @JSName("name")
  val name_FunctionDeclaration: js.UndefOr[Identifier] = js.native
}
