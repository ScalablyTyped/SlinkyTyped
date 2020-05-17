package typingsSlinky.winrt.Windows.UI.Text

import typingsSlinky.winrt.Windows.Foundation.Point
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStream
import typingsSlinky.winrt.anon.Hit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextRange extends js.Object {
  var character: String = js.native
  var characterFormat: ITextCharacterFormat = js.native
  var endPosition: Double = js.native
  var formattedText: ITextRange = js.native
  var gravity: RangeGravity = js.native
  var length: Double = js.native
  var link: String = js.native
  var paragraphFormat: ITextParagraphFormat = js.native
  var startPosition: Double = js.native
  var storyLength: Double = js.native
  var text: String = js.native
  def canPaste(format: Double): Boolean = js.native
  def changeCase(value: LetterCase): Unit = js.native
  def collapse(value: Boolean): Unit = js.native
  def copy(): Unit = js.native
  def cut(): Unit = js.native
  def delete_(unit: TextRangeUnit, count: Double): Double = js.native
  def endOf(unit: TextRangeUnit, extend: Boolean): Double = js.native
  def expand(unit: TextRangeUnit): Double = js.native
  def findText(value: String, scanLength: Double, options: FindOptions): Double = js.native
  def getCharacterUtf32(offset: Double): Double = js.native
  def getClone(): ITextRange = js.native
  def getIndex(unit: TextRangeUnit): Double = js.native
  def getPoint(
    horizontalAlign: HorizontalCharacterAlignment,
    verticalAlign: VerticalCharacterAlignment,
    options: PointOptions
  ): Point = js.native
  def getRect(options: PointOptions): Hit = js.native
  def getText(options: TextGetOptions): String = js.native
  def getTextViaStream(options: TextGetOptions, value: IRandomAccessStream): Unit = js.native
  def inRange(range: ITextRange): Boolean = js.native
  def inStory(range: ITextRange): Boolean = js.native
  def insertImage(
    width: Double,
    height: Double,
    ascent: Double,
    verticalAlign: VerticalCharacterAlignment,
    alternateText: String,
    value: IRandomAccessStream
  ): Unit = js.native
  def isEqual(range: ITextRange): Boolean = js.native
  def matchSelection(): Unit = js.native
  def move(unit: TextRangeUnit, count: Double): Double = js.native
  def moveEnd(unit: TextRangeUnit, count: Double): Double = js.native
  def moveStart(unit: TextRangeUnit, count: Double): Double = js.native
  def paste(format: Double): Unit = js.native
  def scrollIntoView(value: PointOptions): Unit = js.native
  def setIndex(unit: TextRangeUnit, index: Double, extend: Boolean): Unit = js.native
  def setPoint(point: Point, options: PointOptions, extend: Boolean): Unit = js.native
  def setRange(startPosition: Double, endPosition: Double): Unit = js.native
  def setText(options: TextSetOptions, value: String): Unit = js.native
  def setTextViaStream(options: TextSetOptions, value: IRandomAccessStream): Unit = js.native
  def startOf(unit: TextRangeUnit, extend: Boolean): Double = js.native
}

object ITextRange {
  @scala.inline
  def apply(
    canPaste: Double => Boolean,
    changeCase: LetterCase => Unit,
    character: String,
    characterFormat: ITextCharacterFormat,
    collapse: Boolean => Unit,
    copy: () => Unit,
    cut: () => Unit,
    delete_ : (TextRangeUnit, Double) => Double,
    endOf: (TextRangeUnit, Boolean) => Double,
    endPosition: Double,
    expand: TextRangeUnit => Double,
    findText: (String, Double, FindOptions) => Double,
    formattedText: ITextRange,
    getCharacterUtf32: Double => Double,
    getClone: () => ITextRange,
    getIndex: TextRangeUnit => Double,
    getPoint: (HorizontalCharacterAlignment, VerticalCharacterAlignment, PointOptions) => Point,
    getRect: PointOptions => Hit,
    getText: TextGetOptions => String,
    getTextViaStream: (TextGetOptions, IRandomAccessStream) => Unit,
    gravity: RangeGravity,
    inRange: ITextRange => Boolean,
    inStory: ITextRange => Boolean,
    insertImage: (Double, Double, Double, VerticalCharacterAlignment, String, IRandomAccessStream) => Unit,
    isEqual: ITextRange => Boolean,
    length: Double,
    link: String,
    matchSelection: () => Unit,
    move: (TextRangeUnit, Double) => Double,
    moveEnd: (TextRangeUnit, Double) => Double,
    moveStart: (TextRangeUnit, Double) => Double,
    paragraphFormat: ITextParagraphFormat,
    paste: Double => Unit,
    scrollIntoView: PointOptions => Unit,
    setIndex: (TextRangeUnit, Double, Boolean) => Unit,
    setPoint: (Point, PointOptions, Boolean) => Unit,
    setRange: (Double, Double) => Unit,
    setText: (TextSetOptions, String) => Unit,
    setTextViaStream: (TextSetOptions, IRandomAccessStream) => Unit,
    startOf: (TextRangeUnit, Boolean) => Double,
    startPosition: Double,
    storyLength: Double,
    text: String
  ): ITextRange = {
    val __obj = js.Dynamic.literal(canPaste = js.Any.fromFunction1(canPaste), changeCase = js.Any.fromFunction1(changeCase), character = character.asInstanceOf[js.Any], characterFormat = characterFormat.asInstanceOf[js.Any], collapse = js.Any.fromFunction1(collapse), copy = js.Any.fromFunction0(copy), cut = js.Any.fromFunction0(cut), delete_ = js.Any.fromFunction2(delete_), endOf = js.Any.fromFunction2(endOf), endPosition = endPosition.asInstanceOf[js.Any], expand = js.Any.fromFunction1(expand), findText = js.Any.fromFunction3(findText), formattedText = formattedText.asInstanceOf[js.Any], getCharacterUtf32 = js.Any.fromFunction1(getCharacterUtf32), getClone = js.Any.fromFunction0(getClone), getIndex = js.Any.fromFunction1(getIndex), getPoint = js.Any.fromFunction3(getPoint), getRect = js.Any.fromFunction1(getRect), getText = js.Any.fromFunction1(getText), getTextViaStream = js.Any.fromFunction2(getTextViaStream), gravity = gravity.asInstanceOf[js.Any], inRange = js.Any.fromFunction1(inRange), inStory = js.Any.fromFunction1(inStory), insertImage = js.Any.fromFunction6(insertImage), isEqual = js.Any.fromFunction1(isEqual), length = length.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], matchSelection = js.Any.fromFunction0(matchSelection), move = js.Any.fromFunction2(move), moveEnd = js.Any.fromFunction2(moveEnd), moveStart = js.Any.fromFunction2(moveStart), paragraphFormat = paragraphFormat.asInstanceOf[js.Any], paste = js.Any.fromFunction1(paste), scrollIntoView = js.Any.fromFunction1(scrollIntoView), setIndex = js.Any.fromFunction3(setIndex), setPoint = js.Any.fromFunction3(setPoint), setRange = js.Any.fromFunction2(setRange), setText = js.Any.fromFunction2(setText), setTextViaStream = js.Any.fromFunction2(setTextViaStream), startOf = js.Any.fromFunction2(startOf), startPosition = startPosition.asInstanceOf[js.Any], storyLength = storyLength.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextRange]
  }
  @scala.inline
  implicit class ITextRangeOps[Self <: ITextRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanPaste(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canPaste")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChangeCase(value: LetterCase => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeCase")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCharacter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("character")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharacterFormat(value: ITextCharacterFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characterFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollapse(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCopy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCut(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cut")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDelete_(value: (TextRangeUnit, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete_")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEndOf(value: (TextRangeUnit, Boolean) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endOf")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEndPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpand(value: TextRangeUnit => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindText(value: (String, Double, FindOptions) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findText")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withFormattedText(value: ITextRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCharacterUtf32(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCharacterUtf32")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetClone(value: () => ITextRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIndex(value: TextRangeUnit => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPoint(value: (HorizontalCharacterAlignment, VerticalCharacterAlignment, PointOptions) => Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPoint")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetRect(value: PointOptions => Hit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetText(value: TextGetOptions => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTextViaStream(value: (TextGetOptions, IRandomAccessStream) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTextViaStream")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGravity(value: RangeGravity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInRange(value: ITextRange => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inRange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInStory(value: ITextRange => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inStory")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsertImage(value: (Double, Double, Double, VerticalCharacterAlignment, String, IRandomAccessStream) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertImage")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withIsEqual(value: ITextRange => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEqual")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchSelection(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchSelection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMove(value: (TextRangeUnit, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMoveEnd(value: (TextRangeUnit, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveEnd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMoveStart(value: (TextRangeUnit, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withParagraphFormat(value: ITextParagraphFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaste(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paste")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScrollIntoView(value: PointOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollIntoView")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIndex(value: (TextRangeUnit, Double, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIndex")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetPoint(value: (Point, PointOptions, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPoint")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetRange(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetText(value: (TextSetOptions, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setText")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetTextViaStream(value: (TextSetOptions, IRandomAccessStream) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTextViaStream")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStartOf(value: (TextRangeUnit, Boolean) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOf")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStartPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoryLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storyLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

