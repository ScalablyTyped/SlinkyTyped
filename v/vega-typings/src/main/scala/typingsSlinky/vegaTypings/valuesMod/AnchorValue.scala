package typingsSlinky.vegaTypings.valuesMod

import typingsSlinky.vegaTypings.encodeMod.AnchorValueRef
import typingsSlinky.vegaTypings.titleMod.TitleAnchor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.titleMod.TitleAnchor
  - typingsSlinky.vegaTypings.encodeMod.AnchorValueRef
*/
trait AnchorValue extends js.Object

object AnchorValue {
  @scala.inline
  implicit def apply(value: AnchorValueRef): AnchorValue = value.asInstanceOf[AnchorValue]
  @scala.inline
  implicit def apply(value: TitleAnchor): AnchorValue = value.asInstanceOf[AnchorValue]
}

