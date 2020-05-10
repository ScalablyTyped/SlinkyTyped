package typingsSlinky.uiGrid.mod.treeBase

import typingsSlinky.uiGrid.AnonAVG_
import typingsSlinky.uiGrid.mod.ISharedTreeConstants
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUiGridTreeBaseConstants extends ISharedTreeConstants {
  var featureName: String = js.native
}

object IUiGridTreeBaseConstants {
  @scala.inline
  def apply(
    COLLAPSED: String,
    EXPANDED: String,
    aggregation: AnonAVG_,
    featureName: String,
    rowHeaderColName: String
  ): IUiGridTreeBaseConstants = {
    val __obj = js.Dynamic.literal(COLLAPSED = COLLAPSED.asInstanceOf[js.Any], EXPANDED = EXPANDED.asInstanceOf[js.Any], aggregation = aggregation.asInstanceOf[js.Any], featureName = featureName.asInstanceOf[js.Any], rowHeaderColName = rowHeaderColName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUiGridTreeBaseConstants]
  }
  @scala.inline
  implicit class IUiGridTreeBaseConstantsOps[Self <: IUiGridTreeBaseConstants] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeatureName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

