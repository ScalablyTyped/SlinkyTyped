package typingsSlinky.winrt.Windows.UI.Text

import typingsSlinky.winrt.Windows.Foundation.Point
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextDocument extends js.Object {
  var caretType: CaretType = js.native
  var defaultTabStop: Double = js.native
  var selection: ITextSelection = js.native
  var undoLimit: Double = js.native
  def applyDisplayUpdates(): Double = js.native
  def batchDisplayUpdates(): Double = js.native
  def beginUndoGroup(): Unit = js.native
  def canCopy(): Boolean = js.native
  def canPaste(): Boolean = js.native
  def canRedo(): Boolean = js.native
  def canUndo(): Boolean = js.native
  def endUndoGroup(): Unit = js.native
  def getDefaultCharacterFormat(): ITextCharacterFormat = js.native
  def getDefaultParagraphFormat(): ITextParagraphFormat = js.native
  def getRange(startPosition: Double, endPosition: Double): ITextRange = js.native
  def getRangeFromPoint(point: Point, options: PointOptions): ITextRange = js.native
  def getText(options: TextGetOptions): String = js.native
  def loadFromStream(options: TextSetOptions, value: IRandomAccessStream): Unit = js.native
  def redo(): Unit = js.native
  def saveToStream(options: TextGetOptions, value: IRandomAccessStream): Unit = js.native
  def setDefaultCharacterFormat(value: ITextCharacterFormat): Unit = js.native
  def setDefaultParagraphFormat(value: ITextParagraphFormat): Unit = js.native
  def setText(options: TextSetOptions, value: String): Unit = js.native
  def undo(): Unit = js.native
}

object ITextDocument {
  @scala.inline
  def apply(
    applyDisplayUpdates: () => Double,
    batchDisplayUpdates: () => Double,
    beginUndoGroup: () => Unit,
    canCopy: () => Boolean,
    canPaste: () => Boolean,
    canRedo: () => Boolean,
    canUndo: () => Boolean,
    caretType: CaretType,
    defaultTabStop: Double,
    endUndoGroup: () => Unit,
    getDefaultCharacterFormat: () => ITextCharacterFormat,
    getDefaultParagraphFormat: () => ITextParagraphFormat,
    getRange: (Double, Double) => ITextRange,
    getRangeFromPoint: (Point, PointOptions) => ITextRange,
    getText: TextGetOptions => String,
    loadFromStream: (TextSetOptions, IRandomAccessStream) => Unit,
    redo: () => Unit,
    saveToStream: (TextGetOptions, IRandomAccessStream) => Unit,
    selection: ITextSelection,
    setDefaultCharacterFormat: ITextCharacterFormat => Unit,
    setDefaultParagraphFormat: ITextParagraphFormat => Unit,
    setText: (TextSetOptions, String) => Unit,
    undo: () => Unit,
    undoLimit: Double
  ): ITextDocument = {
    val __obj = js.Dynamic.literal(applyDisplayUpdates = js.Any.fromFunction0(applyDisplayUpdates), batchDisplayUpdates = js.Any.fromFunction0(batchDisplayUpdates), beginUndoGroup = js.Any.fromFunction0(beginUndoGroup), canCopy = js.Any.fromFunction0(canCopy), canPaste = js.Any.fromFunction0(canPaste), canRedo = js.Any.fromFunction0(canRedo), canUndo = js.Any.fromFunction0(canUndo), caretType = caretType.asInstanceOf[js.Any], defaultTabStop = defaultTabStop.asInstanceOf[js.Any], endUndoGroup = js.Any.fromFunction0(endUndoGroup), getDefaultCharacterFormat = js.Any.fromFunction0(getDefaultCharacterFormat), getDefaultParagraphFormat = js.Any.fromFunction0(getDefaultParagraphFormat), getRange = js.Any.fromFunction2(getRange), getRangeFromPoint = js.Any.fromFunction2(getRangeFromPoint), getText = js.Any.fromFunction1(getText), loadFromStream = js.Any.fromFunction2(loadFromStream), redo = js.Any.fromFunction0(redo), saveToStream = js.Any.fromFunction2(saveToStream), selection = selection.asInstanceOf[js.Any], setDefaultCharacterFormat = js.Any.fromFunction1(setDefaultCharacterFormat), setDefaultParagraphFormat = js.Any.fromFunction1(setDefaultParagraphFormat), setText = js.Any.fromFunction2(setText), undo = js.Any.fromFunction0(undo), undoLimit = undoLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextDocument]
  }
  @scala.inline
  implicit class ITextDocumentOps[Self <: ITextDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyDisplayUpdates(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyDisplayUpdates")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBatchDisplayUpdates(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchDisplayUpdates")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBeginUndoGroup(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginUndoGroup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCanCopy(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canCopy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCanPaste(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canPaste")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCanRedo(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canRedo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCanUndo(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canUndo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCaretType(value: CaretType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caretType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultTabStop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTabStop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndUndoGroup(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endUndoGroup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDefaultCharacterFormat(value: () => ITextCharacterFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultCharacterFormat")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDefaultParagraphFormat(value: () => ITextParagraphFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultParagraphFormat")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRange(value: (Double, Double) => ITextRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetRangeFromPoint(value: (Point, PointOptions) => ITextRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRangeFromPoint")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetText(value: TextGetOptions => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoadFromStream(value: (TextSetOptions, IRandomAccessStream) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadFromStream")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRedo(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSaveToStream(value: (TextGetOptions, IRandomAccessStream) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveToStream")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSelection(value: ITextSelection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetDefaultCharacterFormat(value: ITextCharacterFormat => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultCharacterFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDefaultParagraphFormat(value: ITextParagraphFormat => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultParagraphFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetText(value: (TextSetOptions, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setText")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUndo(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUndoLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undoLimit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

