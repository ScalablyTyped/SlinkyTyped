package typingsSlinky.uirouterCore.stateInterfaceMod

import typingsSlinky.std.Promise
import typingsSlinky.uirouterCore.stateObjectMod.StateObject
import typingsSlinky.uirouterCore.transitionTransitionMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionPromise extends Promise[StateObject] {
  var transition: Transition = js.native
}

