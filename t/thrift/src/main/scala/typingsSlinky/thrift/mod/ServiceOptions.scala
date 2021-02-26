package typingsSlinky.thrift.mod

import typingsSlinky.thrift.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceOptions[TProcessor, THandler] extends StObject {
  
  var handler: js.UndefOr[THandler] = js.native
  
  var processor: js.UndefOr[Instantiable[THandler, TProcessor]] = js.native
  
  var protocol: js.UndefOr[TProtocolConstructor] = js.native
  
  var transport: js.UndefOr[TTransportConstructor] = js.native
}
object ServiceOptions {
  
  @scala.inline
  def apply[TProcessor, THandler](): ServiceOptions[TProcessor, THandler] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceOptions[TProcessor, THandler]]
  }
  
  @scala.inline
  implicit class ServiceOptionsMutableBuilder[Self <: ServiceOptions[_, _], TProcessor, THandler] (val x: Self with (ServiceOptions[TProcessor, THandler])) extends AnyVal {
    
    @scala.inline
    def setHandler(value: THandler): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
    
    @scala.inline
    def setProcessor(value: Instantiable[THandler, TProcessor]): Self = StObject.set(x, "processor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessorUndefined: Self = StObject.set(x, "processor", js.undefined)
    
    @scala.inline
    def setProtocol(value: TProtocolConstructor): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setTransport(value: TTransportConstructor): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
  }
}
