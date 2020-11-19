package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.InstantiableSymbol
import typingsSlinky.typescriptServices.TypeScript.TypeArgumentMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "PullInstantiationHelpers")
@js.native
object PullInstantiationHelpers extends js.Object {
  
  def cleanUpTypeArgumentMap(
    symbol: InstantiableSymbol,
    mutableTypeArgumentMap: typingsSlinky.typescriptServices.TypeScript.PullInstantiationHelpers.MutableTypeArgumentMap
  ): Unit = js.native
  
  def createTypeParameterArgumentMap(
    typeParameters: js.Array[typingsSlinky.typescriptServices.TypeScript.PullTypeParameterSymbol],
    typeArguments: js.Array[typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol]
  ): TypeArgumentMap = js.native
  
  def getAllowedToReferenceTypeParametersFromDecl(decl: typingsSlinky.typescriptServices.TypeScript.PullDecl): js.Array[typingsSlinky.typescriptServices.TypeScript.PullTypeParameterSymbol] = js.native
  
  def instantiateTypeArgument(
    resolver: typingsSlinky.typescriptServices.TypeScript.PullTypeResolver,
    symbol: InstantiableSymbol,
    mutableTypeParameterMap: typingsSlinky.typescriptServices.TypeScript.PullInstantiationHelpers.MutableTypeArgumentMap
  ): Unit = js.native
  
  def twoTypesAreInstantiationsOfSameNamedGenericType(
    type1: typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol,
    type2: typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol
  ): Boolean = js.native
  
  def updateMutableTypeParameterArgumentMap(
    typeParameters: js.Array[typingsSlinky.typescriptServices.TypeScript.PullTypeParameterSymbol],
    typeArguments: js.Array[typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol],
    mutableMap: typingsSlinky.typescriptServices.TypeScript.PullInstantiationHelpers.MutableTypeArgumentMap
  ): Unit = js.native
  
  def updateTypeParameterArgumentMap(
    typeParameters: js.Array[typingsSlinky.typescriptServices.TypeScript.PullTypeParameterSymbol],
    typeArguments: js.Array[typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol],
    typeParameterArgumentMap: TypeArgumentMap
  ): TypeArgumentMap = js.native
  
  @js.native
  class MutableTypeArgumentMap protected ()
    extends typingsSlinky.typescriptServices.TypeScript.PullInstantiationHelpers.MutableTypeArgumentMap {
    def this(typeParameterArgumentMap: TypeArgumentMap) = this()
  }
}
