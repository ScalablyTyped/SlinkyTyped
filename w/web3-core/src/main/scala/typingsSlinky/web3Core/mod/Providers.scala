package typingsSlinky.web3Core.mod

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.web3CoreHelpers.mod.HttpProviderOptions
import typingsSlinky.web3CoreHelpers.mod.WebsocketProviderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Providers extends js.Object {
  var HttpProvider: Instantiable2[
    /* host */ String, 
    js.UndefOr[/* options */ HttpProviderOptions], 
    typingsSlinky.web3Core.mod.HttpProvider
  ] = js.native
  var IpcProvider: Instantiable2[/* path */ String, /* net */ js.Any, typingsSlinky.web3Core.mod.IpcProvider] = js.native
  var WebsocketProvider: Instantiable2[
    /* host */ String, 
    js.UndefOr[/* options */ WebsocketProviderOptions], 
    typingsSlinky.web3Core.mod.WebsocketProvider
  ] = js.native
}

object Providers {
  @scala.inline
  def apply(
    HttpProvider: Instantiable2[/* host */ String, js.UndefOr[/* options */ HttpProviderOptions], HttpProvider],
    IpcProvider: Instantiable2[/* path */ String, /* net */ js.Any, IpcProvider],
    WebsocketProvider: Instantiable2[
      /* host */ String, 
      js.UndefOr[/* options */ WebsocketProviderOptions], 
      WebsocketProvider
    ]
  ): Providers = {
    val __obj = js.Dynamic.literal(HttpProvider = HttpProvider.asInstanceOf[js.Any], IpcProvider = IpcProvider.asInstanceOf[js.Any], WebsocketProvider = WebsocketProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Providers]
  }
  @scala.inline
  implicit class ProvidersOps[Self <: Providers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHttpProvider(
      value: Instantiable2[/* host */ String, js.UndefOr[/* options */ HttpProviderOptions], HttpProvider]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HttpProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpcProvider(value: Instantiable2[/* path */ String, /* net */ js.Any, IpcProvider]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpcProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebsocketProvider(
      value: Instantiable2[
          /* host */ String, 
          js.UndefOr[/* options */ WebsocketProviderOptions], 
          WebsocketProvider
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebsocketProvider")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

