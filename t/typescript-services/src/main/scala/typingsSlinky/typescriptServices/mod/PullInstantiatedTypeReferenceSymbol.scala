package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.TypeArgumentMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "PullInstantiatedTypeReferenceSymbol")
@js.native
class PullInstantiatedTypeReferenceSymbol protected ()
  extends typingsSlinky.typescriptServices.TypeScript.PullInstantiatedTypeReferenceSymbol {
  def this(
    referencedTypeSymbol: typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol,
    _typeParameterArgumentMap: TypeArgumentMap,
    isInstanceReferenceType: Boolean
  ) = this()
}
object PullInstantiatedTypeReferenceSymbol {
  
  /* static member */
  @JSImport("typescript-services", "PullInstantiatedTypeReferenceSymbol.create")
  @js.native
  def create(
    resolver: typingsSlinky.typescriptServices.TypeScript.PullTypeResolver,
    `type`: typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol,
    typeParameterArgumentMap: TypeArgumentMap
  ): typingsSlinky.typescriptServices.TypeScript.PullInstantiatedTypeReferenceSymbol = js.native
}
