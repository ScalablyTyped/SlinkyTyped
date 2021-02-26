package typingsSlinky.vexflow.Vex.Flow

import typingsSlinky.vexflow.Vex.Flow.Annotation.Justify
import typingsSlinky.vexflow.Vex.Flow.Annotation.VerticalJustify
import typingsSlinky.vexflow.Vex.Flow.Modifier.Position
import typingsSlinky.vexflow.Vex.IRenderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Annotation extends Modifier {
  
  def getJustification(): Justify = js.native
  
  def setFont(family: String, size: Double, weight: String): Annotation = js.native
  
  def setJustification(justification: Justify): Annotation = js.native
  
  def setVerticalJustification(just: VerticalJustify): Annotation = js.native
}
object Annotation {
  
  @scala.inline
  def apply(
    alignSubNotesWithNote: (js.Array[Note], Note) => Unit,
    draw: () => Unit,
    getCategory: () => String,
    getContext: () => IRenderContext,
    getIndex: () => Double,
    getJustification: () => Justify,
    getModifierContext: () => ModifierContext,
    getNote: () => Note,
    getPosition: () => Position,
    getWidth: () => Double,
    setContext: IRenderContext => Modifier,
    setFont: (String, Double, String) => Annotation,
    setIndex: Double => Modifier,
    setJustification: Justify => Annotation,
    setModifierContext: ModifierContext => Modifier,
    setNote: Note => Modifier,
    setPosition: Position => Modifier,
    setTextLine: Double => Modifier,
    setVerticalJustification: VerticalJustify => Annotation,
    setWidth: Double => Modifier,
    setXShift: Double => Unit,
    setYShift: Double => Modifier
  ): Annotation = {
    val __obj = js.Dynamic.literal(alignSubNotesWithNote = js.Any.fromFunction2(alignSubNotesWithNote), draw = js.Any.fromFunction0(draw), getCategory = js.Any.fromFunction0(getCategory), getContext = js.Any.fromFunction0(getContext), getIndex = js.Any.fromFunction0(getIndex), getJustification = js.Any.fromFunction0(getJustification), getModifierContext = js.Any.fromFunction0(getModifierContext), getNote = js.Any.fromFunction0(getNote), getPosition = js.Any.fromFunction0(getPosition), getWidth = js.Any.fromFunction0(getWidth), setContext = js.Any.fromFunction1(setContext), setFont = js.Any.fromFunction3(setFont), setIndex = js.Any.fromFunction1(setIndex), setJustification = js.Any.fromFunction1(setJustification), setModifierContext = js.Any.fromFunction1(setModifierContext), setNote = js.Any.fromFunction1(setNote), setPosition = js.Any.fromFunction1(setPosition), setTextLine = js.Any.fromFunction1(setTextLine), setVerticalJustification = js.Any.fromFunction1(setVerticalJustification), setWidth = js.Any.fromFunction1(setWidth), setXShift = js.Any.fromFunction1(setXShift), setYShift = js.Any.fromFunction1(setYShift))
    __obj.asInstanceOf[Annotation]
  }
  
  @js.native
  sealed trait Justify extends StObject
  @JSGlobal("Vex.Flow.Annotation.Justify")
  @js.native
  object Justify extends StObject {
    
    @js.native
    sealed trait CENTER extends Justify
    
    @js.native
    sealed trait CENTER_STEM extends Justify
    
    @js.native
    sealed trait LEFT extends Justify
    
    @js.native
    sealed trait RIGHT extends Justify
  }
  
  @js.native
  sealed trait VerticalJustify extends StObject
  @JSGlobal("Vex.Flow.Annotation.VerticalJustify")
  @js.native
  object VerticalJustify extends StObject {
    
    @js.native
    sealed trait BOTTOM extends VerticalJustify
    
    @js.native
    sealed trait CENTER extends VerticalJustify
    
    @js.native
    sealed trait CENTER_STEM extends VerticalJustify
    
    @js.native
    sealed trait TOP extends VerticalJustify
  }
  
  @scala.inline
  implicit class AnnotationMutableBuilder[Self <: Annotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetJustification(value: () => Justify): Self = StObject.set(x, "getJustification", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetFont(value: (String, Double, String) => Annotation): Self = StObject.set(x, "setFont", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetJustification(value: Justify => Annotation): Self = StObject.set(x, "setJustification", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVerticalJustification(value: VerticalJustify => Annotation): Self = StObject.set(x, "setVerticalJustification", js.Any.fromFunction1(value))
  }
}
