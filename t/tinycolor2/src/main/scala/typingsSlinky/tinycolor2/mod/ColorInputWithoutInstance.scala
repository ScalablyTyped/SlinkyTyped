package typingsSlinky.tinycolor2.mod

import typingsSlinky.tinycolor2.mod.ColorFormats.HSL
import typingsSlinky.tinycolor2.mod.ColorFormats.HSLA
import typingsSlinky.tinycolor2.mod.ColorFormats.HSV
import typingsSlinky.tinycolor2.mod.ColorFormats.HSVA
import typingsSlinky.tinycolor2.mod.ColorFormats.PRGB
import typingsSlinky.tinycolor2.mod.ColorFormats.PRGBA
import typingsSlinky.tinycolor2.mod.ColorFormats.RGB
import typingsSlinky.tinycolor2.mod.ColorFormats.RGBA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.tinycolor2.mod.ColorFormats.PRGB
  - typingsSlinky.tinycolor2.mod.ColorFormats.PRGBA
  - typingsSlinky.tinycolor2.mod.ColorFormats.RGB
  - typingsSlinky.tinycolor2.mod.ColorFormats.RGBA
  - typingsSlinky.tinycolor2.mod.ColorFormats.HSL
  - typingsSlinky.tinycolor2.mod.ColorFormats.HSLA
  - typingsSlinky.tinycolor2.mod.ColorFormats.HSV
  - typingsSlinky.tinycolor2.mod.ColorFormats.HSVA
*/
trait ColorInputWithoutInstance extends ColorInput

object ColorInputWithoutInstance {
  @scala.inline
  implicit def apply(value: HSL): ColorInputWithoutInstance = value.asInstanceOf[ColorInputWithoutInstance]
  @scala.inline
  implicit def apply(value: HSLA): ColorInputWithoutInstance = value.asInstanceOf[ColorInputWithoutInstance]
  @scala.inline
  implicit def apply(value: HSV): ColorInputWithoutInstance = value.asInstanceOf[ColorInputWithoutInstance]
  @scala.inline
  implicit def apply(value: HSVA): ColorInputWithoutInstance = value.asInstanceOf[ColorInputWithoutInstance]
  @scala.inline
  implicit def apply(value: PRGB): ColorInputWithoutInstance = value.asInstanceOf[ColorInputWithoutInstance]
  @scala.inline
  implicit def apply(value: PRGBA): ColorInputWithoutInstance = value.asInstanceOf[ColorInputWithoutInstance]
  @scala.inline
  implicit def apply(value: RGB): ColorInputWithoutInstance = value.asInstanceOf[ColorInputWithoutInstance]
  @scala.inline
  implicit def apply(value: RGBA): ColorInputWithoutInstance = value.asInstanceOf[ColorInputWithoutInstance]
  @scala.inline
  implicit def apply(value: String): ColorInputWithoutInstance = value.asInstanceOf[ColorInputWithoutInstance]
}

