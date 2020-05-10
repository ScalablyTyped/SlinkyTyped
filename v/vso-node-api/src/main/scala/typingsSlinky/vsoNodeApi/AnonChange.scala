package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChange extends js.Object {
  var change: Double = js.native
  var changeset: Double = js.native
  var date: Double = js.native
  var latest: Double = js.native
  var mergeSource: Double = js.native
  var none: Double = js.native
  var shelveset: Double = js.native
  var tip: Double = js.native
}

object AnonChange {
  @scala.inline
  def apply(
    change: Double,
    changeset: Double,
    date: Double,
    latest: Double,
    mergeSource: Double,
    none: Double,
    shelveset: Double,
    tip: Double
  ): AnonChange = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], changeset = changeset.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], latest = latest.asInstanceOf[js.Any], mergeSource = mergeSource.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], shelveset = shelveset.asInstanceOf[js.Any], tip = tip.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChange]
  }
  @scala.inline
  implicit class AnonChangeOps[Self <: AnonChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatest(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMergeSource(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShelveset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shelveset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTip(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tip")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

