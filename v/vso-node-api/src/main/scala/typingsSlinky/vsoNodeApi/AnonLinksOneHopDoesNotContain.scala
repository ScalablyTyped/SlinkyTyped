package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLinksOneHopDoesNotContain extends js.Object {
  var linksOneHopDoesNotContain: Double = js.native
  var linksOneHopMayContain: Double = js.native
  var linksOneHopMustContain: Double = js.native
  var linksRecursiveDoesNotContain: Double = js.native
  var linksRecursiveMayContain: Double = js.native
  var linksRecursiveMustContain: Double = js.native
  var workItems: Double = js.native
}

object AnonLinksOneHopDoesNotContain {
  @scala.inline
  def apply(
    linksOneHopDoesNotContain: Double,
    linksOneHopMayContain: Double,
    linksOneHopMustContain: Double,
    linksRecursiveDoesNotContain: Double,
    linksRecursiveMayContain: Double,
    linksRecursiveMustContain: Double,
    workItems: Double
  ): AnonLinksOneHopDoesNotContain = {
    val __obj = js.Dynamic.literal(linksOneHopDoesNotContain = linksOneHopDoesNotContain.asInstanceOf[js.Any], linksOneHopMayContain = linksOneHopMayContain.asInstanceOf[js.Any], linksOneHopMustContain = linksOneHopMustContain.asInstanceOf[js.Any], linksRecursiveDoesNotContain = linksRecursiveDoesNotContain.asInstanceOf[js.Any], linksRecursiveMayContain = linksRecursiveMayContain.asInstanceOf[js.Any], linksRecursiveMustContain = linksRecursiveMustContain.asInstanceOf[js.Any], workItems = workItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLinksOneHopDoesNotContain]
  }
  @scala.inline
  implicit class AnonLinksOneHopDoesNotContainOps[Self <: AnonLinksOneHopDoesNotContain] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLinksOneHopDoesNotContain(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linksOneHopDoesNotContain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinksOneHopMayContain(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linksOneHopMayContain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinksOneHopMustContain(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linksOneHopMustContain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinksRecursiveDoesNotContain(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linksRecursiveDoesNotContain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinksRecursiveMayContain(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linksRecursiveMayContain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinksRecursiveMustContain(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linksRecursiveMustContain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItems")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

