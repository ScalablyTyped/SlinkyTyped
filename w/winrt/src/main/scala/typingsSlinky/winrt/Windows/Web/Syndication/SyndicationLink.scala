package typingsSlinky.winrt.Windows.Web.Syndication

import typingsSlinky.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Web.Syndication.SyndicationLink")
@js.native
class SyndicationLink () extends ISyndicationLink {
  def this(uri: Uri) = this()
  def this(uri: Uri, relationship: String, title: String, mediaType: String, length: Double) = this()
}

