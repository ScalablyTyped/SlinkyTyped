package typingsSlinky.winston.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NpmConfigSetColors extends AbstractConfigSetColors {
  var debug: String | js.Array[String] = js.native
  var error: String | js.Array[String] = js.native
  var info: String | js.Array[String] = js.native
  var silly: String | js.Array[String] = js.native
  var verbose: String | js.Array[String] = js.native
  var warn: String | js.Array[String] = js.native
}

object NpmConfigSetColors {
  @scala.inline
  def apply(
    debug: String | js.Array[String],
    error: String | js.Array[String],
    info: String | js.Array[String],
    silly: String | js.Array[String],
    verbose: String | js.Array[String],
    warn: String | js.Array[String]
  ): NpmConfigSetColors = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], silly = silly.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[NpmConfigSetColors]
  }
  @scala.inline
  implicit class NpmConfigSetColorsOps[Self <: NpmConfigSetColors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withInfo(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
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

