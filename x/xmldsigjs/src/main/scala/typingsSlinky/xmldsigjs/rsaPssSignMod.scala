package typingsSlinky.xmldsigjs

import typingsSlinky.xmldsigjs.algorithmMod.SignatureAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmldsigjs/build/types/algorithms/rsa_pss_sign", JSImport.Namespace)
@js.native
object rsaPssSignMod extends js.Object {
  
  val RSA_PSS: /* "RSA-PSS" */ String = js.native
  
  val RSA_PSS_WITH_PARAMS_NAMESPACE: /* "http://www.w3.org/2007/05/xmldsig-more#rsa-pss" */ String = js.native
  
  @js.native
  class RsaPssBase () extends SignatureAlgorithm {
    def this(saltLength: Double) = this()
  }
  
  @js.native
  class RsaPssSha1 () extends RsaPssBase {
    def this(saltLength: Double) = this()
  }
  
  @js.native
  class RsaPssSha256 () extends RsaPssBase {
    def this(saltLength: Double) = this()
  }
  
  @js.native
  class RsaPssSha384 () extends RsaPssBase {
    def this(saltLength: Double) = this()
  }
  
  @js.native
  class RsaPssSha512 () extends RsaPssBase {
    def this(saltLength: Double) = this()
  }
}
