package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCCertificate extends js.Object {
  val expires: Double = js.native
  def getFingerprints(): js.Array[RTCDtlsFingerprint] = js.native
}

@JSGlobal("RTCCertificate")
@js.native
object RTCCertificate extends Instantiable0[RTCCertificate] {
  def getSupportedAlgorithms(): js.Array[AlgorithmIdentifier] = js.native
}

