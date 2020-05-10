package typingsSlinky.venn.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutParameter extends js.Object {
  var lossFunction: js.UndefOr[
    js.Function2[/* sets */ StringDictionary[Circle], /* overlaps */ js.Array[Overlap], Double]
  ] = js.native
  var restarts: js.UndefOr[Double] = js.native
}

object LayoutParameter {
  @scala.inline
  def apply(): LayoutParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutParameter]
  }
  @scala.inline
  implicit class LayoutParameterOps[Self <: LayoutParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLossFunction(value: (/* sets */ StringDictionary[Circle], /* overlaps */ js.Array[Overlap]) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lossFunction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLossFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lossFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withRestarts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restarts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestarts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restarts")(js.undefined)
        ret
    }
  }
  
}

