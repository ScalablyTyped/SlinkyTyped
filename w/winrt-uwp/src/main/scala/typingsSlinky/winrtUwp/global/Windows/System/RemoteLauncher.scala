package typingsSlinky.winrtUwp.global.Windows.System

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.ValueSet
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import typingsSlinky.winrtUwp.Windows.System.RemoteSystems.RemoteSystemConnectionRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Starts the default app associated with the specified URI on a remote device. */
@JSGlobal("Windows.System.RemoteLauncher")
@js.native
abstract class RemoteLauncher ()
  extends typingsSlinky.winrtUwp.Windows.System.RemoteLauncher

/* static members */
@JSGlobal("Windows.System.RemoteLauncher")
@js.native
object RemoteLauncher extends js.Object {
  /** Starts the default app associated with the URI scheme name for the specified URI on a remote device. */
  def launchUriAsync(remoteSystemConnectionRequest: RemoteSystemConnectionRequest, uri: Uri): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.System.RemoteLaunchUriStatus] = js.native
  /** Starts the default app associated with the URI scheme name for the specified URI on a remote device, using the specified options. */
  def launchUriAsync(
    remoteSystemConnectionRequest: RemoteSystemConnectionRequest,
    uri: Uri,
    options: typingsSlinky.winrtUwp.Windows.System.RemoteLauncherOptions
  ): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.System.RemoteLaunchUriStatus] = js.native
  /** Starts the default app associated with the URI scheme name for the specified URI on a remote device, using the specified options and input data. */
  def launchUriAsync(
    remoteSystemConnectionRequest: RemoteSystemConnectionRequest,
    uri: Uri,
    options: typingsSlinky.winrtUwp.Windows.System.RemoteLauncherOptions,
    inputData: ValueSet
  ): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.System.RemoteLaunchUriStatus] = js.native
}

