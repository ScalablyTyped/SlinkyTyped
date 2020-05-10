package typingsSlinky.storybookAddonJsx.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddonParameters extends js.Object {
  var displayName: js.UndefOr[String | displayNameFunc] = js.native
  var enableBeautify: js.UndefOr[Boolean] = js.native
  var onBeforeRender: js.UndefOr[js.Function1[/* domString */ String, String]] = js.native
  var skip: js.UndefOr[Double] = js.native
}

object AddonParameters {
  @scala.inline
  def apply(): AddonParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddonParameters]
  }
  @scala.inline
  implicit class AddonParametersOps[Self <: AddonParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayNameFunction1(value: /* element */ ReactElement => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisplayName(value: String | displayNameFunc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableBeautify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableBeautify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableBeautify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableBeautify")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeRender(value: /* domString */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeRender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeRender")(js.undefined)
        ret
    }
    @scala.inline
    def withSkip(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.undefined)
        ret
    }
  }
  
}

