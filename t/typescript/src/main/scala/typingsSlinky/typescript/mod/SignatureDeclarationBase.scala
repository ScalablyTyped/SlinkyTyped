package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.CallSignature
import typingsSlinky.typescript.mod.SyntaxKind.ConstructSignature
import typingsSlinky.typescript.mod.SyntaxKind.Constructor
import typingsSlinky.typescript.mod.SyntaxKind.ConstructorType
import typingsSlinky.typescript.mod.SyntaxKind.FunctionType
import typingsSlinky.typescript.mod.SyntaxKind.GetAccessor
import typingsSlinky.typescript.mod.SyntaxKind.IndexSignature
import typingsSlinky.typescript.mod.SyntaxKind.SetAccessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureDeclarationBase
  extends NamedDeclaration
     with JSDocContainer {
  
  @JSName("kind")
  var kind_SignatureDeclarationBase: CallSignature | ConstructSignature | typingsSlinky.typescript.mod.SyntaxKind.MethodSignature | IndexSignature | FunctionType | ConstructorType | typingsSlinky.typescript.mod.SyntaxKind.JSDocFunctionType | typingsSlinky.typescript.mod.SyntaxKind.FunctionDeclaration | typingsSlinky.typescript.mod.SyntaxKind.MethodDeclaration | Constructor | GetAccessor | SetAccessor | typingsSlinky.typescript.mod.SyntaxKind.FunctionExpression | typingsSlinky.typescript.mod.SyntaxKind.ArrowFunction = js.native
  
  @JSName("name")
  var name_SignatureDeclarationBase: js.UndefOr[PropertyName] = js.native
  
  var parameters: NodeArray[ParameterDeclaration] = js.native
  
  var `type`: js.UndefOr[TypeNode] = js.native
  
  var typeParameters: js.UndefOr[NodeArray[TypeParameterDeclaration]] = js.native
}
