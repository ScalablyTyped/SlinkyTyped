package typingsSlinky.uifabricFoundation.libIslotsMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISlot[TProps] extends js.Object {
  
  def apply(): ReturnType[ReactComponentClass[js.Object]] = js.native
  def apply(componentProps: PropsWithChildren[TProps]): ReturnType[ReactComponentClass[js.Object]] = js.native
  
  var isSlot: js.UndefOr[Boolean] = js.native
}
