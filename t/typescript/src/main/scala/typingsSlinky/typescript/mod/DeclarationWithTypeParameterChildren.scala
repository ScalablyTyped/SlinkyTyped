package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.SignatureDeclaration
  - typingsSlinky.typescript.mod.ClassLikeDeclaration
  - typingsSlinky.typescript.mod.InterfaceDeclaration
  - typingsSlinky.typescript.mod.TypeAliasDeclaration
  - typingsSlinky.typescript.mod.JSDocTemplateTag
*/
trait DeclarationWithTypeParameterChildren extends DeclarationWithTypeParameters

object DeclarationWithTypeParameterChildren {
  @scala.inline
  implicit def apply(value: ClassLikeDeclaration): DeclarationWithTypeParameterChildren = value.asInstanceOf[DeclarationWithTypeParameterChildren]
  @scala.inline
  implicit def apply(value: InterfaceDeclaration): DeclarationWithTypeParameterChildren = value.asInstanceOf[DeclarationWithTypeParameterChildren]
  @scala.inline
  implicit def apply(value: JSDocTemplateTag): DeclarationWithTypeParameterChildren = value.asInstanceOf[DeclarationWithTypeParameterChildren]
  @scala.inline
  implicit def apply(value: SignatureDeclaration): DeclarationWithTypeParameterChildren = value.asInstanceOf[DeclarationWithTypeParameterChildren]
  @scala.inline
  implicit def apply(value: TypeAliasDeclaration): DeclarationWithTypeParameterChildren = value.asInstanceOf[DeclarationWithTypeParameterChildren]
}

