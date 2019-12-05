package typingsSlinky.atUirouterCore.libStateInterfaceMod

import typingsSlinky.atUirouterCore.libStateStateObjectMod.StateObject
import typingsSlinky.atUirouterCore.libTransitionTransitionMod.Transition
import typingsSlinky.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionPromise extends Promise[StateObject] {
  var transition: Transition = js.native
}

