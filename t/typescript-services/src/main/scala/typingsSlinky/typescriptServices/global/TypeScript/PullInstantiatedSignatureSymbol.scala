package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.TypeArgumentMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PullInstantiatedSignatureSymbol")
@js.native
class PullInstantiatedSignatureSymbol protected ()
  extends typingsSlinky.typescriptServices.TypeScript.PullInstantiatedSignatureSymbol {
  def this(
    rootSignature: typingsSlinky.typescriptServices.TypeScript.PullSignatureSymbol,
    _typeParameterArgumentMap: TypeArgumentMap
  ) = this()
  /* CompleteClass */
  override def getAllowedToReferenceTypeParameters(): js.Array[typingsSlinky.typescriptServices.TypeScript.PullTypeParameterSymbol] = js.native
  /* CompleteClass */
  override def getIsSpecialized(): Boolean = js.native
  /* CompleteClass */
  override def getTypeParameterArgumentMap(): TypeArgumentMap = js.native
}

