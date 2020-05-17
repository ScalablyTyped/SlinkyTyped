package typingsSlinky.webpack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assets extends js.Object {
  var assets: js.Array[String] = js.native
  var chunks: js.Array[Double | String] = js.native
  var name: String = js.native
}

object Assets {
  @scala.inline
  def apply(assets: js.Array[String], chunks: js.Array[Double | String], name: String): Assets = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], chunks = chunks.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assets]
  }
  @scala.inline
  implicit class AssetsOps[Self <: Assets] (val x: Self) extends AnyVal {
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
    def withChunks(value: js.Array[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

