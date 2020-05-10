package typingsSlinky.vueTemplateCompiler.mod

import typingsSlinky.vueTemplateCompiler.vueTemplateCompilerBooleans.`true`
import typingsSlinky.vueTemplateCompiler.vueTemplateCompilerStrings.line
import typingsSlinky.vueTemplateCompiler.vueTemplateCompilerStrings.space
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * SFC parser related types
  */
@js.native
trait SFCParserOptions extends js.Object {
  var deindent: js.UndefOr[Boolean] = js.native
  var pad: js.UndefOr[`true` | line | space] = js.native
}

object SFCParserOptions {
  @scala.inline
  def apply(): SFCParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SFCParserOptions]
  }
  @scala.inline
  implicit class SFCParserOptionsOps[Self <: SFCParserOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeindent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deindent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeindent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deindent")(js.undefined)
        ret
    }
    @scala.inline
    def withPad(value: `true` | line | space): Self = {
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

