package typingsSlinky.typedoc

import typingsSlinky.typedoc.abstractMod.ReflectionKind
import typingsSlinky.typedoc.commentsMod.Comment
import typingsSlinky.typedoc.contextMod.Context
import typingsSlinky.typedoc.modelsMod.DeclarationReflection
import typingsSlinky.typedoc.modelsMod.ReferenceType
import typingsSlinky.typedoc.modelsMod.SignatureReflection
import typingsSlinky.typedoc.modelsMod.TypeParameterType
import typingsSlinky.typedoc.reflectionsMod.ParameterReflection
import typingsSlinky.typescript.mod.Declaration
import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.ParameterDeclaration
import typingsSlinky.typescript.mod.SignatureDeclaration
import typingsSlinky.typescript.mod.Symbol
import typingsSlinky.typescript.mod.TypeParameterDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoriesMod {
  
  @JSImport("typedoc/dist/lib/converter/factories", "createComment")
  @js.native
  def createComment(node: Node): js.UndefOr[Comment] = js.native
  
  @JSImport("typedoc/dist/lib/converter/factories", "createDeclaration")
  @js.native
  def createDeclaration(context: Context, node: Declaration, kind: ReflectionKind): js.UndefOr[DeclarationReflection] = js.native
  @JSImport("typedoc/dist/lib/converter/factories", "createDeclaration")
  @js.native
  def createDeclaration(context: Context, node: Declaration, kind: ReflectionKind, name: String): js.UndefOr[DeclarationReflection] = js.native
  
  @JSImport("typedoc/dist/lib/converter/factories", "createParameter")
  @js.native
  def createParameter(context: Context, node: ParameterDeclaration): js.UndefOr[ParameterReflection] = js.native
  
  @JSImport("typedoc/dist/lib/converter/factories", "createReferenceType")
  @js.native
  def createReferenceType(context: Context): js.UndefOr[ReferenceType] = js.native
  @JSImport("typedoc/dist/lib/converter/factories", "createReferenceType")
  @js.native
  def createReferenceType(context: Context, symbol: js.UndefOr[scala.Nothing], includeParent: Boolean): js.UndefOr[ReferenceType] = js.native
  @JSImport("typedoc/dist/lib/converter/factories", "createReferenceType")
  @js.native
  def createReferenceType(context: Context, symbol: Symbol): js.UndefOr[ReferenceType] = js.native
  @JSImport("typedoc/dist/lib/converter/factories", "createReferenceType")
  @js.native
  def createReferenceType(context: Context, symbol: Symbol, includeParent: Boolean): js.UndefOr[ReferenceType] = js.native
  
  @JSImport("typedoc/dist/lib/converter/factories", "createSignature")
  @js.native
  def createSignature(context: Context, node: SignatureDeclaration, name: String, kind: ReflectionKind): SignatureReflection = js.native
  
  @JSImport("typedoc/dist/lib/converter/factories", "createTypeParameter")
  @js.native
  def createTypeParameter(context: Context, node: TypeParameterDeclaration): js.UndefOr[TypeParameterType] = js.native
}
