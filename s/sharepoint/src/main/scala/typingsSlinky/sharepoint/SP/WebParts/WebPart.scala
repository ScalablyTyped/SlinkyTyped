package typingsSlinky.sharepoint.SP.WebParts

import typingsSlinky.sharepoint.SP.ClientObject
import typingsSlinky.sharepoint.SP.PropertyValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebPart extends ClientObject {
  
  def get_hidden(): Boolean = js.native
  
  def get_isClosed(): Boolean = js.native
  
  def get_properties(): PropertyValues = js.native
  
  def get_subtitle(): String = js.native
  
  def get_title(): String = js.native
  
  def get_titleUrl(): String = js.native
  
  def get_zoneIndex(): Double = js.native
  
  def set_hidden(value: Boolean): Unit = js.native
  
  def set_title(value: String): Unit = js.native
  
  def set_titleUrl(value: String): Unit = js.native
}
