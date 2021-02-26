package typingsSlinky.spotifyWebApiNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShuffleOptions extends DeviceOptions {
  
  var state: js.UndefOr[Boolean] = js.native
}
object ShuffleOptions {
  
  @scala.inline
  def apply(): ShuffleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShuffleOptions]
  }
  
  @scala.inline
  implicit class ShuffleOptionsMutableBuilder[Self <: ShuffleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: Boolean): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
