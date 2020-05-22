package typingsSlinky.vegaTypings.anon

import typingsSlinky.vegaTypings.encodeMod.LinearGradient
import typingsSlinky.vegaTypings.encodeMod.RadialGradient
import typingsSlinky.vegaTypings.encodeMod._ColorValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0` extends _ColorValueRef {
  var value: LinearGradient | RadialGradient
}

object `0` {
  @scala.inline
  def apply(value: LinearGradient | RadialGradient): `0` = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
}

