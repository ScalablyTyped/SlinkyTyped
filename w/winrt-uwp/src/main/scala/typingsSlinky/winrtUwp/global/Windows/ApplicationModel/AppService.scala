package typingsSlinky.winrtUwp.global.Windows.ApplicationModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains classes for using app services. */
@JSGlobal("Windows.ApplicationModel.AppService")
@js.native
object AppService extends js.Object {
  
  /** Enumerates the available app service providers on the device. */
  @js.native
  abstract class AppServiceCatalog ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.AppService.AppServiceCatalog
  /* static members */
  @js.native
  object AppServiceCatalog extends js.Object {
    
    var findAppServiceProvidersAsync: js.Any = js.native
  }
  
  /** Provides data for the AppServiceConnection.ServiceClosed event that occurs when the other endpoint closes connection to the app service. */
  @js.native
  abstract class AppServiceClosedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.AppService.AppServiceClosedEventArgs
  
  /** Describes the status that was set when the endpoint for the app service was closed. */
  @js.native
  object AppServiceClosedStatus extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.ApplicationModel.AppService.AppServiceClosedStatus with Double
      ] = js.native
    
    /* 1 */ val canceled: typingsSlinky.winrtUwp.Windows.ApplicationModel.AppService.AppServiceClosedStatus.canceled with Double = js.native
    
    /* 0 */ val completed: typingsSlinky.winrtUwp.Windows.ApplicationModel.AppService.AppServiceClosedStatus.completed with Double = js.native
    
    /* 2 */ val resourceLimitsExceeded: typingsSlinky.winrtUwp.Windows.ApplicationModel.AppService.AppServiceClosedStatus.resourceLimitsExceeded with Double = js.native
    
    /* 3 */ val unknown: typingsSlinky.winrtUwp.Windows.ApplicationModel.AppService.AppServiceClosedStatus.unknown with Double = js.native
  }
  
  /** Represents a connection to the endpoint for an app service. */
  @js.native
  /** Creates and initializes a new instance of the AppServiceConnection class. */
  class AppServiceConnection ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.AppService.AppServiceConnection
  
  /** Describes the status for the attempt that an app makes to open a connection to an app service by calling the AppServiceConnection.OpenAsync method. */
  @js.native
  object AppServiceConnectionStatus extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.ApplicationModel.AppService.AppServiceConnectionStatus with Double
      ] = js.native
    
    /* 1 */ val appNotInstalled: typingsSlinky.winrtUwp.Windows.ApplicationModel.AppService.AppServiceConnectionStatus.appNotInstalled with Double = js.native
    
    /* 3 */ val appServiceUnavailable: typingsSlinky.winrtUwp.Windows.ApplicationModel.AppService.AppServiceConnectionStatus.appServiceUnavailable with Double = js.native
    
    /* 2 */ val appUnavailable: typingsSlinky.winrtUwp.Windows.ApplicationModel.AppService.AppServiceConnectionStatus.appUnavailable with Double = js.native
    
    /* 0 */ val success: typingsSlinky.winrtUwp.Windows.ApplicationModel.AppService.AppServiceConnectionStatus.success with Double = js.native
    
    /* 4 */ val unknown: typingsSlinky.winrtUwp.Windows.ApplicationModel.AppService.AppServiceConnectionStatus.unknown with Double = js.native
  }
  
  /** Enables the background task for an app service to get a deferral so that the app service can respond to subsequent requests. */
  @js.native
  abstract class AppServiceDeferral ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.AppService.AppServiceDeferral
  
  /** Represents a message that the endpoint for one app service sends to another app service. */
  @js.native
  abstract class AppServiceRequest ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.AppService.AppServiceRequest
  
  /** Provides data for the AppServiceConnection.RequestReceived event that occurs when a message arrives from the other endpoint of the app service connection. */
  @js.native
  abstract class AppServiceRequestReceivedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.AppService.AppServiceRequestReceivedEventArgs
  
  /** Represents the message that the app service sent in response to a request. */
  @js.native
  abstract class AppServiceResponse ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.AppService.AppServiceResponse
  
  /** Describes the status when an app tries to send a message to an app service by calling the AppServiceConnection.SendMessageAsync method. */
  @js.native
  object AppServiceResponseStatus extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.ApplicationModel.AppService.AppServiceResponseStatus with Double
      ] = js.native
    
    /* 1 */ val failure: typingsSlinky.winrtUwp.Windows.ApplicationModel.AppService.AppServiceResponseStatus.failure with Double = js.native
    
    /* 2 */ val resourceLimitsExceeded: typingsSlinky.winrtUwp.Windows.ApplicationModel.AppService.AppServiceResponseStatus.resourceLimitsExceeded with Double = js.native
    
    /* 0 */ val success: typingsSlinky.winrtUwp.Windows.ApplicationModel.AppService.AppServiceResponseStatus.success with Double = js.native
    
    /* 3 */ val unknown: typingsSlinky.winrtUwp.Windows.ApplicationModel.AppService.AppServiceResponseStatus.unknown with Double = js.native
  }
  
  /** Represents details associated with the background task for the app service. */
  @js.native
  abstract class AppServiceTriggerDetails ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.AppService.AppServiceTriggerDetails
}
