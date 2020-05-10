package typingsSlinky.titanium

import typingsSlinky.titanium.Titanium.Database.ResultSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple `Error` instance thrown from the
  * [executeAll](Titanium.Database.DB.executeAll) method in case of failure
  */
@js.native
trait BatchQueryError extends js.Object {
  /**
  	 * Index of the failed query
  	 */
  var index: js.UndefOr[Double] = js.native
  /**
  	 * partial `ResultSet`s of any successful queries before the failure
  	 */
  var results: js.UndefOr[js.Array[ResultSet]] = js.native
}

object BatchQueryError {
  @scala.inline
  def apply(): BatchQueryError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchQueryError]
  }
  @scala.inline
  implicit class BatchQueryErrorOps[Self <: BatchQueryError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withResults(value: js.Array[ResultSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(js.undefined)
        ret
    }
  }
  
}

