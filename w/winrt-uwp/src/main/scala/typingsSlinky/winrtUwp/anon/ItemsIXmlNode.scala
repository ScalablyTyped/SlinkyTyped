package typingsSlinky.winrtUwp.anon

import typingsSlinky.winrtUwp.Windows.Data.Xml.Dom.IXmlNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemsIXmlNode extends js.Object {
  /** The items in the vector view that start at startIndex. */ var items: IXmlNode = js.native
  /** The number of items returned. */ var returnValue: Double = js.native
}

object ItemsIXmlNode {
  @scala.inline
  def apply(items: IXmlNode, returnValue: Double): ItemsIXmlNode = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsIXmlNode]
  }
  @scala.inline
  implicit class ItemsIXmlNodeOps[Self <: ItemsIXmlNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: IXmlNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

