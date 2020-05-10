package typingsSlinky.vueTemplateCompiler.mod

import typingsSlinky.vueTemplateCompiler.vueTemplateCompilerNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASTText extends ASTNode {
  var isComment: js.UndefOr[Boolean] = js.native
  // 2.4 ssr optimization
  var ssrOptimizability: js.UndefOr[SSROptimizability] = js.native
  var static: js.UndefOr[Boolean] = js.native
  var text: String = js.native
  var `type`: `3` = js.native
}

object ASTText {
  @scala.inline
  def apply(text: String, `type`: `3`): ASTText = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTText]
  }
  @scala.inline
  implicit class ASTTextOps[Self <: ASTText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: `3`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsComment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isComment")(js.undefined)
        ret
    }
    @scala.inline
    def withSsrOptimizability(value: SSROptimizability): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssrOptimizability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsrOptimizability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssrOptimizability")(js.undefined)
        ret
    }
    @scala.inline
    def withStatic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(js.undefined)
        ret
    }
  }
  
}

