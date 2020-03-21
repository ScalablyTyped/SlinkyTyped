package typingsSlinky.tanemSvgInjector

import typingsSlinky.tanemSvgInjector.svgInjectorMod.Elements
import typingsSlinky.tanemSvgInjector.svgInjectorMod.OptionalArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tanem/svg-injector", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def SVGInjector(elements: Elements): Unit = js.native
  def SVGInjector(elements: Elements, hasAfterAllAfterEachBeforeEachEvalScriptsRenumerateIRIElements: OptionalArgs): Unit = js.native
  @js.native
  object EvalScripts extends js.Object {
    /* "always" */ val Always: typingsSlinky.tanemSvgInjector.typesMod.EvalScripts.Always with String = js.native
    /* "never" */ val Never: typingsSlinky.tanemSvgInjector.typesMod.EvalScripts.Never with String = js.native
    /* "once" */ val Once: typingsSlinky.tanemSvgInjector.typesMod.EvalScripts.Once with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.tanemSvgInjector.typesMod.EvalScripts with String] = js.native
  }
  
}

