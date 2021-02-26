package typingsSlinky.textBuffer

import typingsSlinky.textBuffer.mod.global.TextBuffer.Point
import typingsSlinky.textBuffer.mod.global.TextBuffer.PointCompatible
import typingsSlinky.textBuffer.mod.global.TextBuffer.PointLike
import typingsSlinky.textBuffer.mod.global.TextBuffer.RangeCompatible
import typingsSlinky.textBuffer.mod.global.TextBuffer.RangeLike
import typingsSlinky.textBuffer.textBufferStrings.backward
import typingsSlinky.textBuffer.textBufferStrings.closest
import typingsSlinky.textBuffer.textBufferStrings.forward
import typingsSlinky.textBuffer.textBufferStrings.inside
import typingsSlinky.textBuffer.textBufferStrings.never
import typingsSlinky.textBuffer.textBufferStrings.overlap
import typingsSlinky.textBuffer.textBufferStrings.skip
import typingsSlinky.textBuffer.textBufferStrings.surround
import typingsSlinky.textBuffer.textBufferStrings.touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    var clipDirection: backward | forward | closest = js.native
  }
  object `0` {
    
    @scala.inline
    def apply(clipDirection: backward | forward | closest): `0` = {
      val __obj = js.Dynamic.literal(clipDirection = clipDirection.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClipDirection(value: backward | forward | closest): Self = StObject.set(x, "clipDirection", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ClipDirection extends StObject {
    
    var clipDirection: js.UndefOr[backward | forward | closest] = js.native
    
    var reversed: js.UndefOr[Boolean] = js.native
  }
  object ClipDirection {
    
    @scala.inline
    def apply(): ClipDirection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClipDirection]
    }
    
    @scala.inline
    implicit class ClipDirectionMutableBuilder[Self <: ClipDirection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClipDirection(value: backward | forward | closest): Self = StObject.set(x, "clipDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipDirectionUndefined: Self = StObject.set(x, "clipDirection", js.undefined)
      
      @scala.inline
      def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
    }
  }
  
  @js.native
  trait ClipDirectionExclusive extends StObject {
    
    var clipDirection: js.UndefOr[backward | forward | closest] = js.native
    
    var exclusive: js.UndefOr[Boolean] = js.native
    
    var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.native
    
    var reversed: js.UndefOr[Boolean] = js.native
  }
  object ClipDirectionExclusive {
    
    @scala.inline
    def apply(): ClipDirectionExclusive = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClipDirectionExclusive]
    }
    
    @scala.inline
    implicit class ClipDirectionExclusiveMutableBuilder[Self <: ClipDirectionExclusive] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClipDirection(value: backward | forward | closest): Self = StObject.set(x, "clipDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipDirectionUndefined: Self = StObject.set(x, "clipDirection", js.undefined)
      
      @scala.inline
      def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
      
      @scala.inline
      def setInvalidate(value: never | surround | overlap | inside | touch): Self = StObject.set(x, "invalidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidateUndefined: Self = StObject.set(x, "invalidate", js.undefined)
      
      @scala.inline
      def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
    }
  }
  
  @js.native
  trait ClipDirectionExclusiveInvalidate extends StObject {
    
    var clipDirection: js.UndefOr[backward | forward | closest] = js.native
    
    var exclusive: js.UndefOr[Boolean] = js.native
    
    var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.native
  }
  object ClipDirectionExclusiveInvalidate {
    
    @scala.inline
    def apply(): ClipDirectionExclusiveInvalidate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClipDirectionExclusiveInvalidate]
    }
    
    @scala.inline
    implicit class ClipDirectionExclusiveInvalidateMutableBuilder[Self <: ClipDirectionExclusiveInvalidate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClipDirection(value: backward | forward | closest): Self = StObject.set(x, "clipDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipDirectionUndefined: Self = StObject.set(x, "clipDirection", js.undefined)
      
      @scala.inline
      def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
      
      @scala.inline
      def setInvalidate(value: never | surround | overlap | inside | touch): Self = StObject.set(x, "invalidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidateUndefined: Self = StObject.set(x, "invalidate", js.undefined)
    }
  }
  
  @js.native
  trait Exclusive extends StObject {
    
    var exclusive: js.UndefOr[Boolean] = js.native
    
    var reversed: js.UndefOr[Boolean] = js.native
  }
  object Exclusive {
    
    @scala.inline
    def apply(): Exclusive = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Exclusive]
    }
    
    @scala.inline
    implicit class ExclusiveMutableBuilder[Self <: Exclusive] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
      
      @scala.inline
      def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
    }
  }
  
  @js.native
  trait ExclusiveInvalidate extends StObject {
    
    var exclusive: js.UndefOr[Boolean] = js.native
    
    var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.native
  }
  object ExclusiveInvalidate {
    
    @scala.inline
    def apply(): ExclusiveInvalidate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExclusiveInvalidate]
    }
    
    @scala.inline
    implicit class ExclusiveInvalidateMutableBuilder[Self <: ExclusiveInvalidate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
      
      @scala.inline
      def setInvalidate(value: never | surround | overlap | inside | touch): Self = StObject.set(x, "invalidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidateUndefined: Self = StObject.set(x, "invalidate", js.undefined)
    }
  }
  
  @js.native
  trait Invalidate extends StObject {
    
    var exclusive: js.UndefOr[Boolean] = js.native
    
    var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.native
    
    var reversed: js.UndefOr[Boolean] = js.native
  }
  object Invalidate {
    
    @scala.inline
    def apply(): Invalidate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Invalidate]
    }
    
    @scala.inline
    implicit class InvalidateMutableBuilder[Self <: Invalidate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
      
      @scala.inline
      def setInvalidate(value: never | surround | overlap | inside | touch): Self = StObject.set(x, "invalidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidateUndefined: Self = StObject.set(x, "invalidate", js.undefined)
      
      @scala.inline
      def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
    }
  }
  
  @js.native
  trait MaintainHistory extends StObject {
    
    var maintainHistory: js.UndefOr[Boolean] = js.native
    
    var persistent: js.UndefOr[Boolean] = js.native
  }
  object MaintainHistory {
    
    @scala.inline
    def apply(): MaintainHistory = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaintainHistory]
    }
    
    @scala.inline
    implicit class MaintainHistoryMutableBuilder[Self <: MaintainHistory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaintainHistory(value: Boolean): Self = StObject.set(x, "maintainHistory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaintainHistoryUndefined: Self = StObject.set(x, "maintainHistory", js.undefined)
      
      @scala.inline
      def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    }
  }
  
  @js.native
  trait NewExtent extends StObject {
    
    /** A Point representing the replacement extent. */
    var newExtent: Point = js.native
    
    /** A String representing the replacement text. */
    var newText: String = js.native
    
    /** A Point representing the replaced extent. */
    var oldExtent: Point = js.native
    
    /** A Point representing where the change started. */
    var start: Point = js.native
  }
  object NewExtent {
    
    @scala.inline
    def apply(newExtent: Point, newText: String, oldExtent: Point, start: Point): NewExtent = {
      val __obj = js.Dynamic.literal(newExtent = newExtent.asInstanceOf[js.Any], newText = newText.asInstanceOf[js.Any], oldExtent = oldExtent.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewExtent]
    }
    
    @scala.inline
    implicit class NewExtentMutableBuilder[Self <: NewExtent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNewExtent(value: Point): Self = StObject.set(x, "newExtent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewText(value: String): Self = StObject.set(x, "newText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldExtent(value: Point): Self = StObject.set(x, "oldExtent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NormalizeLineEndings extends StObject {
    
    var normalizeLineEndings: js.UndefOr[Boolean] = js.native
    
    var undo: js.UndefOr[skip] = js.native
  }
  object NormalizeLineEndings {
    
    @scala.inline
    def apply(): NormalizeLineEndings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NormalizeLineEndings]
    }
    
    @scala.inline
    implicit class NormalizeLineEndingsMutableBuilder[Self <: NormalizeLineEndings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNormalizeLineEndings(value: Boolean): Self = StObject.set(x, "normalizeLineEndings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeLineEndingsUndefined: Self = StObject.set(x, "normalizeLineEndings", js.undefined)
      
      @scala.inline
      def setUndo(value: skip): Self = StObject.set(x, "undo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUndoUndefined: Self = StObject.set(x, "undo", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<text-buffer.text-buffer.<global>.TextBuffer.Point> */
  @js.native
  trait ReadonlyPoint extends StObject {
    
    val column: Double = js.native
    
    def compare(other: PointCompatible): Double = js.native
    
    def copy(): this.type = js.native
    
    def freeze(): this.type = js.native
    
    def isEqual(other: PointCompatible): Boolean = js.native
    
    def isGreaterThan(other: PointCompatible): Boolean = js.native
    
    def isGreaterThanOrEqual(other: PointCompatible): Boolean = js.native
    
    def isLessThan(other: PointCompatible): Boolean = js.native
    
    def isLessThanOrEqual(other: PointCompatible): Boolean = js.native
    
    def negate(): this.type = js.native
    
    val row: Double = js.native
    
    def serialize(): js.Tuple2[Double, Double] = js.native
    
    def toArray(): js.Tuple2[Double, Double] = js.native
    
    def translate(other: PointCompatible): this.type = js.native
    
    def traverse(other: PointCompatible): this.type = js.native
  }
  object ReadonlyPoint {
    
    @scala.inline
    def apply(
      column: Double,
      compare: PointCompatible => Double,
      copy: () => ReadonlyPoint,
      freeze: () => ReadonlyPoint,
      isEqual: PointCompatible => Boolean,
      isGreaterThan: PointCompatible => Boolean,
      isGreaterThanOrEqual: PointCompatible => Boolean,
      isLessThan: PointCompatible => Boolean,
      isLessThanOrEqual: PointCompatible => Boolean,
      negate: () => ReadonlyPoint,
      row: Double,
      serialize: () => js.Tuple2[Double, Double],
      toArray: () => js.Tuple2[Double, Double],
      translate: PointCompatible => ReadonlyPoint,
      traverse: PointCompatible => ReadonlyPoint
    ): ReadonlyPoint = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], compare = js.Any.fromFunction1(compare), copy = js.Any.fromFunction0(copy), freeze = js.Any.fromFunction0(freeze), isEqual = js.Any.fromFunction1(isEqual), isGreaterThan = js.Any.fromFunction1(isGreaterThan), isGreaterThanOrEqual = js.Any.fromFunction1(isGreaterThanOrEqual), isLessThan = js.Any.fromFunction1(isLessThan), isLessThanOrEqual = js.Any.fromFunction1(isLessThanOrEqual), negate = js.Any.fromFunction0(negate), row = row.asInstanceOf[js.Any], serialize = js.Any.fromFunction0(serialize), toArray = js.Any.fromFunction0(toArray), translate = js.Any.fromFunction1(translate), traverse = js.Any.fromFunction1(traverse))
      __obj.asInstanceOf[ReadonlyPoint]
    }
    
    @scala.inline
    implicit class ReadonlyPointMutableBuilder[Self <: ReadonlyPoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompare(value: PointCompatible => Double): Self = StObject.set(x, "compare", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCopy(value: () => ReadonlyPoint): Self = StObject.set(x, "copy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFreeze(value: () => ReadonlyPoint): Self = StObject.set(x, "freeze", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsEqual(value: PointCompatible => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsGreaterThan(value: PointCompatible => Boolean): Self = StObject.set(x, "isGreaterThan", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsGreaterThanOrEqual(value: PointCompatible => Boolean): Self = StObject.set(x, "isGreaterThanOrEqual", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsLessThan(value: PointCompatible => Boolean): Self = StObject.set(x, "isLessThan", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsLessThanOrEqual(value: PointCompatible => Boolean): Self = StObject.set(x, "isLessThanOrEqual", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNegate(value: () => ReadonlyPoint): Self = StObject.set(x, "negate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerialize(value: () => js.Tuple2[Double, Double]): Self = StObject.set(x, "serialize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToArray(value: () => js.Tuple2[Double, Double]): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTranslate(value: PointCompatible => ReadonlyPoint): Self = StObject.set(x, "translate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTraverse(value: PointCompatible => ReadonlyPoint): Self = StObject.set(x, "traverse", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Readonly<text-buffer.text-buffer.<global>.TextBuffer.Range> */
  @js.native
  trait ReadonlyRange extends StObject {
    
    def compare(otherRange: RangeCompatible): Double = js.native
    
    def containsPoint(point: PointCompatible): Boolean = js.native
    def containsPoint(point: PointCompatible, exclusive: Boolean): Boolean = js.native
    
    def containsRange(otherRange: RangeCompatible): Boolean = js.native
    def containsRange(otherRange: RangeCompatible, exclusive: Boolean): Boolean = js.native
    
    def copy(): this.type = js.native
    
    def coversSameRows(otherRange: RangeLike): Boolean = js.native
    
    val end: PointLike = js.native
    
    def freeze(): this.type = js.native
    
    def getRowCount(): Double = js.native
    
    def getRows(): js.Array[Double] = js.native
    
    def intersectsRow(row: Double): Boolean = js.native
    
    def intersectsRowRange(startRow: Double, endRow: Double): Boolean = js.native
    
    def intersectsWith(otherRange: RangeLike): Boolean = js.native
    def intersectsWith(otherRange: RangeLike, exclusive: Boolean): Boolean = js.native
    
    def isEmpty(): Boolean = js.native
    
    def isEqual(otherRange: RangeCompatible): Boolean = js.native
    
    def isSingleLine(): Boolean = js.native
    
    def negate(): this.type = js.native
    
    def serialize(): js.Array[js.Array[Double]] = js.native
    
    val start: PointLike = js.native
    
    def translate(startDelta: PointCompatible): this.type = js.native
    def translate(startDelta: PointCompatible, endDelta: PointCompatible): this.type = js.native
    
    def traverse(delta: PointCompatible): this.type = js.native
    
    def union(other: RangeLike): this.type = js.native
  }
  
  @js.native
  trait Reversed extends StObject {
    
    var reversed: Boolean = js.native
  }
  object Reversed {
    
    @scala.inline
    def apply(reversed: Boolean): Reversed = {
      val __obj = js.Dynamic.literal(reversed = reversed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reversed]
    }
    
    @scala.inline
    implicit class ReversedMutableBuilder[Self <: Reversed] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ShouldDestroyOnFileDelete extends StObject {
    
    /**
      *  A function that returns a Boolean indicating whether the buffer should
      *  be destroyed if its file is deleted.
      */
    var shouldDestroyOnFileDelete: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** The initial string text of the buffer. */
    var text: js.UndefOr[String] = js.native
  }
  object ShouldDestroyOnFileDelete {
    
    @scala.inline
    def apply(): ShouldDestroyOnFileDelete = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShouldDestroyOnFileDelete]
    }
    
    @scala.inline
    implicit class ShouldDestroyOnFileDeleteMutableBuilder[Self <: ShouldDestroyOnFileDelete] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShouldDestroyOnFileDelete(value: () => Boolean): Self = StObject.set(x, "shouldDestroyOnFileDelete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShouldDestroyOnFileDeleteUndefined: Self = StObject.set(x, "shouldDestroyOnFileDelete", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
