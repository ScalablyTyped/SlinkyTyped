package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RecycleBinItemType extends js.Object

@JSGlobal("SP.RecycleBinItemType")
@js.native
object RecycleBinItemType extends js.Object {
  @js.native
  sealed trait attachment extends RecycleBinItemType
  
  @js.native
  sealed trait cascadeParent extends RecycleBinItemType
  
  @js.native
  sealed trait file extends RecycleBinItemType
  
  @js.native
  sealed trait fileVersion extends RecycleBinItemType
  
  @js.native
  sealed trait folder extends RecycleBinItemType
  
  @js.native
  sealed trait folderWithLists extends RecycleBinItemType
  
  @js.native
  sealed trait list extends RecycleBinItemType
  
  @js.native
  sealed trait listItem extends RecycleBinItemType
  
  @js.native
  sealed trait listItemVersion extends RecycleBinItemType
  
  @js.native
  sealed trait none extends RecycleBinItemType
  
  @js.native
  sealed trait web extends RecycleBinItemType
  
  /* 7 */ val attachment: typingsSlinky.sharepoint.SP.RecycleBinItemType.attachment with Double = js.native
  /* 9 */ val cascadeParent: typingsSlinky.sharepoint.SP.RecycleBinItemType.cascadeParent with Double = js.native
  /* 1 */ val file: typingsSlinky.sharepoint.SP.RecycleBinItemType.file with Double = js.native
  /* 2 */ val fileVersion: typingsSlinky.sharepoint.SP.RecycleBinItemType.fileVersion with Double = js.native
  /* 5 */ val folder: typingsSlinky.sharepoint.SP.RecycleBinItemType.folder with Double = js.native
  /* 6 */ val folderWithLists: typingsSlinky.sharepoint.SP.RecycleBinItemType.folderWithLists with Double = js.native
  /* 4 */ val list: typingsSlinky.sharepoint.SP.RecycleBinItemType.list with Double = js.native
  /* 3 */ val listItem: typingsSlinky.sharepoint.SP.RecycleBinItemType.listItem with Double = js.native
  /* 8 */ val listItemVersion: typingsSlinky.sharepoint.SP.RecycleBinItemType.listItemVersion with Double = js.native
  /* 0 */ val none: typingsSlinky.sharepoint.SP.RecycleBinItemType.none with Double = js.native
  /* 10 */ val web: typingsSlinky.sharepoint.SP.RecycleBinItemType.web with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RecycleBinItemType with Double] = js.native
}

