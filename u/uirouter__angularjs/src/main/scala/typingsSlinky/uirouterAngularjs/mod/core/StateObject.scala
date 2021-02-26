package typingsSlinky.uirouterAngularjs.mod.core

import typingsSlinky.uirouterCore.stateInterfaceMod.StateDeclaration
import typingsSlinky.uirouterCore.stateInterfaceMod._StateDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/angularjs", "core.StateObject")
@js.native
/** @deprecated use State.create() */
class StateObject ()
  extends typingsSlinky.uirouterCore.mod.StateObject {
  def this(config: StateDeclaration) = this()
}
/* static members */
object StateObject {
  
  /**
    * Create a state object to put the private/internal implementation details onto.
    * The object's prototype chain looks like:
    * (Internal State Object) -> (Copy of State.prototype) -> (State Declaration object) -> (State Declaration's prototype...)
    *
    * @param stateDecl the user-supplied State Declaration
    * @returns {StateObject} an internal State object
    */
  @JSImport("@uirouter/angularjs", "core.StateObject.create")
  @js.native
  def create(stateDecl: _StateDeclaration): typingsSlinky.uirouterCore.stateObjectMod.StateObject = js.native
  
  /** Predicate which returns true if the object is an internal [[StateObject]] object */
  @JSImport("@uirouter/angularjs", "core.StateObject.isState")
  @js.native
  def isState(obj: js.Any): /* is @uirouter/core.@uirouter/core/lib/state/stateObject.StateObject */ Boolean = js.native
  
  /** Predicate which returns true if the object is an class with @State() decorator */
  @JSImport("@uirouter/angularjs", "core.StateObject.isStateClass")
  @js.native
  def isStateClass(stateDecl: _StateDeclaration): Boolean = js.native
  
  /** Predicate which returns true if the object is a [[StateDeclaration]] object */
  @JSImport("@uirouter/angularjs", "core.StateObject.isStateDeclaration")
  @js.native
  def isStateDeclaration(obj: js.Any): /* is @uirouter/core.@uirouter/core/lib/state/interface.StateDeclaration */ Boolean = js.native
}
