package typingsSlinky.typedoc

import typingsSlinky.typedoc.abstractMod.ReflectionKind
import typingsSlinky.typedoc.contextMod.Context
import typingsSlinky.typedoc.modelsMod.DeclarationReflection
import typingsSlinky.typescript.mod.Declaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/factories/declaration", JSImport.Namespace)
@js.native
object declarationMod extends js.Object {
  
  def createDeclaration(context: Context, node: Declaration, kind: ReflectionKind): js.UndefOr[DeclarationReflection] = js.native
  def createDeclaration(context: Context, node: Declaration, kind: ReflectionKind, name: String): js.UndefOr[DeclarationReflection] = js.native
}
