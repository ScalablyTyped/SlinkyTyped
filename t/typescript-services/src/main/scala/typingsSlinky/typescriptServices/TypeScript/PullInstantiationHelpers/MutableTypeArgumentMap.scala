package typingsSlinky.typescriptServices.TypeScript.PullInstantiationHelpers

import typingsSlinky.typescriptServices.TypeScript.TypeArgumentMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutableTypeArgumentMap extends js.Object {
  var createdDuplicateTypeArgumentMap: Boolean = js.native
  var typeParameterArgumentMap: TypeArgumentMap = js.native
  def ensureTypeArgumentCopy(): Unit = js.native
}

object MutableTypeArgumentMap {
  @scala.inline
  def apply(
    createdDuplicateTypeArgumentMap: Boolean,
    ensureTypeArgumentCopy: () => Unit,
    typeParameterArgumentMap: TypeArgumentMap
  ): MutableTypeArgumentMap = {
    val __obj = js.Dynamic.literal(createdDuplicateTypeArgumentMap = createdDuplicateTypeArgumentMap.asInstanceOf[js.Any], ensureTypeArgumentCopy = js.Any.fromFunction0(ensureTypeArgumentCopy), typeParameterArgumentMap = typeParameterArgumentMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutableTypeArgumentMap]
  }
  @scala.inline
  implicit class MutableTypeArgumentMapOps[Self <: MutableTypeArgumentMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedDuplicateTypeArgumentMap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDuplicateTypeArgumentMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnsureTypeArgumentCopy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ensureTypeArgumentCopy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTypeParameterArgumentMap(value: TypeArgumentMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeParameterArgumentMap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

