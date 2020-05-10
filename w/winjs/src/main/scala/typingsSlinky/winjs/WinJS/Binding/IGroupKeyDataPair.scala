package typingsSlinky.winjs.WinJS.Binding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGroupKeyDataPair[T] extends IKeyDataPair[T] {
  var firstItemIndexHint: Double = js.native
  var firstItemKey: String = js.native
  var groupSize: Double = js.native
}

object IGroupKeyDataPair {
  @scala.inline
  def apply[T](data: T, firstItemIndexHint: Double, firstItemKey: String, groupSize: Double, key: String): IGroupKeyDataPair[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], firstItemIndexHint = firstItemIndexHint.asInstanceOf[js.Any], firstItemKey = firstItemKey.asInstanceOf[js.Any], groupSize = groupSize.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGroupKeyDataPair[T]]
  }
  @scala.inline
  implicit class IGroupKeyDataPairOps[Self[t] <: IGroupKeyDataPair[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFirstItemIndexHint(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstItemIndexHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstItemKey(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstItemKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupSize(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

