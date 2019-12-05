package typingsSlinky.atTanemSvgDashInjector

import org.scalajs.dom.raw.Element
import typingsSlinky.atTanemSvgDashInjector.distTypesMod.EvalScripts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tanem/svg-injector/dist/types", JSImport.Namespace)
@js.native
object distTypesMod extends js.Object {
  @js.native
  sealed trait EvalScripts extends js.Object
  
  @js.native
  object EvalScripts extends js.Object {
    @js.native
    sealed trait Always extends EvalScripts
    
    @js.native
    sealed trait Never extends EvalScripts
    
    @js.native
    sealed trait Once extends EvalScripts
    
    /* "always" */ val Always: typingsSlinky.atTanemSvgDashInjector.distTypesMod.EvalScripts.Always with String = js.native
    /* "never" */ val Never: typingsSlinky.atTanemSvgDashInjector.distTypesMod.EvalScripts.Never with String = js.native
    /* "once" */ val Once: typingsSlinky.atTanemSvgDashInjector.distTypesMod.EvalScripts.Once with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EvalScripts with String] = js.native
  }
  
  type AfterAll = js.Function1[/* elementsLoaded */ Double, Unit]
  type BeforeEach = js.Function1[/* svg */ Element, Unit]
  type Errback = js.Function2[/* error */ js.Error | Null, /* svg */ js.UndefOr[Element], Unit]
}

