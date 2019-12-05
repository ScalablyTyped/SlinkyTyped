package typingsSlinky.atUirouterCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTransitionInterfaceMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.atUirouterCore.libCommonCommonMod.PredicateBinary
  import typingsSlinky.atUirouterCore.libStateInterfaceMod.StateDeclaration
  import typingsSlinky.atUirouterCore.libStateStateObjectMod.StateObject
  import typingsSlinky.atUirouterCore.libStateTargetStateMod.TargetState
  import typingsSlinky.atUirouterCore.libTransitionHookRegistryMod.RegisteredHook
  import typingsSlinky.atUirouterCore.libTransitionTransitionMod.Transition

  type HookFn = TransitionHookFn | TransitionStateHookFn | TransitionCreateHookFn
  type HookMatchCriterion = String | IStateMatch | Boolean
  type HookResult = Boolean | TargetState | Unit | (js.Promise[Boolean | TargetState | Unit])
  type IHookRegistration = js.Function3[
    /* matchCriteria */ HookMatchCriteria, 
    /* callback */ HookFn, 
    /* options */ js.UndefOr[HookRegOptions], 
    js.Function
  ]
  type IStateMatch = PredicateBinary[StateObject, Transition]
  type RegisteredHooks = StringDictionary[js.Array[RegisteredHook]]
  type TransitionCreateHookFn = js.Function1[/* transition */ Transition, Unit]
  type TransitionHookFn = js.Function1[/* transition */ Transition, HookResult]
  type TransitionStateHookFn = js.Function2[/* transition */ Transition, /* state */ StateDeclaration, HookResult]
}
