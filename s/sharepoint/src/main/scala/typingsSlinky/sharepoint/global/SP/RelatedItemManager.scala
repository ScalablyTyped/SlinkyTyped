package typingsSlinky.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.RelatedItemManager")
@js.native
class RelatedItemManager ()
  extends typingsSlinky.sharepoint.SP.ClientObject

/* static members */
@JSGlobal("SP.RelatedItemManager")
@js.native
object RelatedItemManager extends js.Object {
  def addSingleLink(
    context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
    SourceListName: String,
    SourceItemID: Double,
    SourceWebUrl: String,
    TargetListName: String,
    TargetItemID: Double,
    TargetWebUrl: String,
    TryAddReverseLink: Boolean
  ): Unit = js.native
  def addSingleLinkFromUrl(
    context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
    SourceItemUrl: String,
    TargetListName: String,
    TargetItemID: Double,
    TryAddReverseLink: Boolean
  ): Unit = js.native
  def addSingleLinkToUrl(
    context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
    SourceListName: String,
    SourceItemID: Double,
    TargetItemUrl: String,
    TryAddReverseLink: Boolean
  ): Unit = js.native
  def deleteSingleLink(
    context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
    SourceListName: String,
    SourceItemID: Double,
    SourceWebUrl: String,
    TargetListName: String,
    TargetItemID: Double,
    TargetWebUrl: String,
    TryDeleteReverseLink: Boolean
  ): Unit = js.native
  def getPageOneRelatedItems(
    context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
    SourceListName: String,
    SourceItemID: Double
  ): js.Array[typingsSlinky.sharepoint.SP.RelatedItem] = js.native
  def getRelatedItems(
    context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
    SourceListName: String,
    SourceItemID: Double
  ): js.Array[typingsSlinky.sharepoint.SP.RelatedItem] = js.native
}

