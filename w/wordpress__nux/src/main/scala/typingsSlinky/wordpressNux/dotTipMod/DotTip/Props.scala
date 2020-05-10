package typingsSlinky.wordpressNux.dotTipMod.DotTip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  /**
    * Any React element or elements can be passed as children. They will be rendered within the
    * tip bubble.
    */
  var children: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReactNode */ js.Any = js.native
  /**
    * A string that uniquely identifies the tip. Identifiers should be prefixed with the name
    * of the plugin, followed by a `/`. For example, `acme/add-to-cart`.
    */
  var tipId: String = js.native
}

object Props {
  @scala.inline
  def apply(
    children: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReactNode */ js.Any,
    tipId: String
  ): Props = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], tipId = tipId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReactNode */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTipId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tipId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

