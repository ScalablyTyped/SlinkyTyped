package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.TypeArgumentMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PullTypeSymbol")
@js.native
class PullTypeSymbol protected ()
  extends typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol {
  def this(name: String, kind: typingsSlinky.typescriptServices.TypeScript.PullElementKind) = this()
  /* CompleteClass */
  override def getAllowedToReferenceTypeParameters(): js.Array[typingsSlinky.typescriptServices.TypeScript.PullTypeParameterSymbol] = js.native
  /* CompleteClass */
  override def getIsSpecialized(): Boolean = js.native
  /* CompleteClass */
  override def getTypeParameterArgumentMap(): TypeArgumentMap = js.native
}

