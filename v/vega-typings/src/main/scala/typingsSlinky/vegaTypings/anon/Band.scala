package typingsSlinky.vegaTypings.anon

import typingsSlinky.vegaTypings.encodeMod.ScaledValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Band
  extends ScaledValueRef[js.Any] {
  var band: Boolean | Double
  var scale: typingsSlinky.vegaTypings.encodeMod.Field
}

object Band {
  @scala.inline
  def apply(band: Boolean | Double, scale: typingsSlinky.vegaTypings.encodeMod.Field): Band = {
    val __obj = js.Dynamic.literal(band = band.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Band]
  }
}

