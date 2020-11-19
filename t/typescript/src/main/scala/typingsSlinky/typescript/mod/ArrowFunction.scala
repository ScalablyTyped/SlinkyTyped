package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.typescript.mod.TextRange because Already inherited
- typingsSlinky.typescript.mod.Node because Already inherited
- typingsSlinky.typescript.mod.Expression because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _expressionBrand */ @js.native
trait ArrowFunction
  extends FunctionLikeDeclarationBase
     with FunctionLikeDeclaration
     with SignatureDeclaration
     with _HasJSDoc
     with ForInitializer {
  
  var _expressionBrand: js.Any = js.native
  
  @JSName("body")
  var body_ArrowFunction: ConciseBody = js.native
  
  var equalsGreaterThanToken: EqualsGreaterThanToken = js.native
  
  @JSName("kind")
  var kind_ArrowFunction: typingsSlinky.typescript.mod.SyntaxKind.ArrowFunction = js.native
}
