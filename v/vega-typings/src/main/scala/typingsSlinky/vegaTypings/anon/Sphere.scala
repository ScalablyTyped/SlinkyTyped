package typingsSlinky.vegaTypings.anon

import typingsSlinky.vegaTypings.markMod.Clip
import typingsSlinky.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sphere extends Clip {
  var sphere: String | SignalRef = js.native
}

object Sphere {
  @scala.inline
  def apply(sphere: String | SignalRef): Sphere = {
    val __obj = js.Dynamic.literal(sphere = sphere.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sphere]
  }
  @scala.inline
  implicit class SphereOps[Self <: Sphere] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSphere(value: String | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sphere")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

