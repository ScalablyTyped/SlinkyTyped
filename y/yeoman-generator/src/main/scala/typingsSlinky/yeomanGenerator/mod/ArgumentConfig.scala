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

@js.native
trait ArgumentConfig extends js.Object {
  var default: js.UndefOr[js.Any] = js.native
  var description: js.UndefOr[String] = js.native
  var optional: js.UndefOr[Boolean] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[
    (StringConstructor with Instantiable0[typingsSlinky.std.global.String]) | (NumberConstructor with Instantiable0[Number]) | (ArrayConstructor with (Instantiable1[/* arrayLength */ Double, Array[js.Object]])) | (ObjectConstructor with Instantiable0[Object])
  ] = js.native
}

object ArgumentConfig {
  @scala.inline
  def apply(): ArgumentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArgumentConfig]
  }
  @scala.inline
  implicit class ArgumentConfigOps[Self <: ArgumentConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withOptional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
    @scala.inline
    def withType(
      value: (StringConstructor with Instantiable0[typingsSlinky.std.global.String]) | (NumberConstructor with Instantiable0[Number]) | (ArrayConstructor with (Instantiable1[/* arrayLength */ Double, Array[js.Object]])) | (ObjectConstructor with Instantiable0[Object])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

