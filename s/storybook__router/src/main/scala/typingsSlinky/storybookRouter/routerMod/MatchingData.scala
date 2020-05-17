package typingsSlinky.storybookRouter.routerMod

import typingsSlinky.storybookRouter.anon.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchingData extends js.Object {
  var `match`: Null | Path = js.native
}

object MatchingData {
  @scala.inline
  def apply(): MatchingData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchingData]
  }
  @scala.inline
  implicit class MatchingDataOps[Self <: MatchingData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatch(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(null)
        ret
    }
  }
  
}

