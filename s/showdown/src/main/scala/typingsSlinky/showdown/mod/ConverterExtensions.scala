package typingsSlinky.showdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Showdown converter extensions store object.
  */
@js.native
trait ConverterExtensions extends js.Object {
  var language: js.Array[ShowdownExtension] = js.native
  var output: js.Array[ShowdownExtension] = js.native
}

object ConverterExtensions {
  @scala.inline
  def apply(language: js.Array[ShowdownExtension], output: js.Array[ShowdownExtension]): ConverterExtensions = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConverterExtensions]
  }
  @scala.inline
  implicit class ConverterExtensionsOps[Self <: ConverterExtensions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLanguage(value: js.Array[ShowdownExtension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutput(value: js.Array[ShowdownExtension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

