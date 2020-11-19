package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.TypeArgumentMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.PullInstantiatedTypeReferenceSymbol")
@js.native
class PullInstantiatedTypeReferenceSymbol protected ()
  extends typingsSlinky.typescriptServices.TypeScript.PullInstantiatedTypeReferenceSymbol {
  def this(
    referencedTypeSymbol: typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol,
    _typeParameterArgumentMap: TypeArgumentMap,
    isInstanceReferenceType: Boolean
  ) = this()
}
/* static members */
@JSGlobal("TypeScript.PullInstantiatedTypeReferenceSymbol")
@js.native
object PullInstantiatedTypeReferenceSymbol extends js.Object {
  
  def create(
    resolver: typingsSlinky.typescriptServices.TypeScript.PullTypeResolver,
    `type`: typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol,
    typeParameterArgumentMap: TypeArgumentMap
  ): typingsSlinky.typescriptServices.TypeScript.PullInstantiatedTypeReferenceSymbol = js.native
}
