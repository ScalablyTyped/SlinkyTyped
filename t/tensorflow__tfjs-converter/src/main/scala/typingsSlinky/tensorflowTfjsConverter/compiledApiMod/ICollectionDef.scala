package typingsSlinky.tensorflowTfjsConverter.compiledApiMod

import typingsSlinky.tensorflowTfjsConverter.compiledApiMod.CollectionDef.IAnyList
import typingsSlinky.tensorflowTfjsConverter.compiledApiMod.CollectionDef.IBytesList
import typingsSlinky.tensorflowTfjsConverter.compiledApiMod.CollectionDef.IFloatList
import typingsSlinky.tensorflowTfjsConverter.compiledApiMod.CollectionDef.IInt64List
import typingsSlinky.tensorflowTfjsConverter.compiledApiMod.CollectionDef.INodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICollectionDef extends js.Object {
  /** CollectionDef anyList */
  var anyList: js.UndefOr[IAnyList | Null] = js.native
  /** CollectionDef bytesList */
  var bytesList: js.UndefOr[IBytesList | Null] = js.native
  /** CollectionDef floatList */
  var floatList: js.UndefOr[IFloatList | Null] = js.native
  /** CollectionDef int64List */
  var int64List: js.UndefOr[IInt64List | Null] = js.native
  /** CollectionDef nodeList */
  var nodeList: js.UndefOr[INodeList | Null] = js.native
}

object ICollectionDef {
  @scala.inline
  def apply(): ICollectionDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICollectionDef]
  }
  @scala.inline
  implicit class ICollectionDefOps[Self <: ICollectionDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnyList(value: IAnyList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anyList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnyList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anyList")(js.undefined)
        ret
    }
    @scala.inline
    def withAnyListNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anyList")(null)
        ret
    }
    @scala.inline
    def withBytesList(value: IBytesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBytesList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesList")(js.undefined)
        ret
    }
    @scala.inline
    def withBytesListNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesList")(null)
        ret
    }
    @scala.inline
    def withFloatList(value: IFloatList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatList")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatListNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatList")(null)
        ret
    }
    @scala.inline
    def withInt64List(value: IInt64List): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("int64List")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInt64List: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("int64List")(js.undefined)
        ret
    }
    @scala.inline
    def withInt64ListNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("int64List")(null)
        ret
    }
    @scala.inline
    def withNodeList(value: INodeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeList")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeListNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeList")(null)
        ret
    }
  }
  
}

