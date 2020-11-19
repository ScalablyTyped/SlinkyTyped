package typingsSlinky.uirouterCore

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.uirouterCore.stateInterfaceMod.StateOrName
import typingsSlinky.uirouterCore.stateObjectMod.StateObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/core/lib/state/stateMatcher", JSImport.Namespace)
@js.native
object stateMatcherMod extends js.Object {
  
  @js.native
  class StateMatcher protected () extends js.Object {
    def this(_states: StringDictionary[StateObject]) = this()
    
    var _states: js.Any = js.native
    
    def find(stateOrName: StateOrName): StateObject = js.native
    def find(stateOrName: StateOrName, base: js.UndefOr[StateOrName], matchGlob: Boolean): StateObject = js.native
    def find(stateOrName: StateOrName, base: StateOrName): StateObject = js.native
    
    def isRelative(stateName: String): Boolean = js.native
    
    def resolvePath(name: String, base: StateOrName): String = js.native
  }
}
