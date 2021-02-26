package typingsSlinky.uirouterAngularjs.mod

import typingsSlinky.uirouterCore.paramsInterfaceMod.RawParams
import typingsSlinky.uirouterCore.stateInterfaceMod.StateOrName
import typingsSlinky.uirouterCore.transitionInterfaceMod.TransitionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/angularjs", "TargetState")
@js.native
class TargetState protected ()
  extends typingsSlinky.uirouterCore.mod.TargetState {
  /**
    * The TargetState constructor
    *
    * Note: Do not construct a `TargetState` manually.
    * To create a `TargetState`, use the [[StateService.target]] factory method.
    *
    * @param _stateRegistry The StateRegistry to use to look up the _definition
    * @param _identifier An identifier for a state.
    *    Either a fully-qualified state name, or the object used to define the state.
    * @param _params Parameters for the target state
    * @param _options Transition options.
    *
    * @internal
    */
  def this(
    _stateRegistry: typingsSlinky.uirouterCore.stateRegistryMod.StateRegistry,
    _identifier: StateOrName
  ) = this()
  def this(
    _stateRegistry: typingsSlinky.uirouterCore.stateRegistryMod.StateRegistry,
    _identifier: StateOrName,
    _params: RawParams
  ) = this()
  def this(
    _stateRegistry: typingsSlinky.uirouterCore.stateRegistryMod.StateRegistry,
    _identifier: StateOrName,
    _params: js.UndefOr[scala.Nothing],
    _options: TransitionOptions
  ) = this()
  def this(
    _stateRegistry: typingsSlinky.uirouterCore.stateRegistryMod.StateRegistry,
    _identifier: StateOrName,
    _params: RawParams,
    _options: TransitionOptions
  ) = this()
}
/* static members */
object TargetState {
  
  /** Returns true if the object has a state property that might be a state or state name */
  @JSImport("@uirouter/angularjs", "TargetState.isDef")
  @js.native
  def isDef(obj: js.Any): /* is @uirouter/core.@uirouter/core/lib/state/interface.TargetStateDef */ Boolean = js.native
}
