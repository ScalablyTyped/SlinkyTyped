package typingsSlinky.uiRouterExtras.mod.ui

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Sticky state service
  */
@js.native
trait IStickyStateService extends js.Object {
  
  def getInactiveStates(): js.Array[IStickyState] = js.native
  
  /*
    * If there is an inactive state named inactiveStateName, this method exits that state.
    * If stateParams is provided, then the state is only exited if the params match the inactive params.
    * If inactiveStateName === '*', then all inactive states are exited
    */
  def reset(inactiveStateName: String): Unit = js.native
  def reset(inactiveStateName: String, stateParams: StringDictionary[String | js.Array[String]]): Unit = js.native
}
