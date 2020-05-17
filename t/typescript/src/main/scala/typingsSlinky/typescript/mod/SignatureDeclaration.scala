package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.CallSignatureDeclaration
  - typingsSlinky.typescript.mod.ConstructSignatureDeclaration
  - typingsSlinky.typescript.mod.MethodSignature
  - typingsSlinky.typescript.mod.IndexSignatureDeclaration
  - typingsSlinky.typescript.mod.FunctionTypeNode
  - typingsSlinky.typescript.mod.ConstructorTypeNode
  - typingsSlinky.typescript.mod.JSDocFunctionType
  - typingsSlinky.typescript.mod.FunctionDeclaration
  - typingsSlinky.typescript.mod.MethodDeclaration
  - typingsSlinky.typescript.mod.ConstructorDeclaration
  - typingsSlinky.typescript.mod.AccessorDeclaration
  - typingsSlinky.typescript.mod.FunctionExpression
  - typingsSlinky.typescript.mod.ArrowFunction
*/
trait SignatureDeclaration
  extends DeclarationWithTypeParameterChildren
     with HasType

object SignatureDeclaration {
  @scala.inline
  implicit def apply(value: AccessorDeclaration): SignatureDeclaration = value.asInstanceOf[SignatureDeclaration]
  @scala.inline
  implicit def apply(value: ArrowFunction): SignatureDeclaration = value.asInstanceOf[SignatureDeclaration]
  @scala.inline
  implicit def apply(value: CallSignatureDeclaration): SignatureDeclaration = value.asInstanceOf[SignatureDeclaration]
  @scala.inline
  implicit def apply(value: ConstructSignatureDeclaration): SignatureDeclaration = value.asInstanceOf[SignatureDeclaration]
  @scala.inline
  implicit def apply(value: ConstructorDeclaration): SignatureDeclaration = value.asInstanceOf[SignatureDeclaration]
  @scala.inline
  implicit def apply(value: ConstructorTypeNode): SignatureDeclaration = value.asInstanceOf[SignatureDeclaration]
  @scala.inline
  implicit def apply(value: FunctionDeclaration): SignatureDeclaration = value.asInstanceOf[SignatureDeclaration]
  @scala.inline
  implicit def apply(value: FunctionExpression): SignatureDeclaration = value.asInstanceOf[SignatureDeclaration]
  @scala.inline
  implicit def apply(value: FunctionTypeNode): SignatureDeclaration = value.asInstanceOf[SignatureDeclaration]
  @scala.inline
  implicit def apply(value: IndexSignatureDeclaration): SignatureDeclaration = value.asInstanceOf[SignatureDeclaration]
  @scala.inline
  implicit def apply(value: JSDocFunctionType): SignatureDeclaration = value.asInstanceOf[SignatureDeclaration]
  @scala.inline
  implicit def apply(value: MethodDeclaration): SignatureDeclaration = value.asInstanceOf[SignatureDeclaration]
  @scala.inline
  implicit def apply(value: MethodSignature): SignatureDeclaration = value.asInstanceOf[SignatureDeclaration]
}

