package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.TypeArgumentMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PullTypeReferenceSymbol")
@js.native
class PullTypeReferenceSymbol protected ()
  extends typingsSlinky.typescriptServices.TypeScript.PullTypeReferenceSymbol {
  def this(referencedTypeSymbol: typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol) = this()
  /* CompleteClass */
  override def getAllowedToReferenceTypeParameters(): js.Array[typingsSlinky.typescriptServices.TypeScript.PullTypeParameterSymbol] = js.native
  /* CompleteClass */
  override def getIsSpecialized(): Boolean = js.native
  /* CompleteClass */
  override def getTypeParameterArgumentMap(): TypeArgumentMap = js.native
}

/* static members */
@JSImport("typescript-services", "PullTypeReferenceSymbol")
@js.native
object PullTypeReferenceSymbol extends js.Object {
  def createTypeReference(`type`: typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol): typingsSlinky.typescriptServices.TypeScript.PullTypeReferenceSymbol = js.native
}

