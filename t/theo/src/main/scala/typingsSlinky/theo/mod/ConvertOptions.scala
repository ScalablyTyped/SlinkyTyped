package typingsSlinky.theo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConvertOptions extends js.Object {
  var format: FormatOptions = js.native
  var resolveAliases: js.UndefOr[Boolean] = js.native
  var resolveMetaAliases: js.UndefOr[Boolean] = js.native
  var transform: TransformOptions[scala.Nothing] = js.native
}

object ConvertOptions {
  @scala.inline
  def apply(format: FormatOptions, transform: TransformOptions[scala.Nothing]): ConvertOptions = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvertOptions]
  }
  @scala.inline
  implicit class ConvertOptionsOps[Self <: ConvertOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: FormatOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransform(value: TransformOptions[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolveAliases(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveAliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolveAliases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveAliases")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveMetaAliases(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveMetaAliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolveMetaAliases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveMetaAliases")(js.undefined)
        ret
    }
  }
  
}

