package typingsSlinky.std.global.WebAssembly

import org.scalajs.dom.experimental.Response
import typingsSlinky.std.WebAssembly.Imports
import typingsSlinky.std.WebAssembly.WebAssemblyInstantiatedSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("WebAssembly.instantiateStreaming")
@js.native
object instantiateStreaming extends js.Object {
  
  def apply(response: js.Thenable[Response]): js.Promise[WebAssemblyInstantiatedSource] = js.native
  def apply(response: js.Thenable[Response], importObject: Imports): js.Promise[WebAssemblyInstantiatedSource] = js.native
  def apply(response: Response): js.Promise[WebAssemblyInstantiatedSource] = js.native
  def apply(response: Response, importObject: Imports): js.Promise[WebAssemblyInstantiatedSource] = js.native
}
