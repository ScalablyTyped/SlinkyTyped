package typingsSlinky.typedoc

import typingsSlinky.typescript.mod.Type
import typingsSlinky.typescript.mod.TypeNode
import typingsSlinky.typescript.mod.TypeParameterDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsTypesMod {
  
  @JSImport("typedoc/dist/lib/converter/utils/types", "getTypeArgumentsWithDefaults")
  @js.native
  def getTypeArgumentsWithDefaults(typeParams: js.Array[TypeParameterDeclaration]): js.Array[TypeNode] = js.native
  @JSImport("typedoc/dist/lib/converter/utils/types", "getTypeArgumentsWithDefaults")
  @js.native
  def getTypeArgumentsWithDefaults(typeParams: js.Array[TypeParameterDeclaration], typeArguments: js.Array[TypeNode]): js.Array[TypeNode] = js.native
  
  @JSImport("typedoc/dist/lib/converter/utils/types", "getTypeParametersOfType")
  @js.native
  def getTypeParametersOfType(`type`: Type): js.Array[TypeParameterDeclaration] = js.native
}
