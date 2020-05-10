package typingsSlinky.tensorflowTfjsConverter.compiledApiMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFunctionDef extends js.Object {
  /** FunctionDef attr */
  var attr: js.UndefOr[StringDictionary[IAttrValue] | Null] = js.native
  /** FunctionDef nodeDef */
  var nodeDef: js.UndefOr[js.Array[INodeDef] | Null] = js.native
  /** FunctionDef ret */
  var ret: js.UndefOr[StringDictionary[String] | Null] = js.native
  /** FunctionDef signature */
  var signature: js.UndefOr[IOpDef | Null] = js.native
}

object IFunctionDef {
  @scala.inline
  def apply(): IFunctionDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFunctionDef]
  }
  @scala.inline
  implicit class IFunctionDefOps[Self <: IFunctionDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttr(value: StringDictionary[IAttrValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attr")(js.undefined)
        ret
    }
    @scala.inline
    def withAttrNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attr")(null)
        ret
    }
    @scala.inline
    def withNodeDef(value: js.Array[INodeDef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeDef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeDef")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeDefNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeDef")(null)
        ret
    }
    @scala.inline
    def withRet(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ret")(js.undefined)
        ret
    }
    @scala.inline
    def withRetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ret")(null)
        ret
    }
    @scala.inline
    def withSignature(value: IOpDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(js.undefined)
        ret
    }
    @scala.inline
    def withSignatureNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(null)
        ret
    }
  }
  
}

