package typingsSlinky.stdMocks.anon

import typingsSlinky.stdMocks.stdMocksBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std-mocks.std-mocks.Options & {  stdout  :false} */
@js.native
trait Optionsstdoutfalse extends js.Object {
  var stderr: js.UndefOr[Boolean] = js.native
  var stdout: js.UndefOr[Boolean with `false`] = js.native
}

object Optionsstdoutfalse {
  @scala.inline
  def apply(): Optionsstdoutfalse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Optionsstdoutfalse]
  }
  @scala.inline
  implicit class OptionsstdoutfalseOps[Self <: Optionsstdoutfalse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStderr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stderr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStderr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stderr")(js.undefined)
        ret
    }
    @scala.inline
    def withStdout(value: Boolean with `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStdout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdout")(js.undefined)
        ret
    }
  }
  
}

