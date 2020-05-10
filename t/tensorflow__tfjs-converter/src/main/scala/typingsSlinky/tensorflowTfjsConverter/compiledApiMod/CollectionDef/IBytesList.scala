package typingsSlinky.tensorflowTfjsConverter.compiledApiMod.CollectionDef

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a BytesList. */
@js.native
trait IBytesList extends js.Object {
  /** BytesList value */
  var value: js.UndefOr[js.Array[js.typedarray.Uint8Array] | Null] = js.native
}

object IBytesList {
  @scala.inline
  def apply(): IBytesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBytesList]
  }
  @scala.inline
  implicit class IBytesListOps[Self <: IBytesList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: js.Array[js.typedarray.Uint8Array]): Self = {
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

