package typingsSlinky.xhrMock

import typingsSlinky.xhrMock.mockRequestMod.default
import typingsSlinky.xhrMock.typesMod.MockFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handleMod {
  
  @JSImport("xhr-mock/lib/handle", "async")
  @js.native
  def async(
    handlers: js.Array[MockFunction],
    request: default,
    response: typingsSlinky.xhrMock.mockResponseMod.default
  ): js.Promise[typingsSlinky.xhrMock.mockResponseMod.default] = js.native
  
  @JSImport("xhr-mock/lib/handle", "sync")
  @js.native
  def sync(
    handlers: js.Array[MockFunction],
    request: default,
    response: typingsSlinky.xhrMock.mockResponseMod.default
  ): typingsSlinky.xhrMock.mockResponseMod.default = js.native
}
