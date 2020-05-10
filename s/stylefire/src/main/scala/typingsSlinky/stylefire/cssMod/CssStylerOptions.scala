package typingsSlinky.stylefire.cssMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.stylefire.typesMod.ResolvedState
import typingsSlinky.stylefire.typesMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CssStylerOptions extends js.Object {
  var element: HTMLElement = js.native
  var hasCSSVariable: js.UndefOr[Boolean] = js.native
  var preparseOutput: Boolean = js.native
  def buildStyles(state: State): ResolvedState = js.native
}

object CssStylerOptions {
  @scala.inline
  def apply(buildStyles: State => ResolvedState, element: HTMLElement, preparseOutput: Boolean): CssStylerOptions = {
    val __obj = js.Dynamic.literal(buildStyles = js.Any.fromFunction1(buildStyles), element = element.asInstanceOf[js.Any], preparseOutput = preparseOutput.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssStylerOptions]
  }
  @scala.inline
  implicit class CssStylerOptionsOps[Self <: CssStylerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuildStyles(value: State => ResolvedState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildStyles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreparseOutput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preparseOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasCSSVariable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCSSVariable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasCSSVariable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCSSVariable")(js.undefined)
        ret
    }
  }
  
}

