package typingsSlinky.stylus.mod.Stylus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExceptionOptions extends js.Object {
  var column: Double = js.native
  var context: Double = js.native
  var filename: String = js.native
  var input: String = js.native
  var lineno: Double = js.native
}

object ExceptionOptions {
  @scala.inline
  def apply(column: Double, context: Double, filename: String, input: String, lineno: Double): ExceptionOptions = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionOptions]
  }
  @scala.inline
  implicit class ExceptionOptionsOps[Self <: ExceptionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineno(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineno")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

