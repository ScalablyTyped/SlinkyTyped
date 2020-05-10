package typingsSlinky.sugarCore.sugarjs.Object

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChainableBase[RawValue] extends js.Object {
  var raw: RawValue = js.native
}

object ChainableBase {
  @scala.inline
  def apply[RawValue](raw: RawValue): ChainableBase[RawValue] = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChainableBase[RawValue]]
  }
  @scala.inline
  implicit class ChainableBaseOps[Self[rawvalue] <: ChainableBase[rawvalue], RawValue] (val x: Self[RawValue]) extends AnyVal {
    @scala.inline
    def duplicate: Self[RawValue] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[RawValue]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[RawValue] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[RawValue] with Other]
    @scala.inline
    def withRaw(value: RawValue): Self[RawValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

