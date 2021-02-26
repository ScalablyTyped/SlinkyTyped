package typingsSlinky.vegaLite.srcDataMod

import typingsSlinky.vegaLite.channeldefMod.FieldName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SequenceParams extends StObject {
  
  /**
    * The name of the generated sequence field.
    *
    * __Default value:__ `"data"`
    */
  var as: js.UndefOr[FieldName] = js.native
  
  /**
    * The starting value of the sequence (inclusive).
    */
  var start: Double = js.native
  
  /**
    * The step value between sequence entries.
    *
    * __Default value:__ `1`
    */
  var step: js.UndefOr[Double] = js.native
  
  /**
    * The ending value of the sequence (exclusive).
    */
  var stop: Double = js.native
}
object SequenceParams {
  
  @scala.inline
  def apply(start: Double, stop: Double): SequenceParams = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceParams]
  }
  
  @scala.inline
  implicit class SequenceParamsMutableBuilder[Self <: SequenceParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: FieldName): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setStop(value: Double): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
  }
}
