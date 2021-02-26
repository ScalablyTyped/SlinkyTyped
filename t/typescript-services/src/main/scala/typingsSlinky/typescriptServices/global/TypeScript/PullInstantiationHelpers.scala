package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.InstantiableSymbol
import typingsSlinky.typescriptServices.TypeScript.TypeArgumentMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PullInstantiationHelpers {
  
  @JSGlobal("TypeScript.PullInstantiationHelpers.MutableTypeArgumentMap")
  @js.native
  class MutableTypeArgumentMap protected ()
    extends typingsSlinky.typescriptServices.TypeScript.PullInstantiationHelpers.MutableTypeArgumentMap {
    def this(typeParameterArgumentMap: TypeArgumentMap) = this()
  }
  
  @JSGlobal("TypeScript.PullInstantiationHelpers.cleanUpTypeArgumentMap")
  @js.native
  def cleanUpTypeArgumentMap(
    symbol: InstantiableSymbol,
    mutableTypeArgumentMap: typingsSlinky.typescriptServices.TypeScript.PullInstantiationHelpers.MutableTypeArgumentMap
  ): Unit = js.native
  
  @JSGlobal("TypeScript.PullInstantiationHelpers.createTypeParameterArgumentMap")
  @js.native
  def createTypeParameterArgumentMap(
    typeParameters: js.Array[typingsSlinky.typescriptServices.TypeScript.PullTypeParameterSymbol],
    typeArguments: js.Array[typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol]
  ): TypeArgumentMap = js.native
  
  @JSGlobal("TypeScript.PullInstantiationHelpers.getAllowedToReferenceTypeParametersFromDecl")
  @js.native
  def getAllowedToReferenceTypeParametersFromDecl(decl: typingsSlinky.typescriptServices.TypeScript.PullDecl): js.Array[typingsSlinky.typescriptServices.TypeScript.PullTypeParameterSymbol] = js.native
  
  @JSGlobal("TypeScript.PullInstantiationHelpers.instantiateTypeArgument")
  @js.native
  def instantiateTypeArgument(
    resolver: typingsSlinky.typescriptServices.TypeScript.PullTypeResolver,
    symbol: InstantiableSymbol,
    mutableTypeParameterMap: typingsSlinky.typescriptServices.TypeScript.PullInstantiationHelpers.MutableTypeArgumentMap
  ): Unit = js.native
  
  @JSGlobal("TypeScript.PullInstantiationHelpers.twoTypesAreInstantiationsOfSameNamedGenericType")
  @js.native
  def twoTypesAreInstantiationsOfSameNamedGenericType(
    type1: typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol,
    type2: typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol
  ): Boolean = js.native
  
  @JSGlobal("TypeScript.PullInstantiationHelpers.updateMutableTypeParameterArgumentMap")
  @js.native
  def updateMutableTypeParameterArgumentMap(
    typeParameters: js.Array[typingsSlinky.typescriptServices.TypeScript.PullTypeParameterSymbol],
    typeArguments: js.Array[typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol],
    mutableMap: typingsSlinky.typescriptServices.TypeScript.PullInstantiationHelpers.MutableTypeArgumentMap
  ): Unit = js.native
  
  @JSGlobal("TypeScript.PullInstantiationHelpers.updateTypeParameterArgumentMap")
  @js.native
  def updateTypeParameterArgumentMap(
    typeParameters: js.Array[typingsSlinky.typescriptServices.TypeScript.PullTypeParameterSymbol],
    typeArguments: js.Array[typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol],
    typeParameterArgumentMap: TypeArgumentMap
  ): TypeArgumentMap = js.native
}
