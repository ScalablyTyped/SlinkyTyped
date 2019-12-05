package typingsSlinky.vegaDashTypings

import typingsSlinky.vegaDashTypings.typesSpecEncodeMod.ColorHCL
import typingsSlinky.vegaDashTypings.typesSpecEncodeMod.ColorHSL
import typingsSlinky.vegaDashTypings.typesSpecEncodeMod.ColorLAB
import typingsSlinky.vegaDashTypings.typesSpecEncodeMod.ColorRGB
import typingsSlinky.vegaDashTypings.typesSpecEncodeMod._ColorValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends _ColorValueRef {
  var color: ColorRGB | ColorHSL | ColorLAB | ColorHCL
}

object Anon_Color {
  @scala.inline
  def apply(color: ColorRGB | ColorHSL | ColorLAB | ColorHCL): Anon_Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Color]
  }
}

