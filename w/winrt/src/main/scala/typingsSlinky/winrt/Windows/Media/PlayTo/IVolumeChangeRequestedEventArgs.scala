package typingsSlinky.winrt.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVolumeChangeRequestedEventArgs extends StObject {
  
  var volume: Double = js.native
}
object IVolumeChangeRequestedEventArgs {
  
  @scala.inline
  def apply(volume: Double): IVolumeChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVolumeChangeRequestedEventArgs]
  }
  
  @scala.inline
  implicit class IVolumeChangeRequestedEventArgsMutableBuilder[Self <: IVolumeChangeRequestedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
