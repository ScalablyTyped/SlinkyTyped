package typingsSlinky.sharp.mod

import typingsSlinky.sharp.sharpStrings.cubic
import typingsSlinky.sharp.sharpStrings.lanczos2
import typingsSlinky.sharp.sharpStrings.lanczos3
import typingsSlinky.sharp.sharpStrings.mitchell
import typingsSlinky.sharp.sharpStrings.nearest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KernelEnum extends js.Object {
  var cubic: typingsSlinky.sharp.sharpStrings.cubic
  var lanczos2: typingsSlinky.sharp.sharpStrings.lanczos2
  var lanczos3: typingsSlinky.sharp.sharpStrings.lanczos3
  var mitchell: typingsSlinky.sharp.sharpStrings.mitchell
  var nearest: typingsSlinky.sharp.sharpStrings.nearest
}

object KernelEnum {
  @scala.inline
  def apply(cubic: cubic, lanczos2: lanczos2, lanczos3: lanczos3, mitchell: mitchell, nearest: nearest): KernelEnum = {
    val __obj = js.Dynamic.literal(cubic = cubic.asInstanceOf[js.Any], lanczos2 = lanczos2.asInstanceOf[js.Any], lanczos3 = lanczos3.asInstanceOf[js.Any], mitchell = mitchell.asInstanceOf[js.Any], nearest = nearest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KernelEnum]
  }
}

