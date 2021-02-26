package typingsSlinky.zdog.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.zdog.mod.VectorOptions
  - typingsSlinky.zdog.mod.PathLineCommand
  - typingsSlinky.zdog.mod.PathMoveCommand
  - typingsSlinky.zdog.mod.PathArcCommand
  - typingsSlinky.zdog.mod.PathBezierCommand
*/
trait PathCommand extends StObject
object PathCommand {
  
  @scala.inline
  def PathArcCommand(arc: js.Tuple2[VectorOptions, VectorOptions]): typingsSlinky.zdog.mod.PathArcCommand = {
    val __obj = js.Dynamic.literal(arc = arc.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.zdog.mod.PathArcCommand]
  }
  
  @scala.inline
  def PathBezierCommand(bezier: js.Tuple3[VectorOptions, VectorOptions, VectorOptions]): typingsSlinky.zdog.mod.PathBezierCommand = {
    val __obj = js.Dynamic.literal(bezier = bezier.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.zdog.mod.PathBezierCommand]
  }
  
  @scala.inline
  def PathLineCommand(line: VectorOptions): typingsSlinky.zdog.mod.PathLineCommand = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.zdog.mod.PathLineCommand]
  }
  
  @scala.inline
  def PathMoveCommand(move: VectorOptions): typingsSlinky.zdog.mod.PathMoveCommand = {
    val __obj = js.Dynamic.literal(move = move.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.zdog.mod.PathMoveCommand]
  }
  
  @scala.inline
  def VectorOptions(): typingsSlinky.zdog.mod.VectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsSlinky.zdog.mod.VectorOptions]
  }
}
