package typingsSlinky.semanticUiPopup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'lastResort'> */
@js.native
trait PickImpllastResort extends js.Object {
  var lastResort: Boolean | String = js.native
}

object PickImpllastResort {
  @scala.inline
  def apply(lastResort: Boolean | String): PickImpllastResort = {
    val __obj = js.Dynamic.literal(lastResort = lastResort.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpllastResort]
  }
  @scala.inline
  implicit class PickImpllastResortOps[Self <: PickImpllastResort] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastResort(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastResort")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

