package typingsSlinky.xmldsigjs

import typingsSlinky.xmldsigjs.buildTypesPkiMod.X509Certificate
import typingsSlinky.xmldsigjs.buildTypesXmlKeyUnderscoreInfosRsaUnderscoreKeyMod.RsaPSSSignParams
import typingsSlinky.xmldsigjs.buildTypesXmlKeyUnderscoreInfosX509UnderscoreDataMod.X509IncludeOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/xml/key_infos", JSImport.Namespace)
@js.native
object buildTypesXmlKeyUnderscoreInfosMod extends js.Object {
  @js.native
  class DomainParameters ()
    extends typingsSlinky.xmldsigjs.buildTypesXmlKeyUnderscoreInfosEcdsaUnderscoreKeyMod.DomainParameters
  
  @js.native
  class EcdsaKeyValue ()
    extends typingsSlinky.xmldsigjs.buildTypesXmlKeyUnderscoreInfosEcdsaUnderscoreKeyMod.EcdsaKeyValue
  
  @js.native
  class EcdsaPublicKey ()
    extends typingsSlinky.xmldsigjs.buildTypesXmlKeyUnderscoreInfosEcdsaUnderscoreKeyMod.EcdsaPublicKey
  
  @js.native
  abstract class KeyInfoClause ()
    extends typingsSlinky.xmldsigjs.buildTypesXmlKeyUnderscoreInfosKeyUnderscoreInfoUnderscoreClauseMod.KeyInfoClause
  
  @js.native
  class KeyInfoX509Data ()
    extends typingsSlinky.xmldsigjs.buildTypesXmlKeyUnderscoreInfosX509UnderscoreDataMod.KeyInfoX509Data {
    def this(cert: X509Certificate) = this()
    def this(rgbCert: scala.scalajs.js.typedarray.Uint8Array) = this()
    def this(cert: X509Certificate, includeOptions: X509IncludeOption) = this()
  }
  
  @js.native
  class KeyValue ()
    extends typingsSlinky.xmldsigjs.buildTypesXmlKeyUnderscoreInfosKeyUnderscoreValueMod.KeyValue {
    def this(value: typingsSlinky.xmldsigjs.buildTypesXmlKeyUnderscoreInfosKeyUnderscoreInfoUnderscoreClauseMod.KeyInfoClause) = this()
  }
  
  @js.native
  class MaskGenerationFunction ()
    extends typingsSlinky.xmldsigjs.buildTypesXmlKeyUnderscoreInfosRsaUnderscoreKeyMod.MaskGenerationFunction
  
  @js.native
  class NamedCurve ()
    extends typingsSlinky.xmldsigjs.buildTypesXmlKeyUnderscoreInfosEcdsaUnderscoreKeyMod.NamedCurve
  
  @js.native
  class PssAlgorithmParams ()
    extends typingsSlinky.xmldsigjs.buildTypesXmlKeyUnderscoreInfosRsaUnderscoreKeyMod.PssAlgorithmParams {
    def this(algorithm: RsaPSSSignParams) = this()
  }
  
  @js.native
  class RsaKeyValue ()
    extends typingsSlinky.xmldsigjs.buildTypesXmlKeyUnderscoreInfosRsaUnderscoreKeyMod.RsaKeyValue
  
  @js.native
  class SPKIData ()
    extends typingsSlinky.xmldsigjs.buildTypesXmlKeyUnderscoreInfosSpkiUnderscoreDataMod.SPKIData
  
  @js.native
  class X509IssuerSerial ()
    extends typingsSlinky.xmldsigjs.buildTypesXmlKeyUnderscoreInfosX509UnderscoreDataMod.X509IssuerSerial
  
  /* static members */
  @js.native
  object PssAlgorithmParams extends js.Object {
    def FromAlgorithm(algorithm: RsaPSSSignParams): typingsSlinky.xmldsigjs.buildTypesXmlKeyUnderscoreInfosRsaUnderscoreKeyMod.PssAlgorithmParams = js.native
  }
  
  @js.native
  object X509IncludeOption extends js.Object {
    /* 1 */ val EndCertOnly: typingsSlinky.xmldsigjs.buildTypesXmlKeyUnderscoreInfosX509UnderscoreDataMod.X509IncludeOption.EndCertOnly with Double = js.native
    /* 2 */ val ExcludeRoot: typingsSlinky.xmldsigjs.buildTypesXmlKeyUnderscoreInfosX509UnderscoreDataMod.X509IncludeOption.ExcludeRoot with Double = js.native
    /* 0 */ val None: typingsSlinky.xmldsigjs.buildTypesXmlKeyUnderscoreInfosX509UnderscoreDataMod.X509IncludeOption.None with Double = js.native
    /* 3 */ val WholeChain: typingsSlinky.xmldsigjs.buildTypesXmlKeyUnderscoreInfosX509UnderscoreDataMod.X509IncludeOption.WholeChain with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.xmldsigjs.buildTypesXmlKeyUnderscoreInfosX509UnderscoreDataMod.X509IncludeOption with Double
      ] = js.native
  }
  
}

