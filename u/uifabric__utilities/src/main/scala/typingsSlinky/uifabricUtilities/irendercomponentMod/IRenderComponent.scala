package typingsSlinky.uifabricUtilities.irendercomponentMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRenderComponent[TProps] extends js.Object {
  /**
    * JSX.Element to return in this component's render() function.
    */
  def children(props: TProps): ReactElement = js.native
}

object IRenderComponent {
  @scala.inline
  def apply[TProps](children: TProps => ReactElement): IRenderComponent[TProps] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[IRenderComponent[TProps]]
  }
  @scala.inline
  implicit class IRenderComponentOps[Self[tprops] <: IRenderComponent[tprops], TProps] (val x: Self[TProps]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TProps] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TProps]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TProps] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TProps] with Other]
    @scala.inline
    def withChildren(value: TProps => ReactElement): Self[TProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

