package typingsSlinky.typedoc

import typingsSlinky.typedoc.contextMod.Context
import typingsSlinky.typedoc.reflectionsMod.ParameterReflection
import typingsSlinky.typescript.mod.ParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/factories/parameter", JSImport.Namespace)
@js.native
object parameterMod extends js.Object {
  def createParameter(context: Context, node: ParameterDeclaration): js.UndefOr[ParameterReflection] = js.native
}

