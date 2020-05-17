package typingsSlinky.socketclusterServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Algorithms extends js.Object {
  var algorithms: js.UndefOr[js.Array[String]] = js.native
}

object Algorithms {
  @scala.inline
  def apply(): Algorithms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Algorithms]
  }
  @scala.inline
  implicit class AlgorithmsOps[Self <: Algorithms] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithms(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithms")(js.undefined)
        ret
    }
  }
  
}

