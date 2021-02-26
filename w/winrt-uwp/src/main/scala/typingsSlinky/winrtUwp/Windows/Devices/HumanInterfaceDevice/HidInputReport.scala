package typingsSlinky.winrtUwp.Windows.Devices.HumanInterfaceDevice

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an input report. */
@js.native
trait HidInputReport extends StObject {
  
  /** Retrieves the currently activated Boolean controls for the given HID device. */
  var activatedBooleanControls: IVectorView[HidBooleanControl] = js.native
  
  /** Retrieves the data associated with a given input report. */
  var data: IBuffer = js.native
  
  var getBooleanControl: js.Any = js.native
  
  /* unmapped type */
  /**
    * Retrieves the Boolean control described by the controlDescription parameter and found in the given input report.
    * @param controlDescription A HidBooleanControlDescription object.
    * @return A HidBooleanControl object.
    */
  def getBooleanControlByDescription(controlDescription: HidBooleanControlDescription): HidBooleanControl = js.native
  
  var getNumericControl: js.Any = js.native
  
  /* unmapped type */
  /**
    * Retrieves the numeric control described by the controlDescription parameter and found in the given input report.
    * @param controlDescription A HidNumericControlDescription object.
    * @return A HidNumericControl object.
    */
  def getNumericControlByDescription(controlDescription: HidNumericControlDescription): HidNumericControl = js.native
  
  /** Retrieves the identifier associated with a given input report. */
  var id: Double = js.native
  
  /** Retrieves the recently transitioned Boolean controls for the given HID device. */
  var transitionedBooleanControls: IVectorView[HidBooleanControl] = js.native
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
  implicit class HidInputReportMutableBuilder[Self <: HidInputReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivatedBooleanControls(value: IVectorView[HidBooleanControl]): Self = StObject.set(x, "activatedBooleanControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: IBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetBooleanControl(value: js.Any): Self = StObject.set(x, "getBooleanControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetBooleanControlByDescription(value: HidBooleanControlDescription => HidBooleanControl): Self = StObject.set(x, "getBooleanControlByDescription", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNumericControl(value: js.Any): Self = StObject.set(x, "getNumericControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetNumericControlByDescription(value: HidNumericControlDescription => HidNumericControl): Self = StObject.set(x, "getNumericControlByDescription", js.Any.fromFunction1(value))
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionedBooleanControls(value: IVectorView[HidBooleanControl]): Self = StObject.set(x, "transitionedBooleanControls", value.asInstanceOf[js.Any])
  }
}
