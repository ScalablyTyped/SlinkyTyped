package typingsSlinky.typedoc

import typingsSlinky.typedoc.distLibConverterContextMod.Context
import typingsSlinky.typedoc.distLibModelsReflectionsMod.ParameterReflection
import typingsSlinky.typescript.typescriptMod.ParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/factories/parameter", JSImport.Namespace)
@js.native
object distLibConverterFactoriesParameterMod extends js.Object {
  def createParameter(context: Context, node: ParameterDeclaration): js.UndefOr[ParameterReflection] = js.native
}

