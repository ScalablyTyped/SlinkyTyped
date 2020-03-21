package typingsSlinky.xmldsigjs

import typingsSlinky.xmldsigjs.pkiMod.X509Certificate
import typingsSlinky.xmldsigjs.rsaKeyMod.RsaPSSSignParams
import typingsSlinky.xmldsigjs.x509DataMod.X509IncludeOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/xml/key_infos", JSImport.Namespace)
@js.native
object keyInfosMod extends js.Object {
  @js.native
  class DomainParameters ()
    extends typingsSlinky.xmldsigjs.ecdsaKeyMod.DomainParameters
  
  @js.native
  class EcdsaKeyValue ()
    extends typingsSlinky.xmldsigjs.ecdsaKeyMod.EcdsaKeyValue
  
  @js.native
  class EcdsaPublicKey ()
    extends typingsSlinky.xmldsigjs.ecdsaKeyMod.EcdsaPublicKey
  
  @js.native
  abstract class KeyInfoClause ()
    extends typingsSlinky.xmldsigjs.keyInfoClauseMod.KeyInfoClause
  
  @js.native
  class KeyInfoX509Data ()
    extends typingsSlinky.xmldsigjs.x509DataMod.KeyInfoX509Data {
    def this(cert: X509Certificate) = this()
    def this(rgbCert: scala.scalajs.js.typedarray.Uint8Array) = this()
    def this(cert: X509Certificate, includeOptions: X509IncludeOption) = this()
  }
  
  @js.native
  class KeyValue ()
    extends typingsSlinky.xmldsigjs.keyValueMod.KeyValue {
    def this(value: typingsSlinky.xmldsigjs.keyInfoClauseMod.KeyInfoClause) = this()
  }
  
  @js.native
  class MaskGenerationFunction ()
    extends typingsSlinky.xmldsigjs.rsaKeyMod.MaskGenerationFunction
  
  @js.native
  class NamedCurve ()
    extends typingsSlinky.xmldsigjs.ecdsaKeyMod.NamedCurve
  
  @js.native
  class PssAlgorithmParams ()
    extends typingsSlinky.xmldsigjs.rsaKeyMod.PssAlgorithmParams {
    def this(algorithm: RsaPSSSignParams) = this()
  }
  
  @js.native
  class RsaKeyValue ()
    extends typingsSlinky.xmldsigjs.rsaKeyMod.RsaKeyValue
  
  @js.native
  class SPKIData ()
    extends typingsSlinky.xmldsigjs.spkiDataMod.SPKIData
  
  @js.native
  class X509IssuerSerial ()
    extends typingsSlinky.xmldsigjs.x509DataMod.X509IssuerSerial
  
  /* static members */
  @js.native
  object PssAlgorithmParams extends js.Object {
    def FromAlgorithm(algorithm: RsaPSSSignParams): typingsSlinky.xmldsigjs.rsaKeyMod.PssAlgorithmParams = js.native
  }
  
  @js.native
  object X509IncludeOption extends js.Object {
    /* 1 */ val EndCertOnly: typingsSlinky.xmldsigjs.x509DataMod.X509IncludeOption.EndCertOnly with Double = js.native
    /* 2 */ val ExcludeRoot: typingsSlinky.xmldsigjs.x509DataMod.X509IncludeOption.ExcludeRoot with Double = js.native
    /* 0 */ val None: typingsSlinky.xmldsigjs.x509DataMod.X509IncludeOption.None with Double = js.native
    /* 3 */ val WholeChain: typingsSlinky.xmldsigjs.x509DataMod.X509IncludeOption.WholeChain with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.xmldsigjs.x509DataMod.X509IncludeOption with Double] = js.native
  }
  
}

