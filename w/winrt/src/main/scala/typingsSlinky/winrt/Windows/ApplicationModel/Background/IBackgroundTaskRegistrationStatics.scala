package typingsSlinky.winrt.Windows.ApplicationModel.Background

import typingsSlinky.winrt.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBackgroundTaskRegistrationStatics extends StObject {
  
  var allTasks: IMapView[String, IBackgroundTaskRegistration] = js.native
}
object IBackgroundTaskRegistrationStatics {
  
  @scala.inline
  def apply(allTasks: IMapView[String, IBackgroundTaskRegistration]): IBackgroundTaskRegistrationStatics = {
    val __obj = js.Dynamic.literal(allTasks = allTasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBackgroundTaskRegistrationStatics]
  }
  
  @scala.inline
  implicit class IBackgroundTaskRegistrationStaticsMutableBuilder[Self <: IBackgroundTaskRegistrationStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllTasks(value: IMapView[String, IBackgroundTaskRegistration]): Self = StObject.set(x, "allTasks", value.asInstanceOf[js.Any])
  }
}
