package typingsSlinky.uirouterAngularjs

import typingsSlinky.uirouterAngularjs.uirouterAngularjsStrings.onEnter
import typingsSlinky.uirouterAngularjs.uirouterAngularjsStrings.onExit
import typingsSlinky.uirouterAngularjs.uirouterAngularjsStrings.onRetain
import typingsSlinky.uirouterCore.mod.StateObject
import typingsSlinky.uirouterCore.stateBuilderMod.BuilderFunction
import typingsSlinky.uirouterCore.transitionInterfaceMod.TransitionStateHookFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs/lib/statebuilders/onEnterExitRetain", JSImport.Namespace)
@js.native
object onEnterExitRetainMod extends js.Object {
  @JSName("getStateHookBuilder")
  def getStateHookBuilder_onEnter(hookName: onEnter): js.Function2[/* stateObject */ StateObject, /* parentFn */ BuilderFunction, TransitionStateHookFn] = js.native
  @JSName("getStateHookBuilder")
  def getStateHookBuilder_onExit(hookName: onExit): js.Function2[/* stateObject */ StateObject, /* parentFn */ BuilderFunction, TransitionStateHookFn] = js.native
  @JSName("getStateHookBuilder")
  def getStateHookBuilder_onRetain(hookName: onRetain): js.Function2[/* stateObject */ StateObject, /* parentFn */ BuilderFunction, TransitionStateHookFn] = js.native
}

