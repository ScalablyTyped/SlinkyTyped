package typingsSlinky.typeorm.typingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCollectionsOptions extends StObject {
  
  /**
    * The batchSize for the returned command cursor or if pre 2.8 the systems batch collection.
    */
  var batchSize: js.UndefOr[scala.Double] = js.native
  
  /**
    * The preferred read preference (ReadPreference.PRIMARY, ReadPreference.PRIMARY_PREFERRED,
    * ReadPreference.SECONDARY, ReadPreference.SECONDARY_PREFERRED, ReadPreference.NEAREST).
    */
  var readPreference: js.UndefOr[ReadPreference | String] = js.native
}
object ListCollectionsOptions {
  
  @scala.inline
  def apply(): ListCollectionsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCollectionsOptions]
  }
  
  @scala.inline
  implicit class ListCollectionsOptionsMutableBuilder[Self <: ListCollectionsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchSize(value: scala.Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    @scala.inline
    def setReadPreference(value: ReadPreference | String): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
  }
}
