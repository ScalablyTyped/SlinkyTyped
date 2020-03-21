package typingsSlinky.wordpressHooks

import typingsSlinky.wordpressHooks.mod.ActionCallback
import typingsSlinky.wordpressHooks.mod.CurrentHook
import typingsSlinky.wordpressHooks.mod.DidHook
import typingsSlinky.wordpressHooks.mod.DoingHook
import typingsSlinky.wordpressHooks.mod.FilterCallback
import typingsSlinky.wordpressHooks.mod.HasHook
import typingsSlinky.wordpressHooks.mod.HookMap
import typingsSlinky.wordpressHooks.mod.RemoveHook
import typingsSlinky.wordpressHooks.mod.RunHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonActions extends js.Object {
  var actions: HookMap[ActionCallback] = js.native
  @JSName("addAction")
  var addAction_Original: js.Function4[
    /* hookName */ String, 
    /* namespace */ String, 
    /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
    /* priority */ js.UndefOr[Double], 
    Unit
  ] = js.native
  @JSName("addFilter")
  var addFilter_Original: FnCall = js.native
  @JSName("applyFilters")
  var applyFilters_Original: RunHook = js.native
  @JSName("currentAction")
  var currentAction_Original: CurrentHook = js.native
  @JSName("currentFilter")
  var currentFilter_Original: CurrentHook = js.native
  @JSName("didAction")
  var didAction_Original: DidHook = js.native
  @JSName("didFilter")
  var didFilter_Original: DidHook = js.native
  @JSName("doAction")
  var doAction_Original: RunHook = js.native
  @JSName("doingAction")
  var doingAction_Original: DoingHook = js.native
  @JSName("doingFilter")
  var doingFilter_Original: DoingHook = js.native
  var filters: HookMap[FilterCallback] = js.native
  @JSName("hasAction")
  var hasAction_Original: HasHook = js.native
  @JSName("hasFilter")
  var hasFilter_Original: HasHook = js.native
  @JSName("removeAction")
  var removeAction_Original: RemoveHook = js.native
  @JSName("removeAllActions")
  var removeAllActions_Original: RemoveHook = js.native
  @JSName("removeAllFilters")
  var removeAllFilters_Original: RemoveHook = js.native
  @JSName("removeFilter")
  var removeFilter_Original: RemoveHook = js.native
  def addAction(hookName: String, namespace: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def addAction(
    hookName: String,
    namespace: String,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    priority: Double
  ): Unit = js.native
  def addFilter[T](
    hookName: String,
    namespace: String,
    callback: js.Function2[/* firstArg */ T, /* repeated */ js.Any, T]
  ): Unit = js.native
  def addFilter[T](
    hookName: String,
    namespace: String,
    callback: js.Function2[/* firstArg */ T, /* repeated */ js.Any, T],
    priority: Double
  ): Unit = js.native
  def applyFilters[T](hookName: String): T | Double | String = js.native
  def applyFilters[T](hookName: String, firstArg: T, rest: js.Any*): T | Double | String = js.native
  def currentAction(): String | Null = js.native
  def currentFilter(): String | Null = js.native
  def didAction(hookName: String): Double = js.native
  def didFilter(hookName: String): Double = js.native
  def doAction[T](hookName: String): T | Double | String = js.native
  def doAction[T](hookName: String, firstArg: T, rest: js.Any*): T | Double | String = js.native
  def doingAction(): Boolean = js.native
  def doingAction(hookName: String): Boolean = js.native
  def doingFilter(): Boolean = js.native
  def doingFilter(hookName: String): Boolean = js.native
  def hasAction(hookName: String): Boolean = js.native
  def hasFilter(hookName: String): Boolean = js.native
  def removeAction(hookName: String, namespace: String): Double = js.native
  def removeAllActions(hookName: String, namespace: String): Double = js.native
  def removeAllFilters(hookName: String, namespace: String): Double = js.native
  def removeFilter(hookName: String, namespace: String): Double = js.native
}

