package typingsSlinky.winrtUwp.Windows.Devices.Perception

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.CollectionChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about an attempt to change properties on a frame source. */
@js.native
trait PerceptionFrameSourcePropertiesChangedEventArgs extends StObject {
  
  /** Gets the type of change that occurred as a result of the property change request. */
  var collectionChange: CollectionChange = js.native
  
  /** Gets a string key indicating the location of the change in the collection. */
  var key: String = js.native
}
object PerceptionFrameSourcePropertiesChangedEventArgs {
  
  @scala.inline
  def apply(collectionChange: CollectionChange, key: String): PerceptionFrameSourcePropertiesChangedEventArgs = {
    val __obj = js.Dynamic.literal(collectionChange = collectionChange.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionFrameSourcePropertiesChangedEventArgs]
  }
  
  @scala.inline
  implicit class PerceptionFrameSourcePropertiesChangedEventArgsMutableBuilder[Self <: PerceptionFrameSourcePropertiesChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollectionChange(value: CollectionChange): Self = StObject.set(x, "collectionChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
