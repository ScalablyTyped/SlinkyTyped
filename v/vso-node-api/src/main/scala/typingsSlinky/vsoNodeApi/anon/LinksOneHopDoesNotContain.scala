package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinksOneHopDoesNotContain extends js.Object {
  var linksOneHopDoesNotContain: scala.Double = js.native
  var linksOneHopMayContain: scala.Double = js.native
  var linksOneHopMustContain: scala.Double = js.native
  var linksRecursiveDoesNotContain: scala.Double = js.native
  var linksRecursiveMayContain: scala.Double = js.native
  var linksRecursiveMustContain: scala.Double = js.native
  var workItems: scala.Double = js.native
}

object LinksOneHopDoesNotContain {
  @scala.inline
  def apply(
    linksOneHopDoesNotContain: scala.Double,
    linksOneHopMayContain: scala.Double,
    linksOneHopMustContain: scala.Double,
    linksRecursiveDoesNotContain: scala.Double,
    linksRecursiveMayContain: scala.Double,
    linksRecursiveMustContain: scala.Double,
    workItems: scala.Double
  ): LinksOneHopDoesNotContain = {
    val __obj = js.Dynamic.literal(linksOneHopDoesNotContain = linksOneHopDoesNotContain.asInstanceOf[js.Any], linksOneHopMayContain = linksOneHopMayContain.asInstanceOf[js.Any], linksOneHopMustContain = linksOneHopMustContain.asInstanceOf[js.Any], linksRecursiveDoesNotContain = linksRecursiveDoesNotContain.asInstanceOf[js.Any], linksRecursiveMayContain = linksRecursiveMayContain.asInstanceOf[js.Any], linksRecursiveMustContain = linksRecursiveMustContain.asInstanceOf[js.Any], workItems = workItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinksOneHopDoesNotContain]
  }
  @scala.inline
  implicit class LinksOneHopDoesNotContainOps[Self <: LinksOneHopDoesNotContain] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLinksOneHopDoesNotContain(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linksOneHopDoesNotContain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinksOneHopMayContain(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linksOneHopMayContain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinksOneHopMustContain(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linksOneHopMustContain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinksRecursiveDoesNotContain(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linksRecursiveDoesNotContain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinksRecursiveMayContain(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linksRecursiveMayContain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinksRecursiveMustContain(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linksRecursiveMustContain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkItems(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItems")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

