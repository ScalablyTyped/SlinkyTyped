package typingsSlinky.unityWebapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnitySettings extends js.Object {
  var iconUrl: String = js.native
  var name: String = js.native
  var onInit: js.Function = js.native
}

object UnitySettings {
  @scala.inline
  def apply(iconUrl: String, name: String, onInit: js.Function): UnitySettings = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onInit = onInit.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnitySettings]
  }
  @scala.inline
  implicit class UnitySettingsOps[Self <: UnitySettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIconUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnInit(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

