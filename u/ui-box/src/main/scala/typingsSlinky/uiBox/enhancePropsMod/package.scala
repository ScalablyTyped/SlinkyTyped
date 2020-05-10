package typingsSlinky.uiBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object enhancePropsMod {
  type PreservedProps = typingsSlinky.uiBox.boxTypesMod.Without[
    typingsSlinky.react.mod.ComponentProps[js.Any], 
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 140 */ js.Any
  ]
}
