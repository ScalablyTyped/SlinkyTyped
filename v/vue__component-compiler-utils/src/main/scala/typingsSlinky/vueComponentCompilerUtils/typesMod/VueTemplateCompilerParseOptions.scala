package typingsSlinky.vueComponentCompilerUtils.typesMod

import typingsSlinky.vueComponentCompilerUtils.vueComponentCompilerUtilsStrings.line
import typingsSlinky.vueComponentCompilerUtils.vueComponentCompilerUtilsStrings.space
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueTemplateCompilerParseOptions extends js.Object {
  var pad: js.UndefOr[line | space] = js.native
}

object VueTemplateCompilerParseOptions {
  @scala.inline
  def apply(): VueTemplateCompilerParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VueTemplateCompilerParseOptions]
  }
  @scala.inline
  implicit class VueTemplateCompilerParseOptionsOps[Self <: VueTemplateCompilerParseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPad(value: line | space): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pad")(js.undefined)
        ret
    }
  }
  
}

