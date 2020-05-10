package typingsSlinky.uiBox.splitPropsMod

import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplitProps[P, K /* <: /* keyof P */ String */] extends js.Object {
  var matchedProps: Pick[P, K] = js.native
  var remainingProps: Omit[P, K] = js.native
}

object SplitProps {
  @scala.inline
  def apply[P, K](matchedProps: Pick[P, K], remainingProps: Omit[P, K]): SplitProps[P, K] = {
    val __obj = js.Dynamic.literal(matchedProps = matchedProps.asInstanceOf[js.Any], remainingProps = remainingProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitProps[P, K]]
  }
  @scala.inline
  implicit class SplitPropsOps[Self[p, k] <: SplitProps[p, k], P, K] (val x: Self[P, K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P, K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P, K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[P, K]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[P, K]) with Other]
    @scala.inline
    def withMatchedProps(value: Pick[P, K]): Self[P, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchedProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemainingProps(value: Omit[P, K]): Self[P, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remainingProps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

