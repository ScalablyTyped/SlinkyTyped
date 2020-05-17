package typingsSlinky.sharepoint.SP.Publishing

import typingsSlinky.sharepoint.SP.Publishing.Navigation.NavigationTermSetItem
import typingsSlinky.sharepoint.SP.StringResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishingPage extends ScheduledItem {
  def addFriendlyUrl(friendlyUrlSegment: String, editableParent: NavigationTermSetItem, doAddToNavigation: Boolean): StringResult = js.native
}

