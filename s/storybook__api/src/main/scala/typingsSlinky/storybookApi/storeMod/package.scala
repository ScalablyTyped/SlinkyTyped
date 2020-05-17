package typingsSlinky.storybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object storeMod {
  type CallBack = js.Function1[/* s */ typingsSlinky.storybookApi.mod.State, scala.Unit]
  type GetState = js.Function0[typingsSlinky.storybookApi.mod.State]
  type InputFnPatch = js.Function1[
    /* s */ typingsSlinky.storybookApi.mod.State, 
    typingsSlinky.storybookApi.storeMod.Patch
  ]
  type SetState = js.Function2[/* a */ js.Any, /* b */ js.Any, js.Any]
}
