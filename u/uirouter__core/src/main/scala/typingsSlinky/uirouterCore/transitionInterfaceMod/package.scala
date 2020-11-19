package typingsSlinky.uirouterCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object transitionInterfaceMod {
  
  type HookFn = typingsSlinky.uirouterCore.transitionInterfaceMod.TransitionHookFn | typingsSlinky.uirouterCore.transitionInterfaceMod.TransitionStateHookFn | typingsSlinky.uirouterCore.transitionInterfaceMod.TransitionCreateHookFn
  
  type HookMatchCriterion = java.lang.String | typingsSlinky.uirouterCore.transitionInterfaceMod.IStateMatch | scala.Boolean
  
  type HookResult = scala.Boolean | typingsSlinky.uirouterCore.targetStateMod.TargetState | scala.Unit | (js.Promise[
    scala.Boolean | typingsSlinky.uirouterCore.targetStateMod.TargetState | scala.Unit
  ])
  
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
