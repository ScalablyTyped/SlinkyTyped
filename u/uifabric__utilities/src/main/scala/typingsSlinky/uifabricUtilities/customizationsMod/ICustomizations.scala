package typingsSlinky.uifabricUtilities.customizationsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustomizations extends js.Object {
  var inCustomizerContext: js.UndefOr[Boolean] = js.native
  var scopedSettings: StringDictionary[ISettings] = js.native
  var settings: ISettings = js.native
}

object ICustomizations {
  @scala.inline
  def apply(scopedSettings: StringDictionary[ISettings], settings: ISettings): ICustomizations = {
    val __obj = js.Dynamic.literal(scopedSettings = scopedSettings.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomizations]
  }
  @scala.inline
  implicit class ICustomizationsOps[Self <: ICustomizations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScopedSettings(value: StringDictionary[ISettings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopedSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSettings(value: ISettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInCustomizerContext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inCustomizerContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInCustomizerContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inCustomizerContext")(js.undefined)
        ret
    }
  }
  
}

