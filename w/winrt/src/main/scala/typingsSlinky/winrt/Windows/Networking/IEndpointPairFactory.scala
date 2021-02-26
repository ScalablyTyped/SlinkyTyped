package typingsSlinky.winrt.Windows.Networking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEndpointPairFactory extends StObject {
  
  def createEndpointPair(
    localHostName: HostName,
    localServiceName: String,
    remoteHostName: HostName,
    remoteServiceName: String
  ): EndpointPair = js.native
}
object IEndpointPairFactory {
  
  @scala.inline
  def apply(createEndpointPair: (HostName, String, HostName, String) => EndpointPair): IEndpointPairFactory = {
    val __obj = js.Dynamic.literal(createEndpointPair = js.Any.fromFunction4(createEndpointPair))
    __obj.asInstanceOf[IEndpointPairFactory]
  }
  
  @scala.inline
  implicit class IEndpointPairFactoryMutableBuilder[Self <: IEndpointPairFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateEndpointPair(value: (HostName, String, HostName, String) => EndpointPair): Self = StObject.set(x, "createEndpointPair", js.Any.fromFunction4(value))
  }
}
