package typingsSlinky.vexflow.mod.Flow

import typingsSlinky.vexflow.Vex.Flow.Stroke.Type
import typingsSlinky.vexflow.anon.Allvoices
import typingsSlinky.vexflow.anon.Leftshift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.Stroke")
@js.native
class Stroke protected ()
  extends typingsSlinky.vexflow.Vex.Flow.Stroke {
  def this(`type`: Type) = this()
  def this(`type`: Type, options: Allvoices) = this()
}
object Stroke {
  
  @JSImport("vexflow", "Flow.Stroke.CATEGORY")
  @js.native
  val CATEGORY: String = js.native
  
  @JSImport("vexflow", "Flow.Stroke.Type")
  @js.native
  object Type extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.vexflow.Vex.Flow.Stroke.Type with Double] = js.native
    
    /* 5 */ val ARPEGGIO_DIRECTIONLESS: typingsSlinky.vexflow.Vex.Flow.Stroke.Type.ARPEGGIO_DIRECTIONLESS with Double = js.native
    
    /* 1 */ val BRUSH_DOWN: typingsSlinky.vexflow.Vex.Flow.Stroke.Type.BRUSH_DOWN with Double = js.native
    
    /* 0 */ val BRUSH_UP: typingsSlinky.vexflow.Vex.Flow.Stroke.Type.BRUSH_UP with Double = js.native
    
    /* 3 */ val RASQUEDO_DOWN: typingsSlinky.vexflow.Vex.Flow.Stroke.Type.RASQUEDO_DOWN with Double = js.native
    
    /* 4 */ val RASQUEDO_UP: typingsSlinky.vexflow.Vex.Flow.Stroke.Type.RASQUEDO_UP with Double = js.native
    
    /* 1 */ val ROLL_DOWN: typingsSlinky.vexflow.Vex.Flow.Stroke.Type.ROLL_DOWN with Double = js.native
    
    /* 2 */ val ROLL_UP: typingsSlinky.vexflow.Vex.Flow.Stroke.Type.ROLL_UP with Double = js.native
  }
  
  /* static member */
  @JSImport("vexflow", "Flow.Stroke.format")
  @js.native
  def format(strokes: js.Array[typingsSlinky.vexflow.Vex.Flow.Stroke], state: Leftshift): Boolean = js.native
}
