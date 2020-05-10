package typingsSlinky.winrt.Windows.Web.Syndication

import typingsSlinky.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISyndicationItemFactory extends js.Object {
  def createSyndicationItem(title: String, content: SyndicationContent, uri: Uri): SyndicationItem = js.native
}

object ISyndicationItemFactory {
  @scala.inline
  def apply(createSyndicationItem: (String, SyndicationContent, Uri) => SyndicationItem): ISyndicationItemFactory = {
    val __obj = js.Dynamic.literal(createSyndicationItem = js.Any.fromFunction3(createSyndicationItem))
    __obj.asInstanceOf[ISyndicationItemFactory]
  }
  @scala.inline
  implicit class ISyndicationItemFactoryOps[Self <: ISyndicationItemFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateSyndicationItem(value: (String, SyndicationContent, Uri) => SyndicationItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSyndicationItem")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

