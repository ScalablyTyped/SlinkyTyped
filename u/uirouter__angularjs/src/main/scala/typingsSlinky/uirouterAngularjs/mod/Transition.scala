package typingsSlinky.uirouterAngularjs.mod

import typingsSlinky.uirouterCore.anon.TypeofTransition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/angularjs", "Transition")
@js.native
class Transition protected ()
  extends typingsSlinky.uirouterCore.mod.Transition {
  /**
    * Creates a new Transition object.
    *
    * If the target state is not valid, an error is thrown.
    *
    * @internal
    *
    * @param fromPath The path of [[PathNode]]s from which the transition is leaving.  The last node in the `fromPath`
    *        encapsulates the "from state".
    * @param targetState The target state and parameters being transitioned to (also, the transition options)
    * @param router The [[UIRouter]] instance
    * @internal
    */
  def this(
    fromPath: js.Array[typingsSlinky.uirouterCore.pathNodeMod.PathNode],
    targetState: typingsSlinky.uirouterCore.targetStateMod.TargetState,
    router: typingsSlinky.uirouterCore.routerMod.UIRouter
  ) = this()
}
/* static members */
@JSImport("@uirouter/angularjs", "Transition")
@js.native
object Transition extends js.Object {
  
  /** @internal */
  var diToken: TypeofTransition = js.native
}
