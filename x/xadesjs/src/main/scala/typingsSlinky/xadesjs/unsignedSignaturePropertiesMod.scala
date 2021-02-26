package typingsSlinky.xadesjs

import typingsSlinky.xadesjs.certificateValuesMod.CertificateValues
import typingsSlinky.xadesjs.completeCertificateRefsMod.CompleteCertificateRefs
import typingsSlinky.xadesjs.completeRevocationRefsMod.CompleteRevocationRefs
import typingsSlinky.xadesjs.revocationValuesMod.RevocationValues
import typingsSlinky.xadesjs.xadesTimeStampMod.XAdESTimeStamp
import typingsSlinky.xadesjs.xmlBaseMod.XadesCollection
import typingsSlinky.xadesjs.xmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unsignedSignaturePropertiesMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.xmlCore.typesMod.IXmlSerializable because Already inherited
  - typingsSlinky.xmlCore.xmlObjectMod.XmlObject because Already inherited
  - typingsSlinky.xmlCore.mod.XmlObject because Already inherited
  - typingsSlinky.xadesjs.xmlBaseMod.XadesObject because Already inherited
  - typingsSlinky.xadesjs.unsignedSignaturePropertiesMod.UnsignedSignatureProperty because Inheritance from two classes. Inlined  */ @JSImport("xadesjs/build/types/xml/unsigned_signature_properties", "ArchiveTimeStamp")
  @js.native
  class ArchiveTimeStamp () extends XAdESTimeStamp {
    def this(properties: js.Object) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.xmlCore.typesMod.IXmlSerializable because Already inherited
  - typingsSlinky.xmlCore.xmlObjectMod.XmlObject because Already inherited
  - typingsSlinky.xmlCore.mod.XmlObject because Already inherited
  - typingsSlinky.xadesjs.xmlBaseMod.XadesObject because Already inherited
  - typingsSlinky.xadesjs.unsignedSignaturePropertiesMod.UnsignedSignatureProperty because Inheritance from two classes. Inlined  */ @JSImport("xadesjs/build/types/xml/unsigned_signature_properties", "AttrAuthoritiesCertValues")
  @js.native
  class AttrAuthoritiesCertValues () extends CertificateValues {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/unsigned_signature_properties", "AttributeCertificateRefs")
  @js.native
  class AttributeCertificateRefs () extends CompleteCertificateRefs {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/unsigned_signature_properties", "AttributeRevocationRefs")
  @js.native
  class AttributeRevocationRefs () extends CompleteRevocationRefs {
    def this(properties: js.Object) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.xmlCore.typesMod.IXmlSerializable because Already inherited
  - typingsSlinky.xmlCore.xmlObjectMod.XmlObject because Already inherited
  - typingsSlinky.xmlCore.mod.XmlObject because Already inherited
  - typingsSlinky.xadesjs.xmlBaseMod.XadesObject because Already inherited
  - typingsSlinky.xadesjs.unsignedSignaturePropertiesMod.UnsignedSignatureProperty because Inheritance from two classes. Inlined  */ @JSImport("xadesjs/build/types/xml/unsigned_signature_properties", "AttributeRevocationValues")
  @js.native
  class AttributeRevocationValues () extends RevocationValues {
    def this(properties: js.Object) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.xmlCore.typesMod.IXmlSerializable because Already inherited
  - typingsSlinky.xmlCore.xmlObjectMod.XmlObject because Already inherited
  - typingsSlinky.xmlCore.mod.XmlObject because Already inherited
  - typingsSlinky.xadesjs.xmlBaseMod.XadesObject because Already inherited
  - typingsSlinky.xadesjs.unsignedSignaturePropertiesMod.UnsignedSignatureProperty because Inheritance from two classes. Inlined  */ @JSImport("xadesjs/build/types/xml/unsigned_signature_properties", "RefsOnlyTimeStamp")
  @js.native
  class RefsOnlyTimeStamp () extends XAdESTimeStamp {
    def this(properties: js.Object) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.xmlCore.typesMod.IXmlSerializable because Already inherited
  - typingsSlinky.xmlCore.xmlObjectMod.XmlObject because Already inherited
  - typingsSlinky.xmlCore.mod.XmlObject because Already inherited
  - typingsSlinky.xadesjs.xmlBaseMod.XadesObject because Already inherited
  - typingsSlinky.xadesjs.unsignedSignaturePropertiesMod.UnsignedSignatureProperty because Inheritance from two classes. Inlined  */ @JSImport("xadesjs/build/types/xml/unsigned_signature_properties", "SigAndRefsTimeStamp")
  @js.native
  class SigAndRefsTimeStamp () extends XAdESTimeStamp {
    def this(properties: js.Object) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.xmlCore.typesMod.IXmlSerializable because Already inherited
  - typingsSlinky.xmlCore.xmlObjectMod.XmlObject because Already inherited
  - typingsSlinky.xmlCore.mod.XmlObject because Already inherited
  - typingsSlinky.xadesjs.xmlBaseMod.XadesObject because Already inherited
  - typingsSlinky.xadesjs.unsignedSignaturePropertiesMod.UnsignedSignatureProperty because Inheritance from two classes. Inlined  */ @JSImport("xadesjs/build/types/xml/unsigned_signature_properties", "SignatureTimeStamp")
  @js.native
  class SignatureTimeStamp () extends XAdESTimeStamp {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/unsigned_signature_properties", "UnsignedSignatureProperties")
  @js.native
  class UnsignedSignatureProperties () extends XadesCollection[UnsignedSignatureProperty] {
    def this(properties: js.Object) = this()
    
    var Id: String = js.native
  }
  
  @JSImport("xadesjs/build/types/xml/unsigned_signature_properties", "UnsignedSignatureProperty")
  @js.native
  class UnsignedSignatureProperty () extends XadesObject {
    def this(properties: js.Object) = this()
  }
}
