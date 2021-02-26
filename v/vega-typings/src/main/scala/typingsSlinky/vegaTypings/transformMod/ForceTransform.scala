package typingsSlinky.vegaTypings.transformMod

import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.vegaTypingsStrings.force
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForceTransform extends _Transforms {
  
  var alpha: js.UndefOr[Double | SignalRef] = js.native
  
  var alphaMin: js.UndefOr[Double | SignalRef] = js.native
  
  var alphaTarget: js.UndefOr[Double | SignalRef] = js.native
  
  var forces: js.UndefOr[(js.Array[Force | SignalRef]) | SignalRef] = js.native
  
  var iterations: js.UndefOr[Double | SignalRef] = js.native
  
  var restart: js.UndefOr[Boolean | SignalRef] = js.native
  
  var signal: js.UndefOr[SignalName] = js.native
  
  var static: js.UndefOr[Boolean | SignalRef] = js.native
  
  var `type`: force = js.native
  
  var velocityDecay: js.UndefOr[Double | SignalRef] = js.native
}
object ForceTransform {
  
  @scala.inline
  def apply(`type`: force): ForceTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceTransform]
  }
  
  @scala.inline
  implicit class ForceTransformMutableBuilder[Self <: ForceTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Double | SignalRef): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaMin(value: Double | SignalRef): Self = StObject.set(x, "alphaMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaMinUndefined: Self = StObject.set(x, "alphaMin", js.undefined)
    
    @scala.inline
    def setAlphaTarget(value: Double | SignalRef): Self = StObject.set(x, "alphaTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaTargetUndefined: Self = StObject.set(x, "alphaTarget", js.undefined)
    
    @scala.inline
    def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    @scala.inline
    def setForces(value: (js.Array[Force | SignalRef]) | SignalRef): Self = StObject.set(x, "forces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForcesUndefined: Self = StObject.set(x, "forces", js.undefined)
    
    @scala.inline
    def setForcesVarargs(value: (Force | SignalRef)*): Self = StObject.set(x, "forces", js.Array(value :_*))
    
    @scala.inline
    def setIterations(value: Double | SignalRef): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
    
    @scala.inline
    def setRestart(value: Boolean | SignalRef): Self = StObject.set(x, "restart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestartUndefined: Self = StObject.set(x, "restart", js.undefined)
    
    @scala.inline
    def setSignal(value: SignalName): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    @scala.inline
    def setStatic(value: Boolean | SignalRef): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
    
    @scala.inline
    def setType(value: force): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocityDecay(value: Double | SignalRef): Self = StObject.set(x, "velocityDecay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocityDecayUndefined: Self = StObject.set(x, "velocityDecay", js.undefined)
  }
}
