package typingsSlinky.typedoc

import typingsSlinky.typedoc.distLibConverterContextMod.Context
import typingsSlinky.typedoc.distLibModelsCommentsMod.Comment
import typingsSlinky.typedoc.distLibModelsMod.DeclarationReflection
import typingsSlinky.typedoc.distLibModelsMod.SignatureReflection
import typingsSlinky.typedoc.distLibModelsMod.TypeParameterType
import typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind
import typingsSlinky.typedoc.distLibModelsReflectionsMod.ParameterReflection
import typingsSlinky.typedoc.distLibModelsTypesMod.ReferenceType
import typingsSlinky.typescript.typescriptMod.Declaration
import typingsSlinky.typescript.typescriptMod.Node
import typingsSlinky.typescript.typescriptMod.ParameterDeclaration
import typingsSlinky.typescript.typescriptMod.SignatureDeclaration
import typingsSlinky.typescript.typescriptMod.Symbol
import typingsSlinky.typescript.typescriptMod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/factories", JSImport.Namespace)
@js.native
object distLibConverterFactoriesMod extends js.Object {
  def createComment(node: Node): js.UndefOr[Comment] = js.native
  def createDeclaration(context: Context, node: Declaration, kind: ReflectionKind): js.UndefOr[DeclarationReflection] = js.native
  def createDeclaration(context: Context, node: Declaration, kind: ReflectionKind, name: String): js.UndefOr[DeclarationReflection] = js.native
  def createParameter(context: Context, node: ParameterDeclaration): js.UndefOr[ParameterReflection] = js.native
  def createReferenceType(context: Context): js.UndefOr[ReferenceType] = js.native
  def createReferenceType(context: Context, symbol: js.UndefOr[scala.Nothing], includeParent: Boolean): js.UndefOr[ReferenceType] = js.native
  def createReferenceType(context: Context, symbol: Symbol): js.UndefOr[ReferenceType] = js.native
  def createReferenceType(context: Context, symbol: Symbol, includeParent: Boolean): js.UndefOr[ReferenceType] = js.native
  def createSignature(context: Context, node: SignatureDeclaration, name: String, kind: ReflectionKind): SignatureReflection = js.native
  def createTypeParameter(context: Context, node: TypeParameterDeclaration): js.UndefOr[TypeParameterType] = js.native
}

