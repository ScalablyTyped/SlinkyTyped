package typingsSlinky.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.DataConvert")
@js.native
class DataConvert ()
  extends typingsSlinky.sharepoint.SP.DataConvert
object DataConvert {
  
  /* static member */
  @JSGlobal("SP.DataConvert.createLocalDateTime")
  @js.native
  def createLocalDateTime(milliseconds: Double): js.Date = js.native
  
  /* static member */
  @JSGlobal("SP.DataConvert.createUnspecifiedDateTime")
  @js.native
  def createUnspecifiedDateTime(
    year: Double,
    month: Double,
    day: Double,
    hour: Double,
    minute: Double,
    second: Double,
    milliseconds: Double
  ): js.Date = js.native
  
  /* static member */
  @JSGlobal("SP.DataConvert.createUtcDateTime")
  @js.native
  def createUtcDateTime(milliseconds: Double): js.Date = js.native
  
  /* static member */
  @JSGlobal("SP.DataConvert.fixupType")
  @js.native
  def fixupType(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, obj: js.Any): js.Any = js.native
  
  /* static member */
  @JSGlobal("SP.DataConvert.fixupTypes")
  @js.native
  def fixupTypes(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, dict: js.Any): Unit = js.native
  
  /* static member */
  @JSGlobal("SP.DataConvert.getDateTimeKind")
  @js.native
  def getDateTimeKind(datetime: js.Date): typingsSlinky.sharepoint.SP.DateTimeKind = js.native
  
  /* static member */
  @JSGlobal("SP.DataConvert.invokeGetProperty")
  @js.native
  def invokeGetProperty(obj: js.Any, propName: String): js.Any = js.native
  
  /* static member */
  @JSGlobal("SP.DataConvert.invokeSetProperty")
  @js.native
  def invokeSetProperty(obj: js.Any, propName: String, propValue: js.Any): Unit = js.native
  
  /* static member */
  @JSGlobal("SP.DataConvert.populateArray")
  @js.native
  def populateArray(
    context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
    dest: js.Any,
    jsonArrayFromServer: js.Any
  ): Unit = js.native
  
  /* static member */
  @JSGlobal("SP.DataConvert.populateDictionaryFromObject")
  @js.native
  def populateDictionaryFromObject(dict: js.Any, parentNode: js.Any): Unit = js.native
  
  /* static member */
  @JSGlobal("SP.DataConvert.specifyDateTimeKind")
  @js.native
  def specifyDateTimeKind(datetime: js.Date, kind: typingsSlinky.sharepoint.SP.DateTimeKind): Unit = js.native
  
  /* static member */
  @JSGlobal("SP.DataConvert.writeDictionaryToXml")
  @js.native
  def writeDictionaryToXml(
    writer: typingsSlinky.sharepoint.SP.XmlWriter,
    dict: js.Any,
    topLevelElementTagName: String,
    keys: js.Any,
    serializationContext: typingsSlinky.sharepoint.SP.SerializationContext
  ): Unit = js.native
  
  /* static member */
  @JSGlobal("SP.DataConvert.writePropertiesToXml")
  @js.native
  def writePropertiesToXml(
    writer: typingsSlinky.sharepoint.SP.XmlWriter,
    obj: js.Any,
    propNames: js.Array[String],
    serializationContext: typingsSlinky.sharepoint.SP.SerializationContext
  ): Unit = js.native
  
  /* static member */
  @JSGlobal("SP.DataConvert.writeValueToXmlElement")
  @js.native
  def writeValueToXmlElement(
    writer: typingsSlinky.sharepoint.SP.XmlWriter,
    objValue: js.Any,
    serializationContext: typingsSlinky.sharepoint.SP.SerializationContext
  ): Unit = js.native
}
