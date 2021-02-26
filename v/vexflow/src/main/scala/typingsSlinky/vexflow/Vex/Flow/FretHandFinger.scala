package typingsSlinky.vexflow.Vex.Flow

import typingsSlinky.vexflow.Vex.Flow.Modifier.Position
import typingsSlinky.vexflow.Vex.IRenderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FretHandFinger extends Modifier {
  
  var finger: Double | String = js.native
  
  def setFretHandFinger(number: Double): FretHandFinger = js.native
  
  def setOffsetX(x: Double): FretHandFinger = js.native
  
  def setOffsetY(y: Double): FretHandFinger = js.native
}
object FretHandFinger {
  
  @scala.inline
  def apply(
    alignSubNotesWithNote: (js.Array[Note], Note) => Unit,
    draw: () => Unit,
    finger: Double | String,
    getCategory: () => String,
    getContext: () => IRenderContext,
    getIndex: () => Double,
    getModifierContext: () => ModifierContext,
    getNote: () => Note,
    getPosition: () => Position,
    getWidth: () => Double,
    setContext: IRenderContext => Modifier,
    setFretHandFinger: Double => FretHandFinger,
    setIndex: Double => Modifier,
    setModifierContext: ModifierContext => Modifier,
    setNote: Note => Modifier,
    setOffsetX: Double => FretHandFinger,
    setOffsetY: Double => FretHandFinger,
    setPosition: Position => Modifier,
    setTextLine: Double => Modifier,
    setWidth: Double => Modifier,
    setXShift: Double => Unit,
    setYShift: Double => Modifier
  ): FretHandFinger = {
    val __obj = js.Dynamic.literal(alignSubNotesWithNote = js.Any.fromFunction2(alignSubNotesWithNote), draw = js.Any.fromFunction0(draw), finger = finger.asInstanceOf[js.Any], getCategory = js.Any.fromFunction0(getCategory), getContext = js.Any.fromFunction0(getContext), getIndex = js.Any.fromFunction0(getIndex), getModifierContext = js.Any.fromFunction0(getModifierContext), getNote = js.Any.fromFunction0(getNote), getPosition = js.Any.fromFunction0(getPosition), getWidth = js.Any.fromFunction0(getWidth), setContext = js.Any.fromFunction1(setContext), setFretHandFinger = js.Any.fromFunction1(setFretHandFinger), setIndex = js.Any.fromFunction1(setIndex), setModifierContext = js.Any.fromFunction1(setModifierContext), setNote = js.Any.fromFunction1(setNote), setOffsetX = js.Any.fromFunction1(setOffsetX), setOffsetY = js.Any.fromFunction1(setOffsetY), setPosition = js.Any.fromFunction1(setPosition), setTextLine = js.Any.fromFunction1(setTextLine), setWidth = js.Any.fromFunction1(setWidth), setXShift = js.Any.fromFunction1(setXShift), setYShift = js.Any.fromFunction1(setYShift))
    __obj.asInstanceOf[FretHandFinger]
  }
  
  @scala.inline
  implicit class FretHandFingerMutableBuilder[Self <: FretHandFinger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFinger(value: Double | String): Self = StObject.set(x, "finger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetFretHandFinger(value: Double => FretHandFinger): Self = StObject.set(x, "setFretHandFinger", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOffsetX(value: Double => FretHandFinger): Self = StObject.set(x, "setOffsetX", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOffsetY(value: Double => FretHandFinger): Self = StObject.set(x, "setOffsetY", js.Any.fromFunction1(value))
  }
}
