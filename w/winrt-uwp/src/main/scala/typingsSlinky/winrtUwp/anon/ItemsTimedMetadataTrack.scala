package typingsSlinky.winrtUwp.anon

import typingsSlinky.winrtUwp.Windows.Media.Core.TimedMetadataTrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsTimedMetadataTrack extends StObject {
  
  /** The timed metadata tracks that start at startIndex in the list. */ var items: TimedMetadataTrack = js.native
  
  /** The number of timed metadata tracks retrieved. */ var returnValue: Double = js.native
}
object ItemsTimedMetadataTrack {
  
  @scala.inline
  def apply(items: TimedMetadataTrack, returnValue: Double): ItemsTimedMetadataTrack = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsTimedMetadataTrack]
  }
  
  @scala.inline
  implicit class ItemsTimedMetadataTrackMutableBuilder[Self <: ItemsTimedMetadataTrack] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: TimedMetadataTrack): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
