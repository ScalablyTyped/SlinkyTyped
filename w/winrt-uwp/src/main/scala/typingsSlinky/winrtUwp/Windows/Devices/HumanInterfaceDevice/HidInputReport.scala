package typingsSlinky.winrtUwp.Windows.Devices.HumanInterfaceDevice

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an input report. */
@js.native
trait HidInputReport extends js.Object {
  /** Retrieves the currently activated Boolean controls for the given HID device. */
  var activatedBooleanControls: IVectorView[HidBooleanControl] = js.native
  /** Retrieves the data associated with a given input report. */
  var data: IBuffer = js.native
  var getBooleanControl: js.Any = js.native
  var getNumericControl: js.Any = js.native
  /** Retrieves the identifier associated with a given input report. */
  var id: Double = js.native
  /** Retrieves the recently transitioned Boolean controls for the given HID device. */
  var transitionedBooleanControls: IVectorView[HidBooleanControl] = js.native
   /* unmapped type */ /**
    * Retrieves the Boolean control described by the controlDescription parameter and found in the given input report.
    * @param controlDescription A HidBooleanControlDescription object.
    * @return A HidBooleanControl object.
    */
  def getBooleanControlByDescription(controlDescription: HidBooleanControlDescription): HidBooleanControl = js.native
   /* unmapped type */ /**
    * Retrieves the numeric control described by the controlDescription parameter and found in the given input report.
    * @param controlDescription A HidNumericControlDescription object.
    * @return A HidNumericControl object.
    */
  def getNumericControlByDescription(controlDescription: HidNumericControlDescription): HidNumericControl = js.native
}

object HidInputReport {
  @scala.inline
  def apply(
    activatedBooleanControls: IVectorView[HidBooleanControl],
    data: IBuffer,
    getBooleanControl: js.Any,
    getBooleanControlByDescription: HidBooleanControlDescription => HidBooleanControl,
    getNumericControl: js.Any,
    getNumericControlByDescription: HidNumericControlDescription => HidNumericControl,
    id: Double,
    transitionedBooleanControls: IVectorView[HidBooleanControl]
  ): HidInputReport = {
    val __obj = js.Dynamic.literal(activatedBooleanControls = activatedBooleanControls.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], getBooleanControl = getBooleanControl.asInstanceOf[js.Any], getBooleanControlByDescription = js.Any.fromFunction1(getBooleanControlByDescription), getNumericControl = getNumericControl.asInstanceOf[js.Any], getNumericControlByDescription = js.Any.fromFunction1(getNumericControlByDescription), id = id.asInstanceOf[js.Any], transitionedBooleanControls = transitionedBooleanControls.asInstanceOf[js.Any])
    __obj.asInstanceOf[HidInputReport]
  }
  @scala.inline
  implicit class HidInputReportOps[Self <: HidInputReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivatedBooleanControls(value: IVectorView[HidBooleanControl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activatedBooleanControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetBooleanControl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBooleanControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetBooleanControlByDescription(value: HidBooleanControlDescription => HidBooleanControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBooleanControlByDescription")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNumericControl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNumericControl")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withTransitionedBooleanControls(value: IVectorView[HidBooleanControl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionedBooleanControls")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

