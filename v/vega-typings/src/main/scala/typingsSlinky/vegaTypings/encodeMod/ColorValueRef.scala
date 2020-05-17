package typingsSlinky.vegaTypings.encodeMod

import typingsSlinky.vegaTypings.anon.Color
import typingsSlinky.vegaTypings.anon.Count
import typingsSlinky.vegaTypings.anon.`0`
import typingsSlinky.vegaTypings.valuesMod.ColorValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.encodeMod.ScaledValueRef[typingsSlinky.vegaTypings.colorMod.Color]
  - typingsSlinky.vegaTypings.anon.`0`
  - typingsSlinky.vegaTypings.anon.Count
  - typingsSlinky.vegaTypings.anon.Color
*/
trait ColorValueRef
  extends ArbitraryValueRef
     with ColorValue

object ColorValueRef {
  @scala.inline
  implicit def apply(value: `0`): ColorValueRef = value.asInstanceOf[ColorValueRef]
  @scala.inline
  implicit def apply(value: Color): ColorValueRef = value.asInstanceOf[ColorValueRef]
  @scala.inline
  implicit def apply(value: Count): ColorValueRef = value.asInstanceOf[ColorValueRef]
  @scala.inline
  implicit def apply(value: ScaledValueRef[typingsSlinky.vegaTypings.colorMod.Color]): ColorValueRef = value.asInstanceOf[ColorValueRef]
}

