package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.TypeArgumentMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PullInstantiatedTypeParameterSymbol")
@js.native
class PullInstantiatedTypeParameterSymbol protected ()
  extends typingsSlinky.typescriptServices.TypeScript.PullInstantiatedTypeParameterSymbol {
  def this(
    rootTypeParameter: typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol,
    constraintType: typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol
  ) = this()
  /* CompleteClass */
  override def getAllowedToReferenceTypeParameters(): js.Array[typingsSlinky.typescriptServices.TypeScript.PullTypeParameterSymbol] = js.native
  /* CompleteClass */
  override def getIsSpecialized(): Boolean = js.native
  /* CompleteClass */
  override def getTypeParameterArgumentMap(): TypeArgumentMap = js.native
}

