package typingsSlinky.xadesjs

import typingsSlinky.xadesjs.encapsulatedPkiDataMod.EncapsulatedPKIData
import typingsSlinky.xadesjs.xmlBaseMod.XadesCollection
import typingsSlinky.xadesjs.xmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object revocationValuesMod {
  
  @JSImport("xadesjs/build/types/xml/revocation_values", "CRLValues")
  @js.native
  class CRLValues () extends XadesCollection[EncapsulatedCRLValue] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/revocation_values", "EncapsulatedCRLValue")
  @js.native
  class EncapsulatedCRLValue () extends EncapsulatedPKIData {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/revocation_values", "EncapsulatedOCSPValue")
  @js.native
  class EncapsulatedOCSPValue () extends EncapsulatedPKIData {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/revocation_values", "OCSPValues")
  @js.native
  class OCSPValues () extends XadesCollection[EncapsulatedOCSPValue] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/revocation_values", "OtherValue")
  @js.native
  class OtherValue () extends EncapsulatedPKIData {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/revocation_values", "OtherValues")
  @js.native
  class OtherValues () extends XadesCollection[OtherValue] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/revocation_values", "RevocationValues")
  @js.native
  class RevocationValues () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var CRLValues: typingsSlinky.xadesjs.revocationValuesMod.CRLValues = js.native
    
    var Id: String = js.native
    
    var OCSPValues: typingsSlinky.xadesjs.revocationValuesMod.OCSPValues = js.native
    
    var OtherValues: typingsSlinky.xadesjs.revocationValuesMod.OtherValues = js.native
  }
}
