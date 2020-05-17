package typingsSlinky.sharepoint.SP.Publishing.Navigation

import typingsSlinky.sharepoint.SP.ClientObject
import typingsSlinky.sharepoint.SP.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationTermSetView extends ClientObject {
  def getCopy(): NavigationTermSetView = js.native
  def get_excludeDeprecatedTerms(): Boolean = js.native
  def get_excludeTermsByPermissions(): Boolean = js.native
  def get_excludeTermsByProvider(): Boolean = js.native
  def get_serverRelativeSiteUrl(): String = js.native
  def get_serverRelativeWebUrl(): String = js.native
  def get_siteMapProviderName(): String = js.native
  def get_webId(): Guid = js.native
  def get_webTitle(): String = js.native
  def set_excludeDeprecatedTerms(value: Boolean): Boolean = js.native
  def set_excludeTermsByPermissions(value: Boolean): Boolean = js.native
  def set_excludeTermsByProvider(value: Boolean): Boolean = js.native
  def set_siteMapProviderName(value: String): String = js.native
}

