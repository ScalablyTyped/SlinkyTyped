package typingsSlinky.yandexMaps.mod.behavior

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRightMouseButtonMagnifierOptions extends js.Object {
  var actionCursor: js.UndefOr[String] = js.native
  var duration: js.UndefOr[Double] = js.native
}

object IRightMouseButtonMagnifierOptions {
  @scala.inline
  def apply(): IRightMouseButtonMagnifierOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRightMouseButtonMagnifierOptions]
  }
  @scala.inline
  implicit class IRightMouseButtonMagnifierOptionsOps[Self <: IRightMouseButtonMagnifierOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionCursor")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
  }
  
}

