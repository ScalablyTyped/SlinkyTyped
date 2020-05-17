package typingsSlinky.webpack.mod.Stats

import typingsSlinky.std.Record
import typingsSlinky.webpack.anon.Assets
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChunkGroup extends js.Object {
  var assets: js.Array[String] = js.native
  var childAssets: Record[String, js.Array[String]] = js.native
  var children: Record[String, Assets] = js.native
  var chunks: js.Array[Double | String] = js.native
  var isOverSizeLimit: js.UndefOr[Boolean] = js.native
}

object ChunkGroup {
  @scala.inline
  def apply(
    assets: js.Array[String],
    childAssets: Record[String, js.Array[String]],
    children: Record[String, Assets],
    chunks: js.Array[Double | String]
  ): ChunkGroup = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], childAssets = childAssets.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], chunks = chunks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChunkGroup]
  }
  @scala.inline
  implicit class ChunkGroupOps[Self <: ChunkGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssets(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildAssets(value: Record[String, js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childAssets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: Record[String, Assets]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChunks(value: js.Array[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOverSizeLimit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOverSizeLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOverSizeLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOverSizeLimit")(js.undefined)
        ret
    }
  }
  
}

