package typingsSlinky.vueTemplateCompiler.mod

import typingsSlinky.vueTemplateCompiler.vueTemplateCompilerBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompilerOptionsWithSourceRange extends CompilerOptions {
  @JSName("outputSourceRange")
  var outputSourceRange_CompilerOptionsWithSourceRange: `true` = js.native
}

object CompilerOptionsWithSourceRange {
  @scala.inline
  def apply(outputSourceRange: `true`): CompilerOptionsWithSourceRange = {
    val __obj = js.Dynamic.literal(outputSourceRange = outputSourceRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilerOptionsWithSourceRange]
  }
  @scala.inline
  implicit class CompilerOptionsWithSourceRangeOps[Self <: CompilerOptionsWithSourceRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutputSourceRange(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputSourceRange")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

