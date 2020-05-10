package typingsSlinky.xrm.Xrm.Url

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for defining parameters of a request to open a report with viewer.apsx (as with
  * window.open).  Useful for parsing out the keys and values into a string of the format:
  * "&key=value"
  *
  * @see {@link http://msdn.microsoft.com/en-us/library/gg328483.aspx External Link: Open forms, views, dialogs, and reports with a URL}
  */
@js.native
trait ReportOpenParameters extends js.Object {
  /**
    * The action to perform, as either "run" or "filter".
    * @remarks **Actions**:
    * * "run"       Executes the report with default filters.
    * * "filter"    Presents the user with the filter editor, and a "Run Report" button.
    */
  var action: ReportAction = js.native
  /**
    * The file name of the report.  For out-of-box reports, this parameter enables context-sensitive
    * help.
    */
  var helpID: js.UndefOr[String] = js.native
  /**
    * The unique identifier, held in the report's 'reportid' attribute, in Guid format.
    */
  var id: String = js.native
}

object ReportOpenParameters {
  @scala.inline
  def apply(action: ReportAction, id: String): ReportOpenParameters = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportOpenParameters]
  }
  @scala.inline
  implicit class ReportOpenParametersOps[Self <: ReportOpenParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: ReportAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelpID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelpID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpID")(js.undefined)
        ret
    }
  }
  
}

