package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Change extends js.Object {
  var change: scala.Double = js.native
  var changeset: scala.Double = js.native
  var date: scala.Double = js.native
  var latest: scala.Double = js.native
  var mergeSource: scala.Double = js.native
  var none: scala.Double = js.native
  var shelveset: scala.Double = js.native
  var tip: scala.Double = js.native
}

object Change {
  @scala.inline
  def apply(
    change: scala.Double,
    changeset: scala.Double,
    date: scala.Double,
    latest: scala.Double,
    mergeSource: scala.Double,
    none: scala.Double,
    shelveset: scala.Double,
    tip: scala.Double
  ): Change = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], changeset = changeset.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], latest = latest.asInstanceOf[js.Any], mergeSource = mergeSource.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], shelveset = shelveset.asInstanceOf[js.Any], tip = tip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change]
  }
  @scala.inline
  implicit class ChangeOps[Self <: Change] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChange(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeset(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatest(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMergeSource(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShelveset(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shelveset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTip(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tip")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

