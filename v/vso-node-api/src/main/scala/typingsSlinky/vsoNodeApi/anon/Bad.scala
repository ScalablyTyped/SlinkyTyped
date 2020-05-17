package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bad extends js.Object {
  var bad: scala.Double = js.native
  var blob: scala.Double = js.native
  var commit: scala.Double = js.native
  var ext2: scala.Double = js.native
  var ofsDelta: scala.Double = js.native
  var refDelta: scala.Double = js.native
  var tag: scala.Double = js.native
  var tree: scala.Double = js.native
}

object Bad {
  @scala.inline
  def apply(
    bad: scala.Double,
    blob: scala.Double,
    commit: scala.Double,
    ext2: scala.Double,
    ofsDelta: scala.Double,
    refDelta: scala.Double,
    tag: scala.Double,
    tree: scala.Double
  ): Bad = {
    val __obj = js.Dynamic.literal(bad = bad.asInstanceOf[js.Any], blob = blob.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], ext2 = ext2.asInstanceOf[js.Any], ofsDelta = ofsDelta.asInstanceOf[js.Any], refDelta = refDelta.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bad]
  }
  @scala.inline
  implicit class BadOps[Self <: Bad] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBad(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlob(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommit(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExt2(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfsDelta(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ofsDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefDelta(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTree(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tree")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

