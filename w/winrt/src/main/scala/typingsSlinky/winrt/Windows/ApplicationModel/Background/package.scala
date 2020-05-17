package typingsSlinky.winrt.Windows.ApplicationModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Background {
  type BackgroundTaskCanceledEventHandler = js.Function2[
    /* sender */ typingsSlinky.winrt.Windows.ApplicationModel.Background.IBackgroundTaskInstance, 
    /* reason */ typingsSlinky.winrt.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason, 
    scala.Unit
  ]
  type BackgroundTaskCompletedEventHandler = js.Function2[
    /* sender */ typingsSlinky.winrt.Windows.ApplicationModel.Background.BackgroundTaskRegistration, 
    /* args */ typingsSlinky.winrt.Windows.ApplicationModel.Background.BackgroundTaskCompletedEventArgs, 
    scala.Unit
  ]
  type BackgroundTaskProgressEventHandler = js.Function2[
    /* sender */ typingsSlinky.winrt.Windows.ApplicationModel.Background.BackgroundTaskRegistration, 
    /* args */ typingsSlinky.winrt.Windows.ApplicationModel.Background.BackgroundTaskProgressEventArgs, 
    scala.Unit
  ]
  type INetworkOperatorHotspotAuthenticationTrigger = typingsSlinky.winrt.Windows.ApplicationModel.Background.IBackgroundTrigger
  type PushNotificationTrigger = typingsSlinky.winrt.Windows.ApplicationModel.Background.IBackgroundTrigger
}
