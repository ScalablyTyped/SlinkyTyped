package typingsSlinky.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait IGridMetadata extends js.Object {
  var GridOperationalConstantsFieldKeyMap: js.UndefOr[NumberDictionary[String]] = js.native
  var GroupingLevel: js.UndefOr[Double] = js.native
  var GroupingPrefix: js.UndefOr[String] = js.native
  var IsGanttEnabled: js.UndefOr[Boolean] = js.native
  var IsHierarchyEnabled: js.UndefOr[Boolean] = js.native
  var IsSorted: js.UndefOr[Boolean] = js.native
  var KeyColumnName: String = js.native
  var RecordKeyHash: js.UndefOr[String] = js.native
  var RecordKeyOrderChanged: js.UndefOr[js.Any] = js.native
}

object IGridMetadata {
  @scala.inline
  def apply(KeyColumnName: String): IGridMetadata = {
    val __obj = js.Dynamic.literal(KeyColumnName = KeyColumnName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridMetadata]
  }
  @scala.inline
  implicit class IGridMetadataOps[Self <: IGridMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyColumnName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyColumnName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGridOperationalConstantsFieldKeyMap(value: NumberDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GridOperationalConstantsFieldKeyMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridOperationalConstantsFieldKeyMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GridOperationalConstantsFieldKeyMap")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupingLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupingLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupingLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupingLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupingPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupingPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupingPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupingPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withIsGanttEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsGanttEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsGanttEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsGanttEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHierarchyEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsHierarchyEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHierarchyEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsHierarchyEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSorted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsSorted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSorted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsSorted")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordKeyHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordKeyHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordKeyHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordKeyHash")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordKeyOrderChanged(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordKeyOrderChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordKeyOrderChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordKeyOrderChanged")(js.undefined)
        ret
    }
  }
  
}

