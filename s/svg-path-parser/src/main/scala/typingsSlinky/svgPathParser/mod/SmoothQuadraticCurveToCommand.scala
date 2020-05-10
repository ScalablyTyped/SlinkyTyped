package typingsSlinky.svgPathParser.mod

import typingsSlinky.svgPathParser.svgPathParserStrings.T
import typingsSlinky.svgPathParser.svgPathParserStrings.`smooth quadratic curveto`
import typingsSlinky.svgPathParser.svgPathParserStrings.t_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmoothQuadraticCurveToCommand extends js.Object {
  var code: t_ | T = js.native
  var command: `smooth quadratic curveto` = js.native
  var relative: js.UndefOr[Boolean] = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object SmoothQuadraticCurveToCommand {
  @scala.inline
  def apply(code: t_ | T, command: `smooth quadratic curveto`, x: Double, y: Double): SmoothQuadraticCurveToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmoothQuadraticCurveToCommand]
  }
  @scala.inline
  implicit class SmoothQuadraticCurveToCommandOps[Self <: SmoothQuadraticCurveToCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: t_ | T): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommand(value: `smooth quadratic curveto`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relative")(js.undefined)
        ret
    }
  }
  
}

