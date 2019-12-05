package typingsSlinky.atUirouterAngularjs.atUirouterAngularjsMod.core

import typingsSlinky.atUirouterCore.libTransitionInterfaceMod.HookFn
import typingsSlinky.atUirouterCore.libTransitionInterfaceMod.HookMatchCriteria
import typingsSlinky.atUirouterCore.libTransitionInterfaceMod.HookRegOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs", "core.RegisteredHook")
@js.native
class RegisteredHook protected ()
  extends typingsSlinky.atUirouterCore.atUirouterCoreMod.RegisteredHook {
  def this(
    tranSvc: typingsSlinky.atUirouterCore.libTransitionTransitionServiceMod.TransitionService,
    eventType: typingsSlinky.atUirouterCore.libTransitionTransitionEventTypeMod.TransitionEventType,
    callback: HookFn,
    matchCriteria: HookMatchCriteria,
    removeHookFromRegistry: js.Function1[
        /* hook */ typingsSlinky.atUirouterCore.libTransitionHookRegistryMod.RegisteredHook, 
        Unit
      ]
  ) = this()
  def this(
    tranSvc: typingsSlinky.atUirouterCore.libTransitionTransitionServiceMod.TransitionService,
    eventType: typingsSlinky.atUirouterCore.libTransitionTransitionEventTypeMod.TransitionEventType,
    callback: HookFn,
    matchCriteria: HookMatchCriteria,
    removeHookFromRegistry: js.Function1[
        /* hook */ typingsSlinky.atUirouterCore.libTransitionHookRegistryMod.RegisteredHook, 
        Unit
      ],
    options: HookRegOptions
  ) = this()
}

