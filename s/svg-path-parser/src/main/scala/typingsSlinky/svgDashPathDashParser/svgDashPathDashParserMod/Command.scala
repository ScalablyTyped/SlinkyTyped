package typingsSlinky.svgDashPathDashParser.svgDashPathDashParserMod

import typingsSlinky.svgDashPathDashParser.svgDashPathDashParserStrings.A
import typingsSlinky.svgDashPathDashParser.svgDashPathDashParserStrings.C
import typingsSlinky.svgDashPathDashParser.svgDashPathDashParserStrings.H
import typingsSlinky.svgDashPathDashParser.svgDashPathDashParserStrings.L
import typingsSlinky.svgDashPathDashParser.svgDashPathDashParserStrings.M
import typingsSlinky.svgDashPathDashParser.svgDashPathDashParserStrings.Q
import typingsSlinky.svgDashPathDashParser.svgDashPathDashParserStrings.S
import typingsSlinky.svgDashPathDashParser.svgDashPathDashParserStrings.T
import typingsSlinky.svgDashPathDashParser.svgDashPathDashParserStrings.V
import typingsSlinky.svgDashPathDashParser.svgDashPathDashParserStrings.Z
import typingsSlinky.svgDashPathDashParser.svgDashPathDashParserStrings.`elliptical arc`
import typingsSlinky.svgDashPathDashParser.svgDashPathDashParserStrings.`horizontal lineto`
import typingsSlinky.svgDashPathDashParser.svgDashPathDashParserStrings.`quadratic curveto`
import typingsSlinky.svgDashPathDashParser.svgDashPathDashParserStrings.`smooth curveto`
import typingsSlinky.svgDashPathDashParser.svgDashPathDashParserStrings.`smooth quadratic curveto`
import typingsSlinky.svgDashPathDashParser.svgDashPathDashParserStrings.`vertical lineto`
import typingsSlinky.svgDashPathDashParser.svgDashPathDashParserStrings.a_
import typingsSlinky.svgDashPathDashParser.svgDashPathDashParserStrings.c_
import typingsSlinky.svgDashPathDashParser.svgDashPathDashParserStrings.closepath
import typingsSlinky.svgDashPathDashParser.svgDashPathDashParserStrings.curveto
import typingsSlinky.svgDashPathDashParser.svgDashPathDashParserStrings.h_
import typingsSlinky.svgDashPathDashParser.svgDashPathDashParserStrings.l_
import typingsSlinky.svgDashPathDashParser.svgDashPathDashParserStrings.lineto
import typingsSlinky.svgDashPathDashParser.svgDashPathDashParserStrings.m_
import typingsSlinky.svgDashPathDashParser.svgDashPathDashParserStrings.moveto
import typingsSlinky.svgDashPathDashParser.svgDashPathDashParserStrings.q_
import typingsSlinky.svgDashPathDashParser.svgDashPathDashParserStrings.s_
import typingsSlinky.svgDashPathDashParser.svgDashPathDashParserStrings.t_
import typingsSlinky.svgDashPathDashParser.svgDashPathDashParserStrings.v_
import typingsSlinky.svgDashPathDashParser.svgDashPathDashParserStrings.z_
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
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
}

