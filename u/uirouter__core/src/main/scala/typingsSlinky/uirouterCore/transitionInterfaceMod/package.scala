package typingsSlinky.uirouterCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transitionInterfaceMod {
  type IHookRegistration = js.Function3[
    /* matchCriteria */ typingsSlinky.uirouterCore.transitionInterfaceMod.HookMatchCriteria, 
    /* callback */ typingsSlinky.uirouterCore.transitionInterfaceMod.HookFn, 
    /* options */ js.UndefOr[typingsSlinky.uirouterCore.transitionInterfaceMod.HookRegOptions], 
    js.Function
  ]
  type IStateMatch = typingsSlinky.uirouterCore.commonCommonMod.PredicateBinary[
    typingsSlinky.uirouterCore.stateObjectMod.StateObject, 
    typingsSlinky.uirouterCore.transitionTransitionMod.Transition
  ]
  type RegisteredHooks = org.scalablytyped.runtime.StringDictionary[js.Array[typingsSlinky.uirouterCore.hookRegistryMod.RegisteredHook]]
  type TransitionCreateHookFn = js.Function1[
    /* transition */ typingsSlinky.uirouterCore.transitionTransitionMod.Transition, 
    scala.Unit
  ]
  type TransitionHookFn = js.Function1[
    /* transition */ typingsSlinky.uirouterCore.transitionTransitionMod.Transition, 
    typingsSlinky.uirouterCore.transitionInterfaceMod.HookResult
  ]
  type TransitionStateHookFn = js.Function2[
    /* transition */ typingsSlinky.uirouterCore.transitionTransitionMod.Transition, 
    /* state */ typingsSlinky.uirouterCore.stateInterfaceMod.StateDeclaration, 
    typingsSlinky.uirouterCore.transitionInterfaceMod.HookResult
  ]
}
