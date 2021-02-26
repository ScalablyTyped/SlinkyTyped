package typingsSlinky.winrtUwp.Windows.UI.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the distance thresholds for a CrossSliding interaction. */
@js.native
trait CrossSlideThresholds extends StObject {
  
  /** The distance, in DIPs, from the initial point of contact until the rearrange action is initiated. */
  var rearrangeStart: Double = js.native
  
  /** The distance, in DIPs, from the initial point of contact until the selection action is initiated. */
  var selectionStart: Double = js.native
  
  /** The distance, in DIPs, from the initial point of contact until the end of the speed bump. */
  var speedBumpEnd: Double = js.native
  
  /** The distance, in DIPs, from the initial point of contact until the speed bump is initiated. */
  var speedBumpStart: Double = js.native
}
object CrossSlideThresholds {
  
  @scala.inline
  def apply(rearrangeStart: Double, selectionStart: Double, speedBumpEnd: Double, speedBumpStart: Double): CrossSlideThresholds = {
    val __obj = js.Dynamic.literal(rearrangeStart = rearrangeStart.asInstanceOf[js.Any], selectionStart = selectionStart.asInstanceOf[js.Any], speedBumpEnd = speedBumpEnd.asInstanceOf[js.Any], speedBumpStart = speedBumpStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossSlideThresholds]
  }
  
  @scala.inline
  implicit class CrossSlideThresholdsMutableBuilder[Self <: CrossSlideThresholds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRearrangeStart(value: Double): Self = StObject.set(x, "rearrangeStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionStart(value: Double): Self = StObject.set(x, "selectionStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedBumpEnd(value: Double): Self = StObject.set(x, "speedBumpEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedBumpStart(value: Double): Self = StObject.set(x, "speedBumpStart", value.asInstanceOf[js.Any])
  }
}
