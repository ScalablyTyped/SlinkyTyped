package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.anon.Graticule
import typingsSlinky.vegaLite.encodingMod.Encoding
import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaLite.srcConfigMod.Config
import typingsSlinky.vegaLite.srcMarkMod.Mark
import typingsSlinky.vegaLite.srcMarkMod.MarkDef
import typingsSlinky.vegaLite.vegaLiteStrings.arc
import typingsSlinky.vegaLite.vegaLiteStrings.area
import typingsSlinky.vegaLite.vegaLiteStrings.bar
import typingsSlinky.vegaLite.vegaLiteStrings.circle
import typingsSlinky.vegaLite.vegaLiteStrings.geoshape
import typingsSlinky.vegaLite.vegaLiteStrings.image
import typingsSlinky.vegaLite.vegaLiteStrings.line
import typingsSlinky.vegaLite.vegaLiteStrings.point
import typingsSlinky.vegaLite.vegaLiteStrings.rect
import typingsSlinky.vegaLite.vegaLiteStrings.rule
import typingsSlinky.vegaLite.vegaLiteStrings.square
import typingsSlinky.vegaLite.vegaLiteStrings.text
import typingsSlinky.vegaLite.vegaLiteStrings.tick
import typingsSlinky.vegaLite.vegaLiteStrings.trail
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object markInitMod {
  
  @JSImport("vega-lite/build/src/compile/mark/init", "defaultFilled")
  @js.native
  def defaultFilled(markDef: MarkDef[Mark, ExprRef | SignalRef], config: Config[SignalRef], hasGraticule: Graticule): Boolean = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/init", "initMarkdef")
  @js.native
  def initMarkdef(
    originalMarkDef: MarkDef[Mark, ExprRef | SignalRef],
    encoding: Encoding[String],
    config: Config[SignalRef]
  ): MarkDef[
    square | area | circle | image | line | rect | text | point | arc | rule | trail | geoshape | bar | tick, 
    SignalRef
  ] = js.native
}
