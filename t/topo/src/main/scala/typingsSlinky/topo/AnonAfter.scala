package typingsSlinky.topo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAfter[TGroup] extends js.Object {
  var after: js.UndefOr[TGroup | js.Array[TGroup]] = js.native
  var before: js.UndefOr[TGroup | js.Array[TGroup]] = js.native
  var group: js.UndefOr[TGroup] = js.native
  var sort: js.UndefOr[Double] = js.native
}

object AnonAfter {
  @scala.inline
  def apply[TGroup](): AnonAfter[TGroup] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAfter[TGroup]]
  }
  @scala.inline
  implicit class AnonAfterOps[Self[tgroup] <: AnonAfter[tgroup], TGroup] (val x: Self[TGroup]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TGroup] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TGroup]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TGroup] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TGroup] with Other]
    @scala.inline
    def withAfter(value: TGroup | js.Array[TGroup]): Self[TGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfter: Self[TGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withBefore(value: TGroup | js.Array[TGroup]): Self[TGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBefore: Self[TGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: TGroup): Self[TGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self[TGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: Double): Self[TGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self[TGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
  }
  
}

