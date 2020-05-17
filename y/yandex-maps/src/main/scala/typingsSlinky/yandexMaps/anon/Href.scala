package typingsSlinky.yandexMaps.anon

import typingsSlinky.yandexMaps.mod.IGeometryJson
import typingsSlinky.yandexMaps.mod.IShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Href extends js.Object {
  var href: String = js.native
  var ooffset: js.Array[Double] = js.native
  var shape: js.UndefOr[IShape | IGeometryJson] = js.native
  var size: js.Array[Double] = js.native
}

object Href {
  @scala.inline
  def apply(href: String, ooffset: js.Array[Double], size: js.Array[Double]): Href = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], ooffset = ooffset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Href]
  }
  @scala.inline
  implicit class HrefOps[Self <: Href] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOoffset(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ooffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShape(value: IShape | IGeometryJson): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(js.undefined)
        ret
    }
  }
  
}

