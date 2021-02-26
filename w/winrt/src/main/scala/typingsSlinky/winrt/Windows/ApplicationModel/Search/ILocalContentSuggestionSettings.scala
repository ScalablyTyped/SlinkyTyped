package typingsSlinky.winrt.Windows.ApplicationModel.Search

import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import typingsSlinky.winrt.Windows.Storage.StorageFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILocalContentSuggestionSettings extends StObject {
  
  var aqsFilter: String = js.native
  
  var enabled: Boolean = js.native
  
  var locations: IVector[StorageFolder] = js.native
  
  var propertiesToMatch: IVector[String] = js.native
}
object ILocalContentSuggestionSettings {
  
  @scala.inline
  def apply(
    aqsFilter: String,
    enabled: Boolean,
    locations: IVector[StorageFolder],
    propertiesToMatch: IVector[String]
  ): ILocalContentSuggestionSettings = {
    val __obj = js.Dynamic.literal(aqsFilter = aqsFilter.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], propertiesToMatch = propertiesToMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILocalContentSuggestionSettings]
  }
  
  @scala.inline
  implicit class ILocalContentSuggestionSettingsMutableBuilder[Self <: ILocalContentSuggestionSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAqsFilter(value: String): Self = StObject.set(x, "aqsFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocations(value: IVector[StorageFolder]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesToMatch(value: IVector[String]): Self = StObject.set(x, "propertiesToMatch", value.asInstanceOf[js.Any])
  }
}
