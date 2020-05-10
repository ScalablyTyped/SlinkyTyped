package typingsSlinky.stdMocks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStderr extends js.Object {
  var stderr: js.Array[String] = js.native
}

object AnonStderr {
  @scala.inline
  def apply(stderr: js.Array[String]): AnonStderr = {
    val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStderr]
  }
  @scala.inline
  implicit class AnonStderrOps[Self <: AnonStderr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStderr(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stderr")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

