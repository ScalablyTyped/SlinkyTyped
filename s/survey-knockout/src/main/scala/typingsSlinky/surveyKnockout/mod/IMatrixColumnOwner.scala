package typingsSlinky.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMatrixColumnOwner extends ILocalizableOwner {
  def getCellType(): String = js.native
  def getRequiredText(): String = js.native
  def onColumnCellTypeChanged(column: MatrixDropdownColumn): Unit = js.native
  def onColumnPropertiesChanged(column: MatrixDropdownColumn): Unit = js.native
}

object IMatrixColumnOwner {
  @scala.inline
  def apply(
    getCellType: () => String,
    getLocale: () => String,
    getMarkdownHtml: String => String,
    getProcessedText: String => String,
    getRequiredText: () => String,
    onColumnCellTypeChanged: MatrixDropdownColumn => Unit,
    onColumnPropertiesChanged: MatrixDropdownColumn => Unit
  ): IMatrixColumnOwner = {
    val __obj = js.Dynamic.literal(getCellType = js.Any.fromFunction0(getCellType), getLocale = js.Any.fromFunction0(getLocale), getMarkdownHtml = js.Any.fromFunction1(getMarkdownHtml), getProcessedText = js.Any.fromFunction1(getProcessedText), getRequiredText = js.Any.fromFunction0(getRequiredText), onColumnCellTypeChanged = js.Any.fromFunction1(onColumnCellTypeChanged), onColumnPropertiesChanged = js.Any.fromFunction1(onColumnPropertiesChanged))
    __obj.asInstanceOf[IMatrixColumnOwner]
  }
  @scala.inline
  implicit class IMatrixColumnOwnerOps[Self <: IMatrixColumnOwner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCellType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCellType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRequiredText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRequiredText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnColumnCellTypeChanged(value: MatrixDropdownColumn => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnCellTypeChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnColumnPropertiesChanged(value: MatrixDropdownColumn => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnPropertiesChanged")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

