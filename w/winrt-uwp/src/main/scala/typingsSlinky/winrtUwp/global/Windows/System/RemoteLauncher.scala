package typingsSlinky.winrtUwp.global.Windows.System

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.ValueSet
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import typingsSlinky.winrtUwp.Windows.System.RemoteSystems.RemoteSystemConnectionRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Starts the default app associated with the specified URI on a remote device. */
@JSGlobal("Windows.System.RemoteLauncher")
@js.native
abstract class RemoteLauncher ()
  extends typingsSlinky.winrtUwp.Windows.System.RemoteLauncher
object RemoteLauncher {
  
  /** Starts the default app associated with the URI scheme name for the specified URI on a remote device. */
  /* static member */
  @JSGlobal("Windows.System.RemoteLauncher.launchUriAsync")
  @js.native
  def launchUriAsync(remoteSystemConnectionRequest: RemoteSystemConnectionRequest, uri: Uri): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.System.RemoteLaunchUriStatus] = js.native
  /** Starts the default app associated with the URI scheme name for the specified URI on a remote device, using the specified options. */
  /* static member */
  @JSGlobal("Windows.System.RemoteLauncher.launchUriAsync")
  @js.native
  def launchUriAsync(
    remoteSystemConnectionRequest: RemoteSystemConnectionRequest,
    uri: Uri,
    options: typingsSlinky.winrtUwp.Windows.System.RemoteLauncherOptions
  ): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.System.RemoteLaunchUriStatus] = js.native
  /** Starts the default app associated with the URI scheme name for the specified URI on a remote device, using the specified options and input data. */
  /* static member */
  @JSGlobal("Windows.System.RemoteLauncher.launchUriAsync")
  @js.native
  def launchUriAsync(
    remoteSystemConnectionRequest: RemoteSystemConnectionRequest,
    uri: Uri,
    options: typingsSlinky.winrtUwp.Windows.System.RemoteLauncherOptions,
    inputData: ValueSet
  ): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.System.RemoteLaunchUriStatus] = js.native
}
