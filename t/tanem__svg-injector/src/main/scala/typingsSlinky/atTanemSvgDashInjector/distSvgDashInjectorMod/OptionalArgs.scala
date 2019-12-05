package typingsSlinky.atTanemSvgDashInjector.distSvgDashInjectorMod

import org.scalajs.dom.raw.Element
import typingsSlinky.atTanemSvgDashInjector.distTypesMod.AfterAll
import typingsSlinky.atTanemSvgDashInjector.distTypesMod.BeforeEach
import typingsSlinky.atTanemSvgDashInjector.distTypesMod.Errback
import typingsSlinky.atTanemSvgDashInjector.distTypesMod.EvalScripts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionalArgs extends js.Object {
  var afterAll: js.UndefOr[AfterAll] = js.undefined
  var afterEach: js.UndefOr[Errback] = js.undefined
  var beforeEach: js.UndefOr[BeforeEach] = js.undefined
  var evalScripts: js.UndefOr[EvalScripts] = js.undefined
  var renumerateIRIElements: js.UndefOr[Boolean] = js.undefined
}

object OptionalArgs {
  @scala.inline
  def apply(
    afterAll: /* elementsLoaded */ Double => Unit = null,
    afterEach: (/* error */ js.Error | Null, /* svg */ js.UndefOr[Element]) => Unit = null,
    beforeEach: /* svg */ Element => Unit = null,
    evalScripts: EvalScripts = null,
    renumerateIRIElements: js.UndefOr[Boolean] = js.undefined
  ): OptionalArgs = {
    val __obj = js.Dynamic.literal()
    if (afterAll != null) __obj.updateDynamic("afterAll")(js.Any.fromFunction1(afterAll))
    if (afterEach != null) __obj.updateDynamic("afterEach")(js.Any.fromFunction2(afterEach))
    if (beforeEach != null) __obj.updateDynamic("beforeEach")(js.Any.fromFunction1(beforeEach))
    if (evalScripts != null) __obj.updateDynamic("evalScripts")(evalScripts.asInstanceOf[js.Any])
    if (!js.isUndefined(renumerateIRIElements)) __obj.updateDynamic("renumerateIRIElements")(renumerateIRIElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalArgs]
  }
}

