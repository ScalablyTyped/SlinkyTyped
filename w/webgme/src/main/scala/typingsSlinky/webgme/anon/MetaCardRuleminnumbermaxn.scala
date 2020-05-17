package typingsSlinky.webgme.anon

import typingsSlinky.webgme.GmeCommon.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined webgme.GmeCommon.MetaCardRule & {  min  :number,   max  :number} */
@js.native
trait MetaCardRuleminnumbermaxn extends js.Object {
  var items: js.Array[Path] = js.native
  var max: Double = js.native
  var maxItems: js.Array[Double] = js.native
  var min: Double = js.native
  var minItems: js.Array[Double] = js.native
}

object MetaCardRuleminnumbermaxn {
  @scala.inline
  def apply(
    items: js.Array[Path],
    max: Double,
    maxItems: js.Array[Double],
    min: Double,
    minItems: js.Array[Double]
  ): MetaCardRuleminnumbermaxn = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], maxItems = maxItems.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], minItems = minItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaCardRuleminnumbermaxn]
  }
  @scala.inline
  implicit class MetaCardRuleminnumbermaxnOps[Self <: MetaCardRuleminnumbermaxn] (val x: Self) extends AnyVal {
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
    def withMax(value: Double): Self = {
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
    def withMin(value: Double): Self = {
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

