package typingsSlinky.uirouterCore.urlInterfaceMod

import typingsSlinky.uirouterCore.stateMod.StateObject
import typingsSlinky.uirouterCore.uirouterCoreStrings.STATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateRule extends MatcherUrlRule {
  var state: StateObject = js.native
  @JSName("type")
  var type_StateRule: STATE = js.native
}

