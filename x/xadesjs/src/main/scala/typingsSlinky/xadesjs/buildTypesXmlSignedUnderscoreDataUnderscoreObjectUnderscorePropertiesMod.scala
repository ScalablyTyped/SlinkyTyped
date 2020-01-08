package typingsSlinky.xadesjs

import typingsSlinky.xadesjs.buildTypesXmlCommitmentUnderscoreTypeUnderscoreIndicationMod.CommitmentTypeIndication
import typingsSlinky.xadesjs.buildTypesXmlDataUnderscoreObjectUnderscoreFormatMod.DataObjectFormat
import typingsSlinky.xadesjs.buildTypesXmlXadesUnderscoreTimeUnderscoreStampMod.XAdESTimeStamp
import typingsSlinky.xmlDashCore.xmlDashCoreMod.XmlCollection
import typingsSlinky.xmlDashCore.xmlDashCoreMod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs/build/types/xml/signed_data_object_properties", JSImport.Namespace)
@js.native
object buildTypesXmlSignedUnderscoreDataUnderscoreObjectUnderscorePropertiesMod extends js.Object {
  @js.native
  class AllDataObjectsTimeStamp () extends XAdESTimeStamp
  
  @js.native
  class AllDataObjectsTimeStampCollection () extends XmlCollection[AllDataObjectsTimeStamp]
  
  @js.native
  class CommitmentTypeIndicationCollection () extends XmlCollection[CommitmentTypeIndication]
  
  @js.native
  class DataObjectFormatCollection () extends XmlCollection[DataObjectFormat]
  
  @js.native
  class IndividualDataObjectsTimeStamp () extends XAdESTimeStamp
  
  @js.native
  class IndividualDataObjectsTimeStampCollection () extends XmlCollection[IndividualDataObjectsTimeStamp]
  
  @js.native
  class SignedDataObjectProperties () extends XmlObject {
    var AllDataObjectsTimeStamps: AllDataObjectsTimeStampCollection = js.native
    var CommitmentTypeIndications: CommitmentTypeIndicationCollection = js.native
    var DataObjectFormats: DataObjectFormatCollection = js.native
    var Id: String = js.native
    var IndividualDataObjectsTimeStamps: IndividualDataObjectsTimeStampCollection = js.native
  }
  
}

