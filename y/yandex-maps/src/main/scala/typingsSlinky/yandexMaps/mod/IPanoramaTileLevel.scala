package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPanoramaTileLevel extends js.Object {
  def getImageSize(): js.Array[Double] = js.native
  def getTileUrl(x: Double, y: Double): String = js.native
}

object IPanoramaTileLevel {
  @scala.inline
  def apply(getImageSize: () => js.Array[Double], getTileUrl: (Double, Double) => String): IPanoramaTileLevel = {
    val __obj = js.Dynamic.literal(getImageSize = js.Any.fromFunction0(getImageSize), getTileUrl = js.Any.fromFunction2(getTileUrl))
    __obj.asInstanceOf[IPanoramaTileLevel]
  }
  @scala.inline
  implicit class IPanoramaTileLevelOps[Self <: IPanoramaTileLevel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetImageSize(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getImageSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTileUrl(value: (Double, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTileUrl")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

