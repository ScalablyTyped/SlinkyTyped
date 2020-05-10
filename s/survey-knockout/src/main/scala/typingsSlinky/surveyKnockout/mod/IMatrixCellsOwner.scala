package typingsSlinky.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMatrixCellsOwner extends ILocalizableOwner {
  def getColumns(): js.Array[_] = js.native
  def getRows(): js.Array[_] = js.native
}

object IMatrixCellsOwner {
  @scala.inline
  def apply(
    getColumns: () => js.Array[_],
    getLocale: () => String,
    getMarkdownHtml: String => String,
    getProcessedText: String => String,
    getRows: () => js.Array[_]
  ): IMatrixCellsOwner = {
    val __obj = js.Dynamic.literal(getColumns = js.Any.fromFunction0(getColumns), getLocale = js.Any.fromFunction0(getLocale), getMarkdownHtml = js.Any.fromFunction1(getMarkdownHtml), getProcessedText = js.Any.fromFunction1(getProcessedText), getRows = js.Any.fromFunction0(getRows))
    __obj.asInstanceOf[IMatrixCellsOwner]
  }
  @scala.inline
  implicit class IMatrixCellsOwnerOps[Self <: IMatrixCellsOwner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetColumns(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColumns")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRows(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRows")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

