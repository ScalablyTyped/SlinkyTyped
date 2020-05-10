package typingsSlinky.tanemSvgInjector.svgInjectorMod

import org.scalajs.dom.raw.Element
import typingsSlinky.tanemSvgInjector.typesMod.AfterAll
import typingsSlinky.tanemSvgInjector.typesMod.BeforeEach
import typingsSlinky.tanemSvgInjector.typesMod.Errback
import typingsSlinky.tanemSvgInjector.typesMod.EvalScripts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionalArgs extends js.Object {
  var afterAll: js.UndefOr[AfterAll] = js.native
  var afterEach: js.UndefOr[Errback] = js.native
  var beforeEach: js.UndefOr[BeforeEach] = js.native
  var evalScripts: js.UndefOr[EvalScripts] = js.native
  var renumerateIRIElements: js.UndefOr[Boolean] = js.native
}

object OptionalArgs {
  @scala.inline
  def apply(): OptionalArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalArgs]
  }
  @scala.inline
  implicit class OptionalArgsOps[Self <: OptionalArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterAll(value: /* elementsLoaded */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterAll")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterEach(value: (/* error */ js.Error | Null, /* svg */ js.UndefOr[Element]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterEach")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterEach: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterEach")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeEach(value: /* svg */ Element => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeEach")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeEach: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeEach")(js.undefined)
        ret
    }
    @scala.inline
    def withEvalScripts(value: EvalScripts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evalScripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvalScripts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evalScripts")(js.undefined)
        ret
    }
    @scala.inline
    def withRenumerateIRIElements(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renumerateIRIElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenumerateIRIElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renumerateIRIElements")(js.undefined)
        ret
    }
  }
  
}

