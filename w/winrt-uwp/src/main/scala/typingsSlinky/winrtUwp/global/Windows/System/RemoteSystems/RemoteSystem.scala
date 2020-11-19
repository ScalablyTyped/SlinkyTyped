package typingsSlinky.winrtUwp.global.Windows.System.RemoteSystems

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Networking.HostName
import typingsSlinky.winrtUwp.Windows.System.RemoteSystems.IRemoteSystemFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This class manages the attributes of a discovered remote system (device) and provides the capabilities to discover remote systems as part of Project Rome. */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystem")
@js.native
abstract class RemoteSystem ()
  extends typingsSlinky.winrtUwp.Windows.System.RemoteSystems.RemoteSystem
/* static members */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystem")
@js.native
object RemoteSystem extends js.Object {
  
  /** Returns a RemoteSystemWatcher object with no filters. */
  def createWatcher(): typingsSlinky.winrtUwp.Windows.System.RemoteSystems.RemoteSystemWatcher = js.native
  /** Returns a RemoteSystemWatcher object that filters the remote systems it can see. The filters parameter determines which remote systems will be seen. */
  def createWatcher(filters: IIterable[IRemoteSystemFilter]): typingsSlinky.winrtUwp.Windows.System.RemoteSystems.RemoteSystemWatcher = js.native
  
  /** Attempts to discover a single remote system specified by the HostName parameter. */
  def findByHostNameAsync(host: HostName): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.System.RemoteSystems.RemoteSystem] = js.native
  
  /** Checks whether the client device is authorized to discover other users' devices or just same-user devices. */
  def isAuthorizationKindEnabled(kind: typingsSlinky.winrtUwp.Windows.System.RemoteSystems.RemoteSystemAuthorizationKind): Boolean = js.native
  
  /** Gets the status of the calling app's access to the Remote Systems feature. This method should always be called before an app attempts to discover or otherwise interact with remote systems. */
  def requestAccessAsync(): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.System.RemoteSystems.RemoteSystemAccessStatus] = js.native
}
