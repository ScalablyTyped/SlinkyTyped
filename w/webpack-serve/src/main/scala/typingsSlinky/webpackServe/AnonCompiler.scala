package typingsSlinky.webpackServe

import typingsSlinky.webpack.mod.Compiler_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCompiler extends js.Object {
  var compiler: Compiler_ = js.native
}

object AnonCompiler {
  @scala.inline
  def apply(compiler: Compiler_): AnonCompiler = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCompiler]
  }
  @scala.inline
  implicit class AnonCompilerOps[Self <: AnonCompiler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompiler(value: Compiler_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiler")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

