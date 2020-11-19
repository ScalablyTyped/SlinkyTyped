package typingsSlinky.uiBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object enhancePropsMod {
  
  type PreservedProps = typingsSlinky.uiBox.boxTypesMod.Without[
    typingsSlinky.react.mod.ComponentProps[js.Any], 
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 142 */ js.Any
  ]
}
