package typingsSlinky.wxServerSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Boundaries extends js.Object {
  var boundaries: js.Array[_] = js.native
  var default: js.UndefOr[js.Any] = js.native
  var groupBy: js.Any = js.native
  var output: js.UndefOr[js.Object] = js.native
}

object Boundaries {
  @scala.inline
  def apply(boundaries: js.Array[_], groupBy: js.Any): Boundaries = {
    val __obj = js.Dynamic.literal(boundaries = boundaries.asInstanceOf[js.Any], groupBy = groupBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Boundaries]
  }
  @scala.inline
  implicit class BoundariesOps[Self <: Boundaries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundaries(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupBy(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withOutput(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
        ret
    }
  }
  
}

