package typingsSlinky.typedoc

import typingsSlinky.typedoc.contextMod.Context
import typingsSlinky.typedoc.reflectionsMod.ParameterReflection
import typingsSlinky.typescript.mod.ParameterDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parameterMod {
  
  @JSImport("typedoc/dist/lib/converter/factories/parameter", "createParameter")
  @js.native
  def createParameter(context: Context, node: ParameterDeclaration): js.UndefOr[ParameterReflection] = js.native
}
