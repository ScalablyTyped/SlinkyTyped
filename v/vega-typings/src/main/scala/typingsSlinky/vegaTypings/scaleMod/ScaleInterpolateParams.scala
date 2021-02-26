package typingsSlinky.vegaTypings.scaleMod

import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.vegaTypingsStrings.`cubehelix-long`
import typingsSlinky.vegaTypings.vegaTypingsStrings.cubehelix
import typingsSlinky.vegaTypings.vegaTypingsStrings.rgb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScaleInterpolateParams extends ScaleInterpolate {
  
  var gamma: js.UndefOr[Double | SignalRef] = js.native
  
  var `type`: rgb | cubehelix | `cubehelix-long` | SignalRef = js.native
}
object ScaleInterpolateParams {
  
  @scala.inline
  def apply(`type`: rgb | cubehelix | `cubehelix-long` | SignalRef): ScaleInterpolateParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleInterpolateParams]
  }
  
  @scala.inline
  implicit class ScaleInterpolateParamsMutableBuilder[Self <: ScaleInterpolateParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGamma(value: Double | SignalRef): Self = StObject.set(x, "gamma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGammaUndefined: Self = StObject.set(x, "gamma", js.undefined)
    
    @scala.inline
    def setType(value: rgb | cubehelix | `cubehelix-long` | SignalRef): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
