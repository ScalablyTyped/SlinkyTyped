package typingsSlinky.winrt.Windows.UI.Text

import typingsSlinky.winrt.Windows.Foundation.Point
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStream
import typingsSlinky.winrt.anon.Hit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextSelection extends ITextRange {
  var options: SelectionOptions = js.native
  var `type`: SelectionType = js.native
  def endKey(unit: TextRangeUnit, extend: Boolean): Double = js.native
  def homeKey(unit: TextRangeUnit, extend: Boolean): Double = js.native
  def moveDown(unit: TextRangeUnit, count: Double, extend: Boolean): Double = js.native
  def moveLeft(unit: TextRangeUnit, count: Double, extend: Boolean): Double = js.native
  def moveRight(unit: TextRangeUnit, count: Double, extend: Boolean): Double = js.native
  def moveUp(unit: TextRangeUnit, count: Double, extend: Boolean): Double = js.native
  def typeText(value: String): Unit = js.native
}

object ITextSelection {
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
    endKey: (TextRangeUnit, Boolean) => Double,
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
    homeKey: (TextRangeUnit, Boolean) => Double,
    inRange: ITextRange => Boolean,
    inStory: ITextRange => Boolean,
    insertImage: (Double, Double, Double, VerticalCharacterAlignment, String, IRandomAccessStream) => Unit,
    isEqual: ITextRange => Boolean,
    length: Double,
    link: String,
    matchSelection: () => Unit,
    move: (TextRangeUnit, Double) => Double,
    moveDown: (TextRangeUnit, Double, Boolean) => Double,
    moveEnd: (TextRangeUnit, Double) => Double,
    moveLeft: (TextRangeUnit, Double, Boolean) => Double,
    moveRight: (TextRangeUnit, Double, Boolean) => Double,
    moveStart: (TextRangeUnit, Double) => Double,
    moveUp: (TextRangeUnit, Double, Boolean) => Double,
    options: SelectionOptions,
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
    text: String,
    `type`: SelectionType,
    typeText: String => Unit
  ): ITextSelection = {
    val __obj = js.Dynamic.literal(canPaste = js.Any.fromFunction1(canPaste), changeCase = js.Any.fromFunction1(changeCase), character = character.asInstanceOf[js.Any], characterFormat = characterFormat.asInstanceOf[js.Any], collapse = js.Any.fromFunction1(collapse), copy = js.Any.fromFunction0(copy), cut = js.Any.fromFunction0(cut), delete_ = js.Any.fromFunction2(delete_), endKey = js.Any.fromFunction2(endKey), endOf = js.Any.fromFunction2(endOf), endPosition = endPosition.asInstanceOf[js.Any], expand = js.Any.fromFunction1(expand), findText = js.Any.fromFunction3(findText), formattedText = formattedText.asInstanceOf[js.Any], getCharacterUtf32 = js.Any.fromFunction1(getCharacterUtf32), getClone = js.Any.fromFunction0(getClone), getIndex = js.Any.fromFunction1(getIndex), getPoint = js.Any.fromFunction3(getPoint), getRect = js.Any.fromFunction1(getRect), getText = js.Any.fromFunction1(getText), getTextViaStream = js.Any.fromFunction2(getTextViaStream), gravity = gravity.asInstanceOf[js.Any], homeKey = js.Any.fromFunction2(homeKey), inRange = js.Any.fromFunction1(inRange), inStory = js.Any.fromFunction1(inStory), insertImage = js.Any.fromFunction6(insertImage), isEqual = js.Any.fromFunction1(isEqual), length = length.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], matchSelection = js.Any.fromFunction0(matchSelection), move = js.Any.fromFunction2(move), moveDown = js.Any.fromFunction3(moveDown), moveEnd = js.Any.fromFunction2(moveEnd), moveLeft = js.Any.fromFunction3(moveLeft), moveRight = js.Any.fromFunction3(moveRight), moveStart = js.Any.fromFunction2(moveStart), moveUp = js.Any.fromFunction3(moveUp), options = options.asInstanceOf[js.Any], paragraphFormat = paragraphFormat.asInstanceOf[js.Any], paste = js.Any.fromFunction1(paste), scrollIntoView = js.Any.fromFunction1(scrollIntoView), setIndex = js.Any.fromFunction3(setIndex), setPoint = js.Any.fromFunction3(setPoint), setRange = js.Any.fromFunction2(setRange), setText = js.Any.fromFunction2(setText), setTextViaStream = js.Any.fromFunction2(setTextViaStream), startOf = js.Any.fromFunction2(startOf), startPosition = startPosition.asInstanceOf[js.Any], storyLength = storyLength.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], typeText = js.Any.fromFunction1(typeText))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextSelection]
  }
  @scala.inline
  implicit class ITextSelectionOps[Self <: ITextSelection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndKey(value: (TextRangeUnit, Boolean) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endKey")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHomeKey(value: (TextRangeUnit, Boolean) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeKey")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMoveDown(value: (TextRangeUnit, Double, Boolean) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveDown")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMoveLeft(value: (TextRangeUnit, Double, Boolean) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveLeft")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMoveRight(value: (TextRangeUnit, Double, Boolean) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveRight")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMoveUp(value: (TextRangeUnit, Double, Boolean) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveUp")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOptions(value: SelectionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: SelectionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeText(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeText")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

