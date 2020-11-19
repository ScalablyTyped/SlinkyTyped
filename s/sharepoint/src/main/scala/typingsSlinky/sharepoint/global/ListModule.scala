package typingsSlinky.sharepoint.global

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.sharepoint.ListItem
import typingsSlinky.sharepoint.SPClientTemplates.RenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in SharePoint Online*/
@JSGlobal("ListModule")
@js.native
object ListModule extends js.Object {
  
  @js.native
  object Util extends js.Object {
    
    def clearSelectedItemsDict(context: js.Any): Unit = js.native
    
    def createItemPropertiesTitle(renderCtx: RenderContext, listItem: ListItem): String = js.native
    
    def createViewEditUrl(renderCtx: RenderContext, listItem: ListItem): String = js.native
    def createViewEditUrl(
      renderCtx: RenderContext,
      listItem: ListItem,
      useEditFormUrl: js.UndefOr[scala.Nothing],
      appendSource: Boolean
    ): String = js.native
    def createViewEditUrl(renderCtx: RenderContext, listItem: ListItem, useEditFormUrl: Boolean): String = js.native
    def createViewEditUrl(renderCtx: RenderContext, listItem: ListItem, useEditFormUrl: Boolean, appendSource: Boolean): String = js.native
    
    def ctxInitItemState(context: js.Any): Unit = js.native
    
    def getAttributeFromItemTable(itemTableParam: HTMLElement, strAttributeName: String, strAttributeOldName: String): String = js.native
    
    def getSelectedItemsDict(context: js.Any): js.Any = js.native
    
    def removeOnlyPagingArgs(url: String): String = js.native
    
    def removePagingArgs(url: String): String = js.native
    
    def showAttachmentRows(): Unit = js.native
  }
}
