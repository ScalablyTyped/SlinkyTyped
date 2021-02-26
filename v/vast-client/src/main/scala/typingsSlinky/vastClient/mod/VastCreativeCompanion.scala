package typingsSlinky.vastClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VastCreativeCompanion extends VastCreative {
  
  var variations: js.Array[VastCompanionAd] = js.native
}
object VastCreativeCompanion {
  
  @scala.inline
  def apply(trackingEvents: VastTrackingEvents, `type`: String, variations: js.Array[VastCompanionAd]): VastCreativeCompanion = {
    val __obj = js.Dynamic.literal(trackingEvents = trackingEvents.asInstanceOf[js.Any], variations = variations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastCreativeCompanion]
  }
  
  @scala.inline
  implicit class VastCreativeCompanionMutableBuilder[Self <: VastCreativeCompanion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVariations(value: js.Array[VastCompanionAd]): Self = StObject.set(x, "variations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariationsVarargs(value: VastCompanionAd*): Self = StObject.set(x, "variations", js.Array(value :_*))
  }
}
