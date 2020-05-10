package typingsSlinky.tensorflowTfjsConverter.compiledApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGraphDef extends js.Object {
  /** GraphDef library */
  var library: js.UndefOr[IFunctionDefLibrary | Null] = js.native
  /** GraphDef node */
  var node: js.UndefOr[js.Array[INodeDef] | Null] = js.native
  /** GraphDef versions */
  var versions: js.UndefOr[IVersionDef | Null] = js.native
}

object IGraphDef {
  @scala.inline
  def apply(): IGraphDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGraphDef]
  }
  @scala.inline
  implicit class IGraphDefOps[Self <: IGraphDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLibrary(value: IFunctionDefLibrary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("library")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLibrary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("library")(js.undefined)
        ret
    }
    @scala.inline
    def withLibraryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("library")(null)
        ret
    }
    @scala.inline
    def withNode(value: js.Array[INodeDef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(null)
        ret
    }
    @scala.inline
    def withVersions(value: IVersionDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versions")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versions")(null)
        ret
    }
  }
  
}

