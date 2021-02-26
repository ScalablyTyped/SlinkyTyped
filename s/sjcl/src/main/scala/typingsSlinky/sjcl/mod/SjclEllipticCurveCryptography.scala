package typingsSlinky.sjcl.mod

import typingsSlinky.sjcl.anon.C192
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ________________________________________________________________________
@js.native
trait SjclEllipticCurveCryptography extends StObject {
  
  var basicKey: SjclECCBasic = js.native
  
  var curve: SjclEllipticalCurveStatic = js.native
  
  def curveName(curve: SjclEllipticalCurve): String = js.native
  
  var curves: C192 = js.native
  
  def deserialize(key: SjclECCKeyPairData): SjclECCPublicKey = js.native
  @JSName("deserialize")
  def deserialize_SjclECCSecretKey(key: SjclECCKeyPairData): SjclECCSecretKey = js.native
  
  var ecdsa: SjclECDSA = js.native
  
  var elGamal: SjclElGamal = js.native
  
  var point: SjclEllipticalPointStatic = js.native
  
  var pointJac: SjclPointJacobianStatic = js.native
}
