package typingsSlinky.toastr

import typingsSlinky.toastr.toastrStrings.hidden
import typingsSlinky.toastr.toastrStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToastrResponse extends StObject {
  
  /**
    * The datetime the toast was closed, if the state is hidden.
    */
  var endTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The event's toast details.
    */
  var map: ToastMap = js.native
  
  /**
    * The toastr options.
    */
  var options: ToastrOptions = js.native
  
  /**
    * The datetime the toast was opened.
    */
  var startTime: js.Date = js.native
  
  /**
    * The current state of the toast.
    */
  var state: visible | hidden = js.native
  
  /**
    * The internal toast id.
    */
  var toastId: Double = js.native
}
object ToastrResponse {
  
  @scala.inline
  def apply(
    map: ToastMap,
    options: ToastrOptions,
    startTime: js.Date,
    state: visible | hidden,
    toastId: Double
  ): ToastrResponse = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], toastId = toastId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastrResponse]
  }
  
  @scala.inline
  implicit class ToastrResponseMutableBuilder[Self <: ToastrResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setMap(value: ToastMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: ToastrOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: visible | hidden): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToastId(value: Double): Self = StObject.set(x, "toastId", value.asInstanceOf[js.Any])
  }
}
