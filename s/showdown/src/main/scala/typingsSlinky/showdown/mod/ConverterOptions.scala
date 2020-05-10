package typingsSlinky.showdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConverterOptions extends ShowdownOptions {
  /**
    * Add extensions to the new converter can be showdown extensions or "global" extensions name.
    */
  var extensions: js.UndefOr[
    js.Array[
      (js.Function0[js.Array[ShowdownExtension] | ShowdownExtension]) | js.Array[ShowdownExtension] | ShowdownExtension | String
    ]
  ] = js.native
}

object ConverterOptions {
  @scala.inline
  def apply(): ConverterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConverterOptions]
  }
  @scala.inline
  implicit class ConverterOptionsOps[Self <: ConverterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtensions(
      value: js.Array[
          (js.Function0[js.Array[ShowdownExtension] | ShowdownExtension]) | js.Array[ShowdownExtension] | ShowdownExtension | String
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
  }
  
}

