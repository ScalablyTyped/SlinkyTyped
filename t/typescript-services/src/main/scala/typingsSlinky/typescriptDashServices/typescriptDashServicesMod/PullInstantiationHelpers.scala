package typingsSlinky.typescriptDashServices.typescriptDashServicesMod

import typingsSlinky.typescriptDashServices.TypeScript.InstantiableSymbol
import typingsSlinky.typescriptDashServices.TypeScript.TypeArgumentMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PullInstantiationHelpers")
@js.native
object PullInstantiationHelpers extends js.Object {
  @js.native
  class MutableTypeArgumentMap protected ()
    extends typingsSlinky.typescriptDashServices.TypeScript.PullInstantiationHelpers.MutableTypeArgumentMap {
    def this(typeParameterArgumentMap: TypeArgumentMap) = this()
  }
  
  def cleanUpTypeArgumentMap(
    symbol: InstantiableSymbol,
    mutableTypeArgumentMap: typingsSlinky.typescriptDashServices.TypeScript.PullInstantiationHelpers.MutableTypeArgumentMap
  ): Unit = js.native
  def createTypeParameterArgumentMap(
    typeParameters: js.Array[typingsSlinky.typescriptDashServices.TypeScript.PullTypeParameterSymbol],
    typeArguments: js.Array[typingsSlinky.typescriptDashServices.TypeScript.PullTypeSymbol]
  ): TypeArgumentMap = js.native
  def getAllowedToReferenceTypeParametersFromDecl(decl: typingsSlinky.typescriptDashServices.TypeScript.PullDecl): js.Array[typingsSlinky.typescriptDashServices.TypeScript.PullTypeParameterSymbol] = js.native
  def instantiateTypeArgument(
    resolver: typingsSlinky.typescriptDashServices.TypeScript.PullTypeResolver,
    symbol: InstantiableSymbol,
    mutableTypeParameterMap: typingsSlinky.typescriptDashServices.TypeScript.PullInstantiationHelpers.MutableTypeArgumentMap
  ): Unit = js.native
  def twoTypesAreInstantiationsOfSameNamedGenericType(
    type1: typingsSlinky.typescriptDashServices.TypeScript.PullTypeSymbol,
    type2: typingsSlinky.typescriptDashServices.TypeScript.PullTypeSymbol
  ): Boolean = js.native
  def updateMutableTypeParameterArgumentMap(
    typeParameters: js.Array[typingsSlinky.typescriptDashServices.TypeScript.PullTypeParameterSymbol],
    typeArguments: js.Array[typingsSlinky.typescriptDashServices.TypeScript.PullTypeSymbol],
    mutableMap: typingsSlinky.typescriptDashServices.TypeScript.PullInstantiationHelpers.MutableTypeArgumentMap
  ): Unit = js.native
  def updateTypeParameterArgumentMap(
    typeParameters: js.Array[typingsSlinky.typescriptDashServices.TypeScript.PullTypeParameterSymbol],
    typeArguments: js.Array[typingsSlinky.typescriptDashServices.TypeScript.PullTypeSymbol],
    typeParameterArgumentMap: TypeArgumentMap
  ): TypeArgumentMap = js.native
}

