package typingsSlinky.winrt.Windows.Web.Syndication

import typingsSlinky.winrt.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISyndicationLinkFactory extends StObject {
  
  def createSyndicationLink(uri: Uri): SyndicationLink = js.native
  def createSyndicationLink(uri: Uri, relationship: String, title: String, mediaType: String, length: Double): SyndicationLink = js.native
}
