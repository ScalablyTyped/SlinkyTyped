package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstantiableSymbol extends js.Object {
  def getAllowedToReferenceTypeParameters(): js.Array[PullTypeParameterSymbol] = js.native
  def getIsSpecialized(): Boolean = js.native
  def getTypeParameterArgumentMap(): TypeArgumentMap = js.native
}

object InstantiableSymbol {
  @scala.inline
  def apply(
    getAllowedToReferenceTypeParameters: () => js.Array[PullTypeParameterSymbol],
    getIsSpecialized: () => Boolean,
    getTypeParameterArgumentMap: () => TypeArgumentMap
  ): InstantiableSymbol = {
    val __obj = js.Dynamic.literal(getAllowedToReferenceTypeParameters = js.Any.fromFunction0(getAllowedToReferenceTypeParameters), getIsSpecialized = js.Any.fromFunction0(getIsSpecialized), getTypeParameterArgumentMap = js.Any.fromFunction0(getTypeParameterArgumentMap))
    __obj.asInstanceOf[InstantiableSymbol]
  }
  @scala.inline
  implicit class InstantiableSymbolOps[Self <: InstantiableSymbol] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAllowedToReferenceTypeParameters(value: () => js.Array[PullTypeParameterSymbol]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllowedToReferenceTypeParameters")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIsSpecialized(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIsSpecialized")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTypeParameterArgumentMap(value: () => TypeArgumentMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTypeParameterArgumentMap")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

