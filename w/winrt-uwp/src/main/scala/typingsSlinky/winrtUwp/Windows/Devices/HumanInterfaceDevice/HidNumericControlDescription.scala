package typingsSlinky.winrtUwp.Windows.Devices.HumanInterfaceDevice

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a numeric control for a given HID device. */
@js.native
trait HidNumericControlDescription extends js.Object {
  /** Retrieves a Boolean value which indicates whether the control supports a null, or out-of-range, value. */
  var hasNull: Boolean = js.native
  /** Retrieves the identifier for a given numeric control. */
  var id: Double = js.native
  /** Retrieves a Boolean value indicating whether the given control values are absolute or relative. */
  var isAbsolute: Boolean = js.native
  /** Retrieves the logical maximum value for the given control. */
  var logicalMaximum: Double = js.native
  /** Retrieves the logical minimum value for the control. */
  var logicalMinimum: Double = js.native
  /** Retrieves the parent collections for a given numeric control. */
  var parentCollections: IVectorView[HidCollection] = js.native
  /** Retrieves the physical maximum-value for the given control. */
  var physicalMaximum: Double = js.native
  /** Retrieves the physical minimum-value for the given control. */
  var physicalMinimum: Double = js.native
  /** Retrieves the number of reports associated with the given control. */
  var reportCount: Double = js.native
  /** Retrieves the identifier for the report associated with the given numeric control. */
  var reportId: Double = js.native
  /** Retrieves the size, in bytes, of the given numeric control. */
  var reportSize: Double = js.native
  /** Retrieves the type of report associated with the given numeric control. */
  var reportType: HidReportType = js.native
  /** Retrieves the unit associated with the given numeric control. */
  var unit: Double = js.native
  /** Retrieves the unit exponent for the given numeric control. */
  var unitExponent: Double = js.native
  /** Retrieves the usage identifier associated with the given numeric control. */
  var usageId: Double = js.native
  /** Retrieves the usage page associated with the given numeric control. */
  var usagePage: Double = js.native
}

object HidNumericControlDescription {
  @scala.inline
  def apply(
    hasNull: Boolean,
    id: Double,
    isAbsolute: Boolean,
    logicalMaximum: Double,
    logicalMinimum: Double,
    parentCollections: IVectorView[HidCollection],
    physicalMaximum: Double,
    physicalMinimum: Double,
    reportCount: Double,
    reportId: Double,
    reportSize: Double,
    reportType: HidReportType,
    unit: Double,
    unitExponent: Double,
    usageId: Double,
    usagePage: Double
  ): HidNumericControlDescription = {
    val __obj = js.Dynamic.literal(hasNull = hasNull.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isAbsolute = isAbsolute.asInstanceOf[js.Any], logicalMaximum = logicalMaximum.asInstanceOf[js.Any], logicalMinimum = logicalMinimum.asInstanceOf[js.Any], parentCollections = parentCollections.asInstanceOf[js.Any], physicalMaximum = physicalMaximum.asInstanceOf[js.Any], physicalMinimum = physicalMinimum.asInstanceOf[js.Any], reportCount = reportCount.asInstanceOf[js.Any], reportId = reportId.asInstanceOf[js.Any], reportSize = reportSize.asInstanceOf[js.Any], reportType = reportType.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any], unitExponent = unitExponent.asInstanceOf[js.Any], usageId = usageId.asInstanceOf[js.Any], usagePage = usagePage.asInstanceOf[js.Any])
    __obj.asInstanceOf[HidNumericControlDescription]
  }
  @scala.inline
  implicit class HidNumericControlDescriptionOps[Self <: HidNumericControlDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasNull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasNull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAbsolute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAbsolute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogicalMaximum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logicalMaximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogicalMinimum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logicalMinimum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentCollections(value: IVectorView[HidCollection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentCollections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhysicalMaximum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("physicalMaximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhysicalMinimum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("physicalMinimum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReportCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReportId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReportSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReportType(value: HidReportType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnitExponent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitExponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsageId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsagePage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usagePage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

