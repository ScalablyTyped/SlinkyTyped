package typingsSlinky.stdMocks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stderr extends js.Object {
  var stderr: js.Array[String] = js.native
}

object Stderr {
  @scala.inline
  def apply(stderr: js.Array[String]): Stderr = {
    val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stderr]
  }
  @scala.inline
  implicit class StderrOps[Self <: Stderr] (val x: Self) extends AnyVal {
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

