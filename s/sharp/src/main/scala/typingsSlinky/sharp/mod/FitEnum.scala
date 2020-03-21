package typingsSlinky.sharp.mod

import typingsSlinky.sharp.sharpStrings.contain
import typingsSlinky.sharp.sharpStrings.cover
import typingsSlinky.sharp.sharpStrings.fill
import typingsSlinky.sharp.sharpStrings.inside
import typingsSlinky.sharp.sharpStrings.outside
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FitEnum extends js.Object {
  var contain: typingsSlinky.sharp.sharpStrings.contain
  var cover: typingsSlinky.sharp.sharpStrings.cover
  var fill: typingsSlinky.sharp.sharpStrings.fill
  var inside: typingsSlinky.sharp.sharpStrings.inside
  var outside: typingsSlinky.sharp.sharpStrings.outside
}

object FitEnum {
  @scala.inline
  def apply(contain: contain, cover: cover, fill: fill, inside: inside, outside: outside): FitEnum = {
    val __obj = js.Dynamic.literal(contain = contain.asInstanceOf[js.Any], cover = cover.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], inside = inside.asInstanceOf[js.Any], outside = outside.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FitEnum]
  }
}

