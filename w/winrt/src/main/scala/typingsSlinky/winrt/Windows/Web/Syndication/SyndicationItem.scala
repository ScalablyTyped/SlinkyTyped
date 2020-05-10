package typingsSlinky.winrt.Windows.Web.Syndication

import typingsSlinky.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Web.Syndication.SyndicationItem")
@js.native
class SyndicationItem () extends ISyndicationItem {
  def this(title: String, content: SyndicationContent, uri: Uri) = this()
}

