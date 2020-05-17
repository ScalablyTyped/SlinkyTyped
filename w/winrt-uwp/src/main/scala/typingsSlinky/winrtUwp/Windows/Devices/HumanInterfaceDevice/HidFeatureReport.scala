package typingsSlinky.winrtUwp.Windows.Devices.HumanInterfaceDevice

import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a feature report. */
@js.native
trait HidFeatureReport extends js.Object {
  /** Retrieves, or sets, the data associated with a given feature report. */
  var data: IBuffer = js.native
  /** Retrieves the identifier associated with a given feature report. */
  var id: Double = js.native
  /**
    * Retrieves the Boolean control associated with the usagePage and usageIdparameter and found in the given feature report.
    * @param usagePage The usage page of the top-level collection for the given HID device.
    * @param usageId The usage identifier of the top-level collection for the given HID device.
    * @return A HidBooleanControl object.
    */
  def getBooleanControl(usagePage: Double, usageId: Double): HidBooleanControl = js.native
  /**
    * Retrieves the Boolean control described by the controlDescription parameter and found in the given feature report.
    * @param controlDescription A HidBooleanControlDescription object.
    * @return A HidBooleanControl object.
    */
  def getBooleanControlByDescription(controlDescription: HidBooleanControlDescription): HidBooleanControl = js.native
  /**
    * Retrieves the numeric control associated with the usagePage and usageId parameters and found in the given feature report.
    * @param usagePage The usage page of the top-level collection for the given HID device.
    * @param usageId The usage identifier of the top-level collection for the given HID device.
    * @return A HidNumericControl object.
    */
  def getNumericControl(usagePage: Double, usageId: Double): HidNumericControl = js.native
  /**
    * Retrieves the numeric control described by the controlDescription parameter and found in the given feature report.
    * @param controlDescription A HidNumericControlDescription object.
    * @return A HidNumericControl object.
    */
  def getNumericControlByDescription(controlDescription: HidNumericControlDescription): HidNumericControl = js.native
}

object HidFeatureReport {
  @scala.inline
  def apply(
    data: IBuffer,
    getBooleanControl: (Double, Double) => HidBooleanControl,
    getBooleanControlByDescription: HidBooleanControlDescription => HidBooleanControl,
    getNumericControl: (Double, Double) => HidNumericControl,
    getNumericControlByDescription: HidNumericControlDescription => HidNumericControl,
    id: Double
  ): HidFeatureReport = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getBooleanControl = js.Any.fromFunction2(getBooleanControl), getBooleanControlByDescription = js.Any.fromFunction1(getBooleanControlByDescription), getNumericControl = js.Any.fromFunction2(getNumericControl), getNumericControlByDescription = js.Any.fromFunction1(getNumericControlByDescription), id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[HidFeatureReport]
  }
  @scala.inline
  implicit class HidFeatureReportOps[Self <: HidFeatureReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetBooleanControl(value: (Double, Double) => HidBooleanControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBooleanControl")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetBooleanControlByDescription(value: HidBooleanControlDescription => HidBooleanControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBooleanControlByDescription")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNumericControl(value: (Double, Double) => HidNumericControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNumericControl")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetNumericControlByDescription(value: HidNumericControlDescription => HidNumericControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNumericControlByDescription")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

