package typingsSlinky.sharepoint.global.CUI

import typingsSlinky.sharepoint.CUI.Alignment
import typingsSlinky.sharepoint.CUI.RowType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CUI.Section")
@js.native
class Section protected ()
  extends typingsSlinky.sharepoint.CUI.Section {
  /**
    * @param type  2 - OneRow, 3 - TwoRow, 4 - ThreeRow.
    * @param alignment 0 - Top, 2  - Middle,
    */
  def this(ribbon: typingsSlinky.sharepoint.CUI.Ribbon, id: String, `type`: RowType, alignment: Alignment) = this()
}

