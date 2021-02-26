package typingsSlinky.xmldsigjs

import typingsSlinky.xmldsigjs.pkiMod.X509Certificate
import typingsSlinky.xmldsigjs.rsaKeyMod.RsaPSSSignParams
import typingsSlinky.xmldsigjs.x509DataMod.X509IncludeOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyInfosMod {
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "DomainParameters")
  @js.native
  class DomainParameters ()
    extends typingsSlinky.xmldsigjs.ecdsaKeyMod.DomainParameters {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "EcdsaKeyValue")
  @js.native
  class EcdsaKeyValue ()
    extends typingsSlinky.xmldsigjs.ecdsaKeyMod.EcdsaKeyValue {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "EcdsaPublicKey")
  @js.native
  class EcdsaPublicKey ()
    extends typingsSlinky.xmldsigjs.ecdsaKeyMod.EcdsaPublicKey {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "KeyInfoClause")
  @js.native
  abstract class KeyInfoClause ()
    extends typingsSlinky.xmldsigjs.keyInfoClauseMod.KeyInfoClause {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "KeyInfoX509Data")
  @js.native
  class KeyInfoX509Data ()
    extends typingsSlinky.xmldsigjs.x509DataMod.KeyInfoX509Data {
    def this(cert: X509Certificate) = this()
    def this(rgbCert: js.typedarray.Uint8Array) = this()
    def this(cert: X509Certificate, includeOptions: X509IncludeOption) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "KeyValue")
  @js.native
  class KeyValue ()
    extends typingsSlinky.xmldsigjs.keyValueMod.KeyValue {
    def this(value: typingsSlinky.xmldsigjs.keyInfoClauseMod.KeyInfoClause) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "MaskGenerationFunction")
  @js.native
  class MaskGenerationFunction ()
    extends typingsSlinky.xmldsigjs.rsaKeyMod.MaskGenerationFunction {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "NamedCurve")
  @js.native
  class NamedCurve ()
    extends typingsSlinky.xmldsigjs.ecdsaKeyMod.NamedCurve {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "PssAlgorithmParams")
  @js.native
  class PssAlgorithmParams ()
    extends typingsSlinky.xmldsigjs.rsaKeyMod.PssAlgorithmParams {
    def this(algorithm: RsaPSSSignParams) = this()
  }
  /* static members */
  object PssAlgorithmParams {
    
    @JSImport("xmldsigjs/build/types/xml/key_infos", "PssAlgorithmParams.FromAlgorithm")
    @js.native
    def FromAlgorithm(algorithm: RsaPSSSignParams): typingsSlinky.xmldsigjs.rsaKeyMod.PssAlgorithmParams = js.native
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "RsaKeyValue")
  @js.native
  class RsaKeyValue ()
    extends typingsSlinky.xmldsigjs.rsaKeyMod.RsaKeyValue {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "SPKIData")
  @js.native
  class SPKIData ()
    extends typingsSlinky.xmldsigjs.spkiDataMod.SPKIData {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "X509IncludeOption")
  @js.native
  object X509IncludeOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.xmldsigjs.x509DataMod.X509IncludeOption with Double] = js.native
    
    /* 1 */ val EndCertOnly: typingsSlinky.xmldsigjs.x509DataMod.X509IncludeOption.EndCertOnly with Double = js.native
    
    /* 2 */ val ExcludeRoot: typingsSlinky.xmldsigjs.x509DataMod.X509IncludeOption.ExcludeRoot with Double = js.native
    
    /* 0 */ val None: typingsSlinky.xmldsigjs.x509DataMod.X509IncludeOption.None with Double = js.native
    
    /* 3 */ val WholeChain: typingsSlinky.xmldsigjs.x509DataMod.X509IncludeOption.WholeChain with Double = js.native
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "X509IssuerSerial")
  @js.native
  class X509IssuerSerial ()
    extends typingsSlinky.xmldsigjs.x509DataMod.X509IssuerSerial {
    def this(properties: js.Object) = this()
  }
}
