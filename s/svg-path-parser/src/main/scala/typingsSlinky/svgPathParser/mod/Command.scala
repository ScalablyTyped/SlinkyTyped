package typingsSlinky.svgPathParser.mod

import typingsSlinky.svgPathParser.svgPathParserStrings.A
import typingsSlinky.svgPathParser.svgPathParserStrings.C
import typingsSlinky.svgPathParser.svgPathParserStrings.H
import typingsSlinky.svgPathParser.svgPathParserStrings.L
import typingsSlinky.svgPathParser.svgPathParserStrings.M
import typingsSlinky.svgPathParser.svgPathParserStrings.Q
import typingsSlinky.svgPathParser.svgPathParserStrings.S
import typingsSlinky.svgPathParser.svgPathParserStrings.T
import typingsSlinky.svgPathParser.svgPathParserStrings.V
import typingsSlinky.svgPathParser.svgPathParserStrings.Z
import typingsSlinky.svgPathParser.svgPathParserStrings.`elliptical arc`
import typingsSlinky.svgPathParser.svgPathParserStrings.`horizontal lineto`
import typingsSlinky.svgPathParser.svgPathParserStrings.`quadratic curveto`
import typingsSlinky.svgPathParser.svgPathParserStrings.`smooth curveto`
import typingsSlinky.svgPathParser.svgPathParserStrings.`smooth quadratic curveto`
import typingsSlinky.svgPathParser.svgPathParserStrings.`vertical lineto`
import typingsSlinky.svgPathParser.svgPathParserStrings.a_
import typingsSlinky.svgPathParser.svgPathParserStrings.c_
import typingsSlinky.svgPathParser.svgPathParserStrings.closepath
import typingsSlinky.svgPathParser.svgPathParserStrings.curveto
import typingsSlinky.svgPathParser.svgPathParserStrings.h_
import typingsSlinky.svgPathParser.svgPathParserStrings.l_
import typingsSlinky.svgPathParser.svgPathParserStrings.lineto
import typingsSlinky.svgPathParser.svgPathParserStrings.m_
import typingsSlinky.svgPathParser.svgPathParserStrings.moveto
import typingsSlinky.svgPathParser.svgPathParserStrings.q_
import typingsSlinky.svgPathParser.svgPathParserStrings.s_
import typingsSlinky.svgPathParser.svgPathParserStrings.t_
import typingsSlinky.svgPathParser.svgPathParserStrings.v_
import typingsSlinky.svgPathParser.svgPathParserStrings.z_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  var code: m_ | M | l_ | L | h_ | H | v_ | V | c_ | C | s_ | S | q_ | Q | t_ | T | a_ | A | z_ | Z
  var command: moveto | lineto | (`horizontal lineto`) | (`vertical lineto`) | curveto | (`smooth curveto`) | (`quadratic curveto`) | (`smooth quadratic curveto`) | (`elliptical arc`) | closepath
  var relative: js.UndefOr[Boolean] = js.undefined
}

object Command {
  @scala.inline
  def apply(
    code: m_ | M | l_ | L | h_ | H | v_ | V | c_ | C | s_ | S | q_ | Q | t_ | T | a_ | A | z_ | Z,
    command: moveto | lineto | (`horizontal lineto`) | (`vertical lineto`) | curveto | (`smooth curveto`) | (`quadratic curveto`) | (`smooth quadratic curveto`) | (`elliptical arc`) | closepath,
    relative: js.UndefOr[Boolean] = js.undefined
  ): Command = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any])
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
}

