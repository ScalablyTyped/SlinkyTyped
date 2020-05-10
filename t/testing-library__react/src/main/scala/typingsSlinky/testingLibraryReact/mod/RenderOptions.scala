package typingsSlinky.testingLibraryReact.mod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import typingsSlinky.testingLibraryDom.getQueriesForElementMod.Queries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderOptions[Q /* <: Queries */] extends js.Object {
  var baseElement: js.UndefOr[HTMLElement] = js.native
  var container: js.UndefOr[HTMLElement] = js.native
  var hydrate: js.UndefOr[Boolean] = js.native
  var queries: js.UndefOr[Q] = js.native
  var wrapper: js.UndefOr[ReactComponentClass[js.Object]] = js.native
}

object RenderOptions {
  @scala.inline
  def apply[Q](): RenderOptions[Q] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderOptions[Q]]
  }
  @scala.inline
  implicit class RenderOptionsOps[Self[q] <: RenderOptions[q], Q] (val x: Self[Q]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Q] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Q]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Q] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Q] with Other]
    @scala.inline
    def withBaseElement(value: HTMLElement): Self[Q] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseElement: Self[Q] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseElement")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: HTMLElement): Self[Q] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self[Q] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withHydrate(value: Boolean): Self[Q] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hydrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHydrate: Self[Q] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hydrate")(js.undefined)
        ret
    }
    @scala.inline
    def withQueries(value: Q): Self[Q] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueries: Self[Q] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queries")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapperFunctionComponent(value: ReactComponentClass[js.Object]): Self[Q] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapperComponentClass(value: ReactComponentClass[js.Object]): Self[Q] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapper(value: ReactComponentClass[js.Object]): Self[Q] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapper: Self[Q] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(js.undefined)
        ret
    }
  }
  
}

