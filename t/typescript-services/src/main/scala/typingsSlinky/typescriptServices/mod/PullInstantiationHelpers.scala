package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.InstantiableSymbol
import typingsSlinky.typescriptServices.TypeScript.TypeArgumentMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PullInstantiationHelpers {
  
  @JSImport("typescript-services", "PullInstantiationHelpers.MutableTypeArgumentMap")
  @js.native
  class MutableTypeArgumentMap protected ()
    extends typingsSlinky.typescriptServices.TypeScript.PullInstantiationHelpers.MutableTypeArgumentMap {
    def this(typeParameterArgumentMap: TypeArgumentMap) = this()
  }
  
  @JSImport("typescript-services", "PullInstantiationHelpers.cleanUpTypeArgumentMap")
  @js.native
  def cleanUpTypeArgumentMap(
    symbol: InstantiableSymbol,
    mutableTypeArgumentMap: typingsSlinky.typescriptServices.TypeScript.PullInstantiationHelpers.MutableTypeArgumentMap
  ): Unit = js.native
  
  @JSImport("typescript-services", "PullInstantiationHelpers.createTypeParameterArgumentMap")
  @js.native
  def createTypeParameterArgumentMap(
    typeParameters: js.Array[typingsSlinky.typescriptServices.TypeScript.PullTypeParameterSymbol],
    typeArguments: js.Array[typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol]
  ): TypeArgumentMap = js.native
  
  @JSImport("typescript-services", "PullInstantiationHelpers.getAllowedToReferenceTypeParametersFromDecl")
  @js.native
  def getAllowedToReferenceTypeParametersFromDecl(decl: typingsSlinky.typescriptServices.TypeScript.PullDecl): js.Array[typingsSlinky.typescriptServices.TypeScript.PullTypeParameterSymbol] = js.native
  
  @JSImport("typescript-services", "PullInstantiationHelpers.instantiateTypeArgument")
  @js.native
  def instantiateTypeArgument(
    resolver: typingsSlinky.typescriptServices.TypeScript.PullTypeResolver,
    symbol: InstantiableSymbol,
    mutableTypeParameterMap: typingsSlinky.typescriptServices.TypeScript.PullInstantiationHelpers.MutableTypeArgumentMap
  ): Unit = js.native
  
  @JSImport("typescript-services", "PullInstantiationHelpers.twoTypesAreInstantiationsOfSameNamedGenericType")
  @js.native
  def twoTypesAreInstantiationsOfSameNamedGenericType(
    type1: typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol,
    type2: typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol
  ): Boolean = js.native
  
  @JSImport("typescript-services", "PullInstantiationHelpers.updateMutableTypeParameterArgumentMap")
  @js.native
  def updateMutableTypeParameterArgumentMap(
    typeParameters: js.Array[typingsSlinky.typescriptServices.TypeScript.PullTypeParameterSymbol],
    typeArguments: js.Array[typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol],
    mutableMap: typingsSlinky.typescriptServices.TypeScript.PullInstantiationHelpers.MutableTypeArgumentMap
  ): Unit = js.native
  
  @JSImport("typescript-services", "PullInstantiationHelpers.updateTypeParameterArgumentMap")
  @js.native
  def updateTypeParameterArgumentMap(
    typeParameters: js.Array[typingsSlinky.typescriptServices.TypeScript.PullTypeParameterSymbol],
    typeArguments: js.Array[typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol],
    typeParameterArgumentMap: TypeArgumentMap
  ): TypeArgumentMap = js.native
}
