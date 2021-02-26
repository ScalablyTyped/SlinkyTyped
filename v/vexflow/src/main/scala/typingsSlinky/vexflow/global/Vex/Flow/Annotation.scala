package typingsSlinky.vexflow.global.Vex.Flow

import typingsSlinky.vexflow.anon.Leftshift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.Annotation")
@js.native
class Annotation protected ()
  extends typingsSlinky.vexflow.Vex.Flow.Annotation {
  def this(text: String) = this()
}
object Annotation {
  
  @JSGlobal("Vex.Flow.Annotation")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("Vex.Flow.Annotation.CATEGORY")
  @js.native
  val CATEGORY: String = js.native
  
  /* static member */
  @JSGlobal("Vex.Flow.Annotation.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  @scala.inline
  def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  @JSGlobal("Vex.Flow.Annotation.Justify")
  @js.native
  object Justify extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.vexflow.Vex.Flow.Annotation.Justify with Double] = js.native
    
    /* 0 */ val CENTER: typingsSlinky.vexflow.Vex.Flow.Annotation.Justify.CENTER with Double = js.native
    
    /* 2 */ val CENTER_STEM: typingsSlinky.vexflow.Vex.Flow.Annotation.Justify.CENTER_STEM with Double = js.native
    
    /* 1 */ val LEFT: typingsSlinky.vexflow.Vex.Flow.Annotation.Justify.LEFT with Double = js.native
    
    /* 1 */ val RIGHT: typingsSlinky.vexflow.Vex.Flow.Annotation.Justify.RIGHT with Double = js.native
  }
  
  @JSGlobal("Vex.Flow.Annotation.VerticalJustify")
  @js.native
  object VerticalJustify extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.vexflow.Vex.Flow.Annotation.VerticalJustify with Double] = js.native
    
    /* 1 */ val BOTTOM: typingsSlinky.vexflow.Vex.Flow.Annotation.VerticalJustify.BOTTOM with Double = js.native
    
    /* 0 */ val CENTER: typingsSlinky.vexflow.Vex.Flow.Annotation.VerticalJustify.CENTER with Double = js.native
    
    /* 2 */ val CENTER_STEM: typingsSlinky.vexflow.Vex.Flow.Annotation.VerticalJustify.CENTER_STEM with Double = js.native
    
    /* 1 */ val TOP: typingsSlinky.vexflow.Vex.Flow.Annotation.VerticalJustify.TOP with Double = js.native
  }
  
  /* static member */
  @JSGlobal("Vex.Flow.Annotation.format")
  @js.native
  def format(annotations: js.Array[typingsSlinky.vexflow.Vex.Flow.Annotation], state: Leftshift): Boolean = js.native
}
