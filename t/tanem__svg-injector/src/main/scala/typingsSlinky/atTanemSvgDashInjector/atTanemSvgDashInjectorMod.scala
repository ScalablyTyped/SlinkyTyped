package typingsSlinky.atTanemSvgDashInjector

import typingsSlinky.atTanemSvgDashInjector.distSvgDashInjectorMod.Elements
import typingsSlinky.atTanemSvgDashInjector.distSvgDashInjectorMod.OptionalArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tanem/svg-injector", JSImport.Namespace)
@js.native
object atTanemSvgDashInjectorMod extends js.Object {
  def SVGInjector(elements: Elements): Unit = js.native
  def SVGInjector(elements: Elements, hasAfterAllAfterEachBeforeEachEvalScriptsRenumerateIRIElements: OptionalArgs): Unit = js.native
  @js.native
  object EvalScripts extends js.Object {
    /* "always" */ val Always: typingsSlinky.atTanemSvgDashInjector.distTypesMod.EvalScripts.Always with String = js.native
    /* "never" */ val Never: typingsSlinky.atTanemSvgDashInjector.distTypesMod.EvalScripts.Never with String = js.native
    /* "once" */ val Once: typingsSlinky.atTanemSvgDashInjector.distTypesMod.EvalScripts.Once with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.atTanemSvgDashInjector.distTypesMod.EvalScripts with String] = js.native
  }
  
}

