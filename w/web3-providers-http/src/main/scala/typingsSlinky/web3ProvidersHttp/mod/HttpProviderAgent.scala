package typingsSlinky.web3ProvidersHttp.mod

import typingsSlinky.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpProviderAgent extends js.Object {
  
  var baseUrl: js.UndefOr[String] = js.native
  
  var http: js.UndefOr[Agent] = js.native
  
  var https: js.UndefOr[typingsSlinky.node.httpsMod.Agent] = js.native
}
object HttpProviderAgent {
  
  @scala.inline
  def apply(): HttpProviderAgent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpProviderAgent]
  }
  
  @scala.inline
  implicit class HttpProviderAgentOps[Self <: HttpProviderAgent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    
    @scala.inline
    def setHttp(value: Agent): Self = this.set("http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttp: Self = this.set("http", js.undefined)
    
    @scala.inline
    def setHttps(value: typingsSlinky.node.httpsMod.Agent): Self = this.set("https", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttps: Self = this.set("https", js.undefined)
  }
}
