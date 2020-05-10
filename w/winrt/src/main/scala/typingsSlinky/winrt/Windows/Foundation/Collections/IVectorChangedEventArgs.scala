package typingsSlinky.winrt.Windows.Foundation.Collections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVectorChangedEventArgs extends js.Object {
  var collectionChange: CollectionChange = js.native
  var index: Double = js.native
}

object IVectorChangedEventArgs {
  @scala.inline
  def apply(collectionChange: CollectionChange, index: Double): IVectorChangedEventArgs = {
    val __obj = js.Dynamic.literal(collectionChange = collectionChange.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVectorChangedEventArgs]
  }
  @scala.inline
  implicit class IVectorChangedEventArgsOps[Self <: IVectorChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollectionChange(value: CollectionChange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

