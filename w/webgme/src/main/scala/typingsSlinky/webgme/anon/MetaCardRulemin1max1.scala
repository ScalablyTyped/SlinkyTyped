package typingsSlinky.webgme.anon

import typingsSlinky.webgme.GmeCommon.Path
import typingsSlinky.webgme.webgmeNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined webgme.GmeCommon.MetaCardRule & {  min  :1,   max  :1} */
@js.native
trait MetaCardRulemin1max1 extends js.Object {
  var items: js.Array[Path] = js.native
  var max: `1` = js.native
  var maxItems: js.Array[Double] = js.native
  var min: `1` = js.native
  var minItems: js.Array[Double] = js.native
}

object MetaCardRulemin1max1 {
  @scala.inline
  def apply(items: js.Array[Path], max: `1`, maxItems: js.Array[Double], min: `1`, minItems: js.Array[Double]): MetaCardRulemin1max1 = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], maxItems = maxItems.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], minItems = minItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaCardRulemin1max1]
  }
  @scala.inline
  implicit class MetaCardRulemin1max1Ops[Self <: MetaCardRulemin1max1] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[Path]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxItems(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinItems(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minItems")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

