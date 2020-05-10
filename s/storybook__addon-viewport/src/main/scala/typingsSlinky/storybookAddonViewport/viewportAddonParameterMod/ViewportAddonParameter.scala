package typingsSlinky.storybookAddonViewport.viewportAddonParameterMod

import typingsSlinky.storybookAddonViewport.viewportMod.ViewportMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewportAddonParameter extends js.Object {
  var defaultViewport: js.UndefOr[String] = js.native
  var disable: js.UndefOr[Boolean] = js.native
  var viewports: js.UndefOr[ViewportMap] = js.native
}

object ViewportAddonParameter {
  @scala.inline
  def apply(): ViewportAddonParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewportAddonParameter]
  }
  @scala.inline
  implicit class ViewportAddonParameterOps[Self <: ViewportAddonParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultViewport(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultViewport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultViewport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultViewport")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.undefined)
        ret
    }
    @scala.inline
    def withViewports(value: ViewportMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewports")(js.undefined)
        ret
    }
  }
  
}

