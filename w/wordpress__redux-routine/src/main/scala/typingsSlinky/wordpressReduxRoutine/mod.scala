package typingsSlinky.wordpressReduxRoutine

import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Dispatch
import typingsSlinky.redux.mod.Middleware
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Creates a Redux middleware, given an object of controls where each key is an action type for
    * which to act upon, the value a function which returns either a promise which is to resolve when
    * evaluation of the action should continue, or a value. The value or resolved promise value is
    * assigned on the return value of the yield assignment. If the control handler returns undefined,
    * the execution is not continued.
    *
    * @param controls - Object of control handlers.
    */
  @JSImport("@wordpress/redux-routine", JSImport.Default)
  @js.native
  def default(): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  @JSImport("@wordpress/redux-routine", JSImport.Default)
  @js.native
  def default(controls: Record[String, js.Function1[/* action */ AnyAction, _]]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
}
