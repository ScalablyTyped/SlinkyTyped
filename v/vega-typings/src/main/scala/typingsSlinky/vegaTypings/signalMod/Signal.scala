package typingsSlinky.vegaTypings.signalMod

import typingsSlinky.vegaTypings.exprMod.Expr
import typingsSlinky.vegaTypings.vegaTypingsStrings.outer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.signalMod.NewSignal
  - typingsSlinky.vegaTypings.signalMod.InitSignal
  - typingsSlinky.vegaTypings.signalMod.PushSignal
*/
trait Signal extends js.Object
object Signal {
  
  @scala.inline
  def NewSignal(name: String): Signal = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Signal]
  }
  
  @scala.inline
  def InitSignal(init: Expr, name: String): Signal = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Signal]
  }
  
  @scala.inline
  def PushSignal(name: String, push: outer): Signal = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any])
    __obj.asInstanceOf[Signal]
  }
}
