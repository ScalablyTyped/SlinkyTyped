package typingsSlinky.winrt.Windows.Networking.Sockets

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Networking.EndpointPair
import typingsSlinky.winrt.Windows.Networking.HostName
import typingsSlinky.winrt.Windows.Networking.HostNameSortOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDatagramSocketStatics extends StObject {
  
  def getEndpointPairsAsync(remoteHostName: HostName, remoteServiceName: String): IAsyncOperation[IVectorView[EndpointPair]] = js.native
  def getEndpointPairsAsync(remoteHostName: HostName, remoteServiceName: String, sortOptions: HostNameSortOptions): IAsyncOperation[IVectorView[EndpointPair]] = js.native
}
