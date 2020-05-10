package typingsSlinky.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMatrixDropdownData extends js.Object {
  var columns: js.Array[MatrixDropdownColumn] = js.native
  var value: js.Any = js.native
  def createQuestion(row: MatrixDropdownRowModelBase, column: MatrixDropdownColumn): Question = js.native
  def getLocale(): String = js.native
  def getMarkdownHtml(text: String): String = js.native
  def getProcessedText(text: String): String = js.native
  def getRowIndex(row: MatrixDropdownRowModelBase): Double = js.native
  def getSharedQuestionByName(columnName: String, row: MatrixDropdownRowModelBase): Question = js.native
  def getSurvey(): ISurvey = js.native
  def onRowChanged(row: MatrixDropdownRowModelBase, columnName: String, newRowValue: js.Any, isDeletingValue: Boolean): Unit = js.native
  def onRowChanging(row: MatrixDropdownRowModelBase, columnName: String, rowValue: js.Any): js.Any = js.native
  def onTotalValueChanged(): js.Any = js.native
  def validateCell(row: MatrixDropdownRowModelBase, columnName: String, rowValue: js.Any): SurveyError = js.native
}

object IMatrixDropdownData {
  @scala.inline
  def apply(
    columns: js.Array[MatrixDropdownColumn],
    createQuestion: (MatrixDropdownRowModelBase, MatrixDropdownColumn) => Question,
    getLocale: () => String,
    getMarkdownHtml: String => String,
    getProcessedText: String => String,
    getRowIndex: MatrixDropdownRowModelBase => Double,
    getSharedQuestionByName: (String, MatrixDropdownRowModelBase) => Question,
    getSurvey: () => ISurvey,
    onRowChanged: (MatrixDropdownRowModelBase, String, js.Any, Boolean) => Unit,
    onRowChanging: (MatrixDropdownRowModelBase, String, js.Any) => js.Any,
    onTotalValueChanged: () => js.Any,
    validateCell: (MatrixDropdownRowModelBase, String, js.Any) => SurveyError,
    value: js.Any
  ): IMatrixDropdownData = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], createQuestion = js.Any.fromFunction2(createQuestion), getLocale = js.Any.fromFunction0(getLocale), getMarkdownHtml = js.Any.fromFunction1(getMarkdownHtml), getProcessedText = js.Any.fromFunction1(getProcessedText), getRowIndex = js.Any.fromFunction1(getRowIndex), getSharedQuestionByName = js.Any.fromFunction2(getSharedQuestionByName), getSurvey = js.Any.fromFunction0(getSurvey), onRowChanged = js.Any.fromFunction4(onRowChanged), onRowChanging = js.Any.fromFunction3(onRowChanging), onTotalValueChanged = js.Any.fromFunction0(onTotalValueChanged), validateCell = js.Any.fromFunction3(validateCell), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMatrixDropdownData]
  }
  @scala.inline
  implicit class IMatrixDropdownDataOps[Self <: IMatrixDropdownData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[MatrixDropdownColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateQuestion(value: (MatrixDropdownRowModelBase, MatrixDropdownColumn) => Question): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createQuestion")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetLocale(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLocale")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMarkdownHtml(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMarkdownHtml")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetProcessedText(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProcessedText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetRowIndex(value: MatrixDropdownRowModelBase => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSharedQuestionByName(value: (String, MatrixDropdownRowModelBase) => Question): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSharedQuestionByName")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetSurvey(value: () => ISurvey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSurvey")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnRowChanged(value: (MatrixDropdownRowModelBase, String, js.Any, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowChanged")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withOnRowChanging(value: (MatrixDropdownRowModelBase, String, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowChanging")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOnTotalValueChanged(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTotalValueChanged")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValidateCell(value: (MatrixDropdownRowModelBase, String, js.Any) => SurveyError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateCell")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

