package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationPreloadState extends js.Object {
  var enabled: js.UndefOr[scala.Boolean] = js.native
  var headerValue: js.UndefOr[java.lang.String] = js.native
}

object NavigationPreloadState {
  @scala.inline
  def apply(): NavigationPreloadState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationPreloadState]
  }
  @scala.inline
  implicit class NavigationPreloadStateOps[Self <: NavigationPreloadState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderValue(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerValue")(js.undefined)
        ret
    }
  }
  
}

