package typingsSlinky.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebpOptions
  extends OutputOptions
     with AnimationOptions {
  
  /** Quality of alpha layer, number from 0-100 (optional, default 100) */
  var alphaQuality: js.UndefOr[Double] = js.native
  
  /** Use lossless compression mode (optional, default false) */
  var lossless: js.UndefOr[Boolean] = js.native
  
  /** Use near_lossless compression mode (optional, default false) */
  var nearLossless: js.UndefOr[Boolean] = js.native
  
  /** Level of CPU effort to reduce file size, integer 0-6 (optional, default 4) */
  var reductionEffort: js.UndefOr[Double] = js.native
  
  /** Use high quality chroma subsampling (optional, default false) */
  var smartSubsample: js.UndefOr[Boolean] = js.native
}
object WebpOptions {
  
  @scala.inline
  def apply(): WebpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebpOptions]
  }
  
  @scala.inline
  implicit class WebpOptionsMutableBuilder[Self <: WebpOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlphaQuality(value: Double): Self = StObject.set(x, "alphaQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaQualityUndefined: Self = StObject.set(x, "alphaQuality", js.undefined)
    
    @scala.inline
    def setLossless(value: Boolean): Self = StObject.set(x, "lossless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLosslessUndefined: Self = StObject.set(x, "lossless", js.undefined)
    
    @scala.inline
    def setNearLossless(value: Boolean): Self = StObject.set(x, "nearLossless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNearLosslessUndefined: Self = StObject.set(x, "nearLossless", js.undefined)
    
    @scala.inline
    def setReductionEffort(value: Double): Self = StObject.set(x, "reductionEffort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReductionEffortUndefined: Self = StObject.set(x, "reductionEffort", js.undefined)
    
    @scala.inline
    def setSmartSubsample(value: Boolean): Self = StObject.set(x, "smartSubsample", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmartSubsampleUndefined: Self = StObject.set(x, "smartSubsample", js.undefined)
  }
}
