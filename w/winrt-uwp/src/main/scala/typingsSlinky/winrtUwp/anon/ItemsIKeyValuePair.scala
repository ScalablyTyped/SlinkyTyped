package typingsSlinky.winrtUwp.anon

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemsIKeyValuePair extends js.Object {
  /** The items in the map view. */ var items: IKeyValuePair[_, _] = js.native
  /** The number of items in the map view. */ var returnValue: Double = js.native
}

object ItemsIKeyValuePair {
  @scala.inline
  def apply(items: IKeyValuePair[_, _], returnValue: Double): ItemsIKeyValuePair = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsIKeyValuePair]
  }
  @scala.inline
  implicit class ItemsIKeyValuePairOps[Self <: ItemsIKeyValuePair] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: IKeyValuePair[_, _]): Self = {
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

