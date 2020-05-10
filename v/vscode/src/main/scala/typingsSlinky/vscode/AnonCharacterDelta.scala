package typingsSlinky.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCharacterDelta extends js.Object {
  var characterDelta: js.UndefOr[Double] = js.native
  var lineDelta: js.UndefOr[Double] = js.native
}

object AnonCharacterDelta {
  @scala.inline
  def apply(): AnonCharacterDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCharacterDelta]
  }
  @scala.inline
  implicit class AnonCharacterDeltaOps[Self <: AnonCharacterDelta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharacterDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characterDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharacterDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characterDelta")(js.undefined)
        ret
    }
    @scala.inline
    def withLineDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineDelta")(js.undefined)
        ret
    }
  }
  
}

