package typingsSlinky.tableau.global.tableau

import typingsSlinky.tableau.tableau.Point
import typingsSlinky.tableau.tableau.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.DashboardObject")
@js.native
class DashboardObject ()
  extends typingsSlinky.tableau.tableau.DashboardObject {
  /** Gets the Dashboard object that contains this object. */
  /* CompleteClass */
  override def getDashboard(): typingsSlinky.tableau.tableau.Dashboard = js.native
  /**
    * Gets what the object represents, which is an enum with the following values:
    * BLANK, WORKSHEET, QUICK_FILTER, PARAMETER_CONTROL, PAGE_FILTER, LEGEND, TITLE, TEXT, IMAGE, WEB_PAGE.
    */
  /* CompleteClass */
  override def getObjectType(): typingsSlinky.tableau.tableau.DashboardObjectType = js.native
  /** Gets the coordinates relative to the top-left corner of the dashboard of the object. */
  /* CompleteClass */
  override def getPosition(): Point = js.native
  /** Gets the size of the object. */
  /* CompleteClass */
  override def getSize(): Size = js.native
  /** If getType() returns WORKSHEET, this contains a pointer to the Worksheet object. */
  /* CompleteClass */
  override def getWorksheet(): typingsSlinky.tableau.tableau.Worksheet = js.native
}

