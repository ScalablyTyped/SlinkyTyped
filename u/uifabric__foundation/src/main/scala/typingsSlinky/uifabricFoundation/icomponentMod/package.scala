package typingsSlinky.uifabricFoundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object icomponentMod {
  type IViewComponent[TViewProps, TComponentSlots] = js.Function2[
    /* props */ typingsSlinky.react.mod.PropsWithChildren[TViewProps], 
    /* slots */ typingsSlinky.uifabricFoundation.libIslotsMod.ISlots[typingsSlinky.std.Required[TComponentSlots]], 
    typingsSlinky.std.ReturnType[slinky.core.ReactComponentClass[js.Object]]
  ]
}
