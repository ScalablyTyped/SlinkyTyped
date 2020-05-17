package typingsSlinky.storybookAddonJsx.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.storybookAddonJsx.mod.AddonParameters
import typingsSlinky.storybookAddons.typesMod.OptionsParameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @storybook/addons.@storybook/addons.Parameters & {  jsx  :storybook-addon-jsx.storybook-addon-jsx.AddonParameters} */
@js.native
trait ParametersjsxAddonParamet
  extends /* key */ StringDictionary[js.Any] {
  var fileName: js.UndefOr[String] = js.native
  var jsx: AddonParameters = js.native
  var options: js.UndefOr[OptionsParameter] = js.native
}

object ParametersjsxAddonParamet {
  @scala.inline
  def apply(jsx: AddonParameters): ParametersjsxAddonParamet = {
    val __obj = js.Dynamic.literal(jsx = jsx.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersjsxAddonParamet]
  }
  @scala.inline
  implicit class ParametersjsxAddonParametOps[Self <: ParametersjsxAddonParamet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJsx(value: AddonParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: OptionsParameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

