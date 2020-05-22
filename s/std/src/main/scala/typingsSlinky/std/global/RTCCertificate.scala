package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.std.AlgorithmIdentifier
import typingsSlinky.std.RTCDtlsFingerprint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("RTCCertificate")
@js.native
class RTCCertificate ()
  extends typingsSlinky.std.RTCCertificate {
  /* CompleteClass */
  override val expires: Double = js.native
  /* CompleteClass */
  override def getFingerprints(): js.Array[RTCDtlsFingerprint] = js.native
}

@JSGlobal("RTCCertificate")
@js.native
object RTCCertificate
  extends Instantiable0[typingsSlinky.std.RTCCertificate] {
  def getSupportedAlgorithms(): js.Array[AlgorithmIdentifier] = js.native
}

