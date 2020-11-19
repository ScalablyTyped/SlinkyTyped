package typingsSlinky.vexflow.Vex.Flow

import typingsSlinky.vexflow.Vex.Flow.Annotation.Justify
import typingsSlinky.vexflow.Vex.Flow.Annotation.VerticalJustify
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
@JSGlobal("Vex.Flow.Annotation")
@js.native
object Annotation extends js.Object {
  
  @js.native
  sealed trait Justify extends js.Object
  @js.native
  object Justify extends js.Object {
    
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
  sealed trait VerticalJustify extends js.Object
  @js.native
  object VerticalJustify extends js.Object {
    
    @js.native
    sealed trait BOTTOM extends VerticalJustify
    
    @js.native
    sealed trait CENTER extends VerticalJustify
    
    @js.native
    sealed trait CENTER_STEM extends VerticalJustify
    
    @js.native
    sealed trait TOP extends VerticalJustify
  }
}
