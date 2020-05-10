package typingsSlinky.winston.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CliConfigSetColors extends AbstractConfigSetColors {
  var data: String | js.Array[String] = js.native
  var debug: String | js.Array[String] = js.native
  var error: String | js.Array[String] = js.native
  var help: String | js.Array[String] = js.native
  var info: String | js.Array[String] = js.native
  var input: String | js.Array[String] = js.native
  var prompt: String | js.Array[String] = js.native
  var silly: String | js.Array[String] = js.native
  var verbose: String | js.Array[String] = js.native
  var warn: String | js.Array[String] = js.native
}

object CliConfigSetColors {
  @scala.inline
  def apply(
    data: String | js.Array[String],
    debug: String | js.Array[String],
    error: String | js.Array[String],
    help: String | js.Array[String],
    info: String | js.Array[String],
    input: String | js.Array[String],
    prompt: String | js.Array[String],
    silly: String | js.Array[String],
    verbose: String | js.Array[String],
    warn: String | js.Array[String]
  ): CliConfigSetColors = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], silly = silly.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CliConfigSetColors]
  }
  @scala.inline
  implicit class CliConfigSetColorsOps[Self <: CliConfigSetColors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebug(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelp(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("help")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfo(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrompt(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSilly(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerbose(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarn(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

