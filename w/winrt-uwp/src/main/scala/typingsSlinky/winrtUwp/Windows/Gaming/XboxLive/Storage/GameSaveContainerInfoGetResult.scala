package typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@js.native
trait GameSaveContainerInfoGetResult extends StObject {
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var status: GameSaveErrorStatus = js.native
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var value: IVectorView[GameSaveContainerInfo] = js.native
}
object GameSaveContainerInfoGetResult {
  
  @scala.inline
  def apply(status: GameSaveErrorStatus, value: IVectorView[GameSaveContainerInfo]): GameSaveContainerInfoGetResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameSaveContainerInfoGetResult]
  }
  
  @scala.inline
  implicit class GameSaveContainerInfoGetResultMutableBuilder[Self <: GameSaveContainerInfoGetResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: GameSaveErrorStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: IVectorView[GameSaveContainerInfo]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
