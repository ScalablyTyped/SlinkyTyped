package typingsSlinky.webgme.GmeClasses

import typingsSlinky.webgme.Core.GUID
import typingsSlinky.webgme.Core.Node
import typingsSlinky.webgme.GmeCommon.RelId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeParameters extends js.Object {
  /** the base of the node to be created. */
  var base: js.UndefOr[Node | Null] = js.native
  /** the GUID of the node to be created */
  var guid: js.UndefOr[GUID] = js.native
  /** the parent of the node to be created. */
  var parent: js.UndefOr[Node | Null] = js.native
  /** the relative id of the node to be created 
    * (if reserved, the function returns the node behind the relative id) */
  var relid: js.UndefOr[RelId] = js.native
}

object NodeParameters {
  @scala.inline
  def apply(): NodeParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeParameters]
  }
  @scala.inline
  implicit class NodeParametersOps[Self <: NodeParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(null)
        ret
    }
    @scala.inline
    def withGuid(value: GUID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guid")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withParentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(null)
        ret
    }
    @scala.inline
    def withRelid(value: RelId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relid")(js.undefined)
        ret
    }
  }
  
}

