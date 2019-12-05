package typingsSlinky.typedoc

import typingsSlinky.typedoc.distLibConverterContextMod.Context
import typingsSlinky.typedoc.distLibModelsMod.DeclarationReflection
import typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind
import typingsSlinky.typescript.typescriptMod.Declaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/factories/declaration", JSImport.Namespace)
@js.native
object distLibConverterFactoriesDeclarationMod extends js.Object {
  def createDeclaration(context: Context, node: Declaration, kind: ReflectionKind): js.UndefOr[DeclarationReflection] = js.native
  def createDeclaration(context: Context, node: Declaration, kind: ReflectionKind, name: String): js.UndefOr[DeclarationReflection] = js.native
}

