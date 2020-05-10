package typingsSlinky.xrm.Xrm.Controls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for showAutoComplete argument
  */
@js.native
trait AutoCompleteResultSet extends js.Object {
  /**
    * Command to show/execute at the bottom of the results displayed
    */
  var commands: js.UndefOr[AutoCompleteCommand] = js.native
  /**
    * Results to show
    */
  var results: js.Array[AutoCompleteResult] = js.native
}

object AutoCompleteResultSet {
  @scala.inline
  def apply(results: js.Array[AutoCompleteResult]): AutoCompleteResultSet = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCompleteResultSet]
  }
  @scala.inline
  implicit class AutoCompleteResultSetOps[Self <: AutoCompleteResultSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResults(value: js.Array[AutoCompleteResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommands(value: AutoCompleteCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(js.undefined)
        ret
    }
  }
  
}

