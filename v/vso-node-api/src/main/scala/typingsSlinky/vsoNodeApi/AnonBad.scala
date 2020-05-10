package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBad extends js.Object {
  var bad: Double = js.native
  var blob: Double = js.native
  var commit: Double = js.native
  var ext2: Double = js.native
  var ofsDelta: Double = js.native
  var refDelta: Double = js.native
  var tag: Double = js.native
  var tree: Double = js.native
}

object AnonBad {
  @scala.inline
  def apply(
    bad: Double,
    blob: Double,
    commit: Double,
    ext2: Double,
    ofsDelta: Double,
    refDelta: Double,
    tag: Double,
    tree: Double
  ): AnonBad = {
    val __obj = js.Dynamic.literal(bad = bad.asInstanceOf[js.Any], blob = blob.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], ext2 = ext2.asInstanceOf[js.Any], ofsDelta = ofsDelta.asInstanceOf[js.Any], refDelta = refDelta.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBad]
  }
  @scala.inline
  implicit class AnonBadOps[Self <: AnonBad] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBad(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlob(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExt2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfsDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ofsDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTree(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tree")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

