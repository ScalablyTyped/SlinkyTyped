package typingsSlinky.webrtc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#dom-rtcrtpsender
@js.native
trait RTCRtpSender extends StObject {
  
  def getParameters(): RTCRtpParameters = js.native
  
  def replaceTrack(withTrack: MediaStreamTrack): js.Promise[Unit] = js.native
  
  //readonly track?: MediaStreamTrack;
  //readonly transport?: RTCDtlsTransport;
  //readonly rtcpTransport?: RTCDtlsTransport;
  def setParameters(): js.Promise[Unit] = js.native
  def setParameters(parameters: RTCRtpParameters): js.Promise[Unit] = js.native
}
