package typingsSlinky.tensorflowTfjsConverter.compiledApiMod.CollectionDef

import typingsSlinky.tensorflowTfjsConverter.compiledApiMod.IAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an AnyList. */
@js.native
trait IAnyList extends js.Object {
  /** AnyList value */
  var value: js.UndefOr[js.Array[IAny] | Null] = js.native
}

object IAnyList {
  @scala.inline
  def apply(): IAnyList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAnyList]
  }
  @scala.inline
  implicit class IAnyListOps[Self <: IAnyList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: js.Array[IAny]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(null)
        ret
    }
  }
  
}

