package typingsSlinky.storybookAddons.hooksMod

import typingsSlinky.std.Set
import typingsSlinky.std.WeakMap
import typingsSlinky.storybookAddons.storybookAddonsStrings.MOUNT
import typingsSlinky.storybookAddons.storybookAddonsStrings.NONE
import typingsSlinky.storybookAddons.storybookAddonsStrings.UPDATE
import typingsSlinky.storybookAddons.typesMod.StoryContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/addons/dist/hooks", "HooksContext")
@js.native
class HooksContext () extends js.Object {
  
  def addRenderListeners(): Unit = js.native
  
  def clean(): Unit = js.native
  
  var currentContext: StoryContext | Null = js.native
  
  var currentDecoratorName: String | Null = js.native
  
  var currentEffects: js.Array[Effect] = js.native
  
  var currentHooks: js.Array[Hook] = js.native
  
  var currentPhase: MOUNT | UPDATE | NONE = js.native
  
  def getNextHook(): Hook = js.native
  
  var hasUpdates: Boolean = js.native
  
  var hookListsMap: WeakMap[AbstractFunction, js.Array[Hook]] = js.native
  
  def init(): Unit = js.native
  
  var mountedDecorators: Set[AbstractFunction] = js.native
  
  var nextHookIndex: Double = js.native
  
  var prevEffects: js.Array[Effect] = js.native
  
  var prevMountedDecorators: Set[AbstractFunction] = js.native
  
  def removeRenderListeners(): Unit = js.native
  
  def renderListener(): Unit = js.native
  
  def triggerEffects(): Unit = js.native
}
