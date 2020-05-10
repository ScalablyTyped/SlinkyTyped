package typingsSlinky.tablesorter.pagerClassesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagerClasses extends js.Object {
  /**
    * A set of css-classes to apply to the container.
    */
  var container: js.UndefOr[String] = js.native
  /**
    * The css-class to apply to disabled pager-controls.
    */
  var disabled: js.UndefOr[String] = js.native
  /**
    * The css-class to apply to the table-row which displays the error-message in case of an ajax-error.
    */
  var errorRow: js.UndefOr[String] = js.native
}

object PagerClasses {
  @scala.inline
  def apply(): PagerClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PagerClasses]
  }
  @scala.inline
  implicit class PagerClassesOps[Self <: PagerClasses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorRow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorRow")(js.undefined)
        ret
    }
  }
  
}

