package typingsSlinky.uirouterCore.stateInterfaceMod

import typingsSlinky.uirouterCore.stateObjectMod.StateObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.uirouterCore.stateInterfaceMod.StateDeclaration
  - typingsSlinky.uirouterCore.stateObjectMod.StateObject
*/
trait StateOrName extends js.Object

object StateOrName {
  @scala.inline
  implicit def apply(value: StateDeclaration): StateOrName = value.asInstanceOf[StateOrName]
  @scala.inline
  implicit def apply(value: StateObject): StateOrName = value.asInstanceOf[StateOrName]
  @scala.inline
  implicit def apply(value: String): StateOrName = value.asInstanceOf[StateOrName]
}

