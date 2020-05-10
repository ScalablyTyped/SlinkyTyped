package typingsSlinky.winrt.Windows.Web.Syndication

import typingsSlinky.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Web.Syndication.SyndicationContent")
@js.native
class SyndicationContent () extends ISyndicationContent {
  def this(sourceUri: Uri) = this()
  def this(text: String, `type`: SyndicationTextType) = this()
}

