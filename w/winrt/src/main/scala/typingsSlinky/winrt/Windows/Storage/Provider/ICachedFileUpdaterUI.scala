package typingsSlinky.winrt.Windows.Storage.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICachedFileUpdaterUI extends js.Object {
  var onfileupdaterequested: js.Any = js.native
  var onuirequested: js.Any = js.native
  var title: String = js.native
  var uIStatus: UIStatus = js.native
  var updateTarget: CachedFileTarget = js.native
}

object ICachedFileUpdaterUI {
  @scala.inline
  def apply(
    onfileupdaterequested: js.Any,
    onuirequested: js.Any,
    title: String,
    uIStatus: UIStatus,
    updateTarget: CachedFileTarget
  ): ICachedFileUpdaterUI = {
    val __obj = js.Dynamic.literal(onfileupdaterequested = onfileupdaterequested.asInstanceOf[js.Any], onuirequested = onuirequested.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uIStatus = uIStatus.asInstanceOf[js.Any], updateTarget = updateTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICachedFileUpdaterUI]
  }
  @scala.inline
  implicit class ICachedFileUpdaterUIOps[Self <: ICachedFileUpdaterUI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnfileupdaterequested(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onfileupdaterequested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnuirequested(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onuirequested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUIStatus(value: UIStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uIStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateTarget(value: CachedFileTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTarget")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

