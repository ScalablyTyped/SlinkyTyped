package typingsSlinky.web3Core.mod

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.web3CoreHelpers.mod.HttpProviderOptions
import typingsSlinky.web3CoreHelpers.mod.WebsocketProviderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Providers extends StObject {
  
  var HttpProvider: Instantiable2[
    /* host */ String, 
    /* options */ js.UndefOr[HttpProviderOptions], 
    typingsSlinky.web3Core.mod.HttpProvider
  ] = js.native
  
  var IpcProvider: Instantiable2[/* path */ String, /* net */ js.Any, typingsSlinky.web3Core.mod.IpcProvider] = js.native
  
  var WebsocketProvider: Instantiable2[
    /* host */ String, 
    /* options */ js.UndefOr[WebsocketProviderOptions], 
    typingsSlinky.web3Core.mod.WebsocketProvider
  ] = js.native
}
object Providers {
  
  @scala.inline
  def apply(
    HttpProvider: Instantiable2[/* host */ String, /* options */ js.UndefOr[HttpProviderOptions], HttpProvider],
    IpcProvider: Instantiable2[/* path */ String, /* net */ js.Any, IpcProvider],
    WebsocketProvider: Instantiable2[
      /* host */ String, 
      /* options */ js.UndefOr[WebsocketProviderOptions], 
      WebsocketProvider
    ]
  ): Providers = {
    val __obj = js.Dynamic.literal(HttpProvider = HttpProvider.asInstanceOf[js.Any], IpcProvider = IpcProvider.asInstanceOf[js.Any], WebsocketProvider = WebsocketProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Providers]
  }
  
  @scala.inline
  implicit class ProvidersMutableBuilder[Self <: Providers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHttpProvider(
      value: Instantiable2[/* host */ String, /* options */ js.UndefOr[HttpProviderOptions], HttpProvider]
    ): Self = StObject.set(x, "HttpProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpcProvider(value: Instantiable2[/* path */ String, /* net */ js.Any, IpcProvider]): Self = StObject.set(x, "IpcProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsocketProvider(
      value: Instantiable2[
          /* host */ String, 
          /* options */ js.UndefOr[WebsocketProviderOptions], 
          WebsocketProvider
        ]
    ): Self = StObject.set(x, "WebsocketProvider", value.asInstanceOf[js.Any])
  }
}
