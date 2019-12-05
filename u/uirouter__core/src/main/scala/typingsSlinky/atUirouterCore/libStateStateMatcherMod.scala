package typingsSlinky.atUirouterCore

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atUirouterCore.libStateInterfaceMod.StateOrName
import typingsSlinky.atUirouterCore.libStateStateObjectMod.StateObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/state/stateMatcher", JSImport.Namespace)
@js.native
object libStateStateMatcherMod extends js.Object {
  @js.native
  class StateMatcher protected () extends js.Object {
    def this(_states: StringDictionary[StateObject]) = this()
    var _states: js.Any = js.native
    def find(stateOrName: StateOrName): StateObject = js.native
    def find(stateOrName: StateOrName, base: StateOrName): StateObject = js.native
    def find(stateOrName: StateOrName, base: StateOrName, matchGlob: Boolean): StateObject = js.native
    def isRelative(stateName: String): Boolean = js.native
    def resolvePath(name: String, base: StateOrName): String = js.native
  }
  
}

