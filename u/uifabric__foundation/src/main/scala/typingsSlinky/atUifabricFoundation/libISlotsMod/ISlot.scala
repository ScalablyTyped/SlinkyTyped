package typingsSlinky.atUifabricFoundation.libISlotsMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.PropsWithChildren
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISlot[TProps] extends js.Object {
  var isSlot: js.UndefOr[Boolean] = js.native
  def apply(): ReturnType[ReactComponentClass[js.Object]] = js.native
  def apply(componentProps: PropsWithChildren[TProps]): ReturnType[ReactComponentClass[js.Object]] = js.native
}

