package typingsSlinky.vueComponentCompilerUtils.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueTemplateCompilerResults extends js.Object {
  var ast: js.UndefOr[js.Object] = js.native
  var errors: js.Array[String | ErrorWithRange] = js.native
  var render: String = js.native
  var staticRenderFns: js.Array[String] = js.native
  var tips: js.Array[String | ErrorWithRange] = js.native
}

object VueTemplateCompilerResults {
  @scala.inline
  def apply(
    errors: js.Array[String | ErrorWithRange],
    render: String,
    staticRenderFns: js.Array[String],
    tips: js.Array[String | ErrorWithRange]
  ): VueTemplateCompilerResults = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], staticRenderFns = staticRenderFns.asInstanceOf[js.Any], tips = tips.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueTemplateCompilerResults]
  }
  @scala.inline
  implicit class VueTemplateCompilerResultsOps[Self <: VueTemplateCompilerResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: js.Array[String | ErrorWithRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRender(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStaticRenderFns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticRenderFns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTips(value: js.Array[String | ErrorWithRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAst(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ast")(js.undefined)
        ret
    }
  }
  
}

