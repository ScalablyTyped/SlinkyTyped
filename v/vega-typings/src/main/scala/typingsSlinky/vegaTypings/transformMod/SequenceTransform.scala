package typingsSlinky.vegaTypings.transformMod

import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.vegaTypingsStrings.sequence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SequenceTransform extends _Transforms {
  
  var as: js.UndefOr[String | SignalRef] = js.native
  
  var start: Double | SignalRef = js.native
  
  var step: js.UndefOr[Double | SignalRef] = js.native
  
  var stop: Double | SignalRef = js.native
  
  var `type`: sequence = js.native
}
object SequenceTransform {
  
  @scala.inline
  def apply(start: Double | SignalRef, stop: Double | SignalRef, `type`: sequence): SequenceTransform = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceTransform]
  }
  
  @scala.inline
  implicit class SequenceTransformMutableBuilder[Self <: SequenceTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: String | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setStart(value: Double | SignalRef): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: Double | SignalRef): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setStop(value: Double | SignalRef): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: sequence): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
