package typingsSlinky.std.global

import typingsSlinky.std.RTCSrtpSdesParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("RTCSrtpSdesTransport")
@js.native
class RTCSrtpSdesTransport protected ()
  extends typingsSlinky.std.RTCSrtpSdesTransport {
  def this(
    transport: typingsSlinky.std.RTCIceTransport,
    encryptParameters: RTCSrtpSdesParameters,
    decryptParameters: RTCSrtpSdesParameters
  ) = this()
}
object RTCSrtpSdesTransport {
  
  @JSGlobal("RTCSrtpSdesTransport.getLocalParameters")
  @js.native
  def getLocalParameters(): js.Array[RTCSrtpSdesParameters] = js.native
}
