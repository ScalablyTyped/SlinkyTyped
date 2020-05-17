package typingsSlinky.webpackPluginServe.anon

import typingsSlinky.webpack.mod.Compiler_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Apply extends js.Object {
  @JSName("apply")
  def apply(compiler: Compiler_): Unit = js.native
}

object Apply {
  @scala.inline
  def apply(apply: Compiler_ => Unit): Apply = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
    __obj.asInstanceOf[Apply]
  }
  @scala.inline
  implicit class ApplyOps[Self <: Apply] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApply(value: Compiler_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

