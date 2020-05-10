package typingsSlinky.yandexMaps.mod.behavior

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMultiTouchOptions extends js.Object {
  var tremor: js.UndefOr[Double] = js.native
}

object IMultiTouchOptions {
  @scala.inline
  def apply(): IMultiTouchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMultiTouchOptions]
  }
  @scala.inline
  implicit class IMultiTouchOptionsOps[Self <: IMultiTouchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTremor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tremor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTremor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tremor")(js.undefined)
        ret
    }
  }
  
}

