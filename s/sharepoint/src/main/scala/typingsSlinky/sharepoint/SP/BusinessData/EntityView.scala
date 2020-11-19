package typingsSlinky.sharepoint.SP.BusinessData

import typingsSlinky.sharepoint.SP.BusinessData.Collections.EntityFieldCollection
import typingsSlinky.sharepoint.SP.BusinessData.Runtime.EntityFieldValueDictionary
import typingsSlinky.sharepoint.SP.ClientObject
import typingsSlinky.sharepoint.SP.StringResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityView extends ClientObject {
  
  def getDefaultValues(): EntityFieldValueDictionary = js.native
  
  def getType(fieldDotNotation: String): StringResult = js.native
  
  def getTypeDescriptor(fieldDotNotation: String): TypeDescriptor = js.native
  
  def getXmlSchema(): StringResult = js.native
  
  def get_fields(): EntityFieldCollection = js.native
  
  def get_name(): String = js.native
  
  def get_relatedSpecificFinderName(): String = js.native
}
