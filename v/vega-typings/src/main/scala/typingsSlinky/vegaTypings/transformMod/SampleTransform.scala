package typingsSlinky.vegaTypings.transformMod

import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.vegaTypingsStrings.sample
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SampleTransform extends _Transforms {
  
  var size: Double | SignalRef = js.native
  
  var `type`: sample = js.native
}
object SampleTransform {
  
  @scala.inline
  def apply(size: Double | SignalRef, `type`: sample): SampleTransform = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SampleTransform]
  }
  
  @scala.inline
  implicit class SampleTransformMutableBuilder[Self <: SampleTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSize(value: Double | SignalRef): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: sample): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
