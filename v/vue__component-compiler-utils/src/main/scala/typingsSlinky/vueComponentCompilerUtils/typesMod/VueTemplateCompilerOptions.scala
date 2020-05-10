package typingsSlinky.vueComponentCompilerUtils.typesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vueComponentCompilerUtils.vueComponentCompilerUtilsStrings.condense
import typingsSlinky.vueComponentCompilerUtils.vueComponentCompilerUtilsStrings.preserve
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueTemplateCompilerOptions extends js.Object {
  var directives: js.UndefOr[StringDictionary[js.Function]] = js.native
  var modules: js.UndefOr[js.Array[js.Object]] = js.native
  var outputSourceRange: js.UndefOr[Boolean] = js.native
  var whitespace: js.UndefOr[preserve | condense] = js.native
}

object VueTemplateCompilerOptions {
  @scala.inline
  def apply(): VueTemplateCompilerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VueTemplateCompilerOptions]
  }
  @scala.inline
  implicit class VueTemplateCompilerOptionsOps[Self <: VueTemplateCompilerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectives(value: StringDictionary[js.Function]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directives")(js.undefined)
        ret
    }
    @scala.inline
    def withModules(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputSourceRange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputSourceRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputSourceRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputSourceRange")(js.undefined)
        ret
    }
    @scala.inline
    def withWhitespace(value: preserve | condense): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhitespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitespace")(js.undefined)
        ret
    }
  }
  
}

