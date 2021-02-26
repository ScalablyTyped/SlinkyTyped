package typingsSlinky.xadesjs

import typingsSlinky.xadesjs.commitmentTypeIndicationMod.CommitmentTypeIndication
import typingsSlinky.xadesjs.dataObjectFormatMod.DataObjectFormat
import typingsSlinky.xadesjs.xadesTimeStampMod.XAdESTimeStamp
import typingsSlinky.xadesjs.xmlBaseMod.XadesCollection
import typingsSlinky.xadesjs.xmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signedDataObjectPropertiesMod {
  
  @JSImport("xadesjs/build/types/xml/signed_data_object_properties", "AllDataObjectsTimeStamp")
  @js.native
  class AllDataObjectsTimeStamp () extends XAdESTimeStamp {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/signed_data_object_properties", "AllDataObjectsTimeStampCollection")
  @js.native
  class AllDataObjectsTimeStampCollection () extends XadesCollection[AllDataObjectsTimeStamp] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/signed_data_object_properties", "CommitmentTypeIndicationCollection")
  @js.native
  class CommitmentTypeIndicationCollection () extends XadesCollection[CommitmentTypeIndication] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/signed_data_object_properties", "DataObjectFormatCollection")
  @js.native
  class DataObjectFormatCollection () extends XadesCollection[DataObjectFormat] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/signed_data_object_properties", "IndividualDataObjectsTimeStamp")
  @js.native
  class IndividualDataObjectsTimeStamp () extends XAdESTimeStamp {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/signed_data_object_properties", "IndividualDataObjectsTimeStampCollection")
  @js.native
  class IndividualDataObjectsTimeStampCollection () extends XadesCollection[IndividualDataObjectsTimeStamp] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/signed_data_object_properties", "SignedDataObjectProperties")
  @js.native
  class SignedDataObjectProperties () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var AllDataObjectsTimeStamps: AllDataObjectsTimeStampCollection = js.native
    
    var CommitmentTypeIndications: CommitmentTypeIndicationCollection = js.native
    
    var DataObjectFormats: DataObjectFormatCollection = js.native
    
    var Id: String = js.native
    
    var IndividualDataObjectsTimeStamps: IndividualDataObjectsTimeStampCollection = js.native
  }
}
