package typingsSlinky.webgme.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("GmeClasses")
@js.native
object GmeClasses extends js.Object {
  
  @js.native
  class Project ()
    extends typingsSlinky.webgme.GmeClasses.Project
  
  @js.native
  object TraversalOrder extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.webgme.GmeClasses.TraversalOrder with Double] = js.native
    
    /* 0 */ val BFS: typingsSlinky.webgme.GmeClasses.TraversalOrder.BFS with Double = js.native
    
    /* 1 */ val DFS: typingsSlinky.webgme.GmeClasses.TraversalOrder.DFS with Double = js.native
  }
}
