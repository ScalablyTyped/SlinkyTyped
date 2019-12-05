package typingsSlinky.winrtDashUwp.Windows.Networking.XboxLive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XboxLiveQualityOfServiceMeasurementStatus extends js.Object

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus")
@js.native
object XboxLiveQualityOfServiceMeasurementStatus extends js.Object {
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait canceled extends XboxLiveQualityOfServiceMeasurementStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait inProgress extends XboxLiveQualityOfServiceMeasurementStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait inProgressWithProvisionalResults extends XboxLiveQualityOfServiceMeasurementStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait localSystemNotAuthorized extends XboxLiveQualityOfServiceMeasurementStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait noCompatibleNetworkPaths extends XboxLiveQualityOfServiceMeasurementStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait noLocalNetworks extends XboxLiveQualityOfServiceMeasurementStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait notStarted extends XboxLiveQualityOfServiceMeasurementStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait refusedDueToConfiguration extends XboxLiveQualityOfServiceMeasurementStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait remoteSystemNotAuthorized extends XboxLiveQualityOfServiceMeasurementStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait succeeded extends XboxLiveQualityOfServiceMeasurementStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait timedOut extends XboxLiveQualityOfServiceMeasurementStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait unexpectedInternalError extends XboxLiveQualityOfServiceMeasurementStatus
  
  /* 7 */ val canceled: typingsSlinky.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.canceled with Double = js.native
  /* 1 */ val inProgress: typingsSlinky.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.inProgress with Double = js.native
  /* 2 */ val inProgressWithProvisionalResults: typingsSlinky.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.inProgressWithProvisionalResults with Double = js.native
  /* 6 */ val localSystemNotAuthorized: typingsSlinky.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.localSystemNotAuthorized with Double = js.native
  /* 5 */ val noCompatibleNetworkPaths: typingsSlinky.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.noCompatibleNetworkPaths with Double = js.native
  /* 4 */ val noLocalNetworks: typingsSlinky.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.noLocalNetworks with Double = js.native
  /* 0 */ val notStarted: typingsSlinky.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.notStarted with Double = js.native
  /* 10 */ val refusedDueToConfiguration: typingsSlinky.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.refusedDueToConfiguration with Double = js.native
  /* 9 */ val remoteSystemNotAuthorized: typingsSlinky.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.remoteSystemNotAuthorized with Double = js.native
  /* 3 */ val succeeded: typingsSlinky.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.succeeded with Double = js.native
  /* 8 */ val timedOut: typingsSlinky.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.timedOut with Double = js.native
  /* 11 */ val unexpectedInternalError: typingsSlinky.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.unexpectedInternalError with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[XboxLiveQualityOfServiceMeasurementStatus with Double] = js.native
}

