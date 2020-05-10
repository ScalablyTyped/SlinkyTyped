package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Classifications extends js.Object {
  var endOfLineState: EndOfLineState = js.native
  var spans: js.Array[Double] = js.native
}

object Classifications {
  @scala.inline
  def apply(endOfLineState: EndOfLineState, spans: js.Array[Double]): Classifications = {
    val __obj = js.Dynamic.literal(endOfLineState = endOfLineState.asInstanceOf[js.Any], spans = spans.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classifications]
  }
  @scala.inline
  implicit class ClassificationsOps[Self <: Classifications] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndOfLineState(value: EndOfLineState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endOfLineState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpans(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spans")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

