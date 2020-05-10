package typingsSlinky.stdMocks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStdout extends js.Object {
  var stdout: js.Array[String] = js.native
}

object AnonStdout {
  @scala.inline
  def apply(stdout: js.Array[String]): AnonStdout = {
    val __obj = js.Dynamic.literal(stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStdout]
  }
  @scala.inline
  implicit class AnonStdoutOps[Self <: AnonStdout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStdout(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

