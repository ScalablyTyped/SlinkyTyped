package typingsSlinky.sipDotJs.libConstantsMod.C

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait causes extends js.Object

@JSImport("sip.js/lib/Constants", "C.causes")
@js.native
object causes extends js.Object {
  @js.native
  sealed trait ADDRESS_INCOMPLETE extends causes
  
  @js.native
  sealed trait AUTHENTICATION_ERROR extends causes
  
  @js.native
  sealed trait BAD_MEDIA_DESCRIPTION extends causes
  
  @js.native
  sealed trait BUSY extends causes
  
  @js.native
  sealed trait CANCELED extends causes
  
  @js.native
  sealed trait CONNECTION_ERROR extends causes
  
  @js.native
  sealed trait DIALOG_ERROR extends causes
  
  @js.native
  sealed trait EXPIRES extends causes
  
  @js.native
  sealed trait INCOMPATIBLE_SDP extends causes
  
  @js.native
  sealed trait INTERNAL_ERROR extends causes
  
  @js.native
  sealed trait NOT_FOUND extends causes
  
  @js.native
  sealed trait NO_ACK extends causes
  
  @js.native
  sealed trait NO_ANSWER extends causes
  
  @js.native
  sealed trait NO_PRACK extends causes
  
  @js.native
  sealed trait REDIRECTED extends causes
  
  @js.native
  sealed trait REJECTED extends causes
  
  @js.native
  sealed trait REQUEST_TIMEOUT extends causes
  
  @js.native
  sealed trait RTP_TIMEOUT extends causes
  
  @js.native
  sealed trait SIP_FAILURE_CODE extends causes
  
  @js.native
  sealed trait UNAVAILABLE extends causes
  
  @js.native
  sealed trait USER_DENIED_MEDIA_ACCESS extends causes
  
  @js.native
  sealed trait WEBRTC_ERROR extends causes
  
  @js.native
  sealed trait WEBRTC_NOT_SUPPORTED extends causes
  
  /* "Address Incomplete" */ val ADDRESS_INCOMPLETE: typingsSlinky.sipDotJs.libConstantsMod.C.causes.ADDRESS_INCOMPLETE with String = js.native
  /* "Authentication Error" */ val AUTHENTICATION_ERROR: typingsSlinky.sipDotJs.libConstantsMod.C.causes.AUTHENTICATION_ERROR with String = js.native
  /* "Bad Media Description" */ val BAD_MEDIA_DESCRIPTION: typingsSlinky.sipDotJs.libConstantsMod.C.causes.BAD_MEDIA_DESCRIPTION with String = js.native
  /* "Busy" */ val BUSY: typingsSlinky.sipDotJs.libConstantsMod.C.causes.BUSY with String = js.native
  /* "Canceled" */ val CANCELED: typingsSlinky.sipDotJs.libConstantsMod.C.causes.CANCELED with String = js.native
  /* "Connection Error" */ val CONNECTION_ERROR: typingsSlinky.sipDotJs.libConstantsMod.C.causes.CONNECTION_ERROR with String = js.native
  /* "Dialog Error" */ val DIALOG_ERROR: typingsSlinky.sipDotJs.libConstantsMod.C.causes.DIALOG_ERROR with String = js.native
  /* "Expires" */ val EXPIRES: typingsSlinky.sipDotJs.libConstantsMod.C.causes.EXPIRES with String = js.native
  /* "Incompatible SDP" */ val INCOMPATIBLE_SDP: typingsSlinky.sipDotJs.libConstantsMod.C.causes.INCOMPATIBLE_SDP with String = js.native
  /* "Internal Error" */ val INTERNAL_ERROR: typingsSlinky.sipDotJs.libConstantsMod.C.causes.INTERNAL_ERROR with String = js.native
  /* "Not Found" */ val NOT_FOUND: typingsSlinky.sipDotJs.libConstantsMod.C.causes.NOT_FOUND with String = js.native
  /* "No ACK" */ val NO_ACK: typingsSlinky.sipDotJs.libConstantsMod.C.causes.NO_ACK with String = js.native
  /* "No Answer" */ val NO_ANSWER: typingsSlinky.sipDotJs.libConstantsMod.C.causes.NO_ANSWER with String = js.native
  /* "No PRACK" */ val NO_PRACK: typingsSlinky.sipDotJs.libConstantsMod.C.causes.NO_PRACK with String = js.native
  /* "Redirected" */ val REDIRECTED: typingsSlinky.sipDotJs.libConstantsMod.C.causes.REDIRECTED with String = js.native
  /* "Rejected" */ val REJECTED: typingsSlinky.sipDotJs.libConstantsMod.C.causes.REJECTED with String = js.native
  /* "Request Timeout" */ val REQUEST_TIMEOUT: typingsSlinky.sipDotJs.libConstantsMod.C.causes.REQUEST_TIMEOUT with String = js.native
  /* "RTP Timeout" */ val RTP_TIMEOUT: typingsSlinky.sipDotJs.libConstantsMod.C.causes.RTP_TIMEOUT with String = js.native
  /* "SIP Failure Code" */ val SIP_FAILURE_CODE: typingsSlinky.sipDotJs.libConstantsMod.C.causes.SIP_FAILURE_CODE with String = js.native
  /* "Unavailable" */ val UNAVAILABLE: typingsSlinky.sipDotJs.libConstantsMod.C.causes.UNAVAILABLE with String = js.native
  /* "User Denied Media Access" */ val USER_DENIED_MEDIA_ACCESS: typingsSlinky.sipDotJs.libConstantsMod.C.causes.USER_DENIED_MEDIA_ACCESS with String = js.native
  /* "WebRTC Error" */ val WEBRTC_ERROR: typingsSlinky.sipDotJs.libConstantsMod.C.causes.WEBRTC_ERROR with String = js.native
  /* "WebRTC Not Supported" */ val WEBRTC_NOT_SUPPORTED: typingsSlinky.sipDotJs.libConstantsMod.C.causes.WEBRTC_NOT_SUPPORTED with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[causes with String] = js.native
}

