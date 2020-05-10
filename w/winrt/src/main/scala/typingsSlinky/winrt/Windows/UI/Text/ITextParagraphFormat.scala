package typingsSlinky.winrt.Windows.UI.Text

import typingsSlinky.winrt.AnonAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextParagraphFormat extends js.Object {
  var alignment: ParagraphAlignment = js.native
  var firstLineIndent: Double = js.native
  var keepTogether: FormatEffect = js.native
  var keepWithNext: FormatEffect = js.native
  var leftIndent: Double = js.native
  var lineSpacing: Double = js.native
  var lineSpacingRule: LineSpacingRule = js.native
  var listAlignment: MarkerAlignment = js.native
  var listLevelIndex: Double = js.native
  var listStart: Double = js.native
  var listStyle: MarkerStyle = js.native
  var listTab: Double = js.native
  var listType: MarkerType = js.native
  var noLineNumber: FormatEffect = js.native
  var pageBreakBefore: FormatEffect = js.native
  var rightIndent: Double = js.native
  var rightToLeft: FormatEffect = js.native
  var spaceAfter: Double = js.native
  var spaceBefore: Double = js.native
  var style: ParagraphStyle = js.native
  var tabCount: Double = js.native
  var widowControl: FormatEffect = js.native
  def addTab(position: Double, align: TabAlignment, leader: TabLeader): Unit = js.native
  def clearAllTabs(): Unit = js.native
  def deleteTab(position: Double): Unit = js.native
  def getClone(): ITextParagraphFormat = js.native
  def getTab(index: Double): AnonAlign = js.native
  def isEqual(format: ITextParagraphFormat): Boolean = js.native
  def setClone(format: ITextParagraphFormat): Unit = js.native
  def setIndents(start: Double, left: Double, right: Double): Unit = js.native
  def setLineSpacing(rule: LineSpacingRule, spacing: Double): Unit = js.native
}

object ITextParagraphFormat {
  @scala.inline
  def apply(
    addTab: (Double, TabAlignment, TabLeader) => Unit,
    alignment: ParagraphAlignment,
    clearAllTabs: () => Unit,
    deleteTab: Double => Unit,
    firstLineIndent: Double,
    getClone: () => ITextParagraphFormat,
    getTab: Double => AnonAlign,
    isEqual: ITextParagraphFormat => Boolean,
    keepTogether: FormatEffect,
    keepWithNext: FormatEffect,
    leftIndent: Double,
    lineSpacing: Double,
    lineSpacingRule: LineSpacingRule,
    listAlignment: MarkerAlignment,
    listLevelIndex: Double,
    listStart: Double,
    listStyle: MarkerStyle,
    listTab: Double,
    listType: MarkerType,
    noLineNumber: FormatEffect,
    pageBreakBefore: FormatEffect,
    rightIndent: Double,
    rightToLeft: FormatEffect,
    setClone: ITextParagraphFormat => Unit,
    setIndents: (Double, Double, Double) => Unit,
    setLineSpacing: (LineSpacingRule, Double) => Unit,
    spaceAfter: Double,
    spaceBefore: Double,
    style: ParagraphStyle,
    tabCount: Double,
    widowControl: FormatEffect
  ): ITextParagraphFormat = {
    val __obj = js.Dynamic.literal(addTab = js.Any.fromFunction3(addTab), alignment = alignment.asInstanceOf[js.Any], clearAllTabs = js.Any.fromFunction0(clearAllTabs), deleteTab = js.Any.fromFunction1(deleteTab), firstLineIndent = firstLineIndent.asInstanceOf[js.Any], getClone = js.Any.fromFunction0(getClone), getTab = js.Any.fromFunction1(getTab), isEqual = js.Any.fromFunction1(isEqual), keepTogether = keepTogether.asInstanceOf[js.Any], keepWithNext = keepWithNext.asInstanceOf[js.Any], leftIndent = leftIndent.asInstanceOf[js.Any], lineSpacing = lineSpacing.asInstanceOf[js.Any], lineSpacingRule = lineSpacingRule.asInstanceOf[js.Any], listAlignment = listAlignment.asInstanceOf[js.Any], listLevelIndex = listLevelIndex.asInstanceOf[js.Any], listStart = listStart.asInstanceOf[js.Any], listStyle = listStyle.asInstanceOf[js.Any], listTab = listTab.asInstanceOf[js.Any], listType = listType.asInstanceOf[js.Any], noLineNumber = noLineNumber.asInstanceOf[js.Any], pageBreakBefore = pageBreakBefore.asInstanceOf[js.Any], rightIndent = rightIndent.asInstanceOf[js.Any], rightToLeft = rightToLeft.asInstanceOf[js.Any], setClone = js.Any.fromFunction1(setClone), setIndents = js.Any.fromFunction3(setIndents), setLineSpacing = js.Any.fromFunction2(setLineSpacing), spaceAfter = spaceAfter.asInstanceOf[js.Any], spaceBefore = spaceBefore.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tabCount = tabCount.asInstanceOf[js.Any], widowControl = widowControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextParagraphFormat]
  }
  @scala.inline
  implicit class ITextParagraphFormatOps[Self <: ITextParagraphFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddTab(value: (Double, TabAlignment, TabLeader) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTab")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAlignment(value: ParagraphAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearAllTabs(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearAllTabs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeleteTab(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteTab")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFirstLineIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstLineIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetClone(value: () => ITextParagraphFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTab(value: Double => AnonAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTab")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsEqual(value: ITextParagraphFormat => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEqual")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKeepTogether(value: FormatEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepTogether")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepWithNext(value: FormatEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepWithNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineSpacingRule(value: LineSpacingRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineSpacingRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListAlignment(value: MarkerAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListLevelIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listLevelIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListStyle(value: MarkerStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListTab(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListType(value: MarkerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoLineNumber(value: FormatEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noLineNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageBreakBefore(value: FormatEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageBreakBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightToLeft(value: FormatEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightToLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetClone(value: ITextParagraphFormat => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setClone")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIndents(value: (Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIndents")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetLineSpacing(value: (LineSpacingRule, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLineSpacing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSpaceAfter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceBefore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: ParagraphStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidowControl(value: FormatEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widowControl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

