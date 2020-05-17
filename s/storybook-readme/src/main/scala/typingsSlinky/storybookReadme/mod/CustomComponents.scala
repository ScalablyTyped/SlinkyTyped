package typingsSlinky.storybookReadme.mod

import slinky.core.facade.ReactElement
import typingsSlinky.storybookReadme.anon.ChildrenElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomComponents extends js.Object {
  var FooterComponent: js.UndefOr[js.Function1[/* props */ ChildrenElement, ReactElement]] = js.native
  var PreviewComponent: js.UndefOr[js.Function1[/* props */ ChildrenElement, ReactElement]] = js.native
}

object CustomComponents {
  @scala.inline
  def apply(): CustomComponents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomComponents]
  }
  @scala.inline
  implicit class CustomComponentsOps[Self <: CustomComponents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFooterComponent(value: /* props */ ChildrenElement => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FooterComponent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFooterComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FooterComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewComponent(value: /* props */ ChildrenElement => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreviewComponent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPreviewComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreviewComponent")(js.undefined)
        ret
    }
  }
  
}

