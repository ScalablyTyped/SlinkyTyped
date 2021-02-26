package typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolvedDataProvider extends StObject {
  
  /**
    * The total time the data provider took to resolve its data (in milliseconds)
    */
  var duration: Double = js.native
  
  var error: String = js.native
  
  var id: String = js.native
}
object ResolvedDataProvider {
  
  @scala.inline
  def apply(duration: Double, error: String, id: String): ResolvedDataProvider = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedDataProvider]
  }
  
  @scala.inline
  implicit class ResolvedDataProviderMutableBuilder[Self <: ResolvedDataProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
