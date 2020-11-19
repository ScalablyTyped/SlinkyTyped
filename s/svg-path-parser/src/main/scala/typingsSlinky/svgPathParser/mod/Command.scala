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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Command extends js.Object {
  
  var code: m_ | M | l_ | L | h_ | H | v_ | V | c_ | C | s_ | S | q_ | Q | t_ | T | a_ | A | z_ | Z = js.native
  
  var command: moveto | lineto | (`horizontal lineto`) | (`vertical lineto`) | curveto | (`smooth curveto`) | (`quadratic curveto`) | (`smooth quadratic curveto`) | (`elliptical arc`) | closepath = js.native
  
  var relative: js.UndefOr[Boolean] = js.native
}
object Command {
  
  @scala.inline
  def apply(
    code: m_ | M | l_ | L | h_ | H | v_ | V | c_ | C | s_ | S | q_ | Q | t_ | T | a_ | A | z_ | Z,
    command: moveto | lineto | (`horizontal lineto`) | (`vertical lineto`) | curveto | (`smooth curveto`) | (`quadratic curveto`) | (`smooth quadratic curveto`) | (`elliptical arc`) | closepath
  ): Command = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
  
  @scala.inline
  implicit class CommandOps[Self <: Command] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCode(value: m_ | M | l_ | L | h_ | H | v_ | V | c_ | C | s_ | S | q_ | Q | t_ | T | a_ | A | z_ | Z): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommand(
      value: moveto | lineto | (`horizontal lineto`) | (`vertical lineto`) | curveto | (`smooth curveto`) | (`quadratic curveto`) | (`smooth quadratic curveto`) | (`elliptical arc`) | closepath
    ): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelative(value: Boolean): Self = this.set("relative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelative: Self = this.set("relative", js.undefined)
  }
}
