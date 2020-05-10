package typingsSlinky.vueTemplateCompiler.mod

import typingsSlinky.std.Record
import typingsSlinky.vueTemplateCompiler.vueTemplateCompilerStrings.condense
import typingsSlinky.vueTemplateCompiler.vueTemplateCompilerStrings.preserve
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * Template compilation options / results
  */
@js.native
trait CompilerOptions extends js.Object {
  var directives: js.UndefOr[Record[String, DirectiveFunction]] = js.native
  var modules: js.UndefOr[js.Array[ModuleOptions]] = js.native
  var outputSourceRange: js.UndefOr[js.Any] = js.native
  var preserveWhitespace: js.UndefOr[Boolean] = js.native
  var whitespace: js.UndefOr[preserve | condense] = js.native
}

object CompilerOptions {
  @scala.inline
  def apply(): CompilerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompilerOptions]
  }
  @scala.inline
  implicit class CompilerOptionsOps[Self <: CompilerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectives(value: Record[String, DirectiveFunction]): Self = {
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
    def withModules(value: js.Array[ModuleOptions]): Self = {
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
    def withOutputSourceRange(value: js.Any): Self = {
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
    def withPreserveWhitespace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveWhitespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveWhitespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveWhitespace")(js.undefined)
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

