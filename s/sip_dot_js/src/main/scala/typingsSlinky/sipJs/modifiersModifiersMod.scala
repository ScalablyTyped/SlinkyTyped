package typingsSlinky.sipJs

import org.scalajs.dom.experimental.webrtc.RTCSessionDescriptionInit
import typingsSlinky.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerModifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/platform/web/modifiers/modifiers", JSImport.Namespace)
@js.native
object modifiersModifiersMod extends js.Object {
  
  def addMidLines(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  
  def cleanJitsiSdpImageattr(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  
  def holdModifier(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  
  def stripG722(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  
  def stripRtpPayload(payload: String): SessionDescriptionHandlerModifier = js.native
  
  def stripTcpCandidates(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  
  def stripTelephoneEvent(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  
  def stripVideo(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
}
