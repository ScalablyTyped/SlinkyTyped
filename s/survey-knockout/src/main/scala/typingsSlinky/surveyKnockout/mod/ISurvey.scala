package typingsSlinky.surveyKnockout.mod

import org.scalajs.dom.raw.File
import typingsSlinky.surveyKnockout.anon.CanAddRow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISurvey
  extends ISurveyErrorOwner
     with ITextProcessor {
  var areInvisibleElementsShowing: Boolean = js.native
  var clearValueOnDisableItems: Boolean = js.native
  var currentPage: IPage = js.native
  var isDesignMode: Boolean = js.native
  var isDisplayMode: Boolean = js.native
  var isLoadingFromJson: Boolean = js.native
  var isUpdateValueTextOnTyping: Boolean = js.native
  var maxOthersLength: Double = js.native
  var maxTextLength: Double = js.native
  var pages: js.Array[IPage] = js.native
  var questionDescriptionLocation: String = js.native
  var questionErrorLocation: String = js.native
  var questionStartIndex: String = js.native
  var questionTitleLocation: String = js.native
  var questionsOrder: String = js.native
  var requiredText: String = js.native
  var storeOthersAsComment: Boolean = js.native
  def afterRenderPage(htmlElement: js.Any): js.Any = js.native
  def afterRenderPanel(panel: IElement, htmlElement: js.Any): js.Any = js.native
  def afterRenderQuestion(question: IQuestion, htmlElement: js.Any): js.Any = js.native
  def afterRenderQuestionInput(question: IQuestion, htmlElement: js.Any): js.Any = js.native
  def beforeSettingQuestionErrors(question: IQuestion, errors: js.Array[SurveyError]): Unit = js.native
  def clearFiles(
    name: String,
    value: js.Any,
    fileName: String,
    clearCallback: js.Function2[/* status */ String, /* data */ js.Any, _]
  ): js.Any = js.native
  def downloadFile(name: String, content: String, callback: js.Function2[/* status */ String, /* data */ js.Any, _]): js.Any = js.native
  def dragAndDropAllow(options: js.Any): Boolean = js.native
  def dynamicPanelAdded(question: IQuestion): js.Any = js.native
  def dynamicPanelItemValueChanged(question: IQuestion, options: js.Any): js.Any = js.native
  def dynamicPanelRemoved(question: IQuestion, panelIndex: Double, panel: IPanel): js.Any = js.native
  def getCss(): js.Any = js.native
  def getQuestionByValueNameFromArray(valueName: String, name: String, index: Double): IQuestion = js.native
  def getQuestionTitleTemplate(): String = js.native
  def getSurveyMarkdownHtml(element: Base, text: String): String = js.native
  def getUpdatedQuestionTitle(question: IQuestion, title: String): String = js.native
  def hasVisibleQuestionByValueName(valueName: String): Boolean = js.native
  def isPageStarted(page: IPage): Boolean = js.native
  def matrixAfterCellRender(question: IQuestion, options: js.Any): js.Any = js.native
  def matrixAllowRemoveRow(question: IQuestion, rowIndex: Double, row: js.Any): Boolean = js.native
  def matrixBeforeRowAdded(options: CanAddRow): js.Any = js.native
  def matrixCellCreated(question: IQuestion, options: js.Any): js.Any = js.native
  def matrixCellValidate(question: IQuestion, options: js.Any): SurveyError = js.native
  def matrixCellValueChanged(question: IQuestion, options: js.Any): js.Any = js.native
  def matrixCellValueChanging(question: IQuestion, options: js.Any): js.Any = js.native
  def matrixRowAdded(question: IQuestion): js.Any = js.native
  def matrixRowRemoved(question: IQuestion, rowIndex: Double, row: js.Any): js.Any = js.native
  def pageVisibilityChanged(page: IPage, newValue: Boolean): js.Any = js.native
  def panelAdded(panel: IElement, index: Double, parentPanel: js.Any, rootPanel: js.Any): js.Any = js.native
  def panelRemoved(panel: IElement): js.Any = js.native
  def panelVisibilityChanged(panel: IPanel, newValue: Boolean): js.Any = js.native
  def processHtml(html: String): String = js.native
  def questionAdded(question: IQuestion, index: Double, parentPanel: js.Any, rootPanel: js.Any): js.Any = js.native
  def questionCountByValueName(valueName: String): Double = js.native
  def questionRemoved(question: IQuestion): js.Any = js.native
  def questionRenamed(question: IQuestion, oldName: String, oldValueName: String): js.Any = js.native
  def questionVisibilityChanged(question: IQuestion, newValue: Boolean): js.Any = js.native
  def updateChoicesFromServer(question: IQuestion, choices: js.Array[_], serverResult: js.Any): js.Array[_] = js.native
  def updatePageCssClasses(panel: IPanel, cssClasses: js.Any): js.Any = js.native
  def updatePanelCssClasses(panel: IPanel, cssClasses: js.Any): js.Any = js.native
  def updateQuestionCssClasses(question: IQuestion, cssClasses: js.Any): js.Any = js.native
  def uploadFiles(
    name: String,
    files: js.Array[File],
    uploadingCallback: js.Function2[/* status */ String, /* data */ js.Any, _]
  ): js.Any = js.native
  def validatePanel(panel: IPanel): SurveyError = js.native
  def validateQuestion(question: IQuestion): SurveyError = js.native
}

object ISurvey {
  @scala.inline
  def apply(
    afterRenderPage: js.Any => js.Any,
    afterRenderPanel: (IElement, js.Any) => js.Any,
    afterRenderQuestion: (IQuestion, js.Any) => js.Any,
    afterRenderQuestionInput: (IQuestion, js.Any) => js.Any,
    areInvisibleElementsShowing: Boolean,
    beforeSettingQuestionErrors: (IQuestion, js.Array[SurveyError]) => Unit,
    clearFiles: (String, js.Any, String, js.Function2[/* status */ String, /* data */ js.Any, _]) => js.Any,
    clearValueOnDisableItems: Boolean,
    currentPage: IPage,
    downloadFile: (String, String, js.Function2[/* status */ String, /* data */ js.Any, _]) => js.Any,
    dragAndDropAllow: js.Any => Boolean,
    dynamicPanelAdded: IQuestion => js.Any,
    dynamicPanelItemValueChanged: (IQuestion, js.Any) => js.Any,
    dynamicPanelRemoved: (IQuestion, Double, IPanel) => js.Any,
    getCss: () => js.Any,
    getErrorCustomText: (String, SurveyError) => String,
    getLocale: () => String,
    getMarkdownHtml: String => String,
    getProcessedText: String => String,
    getQuestionByValueNameFromArray: (String, String, Double) => IQuestion,
    getQuestionTitleTemplate: () => String,
    getSurveyMarkdownHtml: (Base, String) => String,
    getUpdatedQuestionTitle: (IQuestion, String) => String,
    hasVisibleQuestionByValueName: String => Boolean,
    isDesignMode: Boolean,
    isDisplayMode: Boolean,
    isLoadingFromJson: Boolean,
    isPageStarted: IPage => Boolean,
    isUpdateValueTextOnTyping: Boolean,
    matrixAfterCellRender: (IQuestion, js.Any) => js.Any,
    matrixAllowRemoveRow: (IQuestion, Double, js.Any) => Boolean,
    matrixBeforeRowAdded: CanAddRow => js.Any,
    matrixCellCreated: (IQuestion, js.Any) => js.Any,
    matrixCellValidate: (IQuestion, js.Any) => SurveyError,
    matrixCellValueChanged: (IQuestion, js.Any) => js.Any,
    matrixCellValueChanging: (IQuestion, js.Any) => js.Any,
    matrixRowAdded: IQuestion => js.Any,
    matrixRowRemoved: (IQuestion, Double, js.Any) => js.Any,
    maxOthersLength: Double,
    maxTextLength: Double,
    pageVisibilityChanged: (IPage, Boolean) => js.Any,
    pages: js.Array[IPage],
    panelAdded: (IElement, Double, js.Any, js.Any) => js.Any,
    panelRemoved: IElement => js.Any,
    panelVisibilityChanged: (IPanel, Boolean) => js.Any,
    processHtml: String => String,
    processText: (String, Boolean) => String,
    processTextEx: (String, Boolean, Boolean) => js.Any,
    questionAdded: (IQuestion, Double, js.Any, js.Any) => js.Any,
    questionCountByValueName: String => Double,
    questionDescriptionLocation: String,
    questionErrorLocation: String,
    questionRemoved: IQuestion => js.Any,
    questionRenamed: (IQuestion, String, String) => js.Any,
    questionStartIndex: String,
    questionTitleLocation: String,
    questionVisibilityChanged: (IQuestion, Boolean) => js.Any,
    questionsOrder: String,
    requiredText: String,
    storeOthersAsComment: Boolean,
    updateChoicesFromServer: (IQuestion, js.Array[_], js.Any) => js.Array[_],
    updatePageCssClasses: (IPanel, js.Any) => js.Any,
    updatePanelCssClasses: (IPanel, js.Any) => js.Any,
    updateQuestionCssClasses: (IQuestion, js.Any) => js.Any,
    uploadFiles: (String, js.Array[File], js.Function2[/* status */ String, /* data */ js.Any, _]) => js.Any,
    validatePanel: IPanel => SurveyError,
    validateQuestion: IQuestion => SurveyError
  ): ISurvey = {
    val __obj = js.Dynamic.literal(afterRenderPage = js.Any.fromFunction1(afterRenderPage), afterRenderPanel = js.Any.fromFunction2(afterRenderPanel), afterRenderQuestion = js.Any.fromFunction2(afterRenderQuestion), afterRenderQuestionInput = js.Any.fromFunction2(afterRenderQuestionInput), areInvisibleElementsShowing = areInvisibleElementsShowing.asInstanceOf[js.Any], beforeSettingQuestionErrors = js.Any.fromFunction2(beforeSettingQuestionErrors), clearFiles = js.Any.fromFunction4(clearFiles), clearValueOnDisableItems = clearValueOnDisableItems.asInstanceOf[js.Any], currentPage = currentPage.asInstanceOf[js.Any], downloadFile = js.Any.fromFunction3(downloadFile), dragAndDropAllow = js.Any.fromFunction1(dragAndDropAllow), dynamicPanelAdded = js.Any.fromFunction1(dynamicPanelAdded), dynamicPanelItemValueChanged = js.Any.fromFunction2(dynamicPanelItemValueChanged), dynamicPanelRemoved = js.Any.fromFunction3(dynamicPanelRemoved), getCss = js.Any.fromFunction0(getCss), getErrorCustomText = js.Any.fromFunction2(getErrorCustomText), getLocale = js.Any.fromFunction0(getLocale), getMarkdownHtml = js.Any.fromFunction1(getMarkdownHtml), getProcessedText = js.Any.fromFunction1(getProcessedText), getQuestionByValueNameFromArray = js.Any.fromFunction3(getQuestionByValueNameFromArray), getQuestionTitleTemplate = js.Any.fromFunction0(getQuestionTitleTemplate), getSurveyMarkdownHtml = js.Any.fromFunction2(getSurveyMarkdownHtml), getUpdatedQuestionTitle = js.Any.fromFunction2(getUpdatedQuestionTitle), hasVisibleQuestionByValueName = js.Any.fromFunction1(hasVisibleQuestionByValueName), isDesignMode = isDesignMode.asInstanceOf[js.Any], isDisplayMode = isDisplayMode.asInstanceOf[js.Any], isLoadingFromJson = isLoadingFromJson.asInstanceOf[js.Any], isPageStarted = js.Any.fromFunction1(isPageStarted), isUpdateValueTextOnTyping = isUpdateValueTextOnTyping.asInstanceOf[js.Any], matrixAfterCellRender = js.Any.fromFunction2(matrixAfterCellRender), matrixAllowRemoveRow = js.Any.fromFunction3(matrixAllowRemoveRow), matrixBeforeRowAdded = js.Any.fromFunction1(matrixBeforeRowAdded), matrixCellCreated = js.Any.fromFunction2(matrixCellCreated), matrixCellValidate = js.Any.fromFunction2(matrixCellValidate), matrixCellValueChanged = js.Any.fromFunction2(matrixCellValueChanged), matrixCellValueChanging = js.Any.fromFunction2(matrixCellValueChanging), matrixRowAdded = js.Any.fromFunction1(matrixRowAdded), matrixRowRemoved = js.Any.fromFunction3(matrixRowRemoved), maxOthersLength = maxOthersLength.asInstanceOf[js.Any], maxTextLength = maxTextLength.asInstanceOf[js.Any], pageVisibilityChanged = js.Any.fromFunction2(pageVisibilityChanged), pages = pages.asInstanceOf[js.Any], panelAdded = js.Any.fromFunction4(panelAdded), panelRemoved = js.Any.fromFunction1(panelRemoved), panelVisibilityChanged = js.Any.fromFunction2(panelVisibilityChanged), processHtml = js.Any.fromFunction1(processHtml), processText = js.Any.fromFunction2(processText), processTextEx = js.Any.fromFunction3(processTextEx), questionAdded = js.Any.fromFunction4(questionAdded), questionCountByValueName = js.Any.fromFunction1(questionCountByValueName), questionDescriptionLocation = questionDescriptionLocation.asInstanceOf[js.Any], questionErrorLocation = questionErrorLocation.asInstanceOf[js.Any], questionRemoved = js.Any.fromFunction1(questionRemoved), questionRenamed = js.Any.fromFunction3(questionRenamed), questionStartIndex = questionStartIndex.asInstanceOf[js.Any], questionTitleLocation = questionTitleLocation.asInstanceOf[js.Any], questionVisibilityChanged = js.Any.fromFunction2(questionVisibilityChanged), questionsOrder = questionsOrder.asInstanceOf[js.Any], requiredText = requiredText.asInstanceOf[js.Any], storeOthersAsComment = storeOthersAsComment.asInstanceOf[js.Any], updateChoicesFromServer = js.Any.fromFunction3(updateChoicesFromServer), updatePageCssClasses = js.Any.fromFunction2(updatePageCssClasses), updatePanelCssClasses = js.Any.fromFunction2(updatePanelCssClasses), updateQuestionCssClasses = js.Any.fromFunction2(updateQuestionCssClasses), uploadFiles = js.Any.fromFunction3(uploadFiles), validatePanel = js.Any.fromFunction1(validatePanel), validateQuestion = js.Any.fromFunction1(validateQuestion))
    __obj.asInstanceOf[ISurvey]
  }
  @scala.inline
  implicit class ISurveyOps[Self <: ISurvey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterRenderPage(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRenderPage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAfterRenderPanel(value: (IElement, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRenderPanel")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAfterRenderQuestion(value: (IQuestion, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRenderQuestion")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAfterRenderQuestionInput(value: (IQuestion, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRenderQuestionInput")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAreInvisibleElementsShowing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areInvisibleElementsShowing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeSettingQuestionErrors(value: (IQuestion, js.Array[SurveyError]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSettingQuestionErrors")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClearFiles(value: (String, js.Any, String, js.Function2[/* status */ String, /* data */ js.Any, _]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearFiles")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withClearValueOnDisableItems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearValueOnDisableItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentPage(value: IPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownloadFile(value: (String, String, js.Function2[/* status */ String, /* data */ js.Any, _]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadFile")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDragAndDropAllow(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragAndDropAllow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDynamicPanelAdded(value: IQuestion => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicPanelAdded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDynamicPanelItemValueChanged(value: (IQuestion, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicPanelItemValueChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDynamicPanelRemoved(value: (IQuestion, Double, IPanel) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicPanelRemoved")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetCss(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCss")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetQuestionByValueNameFromArray(value: (String, String, Double) => IQuestion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getQuestionByValueNameFromArray")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetQuestionTitleTemplate(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getQuestionTitleTemplate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSurveyMarkdownHtml(value: (Base, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSurveyMarkdownHtml")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetUpdatedQuestionTitle(value: (IQuestion, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUpdatedQuestionTitle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHasVisibleQuestionByValueName(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasVisibleQuestionByValueName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsDesignMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDesignMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDisplayMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisplayMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLoadingFromJson(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoadingFromJson")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPageStarted(value: IPage => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPageStarted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsUpdateValueTextOnTyping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUpdateValueTextOnTyping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatrixAfterCellRender(value: (IQuestion, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrixAfterCellRender")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMatrixAllowRemoveRow(value: (IQuestion, Double, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrixAllowRemoveRow")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMatrixBeforeRowAdded(value: CanAddRow => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrixBeforeRowAdded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMatrixCellCreated(value: (IQuestion, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrixCellCreated")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMatrixCellValidate(value: (IQuestion, js.Any) => SurveyError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrixCellValidate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMatrixCellValueChanged(value: (IQuestion, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrixCellValueChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMatrixCellValueChanging(value: (IQuestion, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrixCellValueChanging")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMatrixRowAdded(value: IQuestion => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrixRowAdded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMatrixRowRemoved(value: (IQuestion, Double, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrixRowRemoved")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMaxOthersLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxOthersLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxTextLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTextLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageVisibilityChanged(value: (IPage, Boolean) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageVisibilityChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPages(value: js.Array[IPage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPanelAdded(value: (IElement, Double, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelAdded")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withPanelRemoved(value: IElement => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelRemoved")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPanelVisibilityChanged(value: (IPanel, Boolean) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelVisibilityChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withProcessHtml(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processHtml")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQuestionAdded(value: (IQuestion, Double, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("questionAdded")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withQuestionCountByValueName(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("questionCountByValueName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQuestionDescriptionLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("questionDescriptionLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuestionErrorLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("questionErrorLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuestionRemoved(value: IQuestion => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("questionRemoved")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQuestionRenamed(value: (IQuestion, String, String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("questionRenamed")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withQuestionStartIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("questionStartIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuestionTitleLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("questionTitleLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuestionVisibilityChanged(value: (IQuestion, Boolean) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("questionVisibilityChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withQuestionsOrder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("questionsOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequiredText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoreOthersAsComment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeOthersAsComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateChoicesFromServer(value: (IQuestion, js.Array[_], js.Any) => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateChoicesFromServer")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withUpdatePageCssClasses(value: (IPanel, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatePageCssClasses")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUpdatePanelCssClasses(value: (IPanel, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatePanelCssClasses")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUpdateQuestionCssClasses(value: (IQuestion, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateQuestionCssClasses")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUploadFiles(value: (String, js.Array[File], js.Function2[/* status */ String, /* data */ js.Any, _]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadFiles")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withValidatePanel(value: IPanel => SurveyError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validatePanel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValidateQuestion(value: IQuestion => SurveyError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateQuestion")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

