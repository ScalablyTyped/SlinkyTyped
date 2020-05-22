package typingsSlinky.yeomanGenerator.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.std.ArrayConstructor
import typingsSlinky.std.NumberConstructor
import typingsSlinky.std.ObjectConstructor
import typingsSlinky.std.StringConstructor
import typingsSlinky.std.global.Array
import typingsSlinky.std.global.Number
import typingsSlinky.std.global.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgumentConfig extends js.Object {
  var default: js.UndefOr[js.Any] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var optional: js.UndefOr[Boolean] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[
    (StringConstructor with Instantiable0[typingsSlinky.std.global.String]) | (NumberConstructor with Instantiable0[Number]) | (ArrayConstructor with (Instantiable1[/* arrayLength */ Double, Array[js.Object]])) | (ObjectConstructor with Instantiable0[Object])
  ] = js.undefined
}

object ArgumentConfig {
  @scala.inline
  def apply(
    default: js.Any = null,
    description: String = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined,
    `type`: (StringConstructor with Instantiable0[typingsSlinky.std.global.String]) | (NumberConstructor with Instantiable0[Number]) | (ArrayConstructor with (Instantiable1[/* arrayLength */ Double, Array[js.Object]])) | (ObjectConstructor with Instantiable0[Object]) = null
  ): ArgumentConfig = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.get.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentConfig]
  }
}

