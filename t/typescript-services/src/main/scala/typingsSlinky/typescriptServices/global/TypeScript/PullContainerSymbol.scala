package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.TypeArgumentMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PullContainerSymbol")
@js.native
class PullContainerSymbol protected ()
  extends typingsSlinky.typescriptServices.TypeScript.PullContainerSymbol {
  def this(name: String, kind: typingsSlinky.typescriptServices.TypeScript.PullElementKind) = this()
  /* CompleteClass */
  override def getAllowedToReferenceTypeParameters(): js.Array[typingsSlinky.typescriptServices.TypeScript.PullTypeParameterSymbol] = js.native
  /* CompleteClass */
  override def getIsSpecialized(): Boolean = js.native
  /* CompleteClass */
  override def getTypeParameterArgumentMap(): TypeArgumentMap = js.native
}

/* static members */
@JSGlobal("TypeScript.PullContainerSymbol")
@js.native
object PullContainerSymbol extends js.Object {
  def usedAsSymbol(
    containerSymbol: typingsSlinky.typescriptServices.TypeScript.PullSymbol,
    symbol: typingsSlinky.typescriptServices.TypeScript.PullSymbol
  ): Boolean = js.native
}

