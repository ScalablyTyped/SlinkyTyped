package typingsSlinky.uirouterAngularjs.mod.core

import typingsSlinky.uirouterCore.transitionInterfaceMod.HookFn
import typingsSlinky.uirouterCore.transitionInterfaceMod.HookMatchCriteria
import typingsSlinky.uirouterCore.transitionInterfaceMod.HookRegOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/angularjs", "core.RegisteredHook")
@js.native
class RegisteredHook protected ()
  extends typingsSlinky.uirouterCore.mod.RegisteredHook {
  def this(
    tranSvc: typingsSlinky.uirouterCore.transitionServiceMod.TransitionService,
    eventType: typingsSlinky.uirouterCore.transitionEventTypeMod.TransitionEventType,
    callback: HookFn,
    matchCriteria: HookMatchCriteria,
    removeHookFromRegistry: js.Function1[/* hook */ typingsSlinky.uirouterCore.hookRegistryMod.RegisteredHook, Unit]
  ) = this()
  def this(
    tranSvc: typingsSlinky.uirouterCore.transitionServiceMod.TransitionService,
    eventType: typingsSlinky.uirouterCore.transitionEventTypeMod.TransitionEventType,
    callback: HookFn,
    matchCriteria: HookMatchCriteria,
    removeHookFromRegistry: js.Function1[/* hook */ typingsSlinky.uirouterCore.hookRegistryMod.RegisteredHook, Unit],
    options: HookRegOptions
  ) = this()
}
