package typingsSlinky.sharepoint.global.SP.JsGrid

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLTableCellElement
import typingsSlinky.sharepoint.SP.JsGrid.IStyleManager
import typingsSlinky.sharepoint.SP.JsGrid.IStyleType
import typingsSlinky.sharepoint.anon.Cell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.Style")
@js.native
class Style ()
  extends typingsSlinky.sharepoint.SP.JsGrid.Style

/* static members */
@JSGlobal("SP.JsGrid.Style")
@js.native
object Style extends js.Object {
  var Type: Cell = js.native
  def ApplyCellStyle(td: HTMLTableCellElement, style: js.Any): Unit = js.native
  def ApplyColumnContextMenuStyle(domObj: HTMLElement, style: js.Any): Unit = js.native
  def ApplyCornerHeaderBorderStyle(domObj: HTMLElement, colStyle: js.Any, rowStyle: js.Any): Unit = js.native
  def ApplyHeaderInnerBorderStyle(domObj: HTMLElement, bIsRowHeader: js.Any, headerObject: js.Any): Unit = js.native
  def ApplyRowHeaderStyle(
    domObj: HTMLElement,
    style: js.Any,
    fnGetHeaderSibling: js.Function2[/* elem */ HTMLElement, /* previousElem */ Boolean, Unit]
  ): Unit = js.native
  def ApplySplitterStyle(domObj: HTMLElement, style: js.Any): Unit = js.native
  def CreateStyle(styleType: IStyleType, styleProps: js.Any): js.Any = js.native
  def CreateStyleFromCss(styleType: IStyleType, cssStyleName: String): js.Any = js.native
  def CreateStyleFromCss(
    styleType: IStyleType,
    cssStyleName: String,
    optExistingStyle: js.UndefOr[scala.Nothing],
    optClassId: js.Any
  ): js.Any = js.native
  def CreateStyleFromCss(styleType: IStyleType, cssStyleName: String, optExistingStyle: js.Any): js.Any = js.native
  def CreateStyleFromCss(styleType: IStyleType, cssStyleName: String, optExistingStyle: js.Any, optClassId: js.Any): js.Any = js.native
  def GetCellStyleDefaultBackgroundColor(): String = js.native
  def MakeBorderString(width: Double, style: String, color: String): String = js.native
  def MakeJsGridStyleManager(): IStyleManager = js.native
  def MergeCellStyles(majorStyle: js.Any, minorStyle: js.Any): js.Any = js.native
  def SetRTL(rtlObject: js.Any): Unit = js.native
}

