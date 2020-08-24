package typingsSlinky.tablesorter.uidatecompareoptionsMod

import typingsSlinky.jqueryui.JQueryUI.DatepickerOptions
import typingsSlinky.tablesorter.comparableOptionsMod.ComparableOptions
import typingsSlinky.tablesorter.controlOptionsMod.ControlOptions
import typingsSlinky.tablesorter.dateOptionsMod.DateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIDateCompareOptions
  extends DatepickerOptions
     with DateOptions
     with ControlOptions
     with ComparableOptions

object UIDateCompareOptions {
  @scala.inline
  def apply(): UIDateCompareOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIDateCompareOptions]
  }
}

