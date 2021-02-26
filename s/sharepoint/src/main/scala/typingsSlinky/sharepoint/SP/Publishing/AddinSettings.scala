package typingsSlinky.sharepoint.SP.Publishing

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sharepoint.SP.ClientObject
import typingsSlinky.sharepoint.SP.Guid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddinSettings extends ClientObject {
  
  def get_description(): String = js.native
  
  def get_enabled(): Boolean = js.native
  
  def get_headScript(): String = js.native
  
  def get_htmlEndBody(): String = js.native
  
  def get_htmlStartBody(): String = js.native
  
  def get_id(): Guid = js.native
  
  def get_metaTagPagePropertyMappings(): StringDictionary[String] = js.native
  
  def get_namespace(): Boolean = js.native
  
  def get_title(): String = js.native
  
  def set_description(value: String): String = js.native
  
  def set_enabled(value: Boolean): Boolean = js.native
  
  def set_headScript(value: String): String = js.native
  
  def set_htmlEndBody(value: String): String = js.native
  
  def set_htmlStartBody(value: String): String = js.native
  
  def set_metaTagPagePropertyMappings(value: StringDictionary[String]): StringDictionary[String] = js.native
  
  def set_namespace(value: Boolean): Boolean = js.native
  
  def set_title(value: String): String = js.native
}
