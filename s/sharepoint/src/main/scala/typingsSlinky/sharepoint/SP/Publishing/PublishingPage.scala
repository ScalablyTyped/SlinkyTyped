package typingsSlinky.sharepoint.SP.Publishing

import typingsSlinky.sharepoint.SP.ClientContext
import typingsSlinky.sharepoint.SP.ListItem
import typingsSlinky.sharepoint.SP.Publishing.Navigation.NavigationTermSetItem
import typingsSlinky.sharepoint.SP.StringResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.PublishingPage")
@js.native
class PublishingPage () extends ScheduledItem {
  def addFriendlyUrl(friendlyUrlSegment: String, editableParent: NavigationTermSetItem, doAddToNavigation: Boolean): StringResult = js.native
}

/* static members */
@JSGlobal("SP.Publishing.PublishingPage")
@js.native
object PublishingPage extends js.Object {
  def getPublishingPage(context: ClientContext, sourceListItem: ListItem[_]): PublishingPage = js.native
}

