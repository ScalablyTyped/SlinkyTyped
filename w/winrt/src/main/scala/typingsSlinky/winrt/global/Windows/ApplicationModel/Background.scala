package typingsSlinky.winrt.global.Windows.ApplicationModel

import typingsSlinky.winrt.Windows.ApplicationModel.Background.BackgroundAccessStatus
import typingsSlinky.winrt.Windows.ApplicationModel.Background.IBackgroundTaskRegistration
import typingsSlinky.winrt.Windows.ApplicationModel.Background.IBackgroundTrigger
import typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemConditionType
import typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemTriggerType
import typingsSlinky.winrt.Windows.Foundation.Collections.IMapView
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Background")
@js.native
object Background extends js.Object {
  @js.native
  class BackgroundExecutionManager ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Background.BackgroundExecutionManager
  
  @js.native
  class BackgroundTaskBuilder ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Background.BackgroundTaskBuilder
  
  @js.native
  class BackgroundTaskCompletedEventArgs ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Background.BackgroundTaskCompletedEventArgs
  
  @js.native
  class BackgroundTaskDeferral ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Background.BackgroundTaskDeferral
  
  @js.native
  class BackgroundTaskProgressEventArgs ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Background.BackgroundTaskProgressEventArgs
  
  @js.native
  class BackgroundTaskRegistration ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Background.BackgroundTaskRegistration
  
  @js.native
  class MaintenanceTrigger protected ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Background.MaintenanceTrigger {
    def this(freshnessTime: Double, oneShot: Boolean) = this()
  }
  
  @js.native
  class NetworkOperatorHotspotAuthenticationTrigger () extends IBackgroundTrigger
  
  @js.native
  class NetworkOperatorNotificationTrigger protected ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Background.NetworkOperatorNotificationTrigger {
    def this(networkAccountId: String) = this()
  }
  
  @js.native
  class PushNotificationTrigger () extends IBackgroundTrigger {
    def this(applicationId: String) = this()
  }
  
  @js.native
  class SystemCondition protected ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemCondition {
    def this(conditionType: SystemConditionType) = this()
  }
  
  @js.native
  class SystemTrigger protected ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemTrigger {
    def this(triggerType: SystemTriggerType, oneShot: Boolean) = this()
  }
  
  @js.native
  class TimeTrigger protected ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Background.TimeTrigger {
    def this(freshnessTime: Double, oneShot: Boolean) = this()
  }
  
  @js.native
  object BackgroundAccessStatus extends js.Object {
    /* 2 */ val allowedMayUseActiveRealTimeConnectivity: typingsSlinky.winrt.Windows.ApplicationModel.Background.BackgroundAccessStatus.allowedMayUseActiveRealTimeConnectivity with Double = js.native
    /* 1 */ val allowedWithAlwaysOnRealTimeConnectivity: typingsSlinky.winrt.Windows.ApplicationModel.Background.BackgroundAccessStatus.allowedWithAlwaysOnRealTimeConnectivity with Double = js.native
    /* 3 */ val denied: typingsSlinky.winrt.Windows.ApplicationModel.Background.BackgroundAccessStatus.denied with Double = js.native
    /* 0 */ val unspecified: typingsSlinky.winrt.Windows.ApplicationModel.Background.BackgroundAccessStatus.unspecified with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrt.Windows.ApplicationModel.Background.BackgroundAccessStatus with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object BackgroundExecutionManager extends js.Object {
    def getAccessStatus(): BackgroundAccessStatus = js.native
    def getAccessStatus(applicationId: String): BackgroundAccessStatus = js.native
    def removeAccess(): Unit = js.native
    def removeAccess(applicationId: String): Unit = js.native
    def requestAccessAsync(): IAsyncOperation[BackgroundAccessStatus] = js.native
    def requestAccessAsync(applicationId: String): IAsyncOperation[BackgroundAccessStatus] = js.native
  }
  
  @js.native
  object BackgroundTaskCancellationReason extends js.Object {
    /* 0 */ val abort: typingsSlinky.winrt.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.abort with Double = js.native
    /* 2 */ val loggingOff: typingsSlinky.winrt.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.loggingOff with Double = js.native
    /* 3 */ val servicingUpdate: typingsSlinky.winrt.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.servicingUpdate with Double = js.native
    /* 1 */ val terminating: typingsSlinky.winrt.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.terminating with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrt.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object BackgroundTaskRegistration extends js.Object {
    var allTasks: IMapView[String, IBackgroundTaskRegistration] = js.native
  }
  
  @js.native
  object SystemConditionType extends js.Object {
    /* 3 */ val internetAvailable: typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemConditionType.internetAvailable with Double = js.native
    /* 4 */ val internetNotAvailable: typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemConditionType.internetNotAvailable with Double = js.native
    /* 0 */ val invalid: typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemConditionType.invalid with Double = js.native
    /* 5 */ val sessionConnected: typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemConditionType.sessionConnected with Double = js.native
    /* 6 */ val sessionDisconnected: typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemConditionType.sessionDisconnected with Double = js.native
    /* 2 */ val userNotPresent: typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemConditionType.userNotPresent with Double = js.native
    /* 1 */ val userPresent: typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemConditionType.userPresent with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemConditionType with Double
      ] = js.native
  }
  
  @js.native
  object SystemTriggerType extends js.Object {
    /* 5 */ val controlChannelReset: typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemTriggerType.controlChannelReset with Double = js.native
    /* 6 */ val internetAvailable: typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemTriggerType.internetAvailable with Double = js.native
    /* 0 */ val invalid: typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemTriggerType.invalid with Double = js.native
    /* 9 */ val lockScreenApplicationAdded: typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemTriggerType.lockScreenApplicationAdded with Double = js.native
    /* 10 */ val lockScreenApplicationRemoved: typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemTriggerType.lockScreenApplicationRemoved with Double = js.native
    /* 4 */ val networkStateChange: typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemTriggerType.networkStateChange with Double = js.native
    /* 12 */ val onlineIdConnectedStateChange: typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemTriggerType.onlineIdConnectedStateChange with Double = js.native
    /* 8 */ val servicingComplete: typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemTriggerType.servicingComplete with Double = js.native
    /* 7 */ val sessionConnected: typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemTriggerType.sessionConnected with Double = js.native
    /* 1 */ val smsReceived: typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemTriggerType.smsReceived with Double = js.native
    /* 11 */ val timeZoneChange: typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemTriggerType.timeZoneChange with Double = js.native
    /* 3 */ val userAway: typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemTriggerType.userAway with Double = js.native
    /* 2 */ val userPresent: typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemTriggerType.userPresent with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemTriggerType with Double
      ] = js.native
  }
  
}

