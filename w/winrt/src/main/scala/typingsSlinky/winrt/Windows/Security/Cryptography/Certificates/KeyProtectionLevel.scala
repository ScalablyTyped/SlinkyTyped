package typingsSlinky.winrt.Windows.Security.Cryptography.Certificates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait KeyProtectionLevel extends StObject
@JSGlobal("Windows.Security.Cryptography.Certificates.KeyProtectionLevel")
@js.native
object KeyProtectionLevel extends StObject {
  
  @js.native
  sealed trait consentOnly extends KeyProtectionLevel
  
  @js.native
  sealed trait consentWithPassword extends KeyProtectionLevel
  
  @js.native
  sealed trait noConsent extends KeyProtectionLevel
}
