package typingsSlinky.vueTemplateCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompiledResult[ErrorType] extends js.Object {
  var ast: js.UndefOr[ASTElement] = js.native
  var errors: js.Array[ErrorType] = js.native
  var render: String = js.native
  var staticRenderFns: js.Array[String] = js.native
  var tips: js.Array[ErrorType] = js.native
}

object CompiledResult {
  @scala.inline
  def apply[ErrorType](
    errors: js.Array[ErrorType],
    render: String,
    staticRenderFns: js.Array[String],
    tips: js.Array[ErrorType]
  ): CompiledResult[ErrorType] = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], staticRenderFns = staticRenderFns.asInstanceOf[js.Any], tips = tips.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompiledResult[ErrorType]]
  }
  @scala.inline
  implicit class CompiledResultOps[Self[errortype] <: CompiledResult[errortype], ErrorType] (val x: Self[ErrorType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ErrorType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ErrorType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ErrorType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ErrorType] with Other]
    @scala.inline
    def withErrors(value: js.Array[ErrorType]): Self[ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRender(value: String): Self[ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStaticRenderFns(value: js.Array[String]): Self[ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticRenderFns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTips(value: js.Array[ErrorType]): Self[ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAst(value: ASTElement): Self[ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAst: Self[ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ast")(js.undefined)
        ret
    }
  }
  
}

