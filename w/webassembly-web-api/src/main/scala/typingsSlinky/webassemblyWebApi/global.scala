package typingsSlinky.webassemblyWebApi

import org.scalajs.dom.experimental.Response
import typingsSlinky.webassemblyWebApi.WebAssembly.Module
import typingsSlinky.webassemblyWebApi.WebAssembly.ResultObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object WebAssembly {
    
    @JSGlobal("WebAssembly.compileStreaming")
    @js.native
    def compileStreaming(source: js.Promise[Response]): js.Promise[Module] = js.native
    @JSGlobal("WebAssembly.compileStreaming")
    @js.native
    def compileStreaming(source: Response): js.Promise[Module] = js.native
    
    @JSGlobal("WebAssembly.instantiateStreaming")
    @js.native
    def instantiateStreaming(source: js.Promise[Response]): js.Promise[ResultObject] = js.native
    @JSGlobal("WebAssembly.instantiateStreaming")
    @js.native
    def instantiateStreaming(source: js.Promise[Response], importObject: js.Object): js.Promise[ResultObject] = js.native
    @JSGlobal("WebAssembly.instantiateStreaming")
    @js.native
    def instantiateStreaming(source: Response): js.Promise[ResultObject] = js.native
    @JSGlobal("WebAssembly.instantiateStreaming")
    @js.native
    def instantiateStreaming(source: Response, importObject: js.Object): js.Promise[ResultObject] = js.native
  }
}
